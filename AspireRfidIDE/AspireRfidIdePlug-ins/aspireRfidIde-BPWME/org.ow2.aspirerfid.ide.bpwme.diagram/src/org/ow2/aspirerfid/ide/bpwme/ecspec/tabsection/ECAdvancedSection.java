/*
 * Copyright ? 2008-2010, Aspire
 * 
 * Aspire is free software; you can redistribute it and/or modify it under the
 * terms of the GNU Lesser General Public License version 2.1 as published by
 * the Free Software Foundation (the "LGPL").
 * 
 * You should have received a copy of the GNU Lesser General Public License
 * along with this library in the file COPYING-LGPL-2.1; if not, write to the
 * Free Software Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston, MA
 * 02110-1301 USA.
 * 
 * This software is distributed on an "AS IS" basis, WITHOUT WARRANTY OF ANY
 * KIND, either express or implied. See the GNU Lesser General Public License
 * for the specific language governing rights and limitations.
 */

package org.ow2.aspirerfid.ide.bpwme.ecspec.tabsection;


import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.ListViewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.MouseAdapter;
import org.eclipse.swt.events.MouseEvent;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.layout.RowData;
import org.eclipse.swt.layout.RowLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Label;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.views.properties.tabbed.AbstractPropertySection;
import org.eclipse.ui.views.properties.tabbed.TabbedPropertySheetPage;
import org.ow2.aspirerfid.ide.bpwme.dialog.InputDialog;
import org.ow2.aspirerfid.ide.bpwme.ecspec.model.ReportSpec;
import org.ow2.aspirerfid.ide.bpwme.ecspec.provider.ReportPropertyContentProvider;
import org.ow2.aspirerfid.ide.bpwme.ecspec.provider.ReportPropertyLabelProvider;
import org.ow2.aspirerfid.ide.bpwme.utils.MainControl;

/**
 * 
 * @author Yongming Luo <yluo@ait.edu.gr>
 *
 */
public class ECAdvancedSection extends AbstractPropertySection {
	ReportSpec rs;
	ListViewer list;
	Button newB;
	Button changeB;
	Button removeB;
	Button checkIfEmpty;
	Button checkOnChange;
	
	@Override
	public void setInput(IWorkbenchPart part, ISelection selection) {
		super.setInput(part, selection);
		Object input = ((IStructuredSelection)selection).getFirstElement();
		rs = (ReportSpec)input;
		//must be set right here...
		list.setInput(rs.ecrspec.getFilterSpec().getIncludePatterns().getIncludePattern());
		checkOnChange.setSelection(rs.isReportOnChange());
		checkIfEmpty.setSelection(rs.isReportIfEmpty());
	}
	
//	public void setInput(IWorkbenchPart part, IStructuredSelection selection) {
//		super.setInput(part, selection);
//		//this.part = part;
//		o = selection;
//		Object input = selection.getFirstElement();
//		list.setInput(input);
//		/*
//		System.out.println("Set selection");
//		if(input instanceof ReportSpec) {
//			rs = (ReportSpec)input;
//		} else{
//			System.out.println("No input here");
//		}*/
//		//rs = (ReportSpec)(selection.getFirstElement());
//	}
	
	public ECAdvancedSection() {
	}
	@Override
	public void createControls(final Composite parent,
			TabbedPropertySheetPage aTabbedPropertySheetPage) {
		super.createControls(parent, aTabbedPropertySheetPage);
        Composite composite = getWidgetFactory().createFlatFormComposite(parent);
        composite.setLayout(new GridLayout());
        createEditPart(composite);
        createEditLogic(composite);
	}
	
	private void createEditLogic(final Composite parent) {		
		
		list.setContentProvider(new ReportPropertyContentProvider());
		list.setLabelProvider(new ReportPropertyLabelProvider());		
		
		final MainControl mc = MainControl.getMainControl();
		
		newB.addMouseListener(new MouseAdapter(){
			@Override
			public void mouseDown(MouseEvent e) {
				super.mouseDown(e);
				InputDialog id = new InputDialog(parent.getShell());
				id.setInput("urn:epc:pat:*");
				String input = id.open();
				if((input != null) && (!input.equals(""))) {
					rs.addFilter(input);
					list.refresh();
					mc.saveObject();			
				}
			}
		});
		
		changeB.addMouseListener(new MouseAdapter(){
			@Override
			public void mouseDown(MouseEvent e) {
				super.mouseDown(e);
				InputDialog id = new InputDialog(parent.getShell());
				String oldFilter = (String)((IStructuredSelection)list.getSelection()).getFirstElement();
				id.setInput(oldFilter);
				String newFilter = id.open();
				if((newFilter != null) && (!newFilter.equals(""))) {
					rs.changeFilter(oldFilter, newFilter);
					list.refresh();
					mc.saveObject();
				}
			}
		});
		
		removeB.addMouseListener(new MouseAdapter(){
			@Override
			public void mouseDown(MouseEvent e) {
				super.mouseDown(e);
				String oldFilter = (String)((IStructuredSelection)list.getSelection()).getFirstElement();
				rs.removeFilter(oldFilter);
				list.refresh();
				mc.saveObject();
			}
		});
		
		checkIfEmpty.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				super.widgetSelected(e);
				rs.setReportIfEmpty(checkIfEmpty.getSelection());
				mc.saveObject();
			}
		});
		
		checkOnChange.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				super.widgetSelected(e);
				rs.setReportOnChange(checkOnChange.getSelection());
				mc.saveObject();
			}
		});
	}

	private void createEditPart(final Composite parent) {
		Composite filterComposite = getWidgetFactory()
        .createFlatFormComposite(parent);
		filterComposite.setLayout(new RowLayout());
		
		Group grp2 = getWidgetFactory().createGroup(filterComposite, "Include Patterns");
		grp2.setLayout(new RowLayout(SWT.HORIZONTAL));
		
		Group grp1 = getWidgetFactory().createGroup(filterComposite, "Edit");
		GridLayout g1Layout = new GridLayout(1, false);
		grp1.setLayout(g1Layout);

		list = new ListViewer(grp2, SWT.SINGLE | SWT.V_SCROLL | SWT.BORDER);
		list.getControl().setLayoutData(new RowData(200, 100));
		
		GridData data = new GridData(GridData.FILL_BOTH);
		newB = getWidgetFactory().createButton(grp1, "New", SWT.PUSH);
		newB.setLayoutData(data);
		
		data = new GridData(GridData.FILL_BOTH);
		changeB = getWidgetFactory().createButton(grp1, "Edit", SWT.PUSH);
		changeB.setLayoutData(data);
		
		data = new GridData(GridData.FILL_BOTH);
		removeB = getWidgetFactory().createButton(grp1, "Remove", SWT.PUSH);
		removeB.setLayoutData(data);
		
		new Label(parent, SWT.SEPARATOR | SWT.HORIZONTAL);
		checkIfEmpty = getWidgetFactory().createButton(parent, "Report If Empty", SWT.CHECK);
		checkOnChange = getWidgetFactory().createButton(parent, "Report On Change", SWT.CHECK);
	}
}

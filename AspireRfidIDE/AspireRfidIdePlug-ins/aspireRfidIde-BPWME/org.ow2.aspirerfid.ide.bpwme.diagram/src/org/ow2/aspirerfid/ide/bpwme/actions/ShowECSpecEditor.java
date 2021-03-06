package org.ow2.aspirerfid.ide.bpwme.actions;

import java.util.HashSet;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.swt.widgets.MessageBox;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;
import org.ow2.aspirerfid.commons.apdl.model.EBProc;
import org.ow2.aspirerfid.ide.bpwme.diagram.comboeditor.ComboEditor;
import org.ow2.aspirerfid.ide.bpwme.diagram.edit.parts.EBProcEditPart;
import org.ow2.aspirerfid.ide.bpwme.diagram.part.BpwmeDiagramEditor;
import org.ow2.aspirerfid.ide.bpwme.ecspec.views.ECLRInput;
import org.ow2.aspirerfid.ide.bpwme.ecspec.views.ECSpecEditor;
import org.ow2.aspirerfid.ide.bpwme.impl.EBProcImpl;
import org.ow2.aspirerfid.ide.bpwme.master.views.MasterEditor;
import org.ow2.aspirerfid.ide.bpwme.master.views.MasterEditorInput;
import org.ow2.aspirerfid.ide.bpwme.utils.MainControl;
import org.ow2.aspirerfid.ide.bpwme.utils.MainUtil;

public class ShowECSpecEditor extends AbstractHandler {

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		if(MainUtil.isEditorOpened(ECSpecEditor.ID)) {
			MessageBox messageBox = new MessageBox(
					PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell());
			messageBox.setMessage("Editor is already opened.\nPlease close it and try again.");
			messageBox.open();
			return null;
		}
		//if bpwme editor is closed, do nothing
		if(!MainUtil.isEditorOpened(ComboEditor.ID)) {
			MessageBox messageBox = new MessageBox(
					PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell());
			messageBox.setMessage("Combo Editor is not open.\nPlease open it and try again.");
			messageBox.open();
			return null;
		}
/*
		//get bpwme editor selection
		BpwmeDiagramEditor bpwme = MainUtil.getBPWMEEditor();
		ISelection iselection = bpwme.getEditorSite().getSelectionProvider().getSelection();
		//get the selected EBProc part
		EBProcEditPart epe = null;
		if (iselection instanceof IStructuredSelection) {
			IStructuredSelection isselection = (IStructuredSelection)iselection;
			if(isselection.size() < 1) {
				return null;
			}
			Object select = isselection.getFirstElement();
			if(!(select instanceof EBProcEditPart)) {
				return null;
			}
			epe = (EBProcEditPart)select;
			if(epe == null) {
				return null;
			}
		}else {
			return null;
		}

		EBProcImpl ebi = (EBProcImpl)((View)epe.getModel()).getElement();
		
		//get the relevant EBProc in Apdl
		MainControl mc = MainControl.getMainControl();
		EBProc ebp = (EBProc)mc.getMapObject(ebi.hashCode());
		
		if(ebp == null) {
			return null;
		}
		
		IWorkbenchPage page = PlatformUI.getWorkbench().
		getActiveWorkbenchWindow().getActivePage();

		ECLRInput eli = new ECLRInput(ebp);

		try {
			ECSpecEditor ese = (ECSpecEditor)page.openEditor(eli, ECSpecEditor.ID);
			ese.setDirty(eli.getECSpecBuilder().isDirty());
		}catch (PartInitException e) {
			e.printStackTrace();
		}
		*/
		IWorkbenchPage page = PlatformUI.getWorkbench().
		getActiveWorkbenchWindow().getActivePage();

		ECLRInput eli = new ECLRInput();
		try {
			ECSpecEditor ese = (ECSpecEditor)page.openEditor(eli, ECSpecEditor.ID);
			ese.setDirty(eli.getECSpecBuilder().isDirty());
		}catch (PartInitException e) {
			e.printStackTrace();
		}
		
		HashSet<String> editorIDs = new HashSet<String>();
		editorIDs.add(ECSpecEditor.ID);
		editorIDs.add(MasterEditor.ID);
		
		MainUtil.splitEditorArea(ComboEditor.ID,editorIDs);
		return null;
	}

}

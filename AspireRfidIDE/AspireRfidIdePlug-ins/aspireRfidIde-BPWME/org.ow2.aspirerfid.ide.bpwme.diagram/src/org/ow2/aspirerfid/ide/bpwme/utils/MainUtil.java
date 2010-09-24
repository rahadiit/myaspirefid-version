/*
 * Copyright � 2008-2010, Aspire
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

package org.ow2.aspirerfid.ide.bpwme.utils;

import java.io.File;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

import org.eclipse.jface.action.IStatusLineManager;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IEditorReference;
import org.eclipse.ui.IPageLayout;
import org.eclipse.ui.IViewPart;
import org.eclipse.ui.IViewReference;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.handlers.IHandlerService;
import org.eclipse.ui.internal.EditorSashContainer;
import org.eclipse.ui.internal.EditorStack;
import org.eclipse.ui.internal.ILayoutContainer;
import org.eclipse.ui.internal.LayoutPart;
import org.eclipse.ui.internal.PartPane;
import org.eclipse.ui.internal.PartSashContainer;
import org.eclipse.ui.internal.PartSite;
import org.eclipse.ui.internal.PartStack;
import org.eclipse.ui.internal.WorkbenchPage;
import org.eclipse.ui.part.ViewPart;
import org.ow2.aspirerfid.commons.apdl.model.CLCBProc;
import org.ow2.aspirerfid.commons.apdl.model.EBProc;
import org.ow2.aspirerfid.commons.apdl.model.OLCBProc;
import org.ow2.aspirerfid.ide.bpwme.BpwmeFactory;
import org.ow2.aspirerfid.ide.bpwme.WorkflowMap;

/**
 * Utils for the whole project and workspace
 * 
 * @author Yongming Luo <yluo@ait.edu.gr>
 *
 */
public class MainUtil {
	
	/**
	 * Return whether the editor is opened already
	 * @param editorID
	 * @return
	 */
	public static boolean isEditorOpened(String editorID) {
		IWorkbenchPage page = PlatformUI.getWorkbench().
		getActiveWorkbenchWindow().getActivePage();
		IEditorReference[] refs = page.getEditorReferences();
		for(IEditorReference ref:refs) {
			if(ref.getId().equals(editorID)) {
				return true;
			}
		}
		return false;
	}
	
	/**
	 * Activate the editor if it is in the workspace
	 * @param editorID
	 */
	public static void activateEditor(String editorID) {
		IWorkbenchPage page = PlatformUI.getWorkbench().
		getActiveWorkbenchWindow().getActivePage();
		IEditorReference[] refs = page.getEditorReferences();
		for(IEditorReference ref:refs) {
			if(ref.getId().equals(editorID)) {
				IEditorPart editor = ref.getEditor(false);
				page.activate(editor);
			}
		}
	}
	
	/**
	 * Get the editor instance if it is in the workspace
	 * @param editorID
	 * @return
	 */
	public static IEditorPart getEditor(String editorID) {
		IWorkbenchPage page = PlatformUI.getWorkbench().
		getActiveWorkbenchWindow().getActivePage();
		IEditorReference[] refs = page.getEditorReferences();
		for(IEditorReference ref:refs) {
			if(ref.getId().equals(editorID)) {
				IEditorPart editor = ref.getEditor(false);
				return editor;
			}
		}
		return null;
	}
	
	/**
	 * Copy and transfer the model in APDL file to the model in GMF Diagram
	 * @param olcb
	 * @param workflowMap
	 */
	public static void copyToDiagramModel(OLCBProc olcbModel, WorkflowMap workflowMap) {
		org.ow2.aspirerfid.ide.bpwme.OLCBProc olcbDiagram = BpwmeFactory.eINSTANCE.createOLCBProc();		
		workflowMap.getNodes().add(olcbDiagram);
		//olcb level
		olcbDiagram.setId(olcbModel.getId());
		olcbDiagram.setName(olcbModel.getName());
		//clcb level
		List<CLCBProc> clcbList = olcbModel.getCLCBProc();
		for(CLCBProc clcbModel : clcbList) {
			org.ow2.aspirerfid.ide.bpwme.CLCBProc clcbDiagram = BpwmeFactory.eINSTANCE.createCLCBProc();
			clcbDiagram.setId(clcbModel.getId());
			clcbDiagram.setName(clcbModel.getName());
			clcbDiagram.setDescription(clcbModel.getDescription());
			olcbDiagram.getCLCBProc().add(clcbDiagram);
			//eb proc level
			 List<EBProc> ebList = clcbModel.getEBProc();
			 for(EBProc ebModel : ebList) {
				 org.ow2.aspirerfid.ide.bpwme.EBProc ebDiagram = BpwmeFactory.eINSTANCE.createEBProc();
				 ebDiagram.setId(ebModel.getId());
				 ebDiagram.setName(ebModel.getName());
				 ebDiagram.setDescription(ebModel.getDescription());				 
				 clcbDiagram.getEBProc().add(ebDiagram);
			 }			
		}
	}
	
	/**
	 * Justify whether the String is a integer or not
	 * @param number
	 * @return
	 */
	public static boolean isInteger(String number) {
		
		try{
			Long.parseLong(number);
			return true;
		}catch(NumberFormatException e) {
			return false;
		}
	}
	
	/**
	 * Set the message in status line
	 * @param message
	 */
	public static void showInStatus(String message) {
		IStatusLineManager statusLineManager;
		IWorkbenchPage activePage = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage();
		if (activePage != null)
		{
			IWorkbenchPart activePart = activePage.getActivePart();
			if (activePart instanceof IViewPart) {
				statusLineManager = 
					((IViewPart)activePart).getViewSite().getActionBars().getStatusLineManager();
				statusLineManager.setMessage(message);
			}
			else if (activePart instanceof IEditorPart) {
				statusLineManager = 
					((IEditorPart)activePart).getEditorSite().getActionBars().getStatusLineManager();
				statusLineManager.setMessage(message);
			}
		}
	}
	
	//get the project name
	public static String getProjectName(String filePath) {
		File f = new File(filePath);
		if(!f.exists()) {
			return null;
		}		
		if(f.isDirectory()) {
			return null;
		}
		String[] names = f.getName().split("\\.");
		return names[0];
	}
	
	
	/**
	 * Idea from http://eclipse.dzone.com/tips/programmatically-split-editor-
	 * Some internal APIs are used because we have to
	 * Split the editor only when the main editor is sharing the space with other editors
	 * 
	 * The organization is like the following:
	 * EditorSashContainer
	 * --EditorStack
	 * ----PartPane
	 * ------EditorPart
	 * 
	 */
	public static void splitEditorArea(String mainEditorID, HashSet<String> editorIDs) {
		IWorkbenchPage workbenchPage = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage();
//		IWorkbenchPart part = workbenchPage.getActivePart();
//		PartPane partPane = ((PartSite) part.getSite()).getPane();
//		LayoutPart layoutPart = partPane.getPart();

		IEditorReference[] editorReferences = workbenchPage.getEditorReferences();
		
		//main editor is the editor who does not what to share the stack
		IEditorPart mainEditor = null;
		
		HashSet<IEditorPart> editors = new HashSet<IEditorPart>();
		
		for(int i = 0; i < editorReferences.length; i++) {
			if(editorReferences[i].getId().equals(mainEditorID)) {
				mainEditor = editorReferences[i].getEditor(false);
			}else if(editorIDs.contains(editorReferences[i].getId())) {
				editors.add(editorReferences[i].getEditor(false));
			}
		}
		
		if(mainEditor != null) {
			//get the editor stack of the main editor
			//see if there are more than one editors in it			
			PartStack mainStack = (PartStack)(((PartSite)mainEditor.getSite()).getPane().getContainer());
									
			if(mainStack.getChildren().length > 1) {
				//split the main stack
				PartPane anotherPane = getAnotherPane(mainStack,((PartSite)mainEditor.getSite()).getPane(), editorIDs);				
				//if there exists another stack, move the one to the new stack
				LayoutPart[] sashChildren = ((EditorSashContainer)mainStack.getContainer()).getChildren();
				if(sashChildren.length > 1) {
					PartStack anotherStack = getAotherStack((EditorSashContainer)mainStack.getContainer(), mainStack);
					if(anotherStack != null) {
						mainStack.remove(anotherPane);
						anotherStack.add(anotherPane);
						return;
					}					
				}else {//if there is no new stack, create a new stack
					EditorSashContainer ec = (EditorSashContainer)mainStack.getContainer();
					PartStack anotherStack = EditorStack.newEditorWorkbook(ec, (WorkbenchPage)workbenchPage);
					ec.add(anotherStack, IPageLayout.RIGHT, 0.65f, ec.findBottomRight());
					mainStack.remove(anotherPane);
					anotherStack.add(anotherPane);
					return;
				}
			}
		}
	
//		// Do it only if we have more that one editor
//		if (editorReferences.length > 1) {
//			// Get PartPane that correspond to the active editor
//			PartPane currentEditorPartPane = ((PartSite) workbenchPage.getActiveEditor().getSite()).getPane();
//			EditorSashContainer editorSashContainer = null;
//			ILayoutContainer rootLayoutContainer = layoutPart.getContainer();
//			if (rootLayoutContainer instanceof LayoutPart) {
//				ILayoutContainer editorSashLayoutContainer = ((LayoutPart) rootLayoutContainer).getContainer();
//				if (editorSashLayoutContainer instanceof EditorSashContainer) {
//					editorSashContainer = ((EditorSashContainer) editorSashLayoutContainer);
//				}
//			}
//			/*
//			 * Create a new part stack (i.e. a workbook) to home the currentEditorPartPane
//			 * which hold the active editor
//			 * */
//			PartStack newPart = createStack(editorSashContainer);
//			//newPart.getChildren();
//			editorSashContainer.stack(currentEditorPartPane, newPart);
//			if (rootLayoutContainer instanceof LayoutPart) {
//				ILayoutContainer cont = ((LayoutPart) rootLayoutContainer).getContainer();
//				if (cont instanceof PartSashContainer) {
//					// "Split" the editor area by adding the new part
//					PartSashContainer c = (PartSashContainer)cont;
//					c.add(newPart, IPageLayout.RIGHT, 0.65f, c.findBottomRight()); 
//				}
//			}
//		}
	}

	
	private static PartPane getAnotherPane(PartStack mainStack, PartPane mainPane, HashSet<String> editorIDs) {
		LayoutPart[] children = mainStack.getChildren();
		for(int i = 0; i < children.length; i++) {
			if(((PartPane)children[i] != mainPane)&& (editorIDs.contains(children[i].getPart().getID()))){
				return (PartPane)children[i];
			}
		}
		return null;
	}
	
	private static PartStack getAotherStack(EditorSashContainer mainSash, PartStack mainStack) {
		LayoutPart[] children = mainSash.getChildren();
		for(int i = 0; i < children.length; i++) {
			if((PartStack)children[i] != mainStack) {
				return (PartStack)children[i];
			}
		}
		return null;
	}
	
	public static void executeCommand(String commandId) {
		IHandlerService handlerService = (IHandlerService) 
		PlatformUI.getWorkbench().getService(IHandlerService.class);
		try {
			handlerService.executeCommand(commandId, null);
		} catch (Exception ex) {
			throw new RuntimeException(commandId + " not found");
		}
	}
	
	public static IViewPart getView(String id) {
		IWorkbenchPage pages = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage();	
		IViewReference[] references = pages.getViewReferences();
		for(IViewReference reference : references) {
			if(id.equals(reference.getId())) {
				return reference.getView(false);
			}
		}		
		return null;
	}
	
}

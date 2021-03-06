package org.ow2.aspirerfid.ide.bpwme.diagram.part;

import java.io.File;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.commands.operations.OperationHistoryFactory;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Path;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gmf.runtime.common.core.command.CommandResult;
import org.eclipse.gmf.runtime.diagram.core.services.ViewService;
import org.eclipse.gmf.runtime.diagram.core.services.view.CreateDiagramViewOperation;
import org.eclipse.gmf.runtime.emf.commands.core.command.AbstractTransactionalCommand;
import org.eclipse.gmf.runtime.emf.core.util.EObjectAdapter;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.osgi.util.NLS;
import org.eclipse.ui.PartInitException;
import org.ow2.aspirerfid.ide.bpwme.diagram.application.WizardNewFileCreationPage;
import org.ow2.aspirerfid.ide.bpwme.diagram.edit.parts.WorkflowMapEditPart;
import org.ow2.aspirerfid.ide.bpwme.diagram.preferences.PreferenceConstants;
import org.ow2.aspirerfid.ide.bpwme.utils.MainControl;
import org.ow2.aspirerfid.ide.bpwme.utils.MainUtil;


/**
 * @generated
 */
public class BpwmeNewDiagramFileWizard extends Wizard {

	/**
	 * @generated
	 */
	private WizardNewFileCreationPage myFileCreationPage;

	/**
	 * @generated
	 */
	private TransactionalEditingDomain myEditingDomain;
	private URI bpwmeURI;
	
	private EObject root;

	/**
	 * @generated
	 */
	public BpwmeNewDiagramFileWizard(URI domainModelURI, EObject diagramRoot,
			TransactionalEditingDomain editingDomain) {
		assert domainModelURI != null : "Domain model uri must be specified"; //$NON-NLS-1$
		assert diagramRoot != null : "Doagram root element must be specified"; //$NON-NLS-1$
		assert editingDomain != null : "Editing domain must be specified"; //$NON-NLS-1$
		bpwmeURI = null;
		
		myFileCreationPage = new WizardNewFileCreationPage(
				Messages.BpwmeNewDiagramFileWizard_CreationPageName,
				StructuredSelection.EMPTY);
		myFileCreationPage
				.setTitle(Messages.BpwmeNewDiagramFileWizard_CreationPageTitle);
		myFileCreationPage.setDescription(NLS.bind(
				Messages.BpwmeNewDiagramFileWizard_CreationPageDescription,
				WorkflowMapEditPart.MODEL_ID));
		IPath filePath;
		String fileName = URI.decode(domainModelURI.trimFileExtension()
				.lastSegment());
		if (domainModelURI.isPlatformResource()) {
			filePath = new Path(domainModelURI.trimSegments(1)
					.toPlatformString(true));
		} else if (domainModelURI.isFile()) {
			IPreferenceStore store = BpwmeDiagramEditorPlugin.getInstance().getPreferenceStore();
			String path = store.getString(PreferenceConstants.P_BPWME_DIR);
			filePath = new Path(path+File.separator+fileName);
			
//			filePath = new Path(domainModelURI.trimSegments(1).toFileString()
//					+File.separator+fileName);
		} else {
			// TODO : use some default path
			throw new IllegalArgumentException(
					"Unsupported URI: " + domainModelURI); //$NON-NLS-1$
		}
		myFileCreationPage.setContainerFullPath(filePath);
		myFileCreationPage.setFileName(BpwmeDiagramEditorUtil
				.getUniqueFileName(filePath, fileName, "bpwme_diagram")); //$NON-NLS-1$

		root = diagramRoot;

		myEditingDomain = editingDomain;
	}

	
	/**
	 * add by yluo
	 */
	public BpwmeNewDiagramFileWizard(EObject diagramRoot,
			TransactionalEditingDomain editingDomain, String uniqueProjectName) {
		assert diagramRoot != null : "Doagram root element must be specified"; //$NON-NLS-1$
		assert editingDomain != null : "Editing domain must be specified"; //$NON-NLS-1$
		bpwmeURI = null;

		myFileCreationPage = new WizardNewFileCreationPage(
				Messages.BpwmeNewDiagramFileWizard_CreationPageName,
				StructuredSelection.EMPTY);
		myFileCreationPage
		.setTitle(Messages.BpwmeNewDiagramFileWizard_CreationPageTitle);
		myFileCreationPage.setDescription(NLS.bind(
				Messages.BpwmeNewDiagramFileWizard_CreationPageDescription,
				WorkflowMapEditPart.MODEL_ID));
		IPath filePath;

		IPreferenceStore store = BpwmeDiagramEditorPlugin.getInstance().getPreferenceStore();
		String path = store.getString(PreferenceConstants.P_BPWME_DIR);
		filePath = new Path(path+File.separator+uniqueProjectName);

		myFileCreationPage.setContainerFullPath(filePath);
		myFileCreationPage.setFileName(BpwmeDiagramEditorUtil
				.getUniqueFileName(filePath, uniqueProjectName, "bpwme_diagram")); //$NON-NLS-1$

		root = diagramRoot;
		myEditingDomain = editingDomain;
	}

	/**
	 * @generated
	 */
	public void addPages() {
		addPage(myFileCreationPage);
		//addPage(diagramRootElementSelectionPage);
	}

	/**
	 * modified by yluo
	 */
	public boolean performFinish() {
		List affectedFiles = new LinkedList();
		IPath diagramModelPath = myFileCreationPage.getContainerFullPath()
				.append(myFileCreationPage.getFileName());
		URI diagramModelURI = URI.createFileURI(diagramModelPath.toString());
		ResourceSet resourceSet = myEditingDomain.getResourceSet();
		final Resource diagramResource = resourceSet
				.createResource(diagramModelURI);
		
		bpwmeURI = diagramModelURI;
		
		AbstractTransactionalCommand command = new AbstractTransactionalCommand(
				myEditingDomain,
				Messages.BpwmeNewDiagramFileWizard_InitDiagramCommand,
				affectedFiles) {

			protected CommandResult doExecuteWithResult(
					IProgressMonitor monitor, IAdaptable info)
					throws ExecutionException {
				diagramResource.getContents().add(root);
				
				int diagramVID = BpwmeVisualIDRegistry
						.getDiagramVisualID(root);
				
				if (diagramVID != WorkflowMapEditPart.VISUAL_ID) {
					return CommandResult
							.newErrorCommandResult(Messages.BpwmeNewDiagramFileWizard_IncorrectRootError);
				}
				Diagram diagram = ViewService.createDiagram(
						root,
						WorkflowMapEditPart.MODEL_ID,
						BpwmeDiagramEditorPlugin.DIAGRAM_PREFERENCES_HINT);
				
				diagramResource.getContents().add(diagram);
				return CommandResult.newOKCommandResult();
			}
		};
		
		//copy the xml file to new location
		MainControl mc = MainControl.getMainControl();
		String from = mc.getApdlURI().toFileString();
		String to = diagramModelURI.trimFileExtension().appendFileExtension("xml").toFileString();
		MainUtil.copyFile(from,to);
		mc.setAPDLURI(to);
		
		
		try {
			OperationHistoryFactory.getOperationHistory().execute(command,
					new NullProgressMonitor(), null);
			diagramResource.save(BpwmeDiagramEditorUtil.getSaveOptions());
			//BpwmeDiagramEditorUtil.openDiagram(diagramResource);
			BpwmeDiagramEditorUtil.openMultipageDiagram(diagramResource);
			MainUtil.setPerspective("bpwme.diagram.BpwmePerspective");
			
			
			//mc.mapModels();
		} catch (ExecutionException e) {
			BpwmeDiagramEditorPlugin.getInstance().logError(
					"Unable to create model and diagram", e); //$NON-NLS-1$
		} catch (IOException ex) {
			BpwmeDiagramEditorPlugin.getInstance().logError(
					"Save operation failed for: " + diagramModelURI, ex); //$NON-NLS-1$
		} catch (PartInitException ex) {
			BpwmeDiagramEditorPlugin.getInstance().logError(
					"Unable to open editor", ex); //$NON-NLS-1$
		}
		return true;
	}
	
	public URI getBpwmeURI() {
		return bpwmeURI;
	}
	

//	/**
//	 * @generated
//	 */
//	private static class DiagramRootElementSelectionPage extends
//			ModelElementSelectionPage {
//
//		/**
//		 * @generated
//		 */
//		protected DiagramRootElementSelectionPage(String pageName) {
//			super(pageName);
//		}
//
//		/**
//		 * @generated
//		 */
//		protected String getSelectionTitle() {
//			return Messages.BpwmeNewDiagramFileWizard_RootSelectionPageSelectionTitle;
//		}
//
//		/**
//		 * @generated
//		 */
//		protected boolean validatePage() {
//			if (selectedModelElement == null) {
//				setErrorMessage(Messages.BpwmeNewDiagramFileWizard_RootSelectionPageNoSelectionMessage);
//				return false;
//			}
//			boolean result = ViewService.getInstance().provides(
//					new CreateDiagramViewOperation(new EObjectAdapter(
//							selectedModelElement),
//							WorkflowMapEditPart.MODEL_ID,
//							BpwmeDiagramEditorPlugin.DIAGRAM_PREFERENCES_HINT));
//			setErrorMessage(result ? null
//					: Messages.BpwmeNewDiagramFileWizard_RootSelectionPageInvalidSelectionMessage);
//			return result;
//		}
//	}
}

/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.ow2.aspirerfid.ide.bpwme.provider;



import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;
import org.ow2.aspirerfid.ide.bpwme.BpwmePackage;
import org.ow2.aspirerfid.ide.bpwme.EBProc;
import org.ow2.aspirerfid.ide.bpwme.impl.EBProcImpl;

/**
 * This is the item provider adapter for a {@link org.ow2.aspirerfid.ide.bpwme.EBProc} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class EBProcItemProvider
	extends NodeItemProvider
	implements
		IEditingDomainItemProvider,
		IStructuredItemContentProvider,
		ITreeItemContentProvider,
		IItemLabelProvider,
		IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EBProcItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);
			//object is an instance of EBProc
			addDescriptionPropertyDescriptor(object);
			addNamePropertyDescriptor(object);
			addIdPropertyDescriptor(object);
			//addTestPropertyDescriptor(object);
			addExtendedAttributesPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Description feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDescriptionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_EBProc_description_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_EBProc_description_feature", "_UI_EBProc_type"),
				 BpwmePackage.Literals.EB_PROC__DESCRIPTION,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}
	
	//robert added
	protected void addTestPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(new FakeItemPropertyDescriptor(object));
	}
	
	
	class FakeItemPropertyDescriptor implements IItemPropertyDescriptor{
		EBProcImpl ebpi;
		
		public FakeItemPropertyDescriptor(Object object) {
			ebpi = (EBProcImpl)object;
		}
		@Override
		public boolean canSetProperty(Object object) {
			// TODO Auto-generated method stub
			return false;
		}

		@Override
		public String getCategory(Object object) {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public Collection<?> getChoiceOfValues(Object object) {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public String getDescription(Object object) {
			return "Test Property";
		}

		@Override
		public String getDisplayName(Object object) {
			return "Test Property";
		}

		@Override
		public Object getFeature(Object object) {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public String[] getFilterFlags(Object object) {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public Object getHelpContextIds(Object object) {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public String getId(Object object) {

			return null;
		}

		@Override
		public IItemLabelProvider getLabelProvider(Object object) {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public Object getPropertyValue(Object object) {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public boolean isCompatibleWith(Object object, Object anotherObject,
				IItemPropertyDescriptor anotherPropertyDescriptor) {
			// TODO Auto-generated method stub
			return false;
		}

		@Override
		public boolean isMany(Object object) {
			// TODO Auto-generated method stub
			return false;
		}

		@Override
		public boolean isMultiLine(Object object) {
			// TODO Auto-generated method stub
			return false;
		}

		@Override
		public boolean isPropertySet(Object object) {
			// TODO Auto-generated method stub
			return false;
		}

		@Override
		public boolean isSortChoices(Object object) {
			// TODO Auto-generated method stub
			return false;
		}

		@Override
		public void resetPropertyValue(Object object) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void setPropertyValue(Object object, Object value) {
			// TODO Auto-generated method stub			
		}
		
	}

	/**
	 * This adds a property descriptor for the Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_EBProc_name_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_EBProc_name_feature", "_UI_EBProc_type"),
				 BpwmePackage.Literals.EB_PROC__NAME,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Id feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIdPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_EBProc_id_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_EBProc_id_feature", "_UI_EBProc_type"),
				 BpwmePackage.Literals.EB_PROC__ID,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Extended Attributes feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addExtendedAttributesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_EBProc_extendedAttributes_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_EBProc_extendedAttributes_feature", "_UI_EBProc_type"),
				 BpwmePackage.Literals.EB_PROC__EXTENDED_ATTRIBUTES,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This returns EBProc.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/EBProc"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((EBProc)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_EBProc_type") :
			getString("_UI_EBProc_type") + " " + label;
	}

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(EBProc.class)) {
			case BpwmePackage.EB_PROC__DESCRIPTION:
			case BpwmePackage.EB_PROC__NAME:
			case BpwmePackage.EB_PROC__ID:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
		}
		super.notifyChanged(notification);
	}
	

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);
	}

}

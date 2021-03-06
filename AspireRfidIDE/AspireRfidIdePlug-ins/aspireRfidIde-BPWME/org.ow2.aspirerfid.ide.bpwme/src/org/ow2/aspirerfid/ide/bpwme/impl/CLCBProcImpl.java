/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.ow2.aspirerfid.ide.bpwme.impl;


import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.ow2.aspirerfid.ide.bpwme.BpwmePackage;
import org.ow2.aspirerfid.ide.bpwme.CLCBProc;
import org.ow2.aspirerfid.ide.bpwme.EBProc;
import org.ow2.aspirerfid.ide.bpwme.util.BpwmeAssistant;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CLCB Proc</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.ow2.aspirerfid.ide.bpwme.impl.CLCBProcImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.ow2.aspirerfid.ide.bpwme.impl.CLCBProcImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.ow2.aspirerfid.ide.bpwme.impl.CLCBProcImpl#getId <em>Id</em>}</li>
 *   <li>{@link org.ow2.aspirerfid.ide.bpwme.impl.CLCBProcImpl#getTransitions <em>Transitions</em>}</li>
 *   <li>{@link org.ow2.aspirerfid.ide.bpwme.impl.CLCBProcImpl#getEBProc <em>EB Proc</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CLCBProcImpl extends NodeImpl implements CLCBProc {
	/**
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = "";

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected String description = DESCRIPTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = "";

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_EDEFAULT = "";

	/**
	 * The default value of the '{@link #getBizLocationFile() <em>Biz Location File</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBizLocationFile()
	 * @generated
	 * @ordered
	 */
	protected static final String BIZ_LOCATION_FILE_EDEFAULT = "";

	/**
	 * The cached value of the '{@link #getBizLocationFile() <em>Biz Location File</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBizLocationFile()
	 * @generated
	 * @ordered
	 */
	protected String bizLocationFile = BIZ_LOCATION_FILE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected String id = BpwmeAssistant.getUniqueCLCBID();

	/**
	 * The cached value of the '{@link #getEBProc() <em>EB Proc</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEBProc()
	 * @generated
	 * @ordered
	 */
	protected EList<EBProc> eBProc;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CLCBProcImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BpwmePackage.Literals.CLCB_PROC;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(String newDescription) {
		String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BpwmePackage.CLCB_PROC__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BpwmePackage.CLCB_PROC__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setId(String newId) {
		String oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BpwmePackage.CLCB_PROC__ID, oldId, id));
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getBizLocationFile() {
		return bizLocationFile;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBizLocationFile(String newBizLocationFile) {
		String oldBizLocationFile = bizLocationFile;
		bizLocationFile = newBizLocationFile;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BpwmePackage.CLCB_PROC__BIZ_LOCATION_FILE, oldBizLocationFile, bizLocationFile));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EBProc> getEBProc() {
		if (eBProc == null) {
			eBProc = new EObjectContainmentEList<EBProc>(EBProc.class, this, BpwmePackage.CLCB_PROC__EB_PROC);
		}
		return eBProc;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BpwmePackage.CLCB_PROC__EB_PROC:
				return ((InternalEList<?>)getEBProc()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case BpwmePackage.CLCB_PROC__DESCRIPTION:
				return getDescription();
			case BpwmePackage.CLCB_PROC__NAME:
				return getName();
			case BpwmePackage.CLCB_PROC__ID:
				return getId();
			case BpwmePackage.CLCB_PROC__EB_PROC:
				return getEBProc();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case BpwmePackage.CLCB_PROC__ID:
				setId((String)newValue);
				return;
			case BpwmePackage.CLCB_PROC__NAME:
				setName((String)newValue);
				return;
			case BpwmePackage.CLCB_PROC__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case BpwmePackage.CLCB_PROC__BIZ_LOCATION_FILE:
				setBizLocationFile((String)newValue);
				return;
			case BpwmePackage.CLCB_PROC__EB_PROC:
				getEBProc().clear();
				getEBProc().addAll((Collection<? extends EBProc>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case BpwmePackage.CLCB_PROC__ID:
				setId(ID_EDEFAULT);
				return;
			case BpwmePackage.CLCB_PROC__NAME:
				setName(NAME_EDEFAULT);
				return;
			case BpwmePackage.CLCB_PROC__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case BpwmePackage.CLCB_PROC__BIZ_LOCATION_FILE:
				setBizLocationFile(BIZ_LOCATION_FILE_EDEFAULT);
				return;
			case BpwmePackage.CLCB_PROC__EB_PROC:
				getEBProc().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case BpwmePackage.CLCB_PROC__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case BpwmePackage.CLCB_PROC__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case BpwmePackage.CLCB_PROC__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case BpwmePackage.CLCB_PROC__BIZ_LOCATION_FILE:
				return BIZ_LOCATION_FILE_EDEFAULT == null ? bizLocationFile != null : !BIZ_LOCATION_FILE_EDEFAULT.equals(bizLocationFile);
			case BpwmePackage.CLCB_PROC__EB_PROC:
				return eBProc != null && !eBProc.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (id: ");
		result.append(id);
		result.append(", name: ");
		result.append(name);
		result.append(", description: ");
		result.append(description);
		result.append(", bizLocationFile: ");
		result.append(bizLocationFile);
		result.append(')');
		return result.toString();
	}

} //CLCBProcImpl

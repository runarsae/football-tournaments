/**
 */
package ft.impl;

import ft.Club;
import ft.FtPackage;
import ft.Region;
import ft.Tournament;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Region</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ft.impl.RegionImpl#getName <em>Name</em>}</li>
 *   <li>{@link ft.impl.RegionImpl#getClubs <em>Clubs</em>}</li>
 *   <li>{@link ft.impl.RegionImpl#getTournaments <em>Tournaments</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RegionImpl extends MinimalEObjectImpl.Container implements Region {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

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
	 * The cached value of the '{@link #getClubs() <em>Clubs</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClubs()
	 * @generated
	 * @ordered
	 */
	protected EList<Club> clubs;

	/**
	 * The cached value of the '{@link #getTournaments() <em>Tournaments</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTournaments()
	 * @generated
	 * @ordered
	 */
	protected EList<Tournament> tournaments;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RegionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FtPackage.Literals.REGION;
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
			eNotify(new ENotificationImpl(this, Notification.SET, FtPackage.REGION__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Club> getClubs() {
		if (clubs == null) {
			clubs = new EObjectContainmentWithInverseEList<Club>(Club.class, this, FtPackage.REGION__CLUBS, FtPackage.CLUB__REGION);
		}
		return clubs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Tournament> getTournaments() {
		if (tournaments == null) {
			tournaments = new EObjectContainmentWithInverseEList<Tournament>(Tournament.class, this, FtPackage.REGION__TOURNAMENTS, FtPackage.TOURNAMENT__REGION);
		}
		return tournaments;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FtPackage.REGION__CLUBS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getClubs()).basicAdd(otherEnd, msgs);
			case FtPackage.REGION__TOURNAMENTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getTournaments()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FtPackage.REGION__CLUBS:
				return ((InternalEList<?>)getClubs()).basicRemove(otherEnd, msgs);
			case FtPackage.REGION__TOURNAMENTS:
				return ((InternalEList<?>)getTournaments()).basicRemove(otherEnd, msgs);
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
			case FtPackage.REGION__NAME:
				return getName();
			case FtPackage.REGION__CLUBS:
				return getClubs();
			case FtPackage.REGION__TOURNAMENTS:
				return getTournaments();
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
			case FtPackage.REGION__NAME:
				setName((String)newValue);
				return;
			case FtPackage.REGION__CLUBS:
				getClubs().clear();
				getClubs().addAll((Collection<? extends Club>)newValue);
				return;
			case FtPackage.REGION__TOURNAMENTS:
				getTournaments().clear();
				getTournaments().addAll((Collection<? extends Tournament>)newValue);
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
			case FtPackage.REGION__NAME:
				setName(NAME_EDEFAULT);
				return;
			case FtPackage.REGION__CLUBS:
				getClubs().clear();
				return;
			case FtPackage.REGION__TOURNAMENTS:
				getTournaments().clear();
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
			case FtPackage.REGION__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case FtPackage.REGION__CLUBS:
				return clubs != null && !clubs.isEmpty();
			case FtPackage.REGION__TOURNAMENTS:
				return tournaments != null && !tournaments.isEmpty();
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

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //RegionImpl

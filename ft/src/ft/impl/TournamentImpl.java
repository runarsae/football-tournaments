/**
 */
package ft.impl;

import ft.AbstractHost;
import ft.FtPackage;
import ft.GenderKind;
import ft.Season;
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
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Tournament</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ft.impl.TournamentImpl#getName <em>Name</em>}</li>
 *   <li>{@link ft.impl.TournamentImpl#getGender <em>Gender</em>}</li>
 *   <li>{@link ft.impl.TournamentImpl#getHost <em>Host</em>}</li>
 *   <li>{@link ft.impl.TournamentImpl#getSeasons <em>Seasons</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TournamentImpl extends MinimalEObjectImpl.Container implements Tournament {
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
	 * The default value of the '{@link #getGender() <em>Gender</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGender()
	 * @generated
	 * @ordered
	 */
	protected static final GenderKind GENDER_EDEFAULT = GenderKind.MALE;

	/**
	 * The cached value of the '{@link #getGender() <em>Gender</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGender()
	 * @generated
	 * @ordered
	 */
	protected GenderKind gender = GENDER_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSeasons() <em>Seasons</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSeasons()
	 * @generated
	 * @ordered
	 */
	protected EList<Season> seasons;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TournamentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FtPackage.Literals.TOURNAMENT;
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
			eNotify(new ENotificationImpl(this, Notification.SET, FtPackage.TOURNAMENT__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenderKind getGender() {
		return gender;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGender(GenderKind newGender) {
		GenderKind oldGender = gender;
		gender = newGender == null ? GENDER_EDEFAULT : newGender;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FtPackage.TOURNAMENT__GENDER, oldGender, gender));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractHost getHost() {
		if (eContainerFeatureID() != FtPackage.TOURNAMENT__HOST) return null;
		return (AbstractHost)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetHost(AbstractHost newHost, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newHost, FtPackage.TOURNAMENT__HOST, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHost(AbstractHost newHost) {
		if (newHost != eInternalContainer() || (eContainerFeatureID() != FtPackage.TOURNAMENT__HOST && newHost != null)) {
			if (EcoreUtil.isAncestor(this, newHost))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newHost != null)
				msgs = ((InternalEObject)newHost).eInverseAdd(this, FtPackage.ABSTRACT_HOST__TOURNAMENTS, AbstractHost.class, msgs);
			msgs = basicSetHost(newHost, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FtPackage.TOURNAMENT__HOST, newHost, newHost));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Season> getSeasons() {
		if (seasons == null) {
			seasons = new EObjectContainmentWithInverseEList<Season>(Season.class, this, FtPackage.TOURNAMENT__SEASONS, FtPackage.SEASON__TOURNAMENT);
		}
		return seasons;
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
			case FtPackage.TOURNAMENT__HOST:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetHost((AbstractHost)otherEnd, msgs);
			case FtPackage.TOURNAMENT__SEASONS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getSeasons()).basicAdd(otherEnd, msgs);
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
			case FtPackage.TOURNAMENT__HOST:
				return basicSetHost(null, msgs);
			case FtPackage.TOURNAMENT__SEASONS:
				return ((InternalEList<?>)getSeasons()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case FtPackage.TOURNAMENT__HOST:
				return eInternalContainer().eInverseRemove(this, FtPackage.ABSTRACT_HOST__TOURNAMENTS, AbstractHost.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case FtPackage.TOURNAMENT__NAME:
				return getName();
			case FtPackage.TOURNAMENT__GENDER:
				return getGender();
			case FtPackage.TOURNAMENT__HOST:
				return getHost();
			case FtPackage.TOURNAMENT__SEASONS:
				return getSeasons();
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
			case FtPackage.TOURNAMENT__NAME:
				setName((String)newValue);
				return;
			case FtPackage.TOURNAMENT__GENDER:
				setGender((GenderKind)newValue);
				return;
			case FtPackage.TOURNAMENT__HOST:
				setHost((AbstractHost)newValue);
				return;
			case FtPackage.TOURNAMENT__SEASONS:
				getSeasons().clear();
				getSeasons().addAll((Collection<? extends Season>)newValue);
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
			case FtPackage.TOURNAMENT__NAME:
				setName(NAME_EDEFAULT);
				return;
			case FtPackage.TOURNAMENT__GENDER:
				setGender(GENDER_EDEFAULT);
				return;
			case FtPackage.TOURNAMENT__HOST:
				setHost((AbstractHost)null);
				return;
			case FtPackage.TOURNAMENT__SEASONS:
				getSeasons().clear();
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
			case FtPackage.TOURNAMENT__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case FtPackage.TOURNAMENT__GENDER:
				return gender != GENDER_EDEFAULT;
			case FtPackage.TOURNAMENT__HOST:
				return getHost() != null;
			case FtPackage.TOURNAMENT__SEASONS:
				return seasons != null && !seasons.isEmpty();
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
		result.append(", gender: ");
		result.append(gender);
		result.append(')');
		return result.toString();
	}

} //TournamentImpl

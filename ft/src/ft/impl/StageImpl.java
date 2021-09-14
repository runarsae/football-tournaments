/**
 */
package ft.impl;

import ft.Club;
import ft.FtPackage;
import ft.Round;
import ft.Season;
import ft.Stage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Stage</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ft.impl.StageImpl#getSeason <em>Season</em>}</li>
 *   <li>{@link ft.impl.StageImpl#getRounds <em>Rounds</em>}</li>
 *   <li>{@link ft.impl.StageImpl#getClubs <em>Clubs</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StageImpl extends MinimalEObjectImpl.Container implements Stage {
	/**
	 * The cached value of the '{@link #getRounds() <em>Rounds</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRounds()
	 * @generated
	 * @ordered
	 */
	protected EList<Round> rounds;

	/**
	 * The cached value of the '{@link #getClubs() <em>Clubs</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClubs()
	 * @generated
	 * @ordered
	 */
	protected EList<Club> clubs;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StageImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FtPackage.Literals.STAGE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Season getSeason() {
		if (eContainerFeatureID() != FtPackage.STAGE__SEASON) return null;
		return (Season)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSeason(Season newSeason, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newSeason, FtPackage.STAGE__SEASON, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSeason(Season newSeason) {
		if (newSeason != eInternalContainer() || (eContainerFeatureID() != FtPackage.STAGE__SEASON && newSeason != null)) {
			if (EcoreUtil.isAncestor(this, newSeason))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newSeason != null)
				msgs = ((InternalEObject)newSeason).eInverseAdd(this, FtPackage.SEASON__STAGES, Season.class, msgs);
			msgs = basicSetSeason(newSeason, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FtPackage.STAGE__SEASON, newSeason, newSeason));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Round> getRounds() {
		if (rounds == null) {
			rounds = new EObjectContainmentWithInverseEList<Round>(Round.class, this, FtPackage.STAGE__ROUNDS, FtPackage.ROUND__STAGE);
		}
		return rounds;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Club> getClubs() {
		if (clubs == null) {
			clubs = new EObjectResolvingEList<Club>(Club.class, this, FtPackage.STAGE__CLUBS);
		}
		return clubs;
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
			case FtPackage.STAGE__SEASON:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetSeason((Season)otherEnd, msgs);
			case FtPackage.STAGE__ROUNDS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getRounds()).basicAdd(otherEnd, msgs);
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
			case FtPackage.STAGE__SEASON:
				return basicSetSeason(null, msgs);
			case FtPackage.STAGE__ROUNDS:
				return ((InternalEList<?>)getRounds()).basicRemove(otherEnd, msgs);
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
			case FtPackage.STAGE__SEASON:
				return eInternalContainer().eInverseRemove(this, FtPackage.SEASON__STAGES, Season.class, msgs);
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
			case FtPackage.STAGE__SEASON:
				return getSeason();
			case FtPackage.STAGE__ROUNDS:
				return getRounds();
			case FtPackage.STAGE__CLUBS:
				return getClubs();
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
			case FtPackage.STAGE__SEASON:
				setSeason((Season)newValue);
				return;
			case FtPackage.STAGE__ROUNDS:
				getRounds().clear();
				getRounds().addAll((Collection<? extends Round>)newValue);
				return;
			case FtPackage.STAGE__CLUBS:
				getClubs().clear();
				getClubs().addAll((Collection<? extends Club>)newValue);
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
			case FtPackage.STAGE__SEASON:
				setSeason((Season)null);
				return;
			case FtPackage.STAGE__ROUNDS:
				getRounds().clear();
				return;
			case FtPackage.STAGE__CLUBS:
				getClubs().clear();
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
			case FtPackage.STAGE__SEASON:
				return getSeason() != null;
			case FtPackage.STAGE__ROUNDS:
				return rounds != null && !rounds.isEmpty();
			case FtPackage.STAGE__CLUBS:
				return clubs != null && !clubs.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //StageImpl

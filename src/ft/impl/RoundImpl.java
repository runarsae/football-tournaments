/**
 */
package ft.impl;

import ft.FtPackage;
import ft.Match;
import ft.Round;
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
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Round</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ft.impl.RoundImpl#getRoundNumber <em>Round Number</em>}</li>
 *   <li>{@link ft.impl.RoundImpl#getMatches <em>Matches</em>}</li>
 *   <li>{@link ft.impl.RoundImpl#getStage <em>Stage</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RoundImpl extends MinimalEObjectImpl.Container implements Round {
	/**
	 * The default value of the '{@link #getRoundNumber() <em>Round Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoundNumber()
	 * @generated
	 * @ordered
	 */
	protected static final int ROUND_NUMBER_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getRoundNumber() <em>Round Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoundNumber()
	 * @generated
	 * @ordered
	 */
	protected int roundNumber = ROUND_NUMBER_EDEFAULT;

	/**
	 * The cached value of the '{@link #getMatches() <em>Matches</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMatches()
	 * @generated
	 * @ordered
	 */
	protected EList<Match> matches;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RoundImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FtPackage.Literals.ROUND;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getRoundNumber() {
		return roundNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRoundNumber(int newRoundNumber) {
		int oldRoundNumber = roundNumber;
		roundNumber = newRoundNumber;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FtPackage.ROUND__ROUND_NUMBER, oldRoundNumber, roundNumber));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Match> getMatches() {
		if (matches == null) {
			matches = new EObjectContainmentWithInverseEList<Match>(Match.class, this, FtPackage.ROUND__MATCHES, FtPackage.MATCH__ROUND);
		}
		return matches;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Stage getStage() {
		if (eContainerFeatureID() != FtPackage.ROUND__STAGE) return null;
		return (Stage)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStage(Stage newStage, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newStage, FtPackage.ROUND__STAGE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStage(Stage newStage) {
		if (newStage != eInternalContainer() || (eContainerFeatureID() != FtPackage.ROUND__STAGE && newStage != null)) {
			if (EcoreUtil.isAncestor(this, newStage))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newStage != null)
				msgs = ((InternalEObject)newStage).eInverseAdd(this, FtPackage.STAGE__ROUNDS, Stage.class, msgs);
			msgs = basicSetStage(newStage, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FtPackage.ROUND__STAGE, newStage, newStage));
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
			case FtPackage.ROUND__MATCHES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getMatches()).basicAdd(otherEnd, msgs);
			case FtPackage.ROUND__STAGE:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetStage((Stage)otherEnd, msgs);
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
			case FtPackage.ROUND__MATCHES:
				return ((InternalEList<?>)getMatches()).basicRemove(otherEnd, msgs);
			case FtPackage.ROUND__STAGE:
				return basicSetStage(null, msgs);
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
			case FtPackage.ROUND__STAGE:
				return eInternalContainer().eInverseRemove(this, FtPackage.STAGE__ROUNDS, Stage.class, msgs);
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
			case FtPackage.ROUND__ROUND_NUMBER:
				return getRoundNumber();
			case FtPackage.ROUND__MATCHES:
				return getMatches();
			case FtPackage.ROUND__STAGE:
				return getStage();
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
			case FtPackage.ROUND__ROUND_NUMBER:
				setRoundNumber((Integer)newValue);
				return;
			case FtPackage.ROUND__MATCHES:
				getMatches().clear();
				getMatches().addAll((Collection<? extends Match>)newValue);
				return;
			case FtPackage.ROUND__STAGE:
				setStage((Stage)newValue);
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
			case FtPackage.ROUND__ROUND_NUMBER:
				setRoundNumber(ROUND_NUMBER_EDEFAULT);
				return;
			case FtPackage.ROUND__MATCHES:
				getMatches().clear();
				return;
			case FtPackage.ROUND__STAGE:
				setStage((Stage)null);
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
			case FtPackage.ROUND__ROUND_NUMBER:
				return roundNumber != ROUND_NUMBER_EDEFAULT;
			case FtPackage.ROUND__MATCHES:
				return matches != null && !matches.isEmpty();
			case FtPackage.ROUND__STAGE:
				return getStage() != null;
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
		result.append(" (roundNumber: ");
		result.append(roundNumber);
		result.append(')');
		return result.toString();
	}

} //RoundImpl

/**
 */
package ft.impl;

import ft.AbstractResult;
import ft.Club;
import ft.FtPackage;
import ft.Match;
import ft.Round;

import java.time.LocalDateTime;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Match</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ft.impl.MatchImpl#getRound <em>Round</em>}</li>
 *   <li>{@link ft.impl.MatchImpl#getHomeClub <em>Home Club</em>}</li>
 *   <li>{@link ft.impl.MatchImpl#getAwayClub <em>Away Club</em>}</li>
 *   <li>{@link ft.impl.MatchImpl#getDate <em>Date</em>}</li>
 *   <li>{@link ft.impl.MatchImpl#getResult <em>Result</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MatchImpl extends MinimalEObjectImpl.Container implements Match {
	/**
	 * The cached value of the '{@link #getHomeClub() <em>Home Club</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHomeClub()
	 * @generated
	 * @ordered
	 */
	protected Club homeClub;

	/**
	 * The cached value of the '{@link #getAwayClub() <em>Away Club</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAwayClub()
	 * @generated
	 * @ordered
	 */
	protected Club awayClub;

	/**
	 * The default value of the '{@link #getDate() <em>Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDate()
	 * @generated
	 * @ordered
	 */
	protected static final LocalDateTime DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDate() <em>Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDate()
	 * @generated
	 * @ordered
	 */
	protected LocalDateTime date = DATE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getResult() <em>Result</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResult()
	 * @generated
	 * @ordered
	 */
	protected AbstractResult result;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MatchImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FtPackage.Literals.MATCH;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Round getRound() {
		if (eContainerFeatureID() != FtPackage.MATCH__ROUND) return null;
		return (Round)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRound(Round newRound, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newRound, FtPackage.MATCH__ROUND, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRound(Round newRound) {
		if (newRound != eInternalContainer() || (eContainerFeatureID() != FtPackage.MATCH__ROUND && newRound != null)) {
			if (EcoreUtil.isAncestor(this, newRound))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newRound != null)
				msgs = ((InternalEObject)newRound).eInverseAdd(this, FtPackage.ROUND__MATCHES, Round.class, msgs);
			msgs = basicSetRound(newRound, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FtPackage.MATCH__ROUND, newRound, newRound));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Club getHomeClub() {
		if (homeClub != null && homeClub.eIsProxy()) {
			InternalEObject oldHomeClub = (InternalEObject)homeClub;
			homeClub = (Club)eResolveProxy(oldHomeClub);
			if (homeClub != oldHomeClub) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FtPackage.MATCH__HOME_CLUB, oldHomeClub, homeClub));
			}
		}
		return homeClub;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Club basicGetHomeClub() {
		return homeClub;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHomeClub(Club newHomeClub) {
		Club oldHomeClub = homeClub;
		homeClub = newHomeClub;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FtPackage.MATCH__HOME_CLUB, oldHomeClub, homeClub));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Club getAwayClub() {
		if (awayClub != null && awayClub.eIsProxy()) {
			InternalEObject oldAwayClub = (InternalEObject)awayClub;
			awayClub = (Club)eResolveProxy(oldAwayClub);
			if (awayClub != oldAwayClub) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FtPackage.MATCH__AWAY_CLUB, oldAwayClub, awayClub));
			}
		}
		return awayClub;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Club basicGetAwayClub() {
		return awayClub;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAwayClub(Club newAwayClub) {
		Club oldAwayClub = awayClub;
		awayClub = newAwayClub;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FtPackage.MATCH__AWAY_CLUB, oldAwayClub, awayClub));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LocalDateTime getDate() {
		return date;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDate(LocalDateTime newDate) {
		LocalDateTime oldDate = date;
		date = newDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FtPackage.MATCH__DATE, oldDate, date));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractResult getResult() {
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetResult(AbstractResult newResult, NotificationChain msgs) {
		AbstractResult oldResult = result;
		result = newResult;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FtPackage.MATCH__RESULT, oldResult, newResult);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResult(AbstractResult newResult) {
		if (newResult != result) {
			NotificationChain msgs = null;
			if (result != null)
				msgs = ((InternalEObject)result).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FtPackage.MATCH__RESULT, null, msgs);
			if (newResult != null)
				msgs = ((InternalEObject)newResult).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FtPackage.MATCH__RESULT, null, msgs);
			msgs = basicSetResult(newResult, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FtPackage.MATCH__RESULT, newResult, newResult));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FtPackage.MATCH__ROUND:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetRound((Round)otherEnd, msgs);
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
			case FtPackage.MATCH__ROUND:
				return basicSetRound(null, msgs);
			case FtPackage.MATCH__RESULT:
				return basicSetResult(null, msgs);
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
			case FtPackage.MATCH__ROUND:
				return eInternalContainer().eInverseRemove(this, FtPackage.ROUND__MATCHES, Round.class, msgs);
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
			case FtPackage.MATCH__ROUND:
				return getRound();
			case FtPackage.MATCH__HOME_CLUB:
				if (resolve) return getHomeClub();
				return basicGetHomeClub();
			case FtPackage.MATCH__AWAY_CLUB:
				if (resolve) return getAwayClub();
				return basicGetAwayClub();
			case FtPackage.MATCH__DATE:
				return getDate();
			case FtPackage.MATCH__RESULT:
				return getResult();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case FtPackage.MATCH__ROUND:
				setRound((Round)newValue);
				return;
			case FtPackage.MATCH__HOME_CLUB:
				setHomeClub((Club)newValue);
				return;
			case FtPackage.MATCH__AWAY_CLUB:
				setAwayClub((Club)newValue);
				return;
			case FtPackage.MATCH__DATE:
				setDate((LocalDateTime)newValue);
				return;
			case FtPackage.MATCH__RESULT:
				setResult((AbstractResult)newValue);
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
			case FtPackage.MATCH__ROUND:
				setRound((Round)null);
				return;
			case FtPackage.MATCH__HOME_CLUB:
				setHomeClub((Club)null);
				return;
			case FtPackage.MATCH__AWAY_CLUB:
				setAwayClub((Club)null);
				return;
			case FtPackage.MATCH__DATE:
				setDate(DATE_EDEFAULT);
				return;
			case FtPackage.MATCH__RESULT:
				setResult((AbstractResult)null);
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
			case FtPackage.MATCH__ROUND:
				return getRound() != null;
			case FtPackage.MATCH__HOME_CLUB:
				return homeClub != null;
			case FtPackage.MATCH__AWAY_CLUB:
				return awayClub != null;
			case FtPackage.MATCH__DATE:
				return DATE_EDEFAULT == null ? date != null : !DATE_EDEFAULT.equals(date);
			case FtPackage.MATCH__RESULT:
				return result != null;
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
		result.append(" (date: ");
		result.append(date);
		result.append(')');
		return result.toString();
	}

} //MatchImpl

/**
 */
package ft.impl;

import ft.Club;
import ft.FtPackage;
import ft.Season;
import ft.Stage;
import ft.Tournament;

import java.time.LocalDate;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Season</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ft.impl.SeasonImpl#getStartDate <em>Start Date</em>}</li>
 *   <li>{@link ft.impl.SeasonImpl#getEndDate <em>End Date</em>}</li>
 *   <li>{@link ft.impl.SeasonImpl#getYearIdentifier <em>Year Identifier</em>}</li>
 *   <li>{@link ft.impl.SeasonImpl#getTournament <em>Tournament</em>}</li>
 *   <li>{@link ft.impl.SeasonImpl#getClubs <em>Clubs</em>}</li>
 *   <li>{@link ft.impl.SeasonImpl#getStage <em>Stage</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SeasonImpl extends MinimalEObjectImpl.Container implements Season {
	/**
	 * The default value of the '{@link #getStartDate() <em>Start Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartDate()
	 * @generated
	 * @ordered
	 */
	protected static final LocalDate START_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStartDate() <em>Start Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartDate()
	 * @generated
	 * @ordered
	 */
	protected LocalDate startDate = START_DATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getEndDate() <em>End Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndDate()
	 * @generated
	 * @ordered
	 */
	protected static final LocalDate END_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEndDate() <em>End Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndDate()
	 * @generated
	 * @ordered
	 */
	protected LocalDate endDate = END_DATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getYearIdentifier() <em>Year Identifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getYearIdentifier()
	 * @generated
	 * @ordered
	 */
	protected static final String YEAR_IDENTIFIER_EDEFAULT = null;

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
	 * The cached value of the '{@link #getStage() <em>Stage</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStage()
	 * @generated
	 * @ordered
	 */
	protected Stage stage;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SeasonImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FtPackage.Literals.SEASON;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LocalDate getStartDate() {
		return startDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStartDate(LocalDate newStartDate) {
		LocalDate oldStartDate = startDate;
		startDate = newStartDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FtPackage.SEASON__START_DATE, oldStartDate, startDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LocalDate getEndDate() {
		return endDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEndDate(LocalDate newEndDate) {
		LocalDate oldEndDate = endDate;
		endDate = newEndDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FtPackage.SEASON__END_DATE, oldEndDate, endDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public String getYearIdentifier() {
		// Use startDate and endDate to generate the years the season stretches over
		// E.g. "2021" or "2021/2022"
		Integer startYear = this.startDate.getYear();
		Integer endYear = this.endDate.getYear();
		
		if (startYear == endYear || (endYear - startYear > 1)) {
			return startYear.toString();
		}
		
		return startYear.toString() + "/" + endYear.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Tournament getTournament() {
		if (eContainerFeatureID() != FtPackage.SEASON__TOURNAMENT) return null;
		return (Tournament)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTournament(Tournament newTournament, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newTournament, FtPackage.SEASON__TOURNAMENT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTournament(Tournament newTournament) {
		if (newTournament != eInternalContainer() || (eContainerFeatureID() != FtPackage.SEASON__TOURNAMENT && newTournament != null)) {
			if (EcoreUtil.isAncestor(this, newTournament))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newTournament != null)
				msgs = ((InternalEObject)newTournament).eInverseAdd(this, FtPackage.TOURNAMENT__SEASONS, Tournament.class, msgs);
			msgs = basicSetTournament(newTournament, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FtPackage.SEASON__TOURNAMENT, newTournament, newTournament));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Club> getClubs() {
		if (clubs == null) {
			clubs = new EObjectResolvingEList<Club>(Club.class, this, FtPackage.SEASON__CLUBS);
		}
		return clubs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Stage getStage() {
		return stage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStage(Stage newStage, NotificationChain msgs) {
		Stage oldStage = stage;
		stage = newStage;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FtPackage.SEASON__STAGE, oldStage, newStage);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStage(Stage newStage) {
		if (newStage != stage) {
			NotificationChain msgs = null;
			if (stage != null)
				msgs = ((InternalEObject)stage).eInverseRemove(this, FtPackage.STAGE__SEASON, Stage.class, msgs);
			if (newStage != null)
				msgs = ((InternalEObject)newStage).eInverseAdd(this, FtPackage.STAGE__SEASON, Stage.class, msgs);
			msgs = basicSetStage(newStage, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FtPackage.SEASON__STAGE, newStage, newStage));
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
			case FtPackage.SEASON__TOURNAMENT:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetTournament((Tournament)otherEnd, msgs);
			case FtPackage.SEASON__STAGE:
				if (stage != null)
					msgs = ((InternalEObject)stage).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FtPackage.SEASON__STAGE, null, msgs);
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
			case FtPackage.SEASON__TOURNAMENT:
				return basicSetTournament(null, msgs);
			case FtPackage.SEASON__STAGE:
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
			case FtPackage.SEASON__TOURNAMENT:
				return eInternalContainer().eInverseRemove(this, FtPackage.TOURNAMENT__SEASONS, Tournament.class, msgs);
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
			case FtPackage.SEASON__START_DATE:
				return getStartDate();
			case FtPackage.SEASON__END_DATE:
				return getEndDate();
			case FtPackage.SEASON__YEAR_IDENTIFIER:
				return getYearIdentifier();
			case FtPackage.SEASON__TOURNAMENT:
				return getTournament();
			case FtPackage.SEASON__CLUBS:
				return getClubs();
			case FtPackage.SEASON__STAGE:
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
			case FtPackage.SEASON__START_DATE:
				setStartDate((LocalDate)newValue);
				return;
			case FtPackage.SEASON__END_DATE:
				setEndDate((LocalDate)newValue);
				return;
			case FtPackage.SEASON__TOURNAMENT:
				setTournament((Tournament)newValue);
				return;
			case FtPackage.SEASON__CLUBS:
				getClubs().clear();
				getClubs().addAll((Collection<? extends Club>)newValue);
				return;
			case FtPackage.SEASON__STAGE:
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
			case FtPackage.SEASON__START_DATE:
				setStartDate(START_DATE_EDEFAULT);
				return;
			case FtPackage.SEASON__END_DATE:
				setEndDate(END_DATE_EDEFAULT);
				return;
			case FtPackage.SEASON__TOURNAMENT:
				setTournament((Tournament)null);
				return;
			case FtPackage.SEASON__CLUBS:
				getClubs().clear();
				return;
			case FtPackage.SEASON__STAGE:
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
			case FtPackage.SEASON__START_DATE:
				return START_DATE_EDEFAULT == null ? startDate != null : !START_DATE_EDEFAULT.equals(startDate);
			case FtPackage.SEASON__END_DATE:
				return END_DATE_EDEFAULT == null ? endDate != null : !END_DATE_EDEFAULT.equals(endDate);
			case FtPackage.SEASON__YEAR_IDENTIFIER:
				return YEAR_IDENTIFIER_EDEFAULT == null ? getYearIdentifier() != null : !YEAR_IDENTIFIER_EDEFAULT.equals(getYearIdentifier());
			case FtPackage.SEASON__TOURNAMENT:
				return getTournament() != null;
			case FtPackage.SEASON__CLUBS:
				return clubs != null && !clubs.isEmpty();
			case FtPackage.SEASON__STAGE:
				return stage != null;
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
		result.append(" (startDate: ");
		result.append(startDate);
		result.append(", endDate: ");
		result.append(endDate);
		result.append(')');
		return result.toString();
	}

} //SeasonImpl

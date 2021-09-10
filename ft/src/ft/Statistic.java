/**
 */
package ft;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Statistic</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ft.Statistic#getClub <em>Club</em>}</li>
 *   <li>{@link ft.Statistic#getPosition <em>Position</em>}</li>
 *   <li>{@link ft.Statistic#getPlayed <em>Played</em>}</li>
 *   <li>{@link ft.Statistic#getWon <em>Won</em>}</li>
 *   <li>{@link ft.Statistic#getDrawn <em>Drawn</em>}</li>
 *   <li>{@link ft.Statistic#getLost <em>Lost</em>}</li>
 *   <li>{@link ft.Statistic#getGoalsFor <em>Goals For</em>}</li>
 *   <li>{@link ft.Statistic#getGoalsAgainst <em>Goals Against</em>}</li>
 *   <li>{@link ft.Statistic#getGoalDifference <em>Goal Difference</em>}</li>
 *   <li>{@link ft.Statistic#getPoints <em>Points</em>}</li>
 *   <li>{@link ft.Statistic#getForm <em>Form</em>}</li>
 * </ul>
 *
 * @see ft.FtPackage#getStatistic()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='clubMustBeInSeason clubMustBeInOnlyOneStatisticPerTable'"
 *        annotation="http://www.eclipse.org/acceleo/query/1.0 clubMustBeInSeason='self.eContainer().stage.season.clubs-&gt;includes(self.club)' clubMustBeInOnlyOneStatisticPerTable='self.eContainer().statistics.club-&gt;count(self.club) = 1'"
 * @generated
 */
public interface Statistic extends EObject {
	/**
	 * Returns the value of the '<em><b>Club</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Club</em>' reference.
	 * @see #setClub(Club)
	 * @see ft.FtPackage#getStatistic_Club()
	 * @model required="true" transient="true"
	 * @generated
	 */
	Club getClub();

	/**
	 * Sets the value of the '{@link ft.Statistic#getClub <em>Club</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Club</em>' reference.
	 * @see #getClub()
	 * @generated
	 */
	void setClub(Club value);

	/**
	 * Returns the value of the '<em><b>Position</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Position</em>' attribute.
	 * @see ft.FtPackage#getStatistic_Position()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	int getPosition();

	/**
	 * Returns the value of the '<em><b>Played</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Played</em>' attribute.
	 * @see ft.FtPackage#getStatistic_Played()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	int getPlayed();

	/**
	 * Returns the value of the '<em><b>Won</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Won</em>' attribute.
	 * @see ft.FtPackage#getStatistic_Won()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	int getWon();

	/**
	 * Returns the value of the '<em><b>Drawn</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Drawn</em>' attribute.
	 * @see ft.FtPackage#getStatistic_Drawn()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	int getDrawn();

	/**
	 * Returns the value of the '<em><b>Lost</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lost</em>' attribute.
	 * @see ft.FtPackage#getStatistic_Lost()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	int getLost();

	/**
	 * Returns the value of the '<em><b>Goals For</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Goals For</em>' attribute.
	 * @see ft.FtPackage#getStatistic_GoalsFor()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	int getGoalsFor();

	/**
	 * Returns the value of the '<em><b>Goals Against</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Goals Against</em>' attribute.
	 * @see ft.FtPackage#getStatistic_GoalsAgainst()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	int getGoalsAgainst();

	/**
	 * Returns the value of the '<em><b>Goal Difference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Goal Difference</em>' attribute.
	 * @see ft.FtPackage#getStatistic_GoalDifference()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	int getGoalDifference();

	/**
	 * Returns the value of the '<em><b>Points</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Points</em>' attribute.
	 * @see ft.FtPackage#getStatistic_Points()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	int getPoints();

	/**
	 * Returns the value of the '<em><b>Form</b></em>' attribute list.
	 * The list contents are of type {@link ft.ResultKind}.
	 * The literals are from the enumeration {@link ft.ResultKind}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Form</em>' attribute list.
	 * @see ft.ResultKind
	 * @see ft.FtPackage#getStatistic_Form()
	 * @model upper="6" transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	EList<ResultKind> getForm();

} // Statistic

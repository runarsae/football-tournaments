/**
 */
package ft;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Stage Club Stats</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ft.StageClubStats#getPosition <em>Position</em>}</li>
 *   <li>{@link ft.StageClubStats#getClub <em>Club</em>}</li>
 *   <li>{@link ft.StageClubStats#getStage <em>Stage</em>}</li>
 *   <li>{@link ft.StageClubStats#getPlayed <em>Played</em>}</li>
 *   <li>{@link ft.StageClubStats#getWon <em>Won</em>}</li>
 *   <li>{@link ft.StageClubStats#getDrawn <em>Drawn</em>}</li>
 *   <li>{@link ft.StageClubStats#getLost <em>Lost</em>}</li>
 *   <li>{@link ft.StageClubStats#getGoalsFor <em>Goals For</em>}</li>
 *   <li>{@link ft.StageClubStats#getGoalsAgainst <em>Goals Against</em>}</li>
 *   <li>{@link ft.StageClubStats#getGoalDifference <em>Goal Difference</em>}</li>
 *   <li>{@link ft.StageClubStats#getPoints <em>Points</em>}</li>
 *   <li>{@link ft.StageClubStats#getForm <em>Form</em>}</li>
 * </ul>
 *
 * @see ft.FtPackage#getStageClubStats()
 * @model
 * @generated
 */
public interface StageClubStats extends EObject {
	/**
	 * Returns the value of the '<em><b>Position</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Position</em>' attribute.
	 * @see ft.FtPackage#getStageClubStats_Position()
	 * @model required="true" changeable="false" derived="true"
	 * @generated
	 */
	int getPosition();

	/**
	 * Returns the value of the '<em><b>Stage</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Stage</em>' reference.
	 * @see ft.FtPackage#getStageClubStats_Stage()
	 * @model required="true" changeable="false" derived="true"
	 * @generated
	 */
	Stage getStage();

	/**
	 * Returns the value of the '<em><b>Club</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Club</em>' reference.
	 * @see ft.FtPackage#getStageClubStats_Club()
	 * @model required="true" changeable="false" derived="true"
	 * @generated
	 */
	Club getClub();

	/**
	 * Returns the value of the '<em><b>Played</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Played</em>' attribute.
	 * @see ft.FtPackage#getStageClubStats_Played()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	int getPlayed();

	/**
	 * Returns the value of the '<em><b>Won</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Won</em>' attribute.
	 * @see ft.FtPackage#getStageClubStats_Won()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	int getWon();

	/**
	 * Returns the value of the '<em><b>Drawn</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Drawn</em>' attribute.
	 * @see ft.FtPackage#getStageClubStats_Drawn()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	int getDrawn();

	/**
	 * Returns the value of the '<em><b>Lost</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lost</em>' attribute.
	 * @see ft.FtPackage#getStageClubStats_Lost()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	int getLost();

	/**
	 * Returns the value of the '<em><b>Goals For</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Goals For</em>' attribute.
	 * @see ft.FtPackage#getStageClubStats_GoalsFor()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	int getGoalsFor();

	/**
	 * Returns the value of the '<em><b>Goals Against</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Goals Against</em>' attribute.
	 * @see ft.FtPackage#getStageClubStats_GoalsAgainst()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	int getGoalsAgainst();

	/**
	 * Returns the value of the '<em><b>Goal Difference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Goal Difference</em>' attribute.
	 * @see ft.FtPackage#getStageClubStats_GoalDifference()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	int getGoalDifference();

	/**
	 * Returns the value of the '<em><b>Points</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Points</em>' attribute.
	 * @see ft.FtPackage#getStageClubStats_Points()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	int getPoints();

	/**
	 * Returns the value of the '<em><b>Form</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Form</em>' attribute list.
	 * @see ft.FtPackage#getStageClubStats_Form()
	 * @model upper="5" transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	EList<Integer> getForm();

} // StageClubStats

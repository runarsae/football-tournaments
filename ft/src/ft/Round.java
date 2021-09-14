/**
 */
package ft;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Round</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ft.Round#getRoundNumber <em>Round Number</em>}</li>
 *   <li>{@link ft.Round#getMatches <em>Matches</em>}</li>
 *   <li>{@link ft.Round#getStage <em>Stage</em>}</li>
 * </ul>
 *
 * @see ft.FtPackage#getRound()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='clubsInRoundMatchesMustBeUnique'"
 *        annotation="http://www.eclipse.org/acceleo/query/1.0 clubsInRoundMatchesMustBeUnique='self.matches.homeClub-&gt;concat(self.matches.awayClub)-&gt;isUnique(club | club)'"
 * @generated
 */
public interface Round extends EObject {
	/**
	 * Returns the value of the '<em><b>Round Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Round Number</em>' attribute.
	 * @see #setRoundNumber(Integer)
	 * @see ft.FtPackage#getRound_RoundNumber()
	 * @model dataType="ft.RoundNumber" required="true"
	 * @generated
	 */
	Integer getRoundNumber();

	/**
	 * Sets the value of the '{@link ft.Round#getRoundNumber <em>Round Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Round Number</em>' attribute.
	 * @see #getRoundNumber()
	 * @generated
	 */
	void setRoundNumber(Integer value);

	/**
	 * Returns the value of the '<em><b>Matches</b></em>' containment reference list.
	 * The list contents are of type {@link ft.Match}.
	 * It is bidirectional and its opposite is '{@link ft.Match#getRound <em>Round</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Matches</em>' containment reference list.
	 * @see ft.FtPackage#getRound_Matches()
	 * @see ft.Match#getRound
	 * @model opposite="round" containment="true"
	 * @generated
	 */
	EList<Match> getMatches();

	/**
	 * Returns the value of the '<em><b>Stage</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link ft.Stage#getRounds <em>Rounds</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Stage</em>' container reference.
	 * @see #setStage(Stage)
	 * @see ft.FtPackage#getRound_Stage()
	 * @see ft.Stage#getRounds
	 * @model opposite="rounds" required="true" transient="false"
	 * @generated
	 */
	Stage getStage();

	/**
	 * Sets the value of the '{@link ft.Round#getStage <em>Stage</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Stage</em>' container reference.
	 * @see #getStage()
	 * @generated
	 */
	void setStage(Stage value);

} // Round

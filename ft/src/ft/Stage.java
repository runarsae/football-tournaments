/**
 */
package ft;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Stage</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ft.Stage#getSeason <em>Season</em>}</li>
 *   <li>{@link ft.Stage#getRounds <em>Rounds</em>}</li>
 *   <li>{@link ft.Stage#getClubs <em>Clubs</em>}</li>
 * </ul>
 *
 * @see ft.FtPackage#getStage()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='roundNumbersMustBeUnique clubsInStageMustBeInSeason'"
 *        annotation="http://www.eclipse.org/acceleo/query/1.0 roundNumbersMustBeUnique='self.rounds-&gt;isUnique(r | r.roundNumber)' clubsInStageMustBeInSeason='self.season.clubs-&gt;includesAll(self.clubs)'"
 * @generated
 */
public interface Stage extends EObject {
	/**
	 * Returns the value of the '<em><b>Season</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link ft.Season#getStages <em>Stages</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Season</em>' container reference.
	 * @see #setSeason(Season)
	 * @see ft.FtPackage#getStage_Season()
	 * @see ft.Season#getStages
	 * @model opposite="stages" required="true" transient="false"
	 * @generated
	 */
	Season getSeason();

	/**
	 * Sets the value of the '{@link ft.Stage#getSeason <em>Season</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Season</em>' container reference.
	 * @see #getSeason()
	 * @generated
	 */
	void setSeason(Season value);

	/**
	 * Returns the value of the '<em><b>Rounds</b></em>' containment reference list.
	 * The list contents are of type {@link ft.Round}.
	 * It is bidirectional and its opposite is '{@link ft.Round#getStage <em>Stage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rounds</em>' containment reference list.
	 * @see ft.FtPackage#getStage_Rounds()
	 * @see ft.Round#getStage
	 * @model opposite="stage" containment="true"
	 * @generated
	 */
	EList<Round> getRounds();

	/**
	 * Returns the value of the '<em><b>Clubs</b></em>' reference list.
	 * The list contents are of type {@link ft.Club}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Clubs</em>' reference list.
	 * @see ft.FtPackage#getStage_Clubs()
	 * @model
	 * @generated
	 */
	EList<Club> getClubs();

} // Stage

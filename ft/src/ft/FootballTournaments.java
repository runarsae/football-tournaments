/**
 */
package ft;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Football Tournaments</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ft.FootballTournaments#getRegions <em>Regions</em>}</li>
 * </ul>
 *
 * @see ft.FtPackage#getFootballTournaments()
 * @model
 * @generated
 */
public interface FootballTournaments extends EObject {
	/**
	 * Returns the value of the '<em><b>Regions</b></em>' containment reference list.
	 * The list contents are of type {@link ft.Region}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Regions</em>' containment reference list.
	 * @see ft.FtPackage#getFootballTournaments_Regions()
	 * @model containment="true"
	 * @generated
	 */
	EList<Region> getRegions();

} // FootballTournaments

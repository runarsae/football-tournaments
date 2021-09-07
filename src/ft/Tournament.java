/**
 */
package ft;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Tournament</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ft.Tournament#getName <em>Name</em>}</li>
 *   <li>{@link ft.Tournament#getGender <em>Gender</em>}</li>
 *   <li>{@link ft.Tournament#getRegion <em>Region</em>}</li>
 *   <li>{@link ft.Tournament#getSeasons <em>Seasons</em>}</li>
 * </ul>
 *
 * @see ft.FtPackage#getTournament()
 * @model
 * @generated
 */
public interface Tournament extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see ft.FtPackage#getTournament_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link ft.Tournament#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Gender</b></em>' attribute.
	 * The literals are from the enumeration {@link ft.GenderKind}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gender</em>' attribute.
	 * @see ft.GenderKind
	 * @see #setGender(GenderKind)
	 * @see ft.FtPackage#getTournament_Gender()
	 * @model required="true"
	 * @generated
	 */
	GenderKind getGender();

	/**
	 * Sets the value of the '{@link ft.Tournament#getGender <em>Gender</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Gender</em>' attribute.
	 * @see ft.GenderKind
	 * @see #getGender()
	 * @generated
	 */
	void setGender(GenderKind value);

	/**
	 * Returns the value of the '<em><b>Region</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link ft.Region#getTournaments <em>Tournaments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Region</em>' container reference.
	 * @see #setRegion(Region)
	 * @see ft.FtPackage#getTournament_Region()
	 * @see ft.Region#getTournaments
	 * @model opposite="tournaments" required="true" transient="false"
	 * @generated
	 */
	Region getRegion();

	/**
	 * Sets the value of the '{@link ft.Tournament#getRegion <em>Region</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Region</em>' container reference.
	 * @see #getRegion()
	 * @generated
	 */
	void setRegion(Region value);

	/**
	 * Returns the value of the '<em><b>Seasons</b></em>' containment reference list.
	 * The list contents are of type {@link ft.Season}.
	 * It is bidirectional and its opposite is '{@link ft.Season#getTournament <em>Tournament</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Seasons</em>' containment reference list.
	 * @see ft.FtPackage#getTournament_Seasons()
	 * @see ft.Season#getTournament
	 * @model opposite="tournament" containment="true"
	 * @generated
	 */
	EList<Season> getSeasons();

} // Tournament

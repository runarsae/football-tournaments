/**
 */
package ft;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Regional Host</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ft.RegionalHost#getRegion <em>Region</em>}</li>
 * </ul>
 *
 * @see ft.FtPackage#getRegionalHost()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='clubsInTournamentSeasonsMustBeInRegion'"
 *        annotation="http://www.eclipse.org/acceleo/query/1.0 clubsInTournamentSeasonsMustBeInRegion='self.tournaments.seasons.clubs-&gt;forAll(club | club.region = self.region)'"
 * @generated
 */
public interface RegionalHost extends AbstractHost {
	/**
	 * Returns the value of the '<em><b>Region</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Region</em>' reference.
	 * @see #setRegion(Region)
	 * @see ft.FtPackage#getRegionalHost_Region()
	 * @model required="true"
	 * @generated
	 */
	Region getRegion();

	/**
	 * Sets the value of the '{@link ft.RegionalHost#getRegion <em>Region</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Region</em>' reference.
	 * @see #getRegion()
	 * @generated
	 */
	void setRegion(Region value);

} // RegionalHost

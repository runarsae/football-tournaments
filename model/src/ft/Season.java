/**
 */
package ft;

import java.time.LocalDate;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Season</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ft.Season#getStartDate <em>Start Date</em>}</li>
 *   <li>{@link ft.Season#getEndDate <em>End Date</em>}</li>
 *   <li>{@link ft.Season#getYearIdentifier <em>Year Identifier</em>}</li>
 *   <li>{@link ft.Season#getTournament <em>Tournament</em>}</li>
 *   <li>{@link ft.Season#getClubs <em>Clubs</em>}</li>
 *   <li>{@link ft.Season#getStage <em>Stage</em>}</li>
 * </ul>
 *
 * @see ft.FtPackage#getSeason()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='startDateMustBeBeforeEndDate clubsGenderMustBeEqualToTournamentGender'"
 *        annotation="http://www.eclipse.org/acceleo/query/1.0 clubsGenderMustBeEqualToTournamentGender='self.clubs.gender-&gt;forAll(g | g = self.tournament.gender)'"
 * @generated
 */
public interface Season extends EObject {
	/**
	 * Returns the value of the '<em><b>Start Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Start Date</em>' attribute.
	 * @see #setStartDate(LocalDate)
	 * @see ft.FtPackage#getSeason_StartDate()
	 * @model dataType="ft.ELocalDate"
	 * @generated
	 */
	LocalDate getStartDate();

	/**
	 * Sets the value of the '{@link ft.Season#getStartDate <em>Start Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Start Date</em>' attribute.
	 * @see #getStartDate()
	 * @generated
	 */
	void setStartDate(LocalDate value);

	/**
	 * Returns the value of the '<em><b>End Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>End Date</em>' attribute.
	 * @see #setEndDate(LocalDate)
	 * @see ft.FtPackage#getSeason_EndDate()
	 * @model dataType="ft.ELocalDate"
	 * @generated
	 */
	LocalDate getEndDate();

	/**
	 * Sets the value of the '{@link ft.Season#getEndDate <em>End Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>End Date</em>' attribute.
	 * @see #getEndDate()
	 * @generated
	 */
	void setEndDate(LocalDate value);

	/**
	 * Returns the value of the '<em><b>Year Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Year Identifier</em>' attribute.
	 * @see ft.FtPackage#getSeason_YearIdentifier()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	String getYearIdentifier();

	/**
	 * Returns the value of the '<em><b>Tournament</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link ft.Tournament#getSeasons <em>Seasons</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tournament</em>' container reference.
	 * @see #setTournament(Tournament)
	 * @see ft.FtPackage#getSeason_Tournament()
	 * @see ft.Tournament#getSeasons
	 * @model opposite="seasons" required="true" transient="false"
	 * @generated
	 */
	Tournament getTournament();

	/**
	 * Sets the value of the '{@link ft.Season#getTournament <em>Tournament</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tournament</em>' container reference.
	 * @see #getTournament()
	 * @generated
	 */
	void setTournament(Tournament value);

	/**
	 * Returns the value of the '<em><b>Clubs</b></em>' reference list.
	 * The list contents are of type {@link ft.Club}.
	 * It is bidirectional and its opposite is '{@link ft.Club#getSeasons <em>Seasons</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Clubs</em>' reference list.
	 * @see ft.FtPackage#getSeason_Clubs()
	 * @see ft.Club#getSeasons
	 * @model opposite="seasons"
	 * @generated
	 */
	EList<Club> getClubs();

	/**
	 * Returns the value of the '<em><b>Stage</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link ft.Stage#getSeason <em>Season</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Stage</em>' containment reference.
	 * @see #setStage(Stage)
	 * @see ft.FtPackage#getSeason_Stage()
	 * @see ft.Stage#getSeason
	 * @model opposite="season" containment="true" required="true"
	 * @generated
	 */
	Stage getStage();

	/**
	 * Sets the value of the '{@link ft.Season#getStage <em>Stage</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Stage</em>' containment reference.
	 * @see #getStage()
	 * @generated
	 */
	void setStage(Stage value);

} // Season

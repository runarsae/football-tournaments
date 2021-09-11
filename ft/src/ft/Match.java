/**
 */
package ft;

import java.time.LocalDateTime;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Match</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ft.Match#getRound <em>Round</em>}</li>
 *   <li>{@link ft.Match#getHomeClub <em>Home Club</em>}</li>
 *   <li>{@link ft.Match#getAwayClub <em>Away Club</em>}</li>
 *   <li>{@link ft.Match#getDate <em>Date</em>}</li>
 *   <li>{@link ft.Match#getResult <em>Result</em>}</li>
 * </ul>
 *
 * @see ft.FtPackage#getMatch()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='homeClubAndAwayClubCannotBeTheSame homeClubMustBeInStage awayClubMustBeInStage homeClubMustBeInOnlyOneMatchPerRound awayClubMustBeInOnlyOneMatchPerRound dateMustBeWithinSeasonStartAndEnd'"
 *        annotation="http://www.eclipse.org/acceleo/query/1.0 homeClubAndAwayClubCannotBeTheSame='self.homeClub &lt;&gt; self.awayClub' homeClubMustBeInStage='self.round.stage.clubs-&gt;includes(self.homeClub)' awayClubMustBeInStage='self.round.stage.clubs-&gt;includes(self.awayClub)' homeClubMustBeInOnlyOneMatchPerRound='self.round.matches.homeClub-&gt;count(self.homeClub) = 1 and self.round.matches.awayClub-&gt;count(self.homeClub) = 0' awayClubMustBeInOnlyOneMatchPerRound='self.round.matches.homeClub-&gt;count(self.awayClub) = 0 and self.round.matches.awayClub-&gt;count(self.awayClub) = 1'"
 * @generated
 */
public interface Match extends EObject {
	/**
	 * Returns the value of the '<em><b>Round</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link ft.Round#getMatches <em>Matches</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Round</em>' container reference.
	 * @see #setRound(Round)
	 * @see ft.FtPackage#getMatch_Round()
	 * @see ft.Round#getMatches
	 * @model opposite="matches" required="true" transient="false"
	 * @generated
	 */
	Round getRound();

	/**
	 * Sets the value of the '{@link ft.Match#getRound <em>Round</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Round</em>' container reference.
	 * @see #getRound()
	 * @generated
	 */
	void setRound(Round value);

	/**
	 * Returns the value of the '<em><b>Home Club</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Home Club</em>' reference.
	 * @see #setHomeClub(Club)
	 * @see ft.FtPackage#getMatch_HomeClub()
	 * @model required="true"
	 * @generated
	 */
	Club getHomeClub();

	/**
	 * Sets the value of the '{@link ft.Match#getHomeClub <em>Home Club</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Home Club</em>' reference.
	 * @see #getHomeClub()
	 * @generated
	 */
	void setHomeClub(Club value);

	/**
	 * Returns the value of the '<em><b>Away Club</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Away Club</em>' reference.
	 * @see #setAwayClub(Club)
	 * @see ft.FtPackage#getMatch_AwayClub()
	 * @model required="true"
	 * @generated
	 */
	Club getAwayClub();

	/**
	 * Sets the value of the '{@link ft.Match#getAwayClub <em>Away Club</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Away Club</em>' reference.
	 * @see #getAwayClub()
	 * @generated
	 */
	void setAwayClub(Club value);

	/**
	 * Returns the value of the '<em><b>Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Date</em>' attribute.
	 * @see #setDate(LocalDateTime)
	 * @see ft.FtPackage#getMatch_Date()
	 * @model dataType="ft.ELocalDateTime" required="true"
	 * @generated
	 */
	LocalDateTime getDate();

	/**
	 * Sets the value of the '{@link ft.Match#getDate <em>Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Date</em>' attribute.
	 * @see #getDate()
	 * @generated
	 */
	void setDate(LocalDateTime value);

	/**
	 * Returns the value of the '<em><b>Result</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Result</em>' containment reference.
	 * @see #setResult(AbstractResult)
	 * @see ft.FtPackage#getMatch_Result()
	 * @model containment="true"
	 * @generated
	 */
	AbstractResult getResult();

	/**
	 * Sets the value of the '{@link ft.Match#getResult <em>Result</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Result</em>' containment reference.
	 * @see #getResult()
	 * @generated
	 */
	void setResult(AbstractResult value);

} // Match

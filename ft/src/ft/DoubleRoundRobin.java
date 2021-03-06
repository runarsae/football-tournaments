/**
 */
package ft;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Double Round Robin</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ft.DoubleRoundRobin#getTable <em>Table</em>}</li>
 * </ul>
 *
 * @see ft.FtPackage#getDoubleRoundRobin()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='numberOfRoundsIsCorrect roundNumbersMustBeInValidRange everyClubMustMeetEveryOtherClubHomeAndAwayOnce numberOfMatchesInEachRoundIsCorrect noExtendedTimeOrPenaltyShootout'"
 *        annotation="http://www.eclipse.org/acceleo/query/1.0 numberOfRoundsIsCorrect=' self.rounds-&gt;size() &lt;= (self.clubs-&gt;size() - 1) * 2' roundNumbersMustBeInValidRange='self.rounds.roundNumber-&gt;forAll(roundNumber | roundNumber &gt;= 1 and roundNumber &lt;=  ((self.clubs-&gt;size() - 1) * 2))' everyClubMustMeetEveryOtherClubHomeAndAwayOnce='self.clubs-&gt;collect(club1 | self.clubs-&gt;select(club2 | club1 &lt;&gt; club2)-&gt;collect(club2  | self.rounds.matches-&gt;select(match | match.homeClub = club1 and match.awayClub = club2)-&gt;size()-&gt;collect(size | size = 0 or size = 1)))-&gt;forAll(v | v)' numberOfMatchesInEachRoundIsCorrect='self.rounds-&gt;forAll(round | round.matches-&gt;size() = (self.clubs-&gt;size() /2))' noExtendedTimeOrPenaltyShootout='self.rounds.matches.result-&gt;forAll(result | result.eClass().name = \'Result\')'"
 * @generated
 */
public interface DoubleRoundRobin extends Stage {
	/**
	 * Returns the value of the '<em><b>Table</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Table</em>' reference.
	 * @see ft.FtPackage#getDoubleRoundRobin_Table()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	Table getTable();

} // DoubleRoundRobin

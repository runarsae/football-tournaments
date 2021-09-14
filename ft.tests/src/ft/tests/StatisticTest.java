/**
 */
package ft.tests;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.resource.Resource;

import ft.DoubleRoundRobin;
import ft.FootballTournaments;
import ft.ResultKind;
import ft.Statistic;
import ft.util.TestResourceLoader;
import junit.framework.TestCase;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Statistic</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are tested:
 * <ul>
 *   <li>{@link ft.Statistic#getPosition() <em>Position</em>}</li>
 *   <li>{@link ft.Statistic#getPlayed() <em>Played</em>}</li>
 *   <li>{@link ft.Statistic#getWon() <em>Won</em>}</li>
 *   <li>{@link ft.Statistic#getDrawn() <em>Drawn</em>}</li>
 *   <li>{@link ft.Statistic#getLost() <em>Lost</em>}</li>
 *   <li>{@link ft.Statistic#getGoalsFor() <em>Goals For</em>}</li>
 *   <li>{@link ft.Statistic#getGoalsAgainst() <em>Goals Against</em>}</li>
 *   <li>{@link ft.Statistic#getGoalDifference() <em>Goal Difference</em>}</li>
 *   <li>{@link ft.Statistic#getPoints() <em>Points</em>}</li>
 *   <li>{@link ft.Statistic#getForm() <em>Form</em>}</li>
 * </ul>
 * </p>
 * @generated
 */
public class StatisticTest extends TestCase {
	
	/**
	 * The fixture for this Statistic test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Statistic fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(StatisticTest.class);
	}

	/**
	 * Constructs a new Statistic test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StatisticTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Statistic test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(Statistic fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Statistic test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Statistic getFixture() {
		return fixture;
	}
	
	protected EList<Statistic> statisticsFixture = null;
	
	protected void setStatisticsFixture(EList<Statistic> fixture) {
		this.statisticsFixture = fixture;
	}

	protected EList<Statistic> getStatisticsFixture() {
		return statisticsFixture;
	} 

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated NOT
	 */
	@Override
	protected void setUp() throws Exception {
		// Test on instance from file
		Resource resource = TestResourceLoader.load("StatisticTest.ft");
		FootballTournaments ft = (FootballTournaments) resource.getContents().get(0);
		
		EList<Statistic> statistics = ((DoubleRoundRobin) ft.getHosts().get(0).getTournaments().get(0).getSeasons().get(0).getStages().get(0)).getTable().getStatistics();
		setStatisticsFixture(statistics);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}

	/**
	 * Tests the '{@link ft.Statistic#getPosition() <em>Position</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ft.Statistic#getPosition()
	 * @generated NOT
	 */
	public void testGetPosition() {
		// Test instance is rigged to contain clubs that has equal points, goal difference and goals for to test all aspects of getPosition
		EList<Statistic> statistics = getStatisticsFixture();

		List<String> clubsRanking = Arrays.asList("Bodø/Glimt", "Molde", "Lillestrøm", "Kristiansund", "Viking",
				"Rosenborg", "Vålerenga", "Haugesund", "Strømsgodset", "Odd", "Sandefjord Fotball", "Sarpsborg 08",
				"Tromsø", "Mjøndalen", "Stabæk", "Brann");
		
		// The two clubs with position 8 has equal points, goal difference and goals for
		List<Integer> positions = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 8, 10, 11, 12, 13, 14, 15, 16);

		// For each statistic in test instance, test if club and position is correct
		for (int i = 0; i < statistics.size(); i++) {
			Statistic statistic = statistics.get(i);

			assertEquals((int) positions.get(i), statistic.getPosition());
			assertEquals(clubsRanking.get(i), statistic.getClub().getName());
		}
	}

	/**
	 * Tests the '{@link ft.Statistic#getPlayed() <em>Played</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ft.Statistic#getPlayed()
	 * @generated NOT
	 */
	public void testGetPlayed() {
		EList<Statistic> statistics = getStatisticsFixture();
				
		// For each statistic in test instance, test if played matches is correct
		for (int i = 0; i < statistics.size(); i++) {
			Statistic statistic = statistics.get(i);
			
			if (i == 2 || i == 15) {
				// Statistic for club number 2 and 15 have one more match played
				assertEquals(18, statistic.getPlayed());
			} else {
				assertEquals(17, statistic.getPlayed());
			}
		}
	}

	/**
	 * Tests the '{@link ft.Statistic#getWon() <em>Won</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ft.Statistic#getWon()
	 * @generated NOT
	 */
	public void testGetWon() {
		EList<Statistic> statistics = getStatisticsFixture();

		List<Integer> wins = Arrays.asList(10, 10, 9, 9, 8, 8, 6, 7, 7, 6, 6, 5, 3, 2, 3, 2);
		
		// For each statistic in test instance, test if number of won matches is correct
		for (int i = 0; i < statistics.size(); i++) {
			Statistic statistic = statistics.get(i);

			assertEquals((int) wins.get(i), statistic.getWon());
		}
	}

	/**
	 * Tests the '{@link ft.Statistic#getDrawn() <em>Drawn</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ft.Statistic#getDrawn()
	 * @generated NOT
	 */
	public void testGetDrawn() {
		EList<Statistic> statistics = getStatisticsFixture();

		List<Integer> draws = Arrays.asList(4, 3, 5, 2, 4, 4, 8, 4, 4, 4, 3, 5, 6, 7, 4, 5);
		
		// For each statistic in test instance, test if number of drawn matches is correct
		for (int i = 0; i < statistics.size(); i++) {
			Statistic statistic = statistics.get(i);

			assertEquals((int) draws.get(i), statistic.getDrawn());
		}
	}

	/**
	 * Tests the '{@link ft.Statistic#getLost() <em>Lost</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ft.Statistic#getLost()
	 * @generated NOT
	 */
	public void testGetLost() {
		EList<Statistic> statistics = getStatisticsFixture();

		List<Integer> losses = Arrays.asList(3, 4, 4, 6, 5, 5, 3, 6, 6, 7, 8, 7, 8, 8, 10, 11);
		
		// For each statistic in test instance, test if number of lost matches is correct
		for (int i = 0; i < statistics.size(); i++) {
			Statistic statistic = statistics.get(i);

			assertEquals((int) losses.get(i), statistic.getLost());
		}
	}

	/**
	 * Tests the '{@link ft.Statistic#getGoalsFor() <em>Goals For</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ft.Statistic#getGoalsFor()
	 * @generated NOT
	 */
	public void testGetGoalsFor() {
		EList<Statistic> statistics = getStatisticsFixture();

		List<Integer> goalsFor = Arrays.asList(36, 42, 29, 22, 45, 34, 30, 27, 27, 26, 22, 18, 19, 20, 22, 18);
		
		// For each statistic in test instance, test if number of goals for is correct
		for (int i = 0; i < statistics.size(); i++) {
			Statistic statistic = statistics.get(i);

			assertEquals((int) goalsFor.get(i), statistic.getGoalsFor());
		}
	}

	/**
	 * Tests the '{@link ft.Statistic#getGoalsAgainst() <em>Goals Against</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ft.Statistic#getGoalsAgainst()
	 * @generated NOT
	 */
	public void testGetGoalsAgainst() {
		EList<Statistic> statistics = getStatisticsFixture();

		List<Integer> goalsAgainst = Arrays.asList(17, 35, 20, 19, 33, 22, 23, 27, 27, 35, 31, 22, 31, 23, 38, 34);
		
		// For each statistic in test instance, test if number of goals against is correct
		for (int i = 0; i < statistics.size(); i++) {
			Statistic statistic = statistics.get(i);

			assertEquals((int) goalsAgainst.get(i), statistic.getGoalsAgainst());
		}
	}

	/**
	 * Tests the '{@link ft.Statistic#getGoalDifference() <em>Goal Difference</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ft.Statistic#getGoalDifference()
	 * @generated NOT
	 */
	public void testGetGoalDifference() {
		EList<Statistic> statistics = getStatisticsFixture();

		List<Integer> goalDifferences = Arrays.asList(19, 7, 9, 3, 12, 12, 7, 0, 0, -9, -9, -4, -12, -3, -16, -16);
		
		// For each statistic in test instance, test if goal difference is correct
		for (int i = 0; i < statistics.size(); i++) {
			Statistic statistic = statistics.get(i);

			assertEquals((int) goalDifferences.get(i), statistic.getGoalDifference());
		}
	}

	/**
	 * Tests the '{@link ft.Statistic#getPoints() <em>Points</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ft.Statistic#getPoints()
	 * @generated NOT
	 */
	public void testGetPoints() {
		EList<Statistic> statistics = getStatisticsFixture();

		List<Integer> points = Arrays.asList(34, 33, 32, 29, 28, 28, 26, 25, 25, 22, 21, 20, 15, 13, 13, 11);
		
		// For each statistic in test instance, test if number of points is correct
		for (int i = 0; i < statistics.size(); i++) {
			Statistic statistic = statistics.get(i);

			assertEquals((int) points.get(i), statistic.getPoints());
		}
	}

	/**
	 * Tests the '{@link ft.Statistic#getForm() <em>Form</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ft.Statistic#getForm()
	 * @generated NOT
	 */
	public void testGetForm() {
	    
		EList<Statistic> statistics = getStatisticsFixture();

		List<List<String>> formPerClub = Arrays.asList(
				Arrays.asList("LOSS", "DRAW", "DRAW", "WIN", "WIN", "WIN"),
				Arrays.asList("LOSS", "WIN", "DRAW", "WIN", "LOSS", "LOSS"),
				Arrays.asList("WIN", "DRAW", "LOSS", "WIN", "WIN", "DRAW"),
				Arrays.asList("LOSS", "WIN", "LOSS", "WIN", "LOSS", "WIN"),
				Arrays.asList("DRAW", "LOSS", "WIN", "WIN", "DRAW", "WIN"),
				Arrays.asList("DRAW", "WIN", "WIN", "WIN", "WIN", "LOSS"),
				Arrays.asList("DRAW", "DRAW", "LOSS", "DRAW", "DRAW", "WIN"),
				Arrays.asList("DRAW", "WIN", "LOSS", "LOSS", "LOSS", "WIN"),
				Arrays.asList("WIN", "WIN", "LOSS", "LOSS", "WIN", "WIN"),
				Arrays.asList("WIN", "LOSS", "LOSS", "WIN", "LOSS", "LOSS"),
				Arrays.asList("DRAW", "WIN", "DRAW", "LOSS", "DRAW", "LOSS"),
				Arrays.asList("DRAW", "DRAW", "LOSS", "LOSS", "WIN", "WIN"),
				Arrays.asList("DRAW", "LOSS", "WIN", "DRAW", "DRAW", "LOSS"),
				Arrays.asList("DRAW", "LOSS", "LOSS", "LOSS", "DRAW", "LOSS"),
				Arrays.asList("LOSS", "WIN", "WIN", "LOSS", "DRAW", "LOSS"),
				Arrays.asList("DRAW", "DRAW", "WIN", "LOSS", "LOSS", "DRAW")
			);

		// For each statistic in test instance, test if form is correct
		for (int i = 0; i < statistics.size(); i++) {
			Statistic statistic = statistics.get(i);
			
			List<String> expectedForm = formPerClub.get(i);
			
			List<String> actualForm = new ArrayList<String>();
			
			for (ResultKind result : statistic.getForm()) {
				actualForm.add(result.getName());
			}

			assertEquals(expectedForm, actualForm);
		}
	}

} //StatisticTest

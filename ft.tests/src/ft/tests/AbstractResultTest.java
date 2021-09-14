/**
 */
package ft.tests;

import ft.AbstractResult;
import ft.ExtendedTimeResult;
import ft.PenaltyShootoutResult;
import ft.Result;
import ft.WinnerKind;
import junit.framework.TestCase;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Abstract Result</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are tested:
 * <ul>
 *   <li>{@link ft.AbstractResult#getWinner() <em>Winner</em>}</li>
 *   <li>{@link ft.AbstractResult#getHomeGoalsFinal() <em>Home Goals Final</em>}</li>
 *   <li>{@link ft.AbstractResult#getAwayGoalsFinal() <em>Away Goals Final</em>}</li>
 * </ul>
 * </p>
 * @generated
 */
public abstract class AbstractResultTest extends TestCase {

	/**
	 * The fixture for this Abstract Result test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AbstractResult fixture = null;

	/**
	 * Constructs a new Abstract Result test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractResultTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Abstract Result test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(AbstractResult fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Abstract Result test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AbstractResult getFixture() {
		return fixture;
	}

	/**
	 * Tests the '{@link ft.AbstractResult#getWinner() <em>Winner</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ft.AbstractResult#getWinner()
	 * @generated NOT
	 */
	public void testGetWinner() {
		AbstractResult abstractResult = getFixture();
				
		// Test based on type of result
		if (abstractResult instanceof PenaltyShootoutResult) {
			PenaltyShootoutResult result = (PenaltyShootoutResult) abstractResult;
			
			result.setHomeGoalsFullTime(0);
			result.setAwayGoalsFullTime(0);
			result.setHomeGoalsExtendedTime(0);
			result.setAwayGoalsExtendedTime(0);
	
			// Test no result set
			assertNull(result.getWinner());
			
			// Test HOME as winner
			result.setHomeGoalsPenaltyShootout(2);
			result.setAwayGoalsPenaltyShootout(1);
			assertEquals(WinnerKind.HOME, result.getWinner());

			// Test AWAY as winner
			result.setHomeGoalsPenaltyShootout(1);
			result.setAwayGoalsPenaltyShootout(2);
			assertEquals(WinnerKind.AWAY, result.getWinner());
			
			// Test DRAW as winner (illegal state)
			result.setHomeGoalsPenaltyShootout(1);
			result.setAwayGoalsPenaltyShootout(1);
			
			try {
				result.getWinner();
				fail("IllegalStateException is missing; The result of a penalty shoot-out cannot be DRAW.");
			} catch (IllegalStateException e) {
				assertEquals("The result of a penalty shoot-out cannot be DRAW.", e.getMessage());
			}

		} else if (abstractResult instanceof ExtendedTimeResult) {
			ExtendedTimeResult result = (ExtendedTimeResult) abstractResult;
		
			// Test no result set
			assertNull(result.getWinner());
			
			result.setHomeGoalsFullTime(0);
			result.setAwayGoalsFullTime(0);
			
			// Test HOME as winner
			result.setHomeGoalsExtendedTime(2);
			result.setAwayGoalsExtendedTime(1);
			assertEquals(WinnerKind.HOME, result.getWinner());

			// Test AWAY as winner
			result.setHomeGoalsExtendedTime(1);
			result.setAwayGoalsExtendedTime(2);
			assertEquals(WinnerKind.AWAY, result.getWinner());
			
			// Test DRAW as winner (illegal state)
			result.setHomeGoalsExtendedTime(1);
			result.setAwayGoalsExtendedTime(1);
			
			try {
				result.getWinner();
				fail("IllegalStateException is missing; The result of a match with extended time cannot be DRAW. Consider using a penalty shoout-out result instead.");
			} catch (IllegalStateException e) {
				assertEquals("The result of a match with extended time cannot be DRAW. Consider using a penalty shoout-out result instead.", e.getMessage());
			}
		} else if (abstractResult instanceof Result) {
			Result result = (Result) abstractResult;
			
			// Test no result set
			assertNull(result.getWinner());
			
			// Test HOME as winner
			result.setHomeGoalsFullTime(2);
			result.setAwayGoalsFullTime(1);
			assertEquals(WinnerKind.HOME, result.getWinner());

			// Test AWAY as winner
			result.setHomeGoalsFullTime(1);
			result.setAwayGoalsFullTime(2);
			assertEquals(WinnerKind.AWAY, result.getWinner());
			
			// Test DRAW as winner
			result.setHomeGoalsFullTime(1);
			result.setAwayGoalsFullTime(1);
			assertEquals(WinnerKind.DRAW, result.getWinner());
		}
	}

	/**
	 * Tests the '{@link ft.AbstractResult#getHomeGoalsFinal() <em>Home Goals Final</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ft.AbstractResult#getHomeGoalsFinal()
	 * @generated NOT
	 */
	public void testGetHomeGoalsFinal() {
		AbstractResult abstractResult = getFixture();
		
		// Test based on type of result
		if (abstractResult instanceof PenaltyShootoutResult) {
			PenaltyShootoutResult result = (PenaltyShootoutResult) abstractResult;
			
			// Test no result set
			assertNull(result.getHomeGoalsFinal());
			
			result.setHomeGoalsFullTime(2);
			result.setHomeGoalsExtendedTime(3);
			result.setHomeGoalsPenaltyShootout(3);
			
			// Test final goals only for full time and extended time
			assertEquals(Integer.valueOf(5), result.getHomeGoalsFinal());
			
		} else if (abstractResult instanceof ExtendedTimeResult) {
			ExtendedTimeResult result = (ExtendedTimeResult) abstractResult;
			
			// Test no result set
			assertNull(result.getHomeGoalsFinal());
			
			result.setHomeGoalsFullTime(2);
			result.setHomeGoalsExtendedTime(3);
			
			// Test final goals only for full time and extended time
			assertEquals(Integer.valueOf(5), result.getHomeGoalsFinal());
			
		} else if (abstractResult instanceof Result) {
			Result result = (Result) abstractResult;
			
			// Test no result set
			assertNull(result.getHomeGoalsFinal());
			
			result.setHomeGoalsFullTime(2);
			
			// Test final goals only for full time
			assertEquals(Integer.valueOf(2), result.getHomeGoalsFinal());
			
		}
	}

	/**
	 * Tests the '{@link ft.AbstractResult#getAwayGoalsFinal() <em>Away Goals Final</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ft.AbstractResult#getAwayGoalsFinal()
	 * @generated NOT
	 */
	public void testGetAwayGoalsFinal() {
		AbstractResult abstractResult = getFixture();
		
		// Test based on type of result
		if (abstractResult instanceof PenaltyShootoutResult) {
			PenaltyShootoutResult result = (PenaltyShootoutResult) abstractResult;
			
			// Test no result set
			assertNull(result.getAwayGoalsFinal());
			
			result.setAwayGoalsFullTime(2);
			result.setAwayGoalsExtendedTime(3);
			result.setAwayGoalsPenaltyShootout(3);
			
			// Test final goals only for full time and extended time
			assertEquals(Integer.valueOf(5), result.getAwayGoalsFinal());
			
		} else if (abstractResult instanceof ExtendedTimeResult) {
			ExtendedTimeResult result = (ExtendedTimeResult) abstractResult;
			
			// Test no result set
			assertNull(result.getAwayGoalsFinal());
			
			result.setAwayGoalsFullTime(2);
			result.setAwayGoalsExtendedTime(3);
			
			// Test final goals only for full time and extended time
			assertEquals(Integer.valueOf(5), result.getAwayGoalsFinal());
			
		} else if (abstractResult instanceof Result) {
			Result result = (Result) abstractResult;
			
			// Test no result set
			assertNull(result.getAwayGoalsFinal());
			
			result.setAwayGoalsFullTime(2);
			
			// Test final goals only for full time
			assertEquals(Integer.valueOf(2), result.getAwayGoalsFinal());
			
		}
	}

} //AbstractResultTest

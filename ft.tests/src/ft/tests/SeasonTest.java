/**
 */
package ft.tests;

import java.time.LocalDate;

import ft.FtFactory;
import ft.Season;

import junit.framework.TestCase;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Season</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are tested:
 * <ul>
 *   <li>{@link ft.Season#getYearIdentifier() <em>Year Identifier</em>}</li>
 * </ul>
 * </p>
 * @generated
 */
public class SeasonTest extends TestCase {

	/**
	 * The fixture for this Season test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Season fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(SeasonTest.class);
	}

	/**
	 * Constructs a new Season test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SeasonTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Season test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(Season fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Season test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Season getFixture() {
		return fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(FtFactory.eINSTANCE.createSeason());
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
	 * Tests the '{@link ft.Season#getYearIdentifier() <em>Year Identifier</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ft.Season#getYearIdentifier()
	 * @generated NOT
	 */
	public void testGetYearIdentifier() {
		Season season = getFixture();
		
		// Test no dates set
		assertNull(season.getYearIdentifier());
		
		// Test only start date set
		season.setStartDate(LocalDate.of(2021, 1, 1));
		assertNull(season.getYearIdentifier());
		
		// Test season within a year
		season.setEndDate(LocalDate.of(2021, 12, 12));
		assertEquals("2021", season.getYearIdentifier());
		
		// Test season over two years
		season.setEndDate(LocalDate.of(2022, 12, 12));
		assertEquals("2021/2022", season.getYearIdentifier());
		
		// Test season over three years
		season.setEndDate(LocalDate.of(2023, 12, 12));
		assertEquals("2021", season.getYearIdentifier());
	}

} //SeasonTest

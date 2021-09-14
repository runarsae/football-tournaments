/**
 */
package ft.tests;

import org.eclipse.emf.ecore.resource.Resource;

import ft.DoubleRoundRobin;
import ft.FootballTournaments;
import ft.FtFactory;
import ft.Statistic;
import ft.Table;
import ft.util.TestResourceLoader;
import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Double Round Robin</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are tested:
 * <ul>
 *   <li>{@link ft.DoubleRoundRobin#getTable() <em>Table</em>}</li>
 * </ul>
 * </p>
 * @generated
 */
public class DoubleRoundRobinTest extends StageTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(DoubleRoundRobinTest.class);
	}

	/**
	 * Constructs a new Double Round Robin test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DoubleRoundRobinTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Double Round Robin test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected DoubleRoundRobin getFixture() {
		return (DoubleRoundRobin)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(FtFactory.eINSTANCE.createDoubleRoundRobin());
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
	 * Tests the '{@link ft.DoubleRoundRobin#getTable() <em>Table</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ft.DoubleRoundRobin#getTable()
	 * @generated NOT
	 */
	public void testGetTable() {
		// Test on instance from file
		Resource resource = TestResourceLoader.load("DoubleRoundRobinTest.ft");
		FootballTournaments ft = (FootballTournaments) resource.getContents().get(0);
		
		DoubleRoundRobin stage = (DoubleRoundRobin) ft.getHosts().get(0).getTournaments().get(0).getSeasons().get(0).getStages().get(0);
		
		Table table = stage.getTable();
		
		// Test existence
		assertNotNull(table);
		
		// Test opposite stage reference
		assertEquals(stage, table.getStage());
		
		// Test that it contains a Statistic for each club in the stage
		assertEquals(stage.getClubs().size(), table.getStatistics().size());
		
		for (Statistic statistic : table.getStatistics()) {
			assertTrue(stage.getClubs().contains(statistic.getClub()));

		}
		
		// Test that statistics are sorted on position
		Integer currentPosition = null;
		
		for (Statistic statistic : table.getStatistics()) {
			if (currentPosition != null) {
				assertTrue(statistic.getPosition() >= currentPosition);
			}
			
			currentPosition = statistic.getPosition();
		}
	}

} //DoubleRoundRobinTest

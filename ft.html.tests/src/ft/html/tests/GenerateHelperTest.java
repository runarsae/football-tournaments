package ft.html.tests;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import ft.FtFactory;
import ft.Match;
import ft.html.GenerateHelper;
import junit.framework.TestCase;
import junit.textui.TestRunner;

public class GenerateHelperTest extends TestCase {
	
	protected GenerateHelper fixture = null;

	public static void main(String[] args) {
		TestRunner.run(GenerateHelperTest.class);
	}

	public GenerateHelperTest(String name) {
		super(name);
	}

	protected void setFixture(GenerateHelper fixture) {
		this.fixture = fixture;
	}

	protected GenerateHelper getFixture() {
		return fixture;
	}

	@Override
	protected void setUp() throws Exception {
		setFixture(new GenerateHelper());
	}

	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}

	public void testSortMatchesOnDate() {
		GenerateHelper generateHelper = getFixture();
		
		Match match1 = FtFactory.eINSTANCE.createMatch();
		match1.setDate(LocalDateTime.of(2021, 10, 03, 10, 00));

		Match match2 = FtFactory.eINSTANCE.createMatch();
		match2.setDate(LocalDateTime.of(2021, 10, 03, 12, 00));
		
		List<Match> matches = new ArrayList<Match>(List.of(match1, match2));
		
		// Test sorting from oldest to newest
		matches = generateHelper.sortMatchesOnDate(matches, false);
		assertEquals(match1, matches.get(0));
		
		// Test reverse order
		matches = generateHelper.sortMatchesOnDate(matches, true);
		assertEquals(match2, matches.get(0));
	}

	public void testGroupOnMatchDays() {
		GenerateHelper generateHelper = getFixture();
		
		Match match1 = FtFactory.eINSTANCE.createMatch();
		match1.setDate(LocalDateTime.of(2021, 10, 03, 10, 00));

		Match match2 = FtFactory.eINSTANCE.createMatch();
		match2.setDate(LocalDateTime.of(2021, 10, 04, 12, 00));
		
		List<Match> matches = new ArrayList<Match>(List.of(match1, match2));
		
		// Test grouping, sorted from oldest to newest
		List<List<Match>> matchDays1 = generateHelper.groupOnMatchDays(matches, false);
		
		assertEquals(2, matchDays1.size());
		assertEquals(match1, matchDays1.get(0).get(0));
		assertEquals(match2, matchDays1.get(1).get(0));
		
		// Test grouping, sorted from newest to oldest
		List<List<Match>> matchDays2 = generateHelper.groupOnMatchDays(matches, true);
		
		assertEquals(2, matchDays2.size());
		assertEquals(match2, matchDays2.get(0).get(0));
		assertEquals(match1, matchDays2.get(1).get(0));
	}

	public void testGetMatchDay() {
		GenerateHelper generateHelper = getFixture();

		Match match = FtFactory.eINSTANCE.createMatch();	
		match.setDate(LocalDateTime.of(2021, 10, 03, 10, 00));
		
		assertEquals("søndag, 03. oktober 2021", generateHelper.getMatchDay(match));
	}

	public void testGetMatchTime() {
		GenerateHelper generateHelper = getFixture();

		Match match = FtFactory.eINSTANCE.createMatch();	
		match.setDate(LocalDateTime.of(2021, 10, 03, 10, 00));
		
		assertEquals("10:00", generateHelper.getMatchTime(match));
	}

	public void testCapitalizeFirstCharacter() {
		GenerateHelper generateHelper = getFixture();

		Match match = FtFactory.eINSTANCE.createMatch();	
		match.setDate(LocalDateTime.of(2021, 10, 03, 10, 00));
		
		assertEquals("Søndag, 03. oktober 2021", generateHelper.capitalizeFirstCharacter("søndag, 03. oktober 2021"));
	}

}

package ft.tests;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeParseException;

import ft.FtFactory;
import ft.impl.FtFactoryImpl;
import junit.framework.TestCase;

public class FtFactoryTest extends TestCase {
	
	protected FtFactory fixture = null;

	protected void setFixture(FtFactory fixture) {
		this.fixture = fixture;
	}

	protected FtFactory getFixture() {
		return fixture;
	}

	@Override
	protected void setUp() throws Exception {
		setFixture(new FtFactoryImpl());
	}

	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}
	
	/*
	 *	Tests for custom data types
	 */
	public void testDataType_ELocalDate_createELocalDateFromString() {
		FtFactoryImpl factory = (FtFactoryImpl) getFixture();
		
		// Test null and blank values
		assertNull(factory.createELocalDateFromString(null, ""));
		assertNull(factory.createELocalDateFromString(null, " "));
		assertNull(factory.createELocalDateFromString(null, null));
		
		// Test on valid values
		assertEquals("2021-01-01", factory.createELocalDateFromString(null, "2021-01-01").toString());
		assertEquals("2021-12-31", factory.createELocalDateFromString(null, "2021-12-31").toString());
		assertEquals("1992-05-14", factory.createELocalDateFromString(null, "1992-05-14").toString());
		
		// Test on invalid values
		try {
			factory.createELocalDateFromString(null, "2021-01-00");
			fail("DateTimeParseException is missing; Text '2021-01-00' could not be parsed: Invalid value for DayOfMonth (valid values 1 - 28/31): 0");
		} catch (DateTimeParseException e) {
			assertEquals("Text '2021-01-00' could not be parsed: Invalid value for DayOfMonth (valid values 1 - 28/31): 0", e.getMessage());
		}
		
		try {
			factory.createELocalDateFromString(null, "2021-13-01");
			fail("DateTimeParseException is missing; Text '2021-13-01' could not be parsed: Invalid value for MonthOfYear (valid values 1 - 12): 13");
		} catch (DateTimeParseException e) {
			assertEquals("Text '2021-13-01' could not be parsed: Invalid value for MonthOfYear (valid values 1 - 12): 13", e.getMessage());
		}
		
		try {
			factory.createELocalDateFromString(null, "20212-01-01");
			fail("DateTimeParseException is missing; Text '20212-01-01' could not be parsed at index 0");
		} catch (DateTimeParseException e) {
			assertEquals("Text '20212-01-01' could not be parsed at index 0", e.getMessage());
		}
		
		try {
			factory.createELocalDateFromString(null, "abc");
			fail("DateTimeParseException is missing; Text 'abc' could not be parsed at index 0");
		} catch (DateTimeParseException e) {
			assertEquals("Text 'abc' could not be parsed at index 0", e.getMessage());
		}
	}
	
	public void testDataType_ELocalDate_convertELocalDateToString() {
		FtFactoryImpl factory = (FtFactoryImpl) getFixture();
		
		// Test null values
		assertNull(factory.convertELocalDateToString(null, null));
		
		// Test on valid values
		assertEquals("2021-01-01", factory.convertELocalDateToString(null, LocalDate.of(2021, 01, 01)));
		assertEquals("2021-12-31", factory.convertELocalDateToString(null, LocalDate.of(2021, 12, 31)));
		assertEquals("1992-05-14", factory.convertELocalDateToString(null, LocalDate.of(1992, 05, 14)));
	}
	
	public void testDataType_ELocalDateTime_createELocalDateTimeFromString() {
		FtFactoryImpl factory = (FtFactoryImpl) getFixture();
		
		// Test null and blank values
		assertNull(factory.createELocalDateTimeFromString(null, ""));
		assertNull(factory.createELocalDateTimeFromString(null, " "));
		assertNull(factory.createELocalDateTimeFromString(null, null));
		
		// Test on valid values
		assertEquals("2021-01-01T00:00", factory.createELocalDateTimeFromString(null, "2021-01-01T00:00").toString());
		assertEquals("2021-12-31T11:00", factory.createELocalDateTimeFromString(null, "2021-12-31T11:00").toString());
		assertEquals("1992-05-14T23:43", factory.createELocalDateTimeFromString(null, "1992-05-14T23:43").toString());
		
		// Test on invalid values
		try {
			factory.createELocalDateTimeFromString(null, "2021-01-01T18:60");
			fail("DateTimeParseException is missing; Text '2021-01-01T18:60' could not be parsed: Invalid value for MinuteOfHour (valid values 0 - 59): 60");
		} catch (DateTimeParseException e) {
			assertEquals("Text '2021-01-01T18:60' could not be parsed: Invalid value for MinuteOfHour (valid values 0 - 59): 60", e.getMessage());
		}
		
		try {
			factory.createELocalDateTimeFromString(null, "2021-01-01T24:02");
			fail("DateTimeParseException is missing; Text '2021-01-01T24:02' could not be parsed: Invalid value for HourOfDay (valid values 0 - 23): 24");
		} catch (DateTimeParseException e) {
			assertEquals("Text '2021-01-01T24:02' could not be parsed: Invalid value for HourOfDay (valid values 0 - 23): 24", e.getMessage());
		}
		
		try {
			factory.createELocalDateTimeFromString(null, "2021-13-01X10:00");
			fail("DateTimeParseException is missing; Text '2021-13-01X10:00' could not be parsed at index 10");
		} catch (DateTimeParseException e) {
			assertEquals("Text '2021-13-01X10:00' could not be parsed at index 10", e.getMessage());
		}
	}
	
	public void testDataType_ELocalDateTime_convertELocalDateTimeToString() {
		FtFactoryImpl factory = (FtFactoryImpl) getFixture();
		
		// Test null values
		assertNull(factory.convertELocalDateTimeToString(null, null));
		
		// Test on valid values
		assertEquals("2021-01-01T18:00", factory.convertELocalDateTimeToString(null, LocalDateTime.of(2021, 01, 01, 18, 00)));
		assertEquals("2021-12-31T19:00", factory.convertELocalDateTimeToString(null, LocalDateTime.of(2021, 12, 31, 19, 00)));
		assertEquals("1992-05-14T00:00", factory.convertELocalDateTimeToString(null, LocalDateTime.of(1992, 05, 14, 00, 00)));
	}
	
}
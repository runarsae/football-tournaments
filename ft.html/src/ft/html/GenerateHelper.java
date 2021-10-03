package ft.html;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import com.google.common.collect.Lists;

import ft.Match;

/**
 * Helper methods for the transformation.
 */
public class GenerateHelper {
	
	private static DateTimeFormatter matchDayFormatter = DateTimeFormatter.ofPattern("EEEE, dd. MMMM yyyy");
	private static DateTimeFormatter timeFormatter = DateTimeFormatter.ofPattern("HH:mm");
	
	public GenerateHelper() {}
	
	/**
	 * Sort a list of matches according to their date. Optionally reverse the order.
	 * 
	 * @param matches The matches to be sorted.
	 * @param reverse Reverse the sorted list or not.
	 * @return A sorted list of matches according to date.
	 */
	public List<Match> sortMatchesOnDate(List<Match> matches, Boolean reverse) {
		matches.sort(new Comparator<Match>() {
			@Override
			public int compare(Match m1, Match m2) {
				return m1.getDate().compareTo(m2.getDate());
			}
		});
		
		if (reverse) {
			// Reverse order of matches (from newest to oldest)
			Collections.reverse(matches);
		}
		
		return matches;
	}
	
	/**
	 * Group matches into match days. Optionally reverse the order.
	 * 
	 * @param matches The matches to be grouped.
	 * @param reverse Reverse the list of match days or not.
	 * @return A sorted list of lists of matches, i.e. a sorted list of match days.
	 */
	public List<List<Match>> groupOnMatchDays(List<Match> matches, Boolean reverse) {		
		// Create a map with entries for each match day, sorted on date
		Map<LocalDate, List<Match>> matchDays = new TreeMap<LocalDate, List<Match>>();		
		
		// Add each match to the correct match day in the map
		for (Match match : matches) {
			if (matchDays.get(match.getDate().toLocalDate()) != null) {
				matchDays.get(match.getDate().toLocalDate()).add(match);
			} else {
				matchDays.put(match.getDate().toLocalDate(), Lists.newArrayList(match));
			}
		}
		
		// Extract lists of matches from map
		List<List<Match>> matchDaysList =  new ArrayList<List<Match>>(matchDays.values());
		
		if (reverse) {
			// Reverse order of match days (from newest to oldest)
			Collections.reverse(matchDaysList);
		}
		
		return matchDaysList;
	}
	
	/**
	 * Get the string representation of the match day for a match.
	 * 
	 * @param match The match to get the match day string from.
	 * @return A string representing the match day.
	 */
	public String getMatchDay(Match match) {
		return match.getDate().toLocalDate().format(matchDayFormatter);
	}
	
	/**
	 * Get the string representation of the time of a match.
	 * 
	 * @param match The match to get the time string from.
	 * @return A string representing the time of a match.
	 */
	public String getMatchTime(Match match) {
		return match.getDate().format(timeFormatter);
	}
	
	/**
	 * Capitalize the first character of a string.
	 * 
	 * @param str The string to be capitalized.
	 * @return A string where the first character is capitalized.
	 */
	public String capitalizeFirstCharacter(String str) {
		if (str.isBlank() || str == null) {
			return str;
		}
		
		return str.substring(0, 1).toUpperCase() + str.substring(1);
	}
	
}

package ft.util;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;

import ft.DoubleRoundRobin;
import ft.FootballTournaments;
import ft.FtPackage;
import ft.Table;

/**
 * Prints the table of the Premier League (season 2020/2021)
 * Corresponding to this web page: https://resultater.nrk.no/fotball/1/turneringer/7/2021/tabell
 */
public class PrintTable {
	
	public static void main(String[] args) {
		ResourceSet resSet = new ResourceSetImpl();
		
		// Maps the URI for the model to the package
		resSet.getPackageRegistry().put(FtPackage.eNS_URI, FtPackage.eINSTANCE);
		
		// When loading an .ft file, use FtResourceFactory to handle resources (parsing to real instances of our model)
		resSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("ft", new FtResourceFactoryImpl());
		
		Resource resource = resSet.getResource(URI.createURI("instances/EnglishTournaments.ft"), true);
		
		FootballTournaments ft = (FootballTournaments) resource.getContents().get(0);
		
		Table table = ((DoubleRoundRobin) ft.getHosts().get(0).getTournaments().get(0).getSeasons().get(0).getStages().get(0)).getTable();
		
		System.out.format("%3s%32s%5s%5s%5s%5s%5s%5s%5s%5s%40s", "Pos", "Club", "P", "W", "D", "L", "GF", "GA", "GD", "Pts", "Form");

		table.getStatistics().forEach(s -> {
			System.out.println();
			System.out.format("%3d%32s%5d%5d%5d%5d%5d%5d%5d%5d%40s", s.getPosition(), s.getClub().getName(), s.getPlayed(), s.getWon(), s.getDrawn(), s.getLost(), s.getGoalsFor(), s.getGoalsAgainst(), s.getGoalDifference(), s.getPoints(), s.getForm());
		});
	}

}

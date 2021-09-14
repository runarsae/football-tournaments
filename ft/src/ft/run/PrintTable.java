package ft.run;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;

import ft.DoubleRoundRobin;
import ft.FootballTournaments;
import ft.FtPackage;
import ft.Table;
import ft.util.FtResourceFactoryImpl;

public class PrintTable {
	
	public static void main(String[] args) {
		ResourceSet resSet = new ResourceSetImpl();
		
		// Maps the URI for the model to the package
		resSet.getPackageRegistry().put(FtPackage.eNS_URI, FtPackage.eINSTANCE);
		
		// When loading an .ft file, use FtResourceFactory to handle resources (parsing to real instances of our model)
		resSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("ft", new FtResourceFactoryImpl());
		
		Resource resource = resSet.getResource(URI.createURI("model/FootballTournaments.ft"), true);
		
		FootballTournaments ft = (FootballTournaments) resource.getContents().get(0);
		
		Table table = ((DoubleRoundRobin) ft.getHosts().get(0).getTournaments().get(0).getSeasons().get(0).getStages().get(0)).getTable();
		
		table.getStatistics().forEach(s -> {
			System.out.println(s.getClub().getName() + " " + s.getPosition() + " " + s.getPlayed() + " " + s.getWon() + " " + s.getDrawn() + " " + s.getLost() + " " + s.getGoalsFor() + " " + s.getGoalsAgainst() + " " + s.getGoalDifference() + " " + s.getPoints() + " " + s.getForm());
		});
	}

}
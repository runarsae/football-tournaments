package ft.run;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

import ft.DoubleRoundRobin;
import ft.FootballTournaments;
import ft.FtPackage;
import ft.Table;

public class PrintTable {
	
	public static void main(String[] args) {
		ResourceSet resSet = new ResourceSetImpl();
		
		// Maps the URI for the model to the package
		resSet.getPackageRegistry().put(FtPackage.eNS_URI, FtPackage.eINSTANCE);
		
		// When loading an XMI file, use an XMIResourceFactory to handle resources (parsing it to real instances of our model)
		resSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("xmi", new XMIResourceFactoryImpl());
		
		Resource resource = resSet.getResource(URI.createURI("model/FootballTournaments.xmi"), true);
		
		FootballTournaments ft = (FootballTournaments) resource.getContents().get(0);
		
		Table table = ((DoubleRoundRobin) ft.getRegions().get(0).getTournaments().get(0).getSeasons().get(0).getStage()).getTable();
		
		table.getStatistics().forEach(s -> {
			System.out.println(s.getClub().getName() + " " + s.getPosition() + " " + s.getPlayed() + " " + s.getWon() + " " + s.getDrawn() + " " + s.getLost() + " " + s.getGoalsFor() + " " + s.getGoalsAgainst() + " " + s.getGoalDifference() + " " + s.getPoints() + " " + s.getForm());
		});
	}

}

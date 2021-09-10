package ft.run;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.XMIResource;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

import ft.Club;
import ft.FootballTournaments;
import ft.FtFactory;
import ft.FtPackage;
import ft.GenderKind;
import ft.Match;
import ft.Region;
import ft.Result;
import ft.Round;
import ft.Season;
import ft.Stage;
import ft.Tournament;

public class FetchData {
	
	static FtFactory factory = FtFactory.eINSTANCE;

	
	static String MODEL_FILE = "model/FootballTournaments.xmi";
	
	static String FILE = "datasets/nm_2018.csv";
	static String REGION = "Norway";
	static String TOURNAMENT = "NM menn";
	static Stage stage = factory.createSingleElimination();
	static GenderKind GENDER = GenderKind.MALE;
	static LocalDate START_DATE = LocalDate.of(2018, 1, 1);
	static LocalDate END_DATE = LocalDate.of(2018, 12, 31);

	
	public static FootballTournaments load() {
		
		ResourceSet resSet = new ResourceSetImpl();
		
		// Maps the URI for the model to the package
		resSet.getPackageRegistry().put(FtPackage.eNS_URI, FtPackage.eINSTANCE);
		
		// When loading an XMI file, use an XMIResourceFactory to handle resources (parsing it to real instances of our model)
		resSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("xmi", new XMIResourceFactoryImpl());
		
		Resource resource = resSet.getResource(URI.createURI(MODEL_FILE), true);
		
		return (FootballTournaments) resource.getContents().get(0);
	}
	
	public static void save(FootballTournaments ft) {
        Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
        Map<String, Object> m = reg.getExtensionToFactoryMap();
        m.put("xmi", new XMIResourceFactoryImpl());

        // Obtain a new resource set
        ResourceSet resSet = new ResourceSetImpl();

        // Create a resource
        Resource resource = resSet.createResource(URI
                .createURI(MODEL_FILE));
        
        // Add content
        resource.getContents().add(ft);

        // Save the content
        try {
        	Map<Object, Object> saveOptions = new HashMap<Object, Object>();	  
        	saveOptions.put(XMIResource.OPTION_ENCODING,"UTF-8");
        	resource.save(saveOptions);
        } catch (IOException e) {
            e.printStackTrace();
        }
	}
	

	public static void main(String[] args) throws IOException {
		
		FootballTournaments footballTournaments = load();
		
		Region region = null;
		
		Optional<Region> r = footballTournaments.getRegions().stream().filter(x -> x.getName().equals(REGION)).findFirst();
		
		boolean addTournament = false;
		
		if (!r.isPresent()) {
			region = factory.createRegion();
			region.setName(REGION);
			footballTournaments.getRegions().add(region);
			addTournament = true;
		}
		
		Tournament tournament = null;
		
		if (r.isPresent()) {
			region = r.get();
			Optional<Tournament> t = region.getTournaments().stream().filter(x -> x.getName().equals(TOURNAMENT)).findFirst();
			
			if (!t.isPresent()) {
				addTournament = true;
			} else {
				tournament = t.get();
			}
		}
		
		if (addTournament) {
			tournament = factory.createTournament();
			tournament.setName(TOURNAMENT);
			tournament.setRegion(region);
			tournament.setGender(GENDER);
		}
		
		Season season = factory.createSeason();
		season.setStartDate(START_DATE);
		season.setEndDate(END_DATE);
		season.setTournament(tournament);
		
		stage.setSeason(season);

		String line = "";

		Round currentRound = null;
		
		try {
			BufferedReader br = new BufferedReader(new FileReader(FILE, StandardCharsets.UTF_8));

			while ((line = br.readLine()) != null) {
				String[] matchString = line.split(";");
				Integer roundNumber = Integer.parseInt(matchString[0]);
				String dateString = matchString[1];
				Integer day = Integer.parseInt(dateString.substring(0, 2));
				Integer month = Integer.parseInt(dateString.substring(3, 5));
				Integer year = Integer.parseInt(dateString.substring(6));
				String timeString = matchString[2];
				Integer hours = Integer.parseInt(timeString.substring(0, 2));
				Integer minutes = Integer.parseInt(timeString.substring(3));
				
			    LocalDateTime date = LocalDateTime.of(year, month, day, hours, minutes);

				String homeClubName = matchString[3];
				String awayClubName = matchString[5];

				String resultString = matchString[4];
				Integer homeGoals = null;
				Integer awayGoals = null;

				if (resultString.length() >= 5 && resultString.contains(" - ")) {
					String[] results = resultString.split(" - ");
					homeGoals = Integer.parseInt(results[0]);
					awayGoals = Integer.parseInt(results[1]);
				}

				if (!stage.getRounds().stream().anyMatch(x -> x.getRoundNumber() == roundNumber)) {
					Round round = factory.createRound();
					round.setRoundNumber(roundNumber);
					round.setStage(stage);
					currentRound = round;
				}
				
				Club homeClub = null;
				Club awayClub = null;
				Optional<Club> homeClubOptional = region.getClubs().stream().filter(x -> x.getName().equals(homeClubName) && x.getGender().equals(GENDER)).findFirst();
				Optional<Club> awayClubOptional = region.getClubs().stream().filter(x -> x.getName().equals(awayClubName) && x.getGender().equals(GENDER)).findFirst();


				if (!homeClubOptional.isPresent()) {
					Club c = factory.createClub();
					c.setName(homeClubName);
					c.setGender(GENDER);
					c.getSeasons().add(season);
					c.setRegion(region);
					homeClub = c;
				} else {
					homeClub = homeClubOptional.get();
					
					if (!season.getClubs().contains(homeClub)) {
						season.getClubs().add(homeClub);
					}
				}

				if (!awayClubOptional.isPresent()) {
					Club c = factory.createClub();
					c.setName(awayClubName);
					c.setGender(GENDER);
					c.getSeasons().add(season);
					c.setRegion(region);
					awayClub = c;
				} else {
					awayClub = awayClubOptional.get();
					
					if (!season.getClubs().contains(awayClub)) {
						season.getClubs().add(awayClub);
					}
				}
				

				Match match = factory.createMatch();
				match.setHomeClub(homeClub);
				match.setAwayClub(awayClub);
				match.setRound(currentRound);
				match.setDate(date);

				if (homeGoals != null && awayGoals != null) {
					Result result = factory.createResult();
					result.setHomeGoalsFullTime(homeGoals);
					result.setAwayGoalsFullTime(awayGoals);

					match.setResult(result);
				}

			}

			br.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
				
		save(footballTournaments);
	}

}

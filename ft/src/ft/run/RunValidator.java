package ft.run;

import org.eclipse.acceleo.query.delegates.AQLValidationDelegate;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EValidator.ValidationDelegate;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.Diagnostician;

import ft.FootballTournaments;
import ft.FtPackage;
import ft.util.FtResourceFactoryImpl;

public class RunValidator {
	
	public static void main(String[] args) {
		// Register AQL (an OCL implementation) constraint support
		ValidationDelegate.Registry.INSTANCE.put("http://www.eclipse.org/acceleo/query/1.0", new AQLValidationDelegate());
		
		// Container corresponding to resources (files)
		// When loading one file, we may need to load other related files
		ResourceSet resSet = new ResourceSetImpl();
		
		// Maps the URI for the model to the package
		resSet.getPackageRegistry().put(FtPackage.eNS_URI, FtPackage.eINSTANCE);
		
		// When loading an .ft file, use FtResourceFactory to handle resources (parsing to real instances of our model)
		resSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("ft", new FtResourceFactoryImpl());
		
		Resource resource = resSet.getResource(URI.createURI("model/FootballTournaments.ft"), true);
		
		// Validate football tournaments
		FootballTournaments ft = (FootballTournaments) resource.getContents().get(0);
		Diagnostic diagnostic = Diagnostician.INSTANCE.validate(ft);
		System.out.println("Severity: " + diagnostic.getSeverity());
		
		if (diagnostic.getSeverity() != 0) {
			for (Diagnostic d : diagnostic.getChildren()) {
				System.out.println(d);
			}
		}
	}
	
}

package ft.util;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;

import ft.FtPackage;

public class TestResourceLoader {
		
	public static Resource load(String file) {
		
		ResourceSet resSet = new ResourceSetImpl();
		
		// Maps the URI for the model to the package
		resSet.getPackageRegistry().put(FtPackage.eNS_URI, FtPackage.eINSTANCE);
		
		// When loading an .ft file, use FtResourceFactory to handle resources (parsing to real instances of our model)
		resSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("ft", new FtResourceFactoryImpl());
		
		// Get resource from the resources folder
		return resSet.getResource(URI.createURI("resources/" + file), true);
	}

}

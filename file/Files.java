package file;

import java.io.FileNotFoundException;

public class Files {

	public static void ouverture() throws FileNotFoundException {

		FileJoueur.lecture();
		FileCoach.lecture();
		FileOrganisateur.lecture();
		
	}
	
	public static void fermeture() throws FileNotFoundException {

		FileJoueur.ecriture();
		FileCoach.ecriture();
		FileOrganisateur.ecriture();
		
	}

}

package file;

import java.io.File;
import java.io.FileNotFoundException;

public class Utilisateur {
	

	public static void ouvrirUtilisateur() {
		
		File file = new File("utilisateurs.txt");
		try {
			Utilisateur utilisateur = Utilisateur.from(file, 3);
			System.out.println(utilisateur);
		} catch (FileNotFoundException e) {
			System.out.println("Fichier manquant");
		}
	}
	
}

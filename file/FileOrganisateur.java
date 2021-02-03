package file;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import eSport.Organisateur;

public class FileOrganisateur {
	
	public static void lecture() throws FileNotFoundException {

		File file = new File("organisateurs.txt");
		Scanner scanner = new Scanner(file);
		while (scanner.hasNextLine()) {
			Organisateur.from(scanner.nextLine());
		}
		scanner.close();

	}

}

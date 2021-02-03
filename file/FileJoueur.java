package file;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

import eSport.Joueur;

public class FileJoueur {

	public static void lecture() throws FileNotFoundException {

		File file = new File("joueurs.txt");
		Scanner scanner = new Scanner(file);
		while (scanner.hasNextLine()) {
			Joueur.from(scanner.nextLine());
		}
		scanner.close();

	}
	
	public static void ecriture() throws IOException{
		File file = new File("joueurs.txt");
		FileWriter fileWriter = new FileWriter(file);
		for(Joueur joueur : joueurs)
		{
			fileWriter.write(String.format("%s\n", joueur));
		}
		fileWriter.close();
	}

}

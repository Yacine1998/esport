package file;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import eSport.Coach;

public class FileCoach {

	public static void lecture() throws FileNotFoundException {
		File file = new File("coachs.txt");
		Scanner scanner = new Scanner(file);
		while (scanner.hasNextLine()) {
			Coach.from(scanner.nextLine());
		}
		scanner.close();
	}

}

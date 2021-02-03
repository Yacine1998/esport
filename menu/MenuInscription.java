package menu;

import java.util.Scanner;

public class MenuInscription {
	
	public static void menuInscription() {
		int type = 0;
		do {
			System.out.println("\n * * * PAGE D'INSCRIPTION * * * \n");
			System.out.println("\n S'inscrire en tant que : \n");
			System.out.println("Joueur : Tapez 1"
			+ "\nCoach : Tapez 2"
			+ "\nOrganisateur : Tapez 3"
			+ "\nQuitter : Tapez 4");
			
			try {
				Scanner scanner = new Scanner (System.in);
				type = scanner.nextInt();
				switch(type) {
				case 1:

					break;
				case 2:
					
					break;
					
				case 3:
					
					break;
					
				}
			}catch(NumberFormatException e)
			{
				type = 4;
			}
		}while (type > 0 && type < 4);
	}

}

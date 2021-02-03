package menu;
 
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int type = 0;
		do {
			System.out.println("\n \t \t  * * * BIENVENUE SUR MY-ESPORT APPLI * * * \n");
			System.out.println("\t  Connexion : Tapez 1"
						  + "\n \t  Inscription : Tapez 2"
						  + "\n \t  Quitter : Tapez 3");
			
			try {
				Scanner scanner = new Scanner (System.in);
				type = scanner.nextInt();
				switch(type) {
				case 1:
					System.out.println("\n \t \t  * * * Vous etes dans la page de Connexion * * * \n");
					MenuInscription.connexion();
					type = 4 ;
					break;
				case 2:
					System.out.println("\n \t \t * * * Vous etes dans la page d'Inscription * * * \n");
					MenuInscription.menuInscription();
					break;
				case 3 :
					System.out.println(" Au revoir à bientot ");
				}
			}catch(NumberFormatException e)
			{
				type = 3;
			}
		}while (type > 0 && type < 3);
	}
}
 
 
package menu;

import java.util.Scanner;

public class MenuInscription {
	
	 static void inscrip() {
		// Ma méthode d'inscription
			System.out.println("Entrez votre nom \n");
			Scanner scanner1 = new Scanner (System.in);
			String nom = scanner1.nextLine();
			System.out.println("Entrez votre prenom \n");
			Scanner scanner2 = new Scanner (System.in);
			String prenom = scanner2.nextLine();
			System.out.println("Entrez votre Date de Naissance \n");
			Scanner scanner3= new Scanner (System.in);
			String dateNaissance = scanner3.nextLine();
			System.out.println("Entrez votre Email \n");
			Scanner scanner4= new Scanner (System.in);
			String email = scanner4.nextLine();					
			System.out.println("Entrez votre mot de passe \n");
			Scanner scanner5 = new Scanner (System.in);
			String mdp = scanner5.nextLine();
			// Message à afficher aprés l'écriture dans le fichier 
			System.out.println("\n \t \t  * * * Vous etes bien inscrit * * * \n");
			System.out.println("\n \t \t   Pour accéder à votre compte veuillez vous identifier   \n");
	 }
	
	 static void connexion() {
			System.out.println("Entrez votre Email \n");
			Scanner scanner1 = new Scanner (System.in);
			String email = scanner1.nextLine();
			System.out.println("Entrez votre mot de passe \n");
			Scanner scanner2 = new Scanner (System.in);
			String mdp = scanner2.nextLine();
			// Vérification de Connexion
			System.out.println("  *_*  Bienvenue dans votre espace adhérant \n Vous etes bien connecté \n");
			System.out.println(" NOUS TRAVAILLONS ACTUELLEMENT SUR LA CONSTRUCTION DE NOTRE SITE  \n");
		 
		}
	
	public static void menuInscription() {
		int type = 0;
		do {
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
					System.out.println("\n Vous allez vous inscrire en tan que : Joueur \n");
					inscrip();	
					// Ecriture d'abords dans le fichier 
					connexion();
					break;
					
				case 2:
					System.out.println("\n Vous allez vous inscrire en tan que : Coach \n");
					inscrip();
					// Ecriture d'abords dans le fichier 
					connexion();
					break;
					
				case 3:
					System.out.println("\n Vous allez vous inscrire en tan que : Organisateur \n");
					inscrip();
					// Ecriture d'abords dans le fichier 
					connexion();
					break;
				}
			} catch(NumberFormatException e){
				type = 4;
			}
		}while (type > 0 && type < 4);
	}

}
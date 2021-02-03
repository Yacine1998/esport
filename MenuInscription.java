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
					// Vérification de Connexion if conn = 1  
					System.out.println("  _   Vous etes bien connecté  _ \n  Bienvenue dans votre espace Joueur \n");
			        System.out.println("  _   Pour afficher les tournois => Tapez 1 \n"
			                            + "   Afficher son équipe => Tapez 2 \n");
					
					break;
					
				case 2:
					System.out.println("\n Vous allez vous inscrire en tan que : Coach \n");
					inscrip();
					// Ecriture d'abords dans le fichier 
					connexion();
					// Vérification de Connexion if conn = 1  
					System.out.println("  Vous etes bien connecté  _ \n  Bienvenue dans votre espace Coach \n");
			        System.out.println("  Pour afficher les tournois => Tapez 1 \n "
			        				+ "   Pour afficher les équipes => Tapez 2 \n "
			        				+ "   Pour Afficher le tableau de qualification => Tapez 3 \n ");
					break;
					
				case 3:
					System.out.println("\n Vous allez vous inscrire en tan que : Organisateur \n");
					inscrip();
					// Ecriture d'abords dans le fichier 
					connexion();
					// Vérification de Connexion if conn = 1  
					System.out.println("  Vous etes bien connecté  _ \n  Bienvenue dans votre espace Organisateur \n");
					 System.out.println(" Pour afficher les tournois => Tapez 1 \n"
		        				+ "       Pour supprimer un tournoi => Tapez 2 \n"
		        				+ " 	  Pour afficher les équipes => Tapez 3 \n"
		        				+ " 	  Pour supprimer une équipe => Tapez 4 \n"
		        				+ "		  Pour Afficher le tableau de qualification => Tapez 5 \n"
		        				+ "		  Pour Afficher  les Sposors => Tapez 6 \n"
		        				+ "		  Pour supprimer un sposnor => Tapez 7 \n"
		        				+ " 	  Pour ajouter un sponsor => Tapez 8  \n" );
					break;
				}
			} catch(NumberFormatException e){
				type = 4;
			}
		}while (type > 0 && type < 4);
	}

}
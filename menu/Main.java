package menu;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int type = 0;
		do {
			System.out.println("\n * * * BIENVENUE SUR MY-ESPORT APPLI * * * \n");
			System.out.println("Connexion : Tapez 1"
			+ "\nInscription : Tapez 2"
			+ "\nQuitter : Tapez 3");
			
			try {
				Scanner scanner = new Scanner (System.in);
				type = scanner.nextInt();
				switch(type) {
				case 1:
					System.out.println("Entrez votre Email \n");
					Scanner scanner1 = new Scanner (System.in);
					String email = scanner1.nextLine();
					System.out.println("Entrez votre mot de passe \n");
					Scanner scanner2 = new Scanner (System.in);
					String mdp = scanner2.nextLine();
					break;
				case 2:
					MenuInscription.menuInscription();
				}
			}catch(NumberFormatException e)
			{
				type = 3;
			}
		}while (type > 0 && type < 3);
		
		/*
		System.out.println("\n * * * BIENVENUE SUR LA PAGE D'INSCRIPTION * * * \n");
		System.out.println(" Vous voulez inscrire en tant que joueur ? Tapez 1 "
		+ "\n Vous voulez inscrire en tant que organisateur ? Tapez 2 "
		+ "\n Vous voulez inscrire en tant que coach ? Tapez 3 ");
		Scanner scanner = new Scanner (System.in);
		int type = scanner.nextInt();
		if (type == 1) {
		System.out.println("Vous allez vous inscrire en tant que joueur");
			
		}
		else if (type == '2') {
		System.out.println("Vous allez vous inscrire en tant que organisateur");
		Utilisateur organ = new organisateur(String nom, String prenom, String dateNaissance, String poste);
		Organisateur.mescordos();
		System.out.println("Saisissez votre poste ");
		String poste = scanner.nextLine();

		System.out.println(" FELICITATION ! \n VOUS ETES BIEN INSCRIT ");
		System.out.println("\nNom : "+organ.nom+"\nPrénom : "+organ.prenom+"\nDate de Naissance : "+organ.dateNaissance+"\nPoste : "+poste);
		}
		else if (type == 'c') {
		System.out.println("Vous allez vous inscrire en tant que coach");
		}
		*/
	}


}

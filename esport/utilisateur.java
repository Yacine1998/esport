package eSport;

import java.io.File;

public class Utilisateur {
	
	public String nom ;
	public String prenom ;
	public String dateNaissance ;
	public String email;
	public String mdp;
	
	Utilisateur(String nom, String prenom, String dateNaissance, String email, String mdp) {
		this.nom = nom;
		this.prenom = prenom;
		this.dateNaissance = dateNaissance;
		this.email = email;
		this.mdp = mdp;
	}
		
		public boolean equals(Object obj) {
			Utilisateur other = (Utilisateur) obj;
			return nom.equals(other.nom) && prenom.equals(other.prenom);
		}
	
	/*
	public Utilisateur from(File file) {​​
		//TODO
		}​​

		public Utilisateur login(String login, String password) throws BadLoginException() {​​
		//TODO
		}​​
		*/
	String getnom() {
		return nom;
	}

	String getprenom() {
		return prenom;
	}
	
	String getdateNaissance() {
		return dateNaissance;
	}
	
	public String toString() {
		// return (nom,prenom,dateNaissance)
		return String.format("%s, %s, %s", nom, prenom, dateNaissance);
	}
}
	class Coach extends Utilisateur {
		public Coach(String nom, String prenom, String dateNaissance, String email, String mdp) {
			super(); 
		 }
		static void setCoach(String nom, String prenom, String dateNaissance, String email, String mdp) {
			new Coach(nom, prenom,dateNaissance);
		}
		static Coach from(String text) {
			String[] fields = text.split(",");
			String nom = fields[0].strip();
			String prenom = fields[1].strip();
			String dateNaissance = fields[2].strip();
			String email = fields[3].strip();
			String mdp = fields[4].strip();
			return new Coach(nom, prenom, dateNaissance, email, mdp);
		}
		
	}
	
	class Joueur extends Utilisateur {
		// newEquipe
		public Joueur(String nom, String prenom, String dateNaissance) {
			super();
		}
		static void setJoueur(String nom, String prenom, String dateNaissance) {
			new Joueur(nom, prenom,dateNaissance);
		}
		
	}
	
	class Organisateur extends Utilisateur {
		// newTache()
		String poste ;
		public Organisateur(String nom, String prenom, String dateNaissance, String poste) {
			super();
			this.poste = poste ;
		}
		public String getPoste() {
			return poste;
		}
		public void setPoste(String poste) {
			this.poste = poste;
		}
		static void setOrganisateur(String nom, String prenom, String dateNaissance, String poste) {
			new Organisateur(nom, prenom,dateNaissance,poste);
		}

}

package eSport;


public class Joueur extends Utilisateur {
	// newEquipe
	public Joueur(String nom, String prenom, String dateNaissance, String email, String mdp) {
		super(nom, prenom, dateNaissance, email, mdp);
	}

	public static Joueur from(String text) {
		String[] fields = text.split(",");
		String nom = fields[0].strip();
		String prenom = fields[1].strip();
		String dateNaissance = fields[2].strip();
		String email = fields[3].strip();
		String mdp = fields[4].strip();
		return new Joueur(nom, prenom, dateNaissance, email, mdp);
	}
	

}
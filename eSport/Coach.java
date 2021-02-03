package eSport;

public class Coach extends Utilisateur {
	public Coach(String nom, String prenom, String dateNaissance, String email, String mdp) {
		super(nom, prenom, dateNaissance, email, mdp);
	}
	
	public static Coach from(String text) {
		String[] fields = text.split(",");
		String nom = fields[0].strip();
		String prenom = fields[1].strip();
		String dateNaissance = fields[2].strip();
		String email = fields[3].strip();
		String mdp = fields[4].strip();
		return new Coach(nom, prenom, dateNaissance, email, mdp);
	}

}

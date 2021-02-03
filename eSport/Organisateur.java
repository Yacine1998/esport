package eSport;

public class Organisateur extends Utilisateur {
	// newTache()
	String poste;

	public Organisateur(String nom, String prenom, String dateNaissance, String email, String mdp, String poste) {
		super(nom, prenom, dateNaissance, email, mdp);
		this.poste = poste;
	}

	public String getPoste() {
		return poste;
	}

	public void setPoste(String poste) {
		this.poste = poste;
	}
	
	public static Organisateur from(String text) {
		String[] fields = text.split(",");
		String nom = fields[0].strip();
		String prenom = fields[1].strip();
		String dateNaissance = fields[2].strip();
		String email = fields[3].strip();
		String mdp = fields[4].strip();
		String poste = fields[5].strip();
		return new Organisateur(nom, prenom, dateNaissance, email, mdp, poste);
	}

}

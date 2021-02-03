package eSport;

public class Utilisateur {

	public String nom;
	public String prenom;
	public String dateNaissance;
	public String email;
	public String mdp;

	public Utilisateur(String nom, String prenom, String dateNaissance, String email, String mdp) {
		this.nom = nom;
		this.prenom = prenom;
		this.dateNaissance = dateNaissance;
		this.email = email;
		this.mdp = mdp;
	}
	
	public String getEmail() {
		return email;
	}

	public String getMdp() {
		return mdp;
	}
	
	/*
	boolean login(File file, String email, String mdp)
	{
		Scanner scanner = new Scanner(file);
		for (int i = 0; i < lines; i++) {
			stock.books[i] = Utilisateur.from(scanner.nextLine());
		}
		scanner.close();
		return stock;
		
		return true;
	}
	*/

	public String toString() {
		// return (nom,prenom,dateNaissance)
		return String.format("%s, %s, %s", nom, prenom, dateNaissance);
	}
}

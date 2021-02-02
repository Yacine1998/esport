package eSport;

public class Qualification {
	public Tournoi tournoi;
	public String dateQualif ; 
	public String heureQualif ;
	public Equipe equipe1;
	public Equipe equipe2;
	public String niveau;
	public Equipe gagnant;

	Qualification(Tournoi tournoi, String dateQualif, String heureQualif, Equipe equipe1, Equipe equipe2, String niveau){
		this.tournoi = tournoi ;
		this.dateQualif = dateQualif ;
		this.heureQualif = heureQualif ;
		this.equipe1 = equipe1 ;
		this.equipe2 = equipe2 ;
		this.niveau = niveau ;
		this.gagnant = NULL;
	}
	
	void setGagnant(Equipe gagnant) {
		this.gagnant = gagnant;
	}
}

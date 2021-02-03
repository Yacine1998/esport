package eSport;

public class Tournoi {
	
	public Jeux jeux ;
	public Qualification qualification;
	public String dateDebut ;
	public String dateFin ;
	public String lieu;

	Tournoi(Jeux jeux, String dateDebut, String dateFin, String lieu){
		this.jeux = jeux ;
		this.dateDebut = dateDebut ;
		this.dateFin = dateFin ;
		this.lieu = lieu;
	}

}

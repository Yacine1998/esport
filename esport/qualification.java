package eSport;

import java.util.ArrayList;
import java.util.Optional;

public class Qualification {
	public Tournoi tournoi;
	public String dateQualif ; 
	public String heureQualif ;
	public ArrayList<Equipe> equipes;
	public String niveau;
	Optional <Equipe> gagnant;

	Qualification(Tournoi tournoi, String dateQualif, String heureQualif, Equipe equipes, int size, String niveau){
		this.tournoi = tournoi ;
		this.dateQualif = dateQualif ;
		this.heureQualif = heureQualif ;
		this.equipes = new ArrayList<>();
		this.niveau = niveau ;
		this.gagnant = Optional.empty();
	}
	
	void setGagnant(Equipe gagnant) {
		this.gagnant.ofNullable(gagnant);
	}
	
	public Optional<Equipe> getGagnant() {
		return gagnant;
	}
}

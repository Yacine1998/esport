package eSport;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class Equipe {
	public String nom ; 
	private Joueur[] joueurs;
	private Coach[] coachs;
	private Sponsor sponsor;
	
	public Equipe(String nom, int joueurs, int coachs, Sponsor sponsor){
		this.nom = nom;
		this.joueurs = new Joueur[joueurs];
		this.coachs = new Coach[coachs];
		this.sponsor = sponsor;
	}

	
	void setJoueur(String nom, String prenom, String dateNaissance) {
			Joueur.setJoueur(nom,prenom,dateNaissance);
		}
	
	void setCoach(String nom, String prenom, String dateNaissance) {
			Coach.setCoach(nom,prenom,dateNaissance);
		}
	
	void deleteJoueur(String nom, String prenom) {
		
	}
	
	void deleteCoach(String nom, String prenom) {
		
	}
	
	String getNom()
	{
		return nom;
	}
	
	void getSponsor()
	{
		Sponsor.getNom();
	}
	
}


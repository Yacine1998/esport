package eSport;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Equipe {
	private String nom;
	private ArrayList<Joueur> joueurs;
	private ArrayList<Coach> coachs;
	private Sponsor sponsor;

	public Equipe(String nom, Sponsor sponsor) {
		this.nom = nom;
		this.joueurs = new ArrayList<>();
		this.coachs = new ArrayList<>();
		this.sponsor = sponsor;
	}

	Joueur getJoueur(int index) {
		return joueurs.get(index);
	}

	Coach getCoach(int index) {
		return coachs.get(index);
	}

	String getNom() {
		return nom;
	}

	Sponsor getSponsor() {
		return sponsor;
	}

	void add(Joueur joueur) {
		joueurs.add(joueur);
	}

	void add(Coach coach) {
		coachs.add(coach);
	}

	void deleteJoueur(int index) {
		joueurs.remove(index);
	}

	void deleteCoach(int index) {
		coachs.remove(index);
	}
	
	public void writeToJoueur(File file) throws IOException {
		FileWriter fileWriter = new FileWriter(file);
		for(Joueur joueur : joueurs) {
			fileWriter.write(String.format("%s\n", joueur));
		}
	fileWriter.close();
	}
	
	public void writeToCoach(File file) throws IOException {
		FileWriter fileWriter = new FileWriter(file);
		for(Coach coach : coachs) {
			fileWriter.write(String.format("%s\n", coach));
		}
	fileWriter.close();
	}
	
	static Equipe from(File file, ArrayList<Joueur> joueurs, ArrayList<Coach> coachs, String nom, Sponsor sponsor) throws FileNotFoundException {
		Equipe equipe = new Equipe(nom, sponsor);
		Scanner scanner = new Scanner(file);
		for(int i = 0; i < joueurs.size(); i++)
		{
			equipe.joueurs.set(i,Joueur.from(scanner.nextLine()));
		}
		for(int i = 0; i < coachs.size(); i++)
		{
			equipe.coachs.set(i,Coach.from(scanner.nextLine()));
		}
		scanner.close();
		return equipe;
	}

}

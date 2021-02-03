package eSport;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Tournoi {

	public String nom;
	public Jeu jeu;
	public String dateDebut;
	public String dateFin;
	public String lieu;
	public ArrayList<Organisateur> organisateurs;
	public Sponsor sponsor;

	public Tournoi(String nom, Jeu jeu, String dateDebut, String dateFin, String lieu, Sponsor sponsor) {
		this.nom = nom;
		this.jeu = jeu;
		this.dateDebut = dateDebut;
		this.dateFin = dateFin;
		this.lieu = lieu;
		this.organisateurs = new ArrayList<>();
		this.sponsor = sponsor;
	}
	
	public void writeToOrganisateur(File file) throws IOException {
		FileWriter fileWriter = new FileWriter(file);
		for(Organisateur organisateur : organisateurs) {
			fileWriter.write(String.format("%s\n", organisateur));
		}
	fileWriter.close();
	}

	static Tournoi from(File file, String nom, Jeu jeu, String dateDebut, String dateFin, String lieu, ArrayList<Organisateur> organisateurs, Sponsor sponsor) throws FileNotFoundException {
		Tournoi tournoi = new Tournoi(nom, jeu, dateDebut, dateFin, lieu, sponsor);
		Scanner scanner = new Scanner(file);
		for(int i = 0; i < organisateurs.size(); i++)
		{
			tournoi.organisateurs.set(i,Organisateur.from(scanner.nextLine()));
		}
		for(int i = 0; i < organisateurs.size(); i++)
		{
			tournoi.organisateurs.set(i,Organisateur.from(scanner.nextLine()));
		}
		scanner.close();
		return tournoi;
	}

}

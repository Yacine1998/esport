package eSport;

public class Jeux {
	
	public String nom ;
	public String licence;
	public String console;
	
	public Jeux(String nom, String licence, String console){
		this.nom = nom;
		this.licence = licence;
		this.console = console;
	}

	String getnom() {
		return nom;
	}

	String getLicence() {
		return licence;
	}
	
	String getConsole() {
		return console;
	}

}

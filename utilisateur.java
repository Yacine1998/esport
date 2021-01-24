package esport;

	public class utilisateur {
		public String nom ;
		public String prenom ;
		public String dateNaissance ; 
	}
	
	class coach extends utilisateur {
		String domaine ;
		public coach(String nom, String prenom, String dateNaissance,String domaine) {
			this.nom = nom ;
			this.prenom = prenom ;
			this.dateNaissance = dateNaissance ; 
			this.domaine = domaine ; 
		 }
		public String getDomaine() {
			return domaine;
		}
		public void setDomaine(String domaine) {
			this.domaine = domaine;
		}
	}
	
	class joueur extends utilisateur {
		// newEquipe
		String categorie ;
		public joueur(String nom, String prenom, String dateNaissance,String categorie) {
			this.nom = nom ;
			this.prenom = prenom ;
			this.dateNaissance = dateNaissance ; 
			this.categorie = categorie ; 
		}
		public String getCategorie() {
			return categorie;
		}
		public void setCategorie(String categorie) {
			this.categorie = categorie;
		}
	}
	
	class organisateur extends utilisateur {
		// newTache()
		String poste ;
		public organisateur(String nom, String prenom, String dateNaissance, String poste) {
			this.nom = nom ;
			this.prenom = prenom ;
			this.dateNaissance = dateNaissance ;
			this.poste = poste ;
		}
		public String getPoste() {
			return poste;
		}
		public void setPoste(String poste) {
			this.poste = poste;
		}
	}
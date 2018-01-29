package DonnePOJO;

public class Personne {

	private int idPerso;
	private String nom;
	private String prenom;
	private int nbHeuresVol;
	
	public Personne(int idPerso, String nom, String prenom, int nbHeuresVol) {
		this.idPerso = idPerso;
		this.nom = nom;
		this.prenom = prenom;
		this.nbHeuresVol = nbHeuresVol;
	}

	public int getIdPerso() {
		return idPerso;
	}

	public void setIdPerso(int idPerso) {
		this.idPerso = idPerso;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public int getNbHeuresVol() {
		return nbHeuresVol;
	}

	public void setNbHeuresVol(int nbHeuresVol) {
		this.nbHeuresVol = nbHeuresVol;
	}
	
	
}

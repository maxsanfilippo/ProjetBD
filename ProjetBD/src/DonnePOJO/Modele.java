package DonnePOJO;

public class Modele {

	private String noModele;
	private int nbPilotes;
	private int rayon;
	private int volumeMax;
	private int poidsMax;
	private int nbPlaces;
	private int nbPlacesEco;
	private int nbPlacesPremiere;
	private int nbPlacesAffaire;
	
	public Modele(String noModele, int nbPilotes, int rayon, int volumeMax, int poidsMax, int nbPlaces, int nbPlacesEco,
			int nbPlacesPremiere, int nbPlacesAffaire) {
		this.noModele = noModele;
		this.nbPilotes = nbPilotes;
		this.rayon = rayon;
		this.volumeMax = volumeMax;
		this.poidsMax = poidsMax;
		this.nbPlaces = nbPlaces;
		this.nbPlacesEco = nbPlacesEco;
		this.nbPlacesPremiere = nbPlacesPremiere;
		this.nbPlacesAffaire = nbPlacesAffaire;
	}

	public String getNoModele() {
		return noModele;
	}

	public void setNoModele(String noModele) {
		this.noModele = noModele;
	}

	public int getNbPilotes() {
		return nbPilotes;
	}

	public void setNbPilotes(int nbPilotes) {
		this.nbPilotes = nbPilotes;
	}

	public int getRayon() {
		return rayon;
	}

	public void setRayon(int rayon) {
		this.rayon = rayon;
	}

	public int getVolumeMax() {
		return volumeMax;
	}

	public void setVolumeMax(int volumeMax) {
		this.volumeMax = volumeMax;
	}

	public int getPoidsMax() {
		return poidsMax;
	}

	public void setPoidsMax(int poidsMax) {
		this.poidsMax = poidsMax;
	}

	public int getNbPlaces() {
		return nbPlaces;
	}

	public void setNbPlaces(int nbPlaces) {
		this.nbPlaces = nbPlaces;
	}

	public int getNbPlacesEco() {
		return nbPlacesEco;
	}

	public void setNbPlacesEco(int nbPlacesEco) {
		this.nbPlacesEco = nbPlacesEco;
	}

	public int getNbPlacesPremiere() {
		return nbPlacesPremiere;
	}

	public void setNbPlacesPremiere(int nbPlacesPremiere) {
		this.nbPlacesPremiere = nbPlacesPremiere;
	}

	public int getNbPlacesAffaire() {
		return nbPlacesAffaire;
	}

	public void setNbPlacesAffaire(int nbPlacesAffaire) {
		this.nbPlacesAffaire = nbPlacesAffaire;
	}
	
	
}

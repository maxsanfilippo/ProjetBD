package DonnePOJO;

public class AvionPassager {

	private int nbPlaces;
	private int nbPlacesEco;
	private int nbPlacesPremiere;
	private int nbPlacesAffaire;
	private int noAvion;
	
	public AvionPassager(int nbPlaces, int nbPlacesEco, int nbPlacesPremiere, int nbPlacesAffaire, int noAvion) {
		this.nbPlaces = nbPlaces;
		this.nbPlacesEco = nbPlacesEco;
		this.nbPlacesPremiere = nbPlacesPremiere;
		this.nbPlacesAffaire = nbPlacesAffaire;
		this.noAvion = noAvion;
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

	public int getNoAvion() {
		return noAvion;
	}

	public void setNoAvion(int noAvion) {
		this.noAvion = noAvion;
	}

	@Override
	public String toString() {
		return "AvionPassager [nbPlaces=" + nbPlaces + ", nbPlacesEco=" + nbPlacesEco + ", nbPlacesPremiere="
				+ nbPlacesPremiere + ", nbPlacesAffaire=" + nbPlacesAffaire + ", noAvion=" + noAvion + "]";
	}
	
	
}

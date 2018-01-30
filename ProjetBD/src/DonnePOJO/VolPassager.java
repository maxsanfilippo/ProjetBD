package DonnePOJO;

import oracle.sql.TIMESTAMP;

public class VolPassager {

	private int placesMinEco;
	private int placesMinPremiere;
	private int placesMinAffaire;
	private String noVol;
	private TIMESTAMP dateDepart;
	
	public VolPassager(int placesMinEco, int placesMinPremiere, int placesMinAffaire, String noVol, TIMESTAMP dateDepart) {
		this.placesMinEco = placesMinEco;
		this.placesMinPremiere = placesMinPremiere;
		this.placesMinAffaire = placesMinAffaire;
		this.noVol = noVol;
		this.dateDepart = dateDepart;
	}

	public int getPlacesMinEco() {
		return placesMinEco;
	}

	public void setPlacesMinEco(int placesMinEco) {
		this.placesMinEco = placesMinEco;
	}

	public int getPlacesMinPremiere() {
		return placesMinPremiere;
	}

	public void setPlacesMinPremiere(int placesMinPremiere) {
		this.placesMinPremiere = placesMinPremiere;
	}

	public int getPlacesMinAffaire() {
		return placesMinAffaire;
	}

	public void setPlacesMinAffaire(int placesMinAffaire) {
		this.placesMinAffaire = placesMinAffaire;
	}

	public String getNoVol() {
		return noVol;
	}

	public void setNoVol(String noVol) {
		this.noVol = noVol;
	}

	public TIMESTAMP getDateDepart() {
		return dateDepart;
	}

	public void setDateDepart(TIMESTAMP dateDepart) {
		this.dateDepart = dateDepart;
	}

	@Override
	public String toString() {
		return "VolPassager [placesMinEco=" + placesMinEco + ", placesMinPremiere=" + placesMinPremiere
				+ ", placesMinAffaire=" + placesMinAffaire + ", noVol=" + noVol + ", dateDepart=" + dateDepart + "]";
	}
	
	
}

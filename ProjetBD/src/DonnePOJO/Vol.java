package DonnePOJO;

import oracle.sql.TIMESTAMP;

public class Vol {
	private String noVol;
	private TIMESTAMP dateDepart;
	private String aeroOrigine;
	private String aeroDestination;
	private int duree;
	private int distance;
	private int arrive;
	private int noAvion;
	
	public Vol(String noVol, TIMESTAMP dateDepart, String aeroOrigine, String aeroDestination,
			int distance, int arrive, int noAvion) {
		this.noVol = noVol;
		this.dateDepart = dateDepart;
		this.aeroOrigine = aeroOrigine;
		this.aeroDestination = aeroDestination;
		this.distance = distance;
		this.arrive = arrive;
		this.noAvion = noAvion;
	}
	
	public Vol(String noVol, TIMESTAMP dateDepart, String aeroOrigine, String aeroDestination, int duree,
			int distance, int arrive, int noAvion) {
		this.noVol = noVol;
		this.dateDepart = dateDepart;
		this.aeroOrigine = aeroOrigine;
		this.aeroDestination = aeroDestination;
		this.duree = duree;
		this.distance = distance;
		this.arrive = arrive;
		this.noAvion = noAvion;
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

	public String getAeroOrigine() {
		return aeroOrigine;
	}

	public void setAeroOrigine(String aeroOrigine) {
		this.aeroOrigine = aeroOrigine;
	}

	public String getAeroDestination() {
		return aeroDestination;
	}

	public void setAeroDestination(String aeroDestination) {
		this.aeroDestination = aeroDestination;
	}

	public int getDuree() {
		return duree;
	}

	public void setDuree(int duree) {
		this.duree = duree;
	}

	public int getDistance() {
		return distance;
	}

	public void setDistance(int distance) {
		this.distance = distance;
	}

	public int isArrive() {
		return arrive;
	}

	public void setArrive(int arrive) {
		this.arrive = arrive;
	}

	public int getNoAvion() {
		return noAvion;
	}

	public void setNoAvion(int noAvion) {
		this.noAvion = noAvion;
	}

	@Override
	public String toString() {
		return "Vol [noVol=" + noVol + ", dateDepart=" + dateDepart + ", aeroOrigine=" + aeroOrigine
				+ ", aeroDestination=" + aeroDestination + ", duree=" + duree + ", distance=" + distance + ", arrive="
				+ arrive + ", noAvion=" + noAvion + "]";
	}
	
	
}

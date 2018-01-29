package DonnePOJO;

import java.sql.Date;

public class Vol {
	private String noVol;
	private Date dateDepart;
	private String aeroOrigine;
	private String aeroDestination;
	private int duree;
	private int distance;
	private boolean bool;
	private int noAvion;
	
	public Vol(String noVol, Date dateDepart, String aeroOrigine, String aeroDestination, int duree,
			int distance, boolean bool, int noAvion) {
		this.noVol = noVol;
		this.dateDepart = dateDepart;
		this.aeroOrigine = aeroOrigine;
		this.aeroDestination = aeroDestination;
		this.duree = duree;
		this.distance = distance;
		this.bool = bool;
		this.noAvion = noAvion;
	}

	public String getNoVol() {
		return noVol;
	}

	public void setNoVol(String noVol) {
		this.noVol = noVol;
	}

	public Date getDateDepart() {
		return dateDepart;
	}

	public void setDateDepart(Date dateDepart) {
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

	public boolean isBool() {
		return bool;
	}

	public void setBool(boolean bool) {
		this.bool = bool;
	}

	public int getNoAvion() {
		return noAvion;
	}

	public void setNoAvion(int noAvion) {
		this.noAvion = noAvion;
	}
	
	
}
package DonnePOJO;

import java.sql.Date;

public class VolFret {
	private int volumeMin;
	private int poidsMin;
	private float prixMetreCube;
	private String noVol;
	private Date dateDepart;
	
	public VolFret(int volumeMin, int poidsMin, float prixMetreCube, String noVol, Date dateDepart) {
		this.volumeMin = volumeMin;
		this.poidsMin = poidsMin;
		this.prixMetreCube = prixMetreCube;
		this.noVol = noVol;
		this.dateDepart = dateDepart;
	}

	public int getVolumeMin() {
		return volumeMin;
	}

	public void setVolumeMin(int volumeMin) {
		this.volumeMin = volumeMin;
	}

	public int getPoidsMin() {
		return poidsMin;
	}

	public void setPoidsMin(int poidsMin) {
		this.poidsMin = poidsMin;
	}

	public float getPrixMetreCube() {
		return prixMetreCube;
	}

	public void setPrixMetreCube(float prixMetreCube) {
		this.prixMetreCube = prixMetreCube;
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
	
	
}

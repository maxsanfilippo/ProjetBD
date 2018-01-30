package DonnePOJO;

import oracle.sql.TIMESTAMP;

public class VolFret {
	private int volumeMin;
	private int poidsMin;
	private float prixMetreCube;
	private String noVol;
	private TIMESTAMP dateDepart;
	
	public VolFret(int volumeMin, int poidsMin, float prixMetreCube, String noVol, TIMESTAMP dateDepart) {
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

	public TIMESTAMP getDateDepart() {
		return dateDepart;
	}

	public void setDateDepart(TIMESTAMP dateDepart) {
		this.dateDepart = dateDepart;
	}

	@Override
	public String toString() {
		return "VolFret [volumeMin=" + volumeMin + ", poidsMin=" + poidsMin + ", prixMetreCube=" + prixMetreCube
				+ ", noVol=" + noVol + ", dateDepart=" + dateDepart + "]";
	}
	
	
}

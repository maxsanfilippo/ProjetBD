package DonnePOJO;

import java.sql.Date;

public class ReserverFret {

	private int volumeResa;
	private int poidsResa;
	private int noResa;
	private String noVol;
	private Date dateDepart;
	
	public ReserverFret(int volumeResa, int poidsResa, int noResa, String noVol, Date dateDepart) {
		super();
		this.volumeResa = volumeResa;
		this.poidsResa = poidsResa;
		this.noResa = noResa;
		this.noVol = noVol;
		this.dateDepart = dateDepart;
	}

	public int getVolumeResa() {
		return volumeResa;
	}

	public void setVolumeResa(int volumeResa) {
		this.volumeResa = volumeResa;
	}

	public int getPoidsResa() {
		return poidsResa;
	}

	public void setPoidsResa(int poidsResa) {
		this.poidsResa = poidsResa;
	}

	public int getNoResa() {
		return noResa;
	}

	public void setNoResa(int noResa) {
		this.noResa = noResa;
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

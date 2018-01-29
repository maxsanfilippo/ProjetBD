package DonnePOJO;

import java.sql.Date;

public class Assure {

	private int idPerso;
	private String noVol;
	private Date dateDepart;
	
	public Assure(int idPerso, String noVol, Date dateDepart) {
		this.idPerso = idPerso;
		this.noVol = noVol;
		this.dateDepart = dateDepart;
	}

	public int getIdPerso() {
		return idPerso;
	}

	public void setIdPerso(int idPerso) {
		this.idPerso = idPerso;
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

	@Override
	public String toString() {
		return "Assure [idPerso=" + idPerso + ", noVol=" + noVol + ", dateDepart=" + dateDepart + "]";
	}
	
	
}

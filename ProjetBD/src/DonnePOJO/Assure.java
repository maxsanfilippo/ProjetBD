package DonnePOJO;

import oracle.sql.TIMESTAMP;

public class Assure {

	private int idPerso;
	private String noVol;
	private TIMESTAMP dateDepart;
	
	public Assure(int idPerso, String noVol, TIMESTAMP dateDepart) {
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

	public TIMESTAMP getDateDepart() {
		return dateDepart;
	}

	public void setDateDepart(TIMESTAMP dateDepart) {
		this.dateDepart = dateDepart;
	}

	@Override
	public String toString() {
		return "Assure [idPerso=" + idPerso + ", noVol=" + noVol + ", dateDepart=" + dateDepart + "]";
	}
	
	
}

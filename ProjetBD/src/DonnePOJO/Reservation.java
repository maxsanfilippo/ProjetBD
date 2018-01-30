package DonnePOJO;

import oracle.sql.TIMESTAMP;

public class Reservation {

	private int noResa;
	private TIMESTAMP dateResa;
	private int prixTotal;
	private int idPerso;
	
	public Reservation(int noResa, TIMESTAMP dateResa, int prixTotal, int idPerso) {
		this.noResa = noResa;
		this.dateResa = dateResa;
		this.prixTotal = prixTotal;
		this.idPerso = idPerso;
	}

	public int getNoResa() {
		return noResa;
	}

	public void setNoResa(int noResa) {
		this.noResa = noResa;
	}

	public TIMESTAMP getDateResa() {
		return dateResa;
	}

	public void setDateResa(TIMESTAMP dateResa) {
		this.dateResa = dateResa;
	}

	public int getPrixTotal() {
		return prixTotal;
	}

	public void setPrixTotal(int prixTotal) {
		this.prixTotal = prixTotal;
	}

	public int getIdPerso() {
		return idPerso;
	}

	public void setIdPerso(int idPerso) {
		this.idPerso = idPerso;
	}

	@Override
	public String toString() {
		return "Reservation [noResa=" + noResa + ", dateResa=" + dateResa + ", prixTotal=" + prixTotal + ", idPerso="
				+ idPerso + "]";
	}
	
	
}

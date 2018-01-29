package DonnePOJO;

import java.sql.Date;

public class Reservation {

	private int noResa;
	private Date dateResa;
	private int prixTotal;
	private int idPerso;
	
	public Reservation(int noResa, Date dateResa, int prixTotal, int idPerso) {
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

	public Date getDateResa() {
		return dateResa;
	}

	public void setDateResa(Date dateResa) {
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
	
	
}

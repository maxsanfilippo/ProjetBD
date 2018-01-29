package DonnePOJO;

import java.sql.Date;

public class Place {

	private int noPlace;
	private Classe classe;
	private Position position;
	private int prix;
	private String noVol;
	private Date DateDepart;
	private int noResa;
	
	public Place(int noPlace, Classe classe, Position position, int prix, String noVol, Date dateDepart, int noResa) {
		super();
		this.noPlace = noPlace;
		this.classe = classe;
		this.position = position;
		this.prix = prix;
		this.noVol = noVol;
		DateDepart = dateDepart;
		this.noResa = noResa;
	}

	public int getNoPlace() {
		return noPlace;
	}

	public void setNoPlace(int noPlace) {
		this.noPlace = noPlace;
	}

	public Classe getClasse() {
		return classe;
	}

	public void setClasse(Classe classe) {
		this.classe = classe;
	}

	public Position getPosition() {
		return position;
	}

	public void setPosition(Position position) {
		this.position = position;
	}

	public int getPrix() {
		return prix;
	}

	public void setPrix(int prix) {
		this.prix = prix;
	}

	public String getNoVol() {
		return noVol;
	}

	public void setNoVol(String noVol) {
		this.noVol = noVol;
	}

	public Date getDateDepart() {
		return DateDepart;
	}

	public void setDateDepart(Date dateDepart) {
		DateDepart = dateDepart;
	}

	public int getNoResa() {
		return noResa;
	}

	public void setNoResa(int noResa) {
		this.noResa = noResa;
	}
	
	
}

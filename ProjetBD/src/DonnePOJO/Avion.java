package DonnePOJO;

public class Avion {

	private int noAvion;
	private int rayon;
	private String noModele;
	
	public Avion(int noAvion, int rayon, String noModele) {
		this.noAvion = noAvion;
		this.rayon = rayon;
		this.noModele = noModele;
	}

	public int getNoAvion() {
		return noAvion;
	}

	public void setNoAvion(int noAvion) {
		this.noAvion = noAvion;
	}

	public int getRayon() {
		return rayon;
	}

	public void setRayon(int rayon) {
		this.rayon = rayon;
	}

	public String getNoModele() {
		return noModele;
	}

	public void setNoModele(String noModele) {
		this.noModele = noModele;
	}
	
	
}

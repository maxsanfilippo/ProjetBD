package DonnePOJO;

public class SaitPiloter {

	private int idPerso;
	private String noModele;
	
	public SaitPiloter(int idPerso, String noModele) {
		this.idPerso = idPerso;
		this.noModele = noModele;
	}

	public int getIdPerso() {
		return idPerso;
	}

	public void setIdPerso(int idPerso) {
		this.idPerso = idPerso;
	}

	public String getNoModele() {
		return noModele;
	}

	public void setNoModele(String noModele) {
		this.noModele = noModele;
	}
	
	
}

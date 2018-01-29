package DonnePOJO;

public class Pilote {

	private int idPerso;

	public Pilote(int idPerso) {
		this.idPerso = idPerso;
	}

	public int getIdPerso() {
		return idPerso;
	}

	public void setIdPerso(int idPerso) {
		this.idPerso = idPerso;
	}

	@Override
	public String toString() {
		return "Pilote [idPerso=" + idPerso + "]";
	}
	
	
}

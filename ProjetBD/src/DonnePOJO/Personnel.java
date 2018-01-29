package DonnePOJO;

public class Personnel {

	private int idPerso;

	public Personnel(int idPerso) {
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
		return "Personnel [idPerso=" + idPerso + "]";
	}
	
	
}

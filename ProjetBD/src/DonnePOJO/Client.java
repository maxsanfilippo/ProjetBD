package DonnePOJO;

public class Client {

	private int idPerso;

	public Client(int idPerso) {
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
		return "Client [idPerso=" + idPerso + "]";
	}
	
	
}

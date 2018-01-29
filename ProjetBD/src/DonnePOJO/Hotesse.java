package DonnePOJO;

public class Hotesse {

	private int idPerso;
	private String secondeLangue;
	
	public Hotesse(int idPerso, String secondeLangue) {
		this.idPerso = idPerso;
		this.secondeLangue = secondeLangue;
	}

	public int getIdPerso() {
		return idPerso;
	}

	public void setIdPerso(int idPerso) {
		this.idPerso = idPerso;
	}

	public String getSecondeLangue() {
		return secondeLangue;
	}

	public void setSecondeLangue(String secondeLangue) {
		this.secondeLangue = secondeLangue;
	}

	@Override
	public String toString() {
		return "Hotesse [idPerso=" + idPerso + ", secondeLangue=" + secondeLangue + "]";
	}
	
	
}

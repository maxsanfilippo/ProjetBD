package DonnePOJO;

public class Adresse {

	private int idAdresse;
	private int noAdresse;
	private String rue;
	private int cpp;
	private String Ville;
	private String pays;
	private int idPerso;
	
	public Adresse(int idAdresse, int noAdresse, String rue, int cpp, String ville, String pays, int idPerso) {
		this.idAdresse = idAdresse;
		this.noAdresse = noAdresse;
		this.rue = rue;
		this.cpp = cpp;
		Ville = ville;
		this.pays = pays;
		this.idPerso = idPerso;
	}

	public int getIdAdresse() {
		return idAdresse;
	}

	public void setIdAdresse(int idAdresse) {
		this.idAdresse = idAdresse;
	}

	public int getNoAdresse() {
		return noAdresse;
	}

	public void setNoAdresse(int noAdresse) {
		this.noAdresse = noAdresse;
	}

	public String getRue() {
		return rue;
	}

	public void setRue(String rue) {
		this.rue = rue;
	}

	public int getCpp() {
		return cpp;
	}

	public void setCpp(int cpp) {
		this.cpp = cpp;
	}

	public String getVille() {
		return Ville;
	}

	public void setVille(String ville) {
		Ville = ville;
	}

	public String getPays() {
		return pays;
	}

	public void setPays(String pays) {
		this.pays = pays;
	}

	public int getIdPerso() {
		return idPerso;
	}

	public void setIdPerso(int idPerso) {
		this.idPerso = idPerso;
	}
	
	
}

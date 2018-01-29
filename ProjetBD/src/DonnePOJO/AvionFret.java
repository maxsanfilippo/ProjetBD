package DonnePOJO;

public class AvionFret {

	private int volumeMax;
	private int poidsMax;
	private int noAvion;
	
	public AvionFret(int volumeMax, int poidsMax, int noAvion) {
		this.volumeMax = volumeMax;
		this.poidsMax = poidsMax;
		this.noAvion = noAvion;
	}

	public int getVolumeMax() {
		return volumeMax;
	}

	public void setVolumeMax(int volumeMax) {
		this.volumeMax = volumeMax;
	}

	public int getPoidsMax() {
		return poidsMax;
	}

	public void setPoidsMax(int poidsMax) {
		this.poidsMax = poidsMax;
	}

	public int getNoAvion() {
		return noAvion;
	}

	public void setNoAvion(int noAvion) {
		this.noAvion = noAvion;
	}
	
	
}

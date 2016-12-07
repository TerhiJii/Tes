package Viikko2;

public class Tietokone {
	
	private double hankintahinta;
	private int ika;
	private String nimi;
	
	public Tietokone(double hankintahinta, int ika, String nimi) {
		this.hankintahinta = hankintahinta;
		this.ika = ika;
		this.nimi = nimi;
	}

	public double getHankintahinta() {
		return hankintahinta;
	}

	public void setHankintahinta(double hankintahinta) {
		this.hankintahinta = hankintahinta;
	}

	public int getIka() {
		return ika;
	}

	public void setIka(int ika) {
		this.ika = ika;
	}

	public String getNimi() {
		return nimi;
	}

	public void setNimi(String nimi) {
		this.nimi = nimi;
	}

	@Override
	public String toString() {
		return "Tietokone [hankintahinta=" + hankintahinta + ", ika=" + ika
				+ ", nimi=" + nimi + "]";
	}
		

}

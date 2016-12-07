package Viikko2;

public class Matkustaja {
	String nimi; // Matkustajan nimi
	double paikanHinta; // Matkustajan ostaman paikan hinta
	String kohde; // Määränpää, minne matkustaja matkustaa
	
	
	
	public Matkustaja() {
		this.nimi = "";
		this.kohde ="";
		this.paikanHinta = 0.0;
	}

	public Matkustaja(String nimi, String kohde, double paikanHinta) {
		this.nimi = nimi;
		this.kohde = kohde;
		this.paikanHinta = paikanHinta;
	}

	public String getNimi() {
		return nimi;
	}

	public void setNimi(String nimi) {
		this.nimi = nimi;
	}

	public double getPaikanHinta() {
		return paikanHinta;
	}

	public void setPaikanHinta(double paikanHinta) {
		this.paikanHinta = paikanHinta;
	}

	public String getKohde() {
		return kohde;
	}

	public void setKohde(String kohde) {
		this.kohde = kohde;
	}

	@Override
	
	//Pekka matkustaa paikkaan Tampere hintaan 35.5 euroa
	public String toString() {
		return nimi + " matkustaa paikkaan " + kohde
				+ " hintaan " + paikanHinta + " euroa\n";
	}
	
	
	
	

}

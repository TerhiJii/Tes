package Viikko2;

public class Puu {
	String laji;
	double vuosikasvu;
	int ika;
	
	public Puu(String laji, double vuosikasvu, int ika) {
		this.laji = laji;
		this.vuosikasvu = vuosikasvu;
		this.ika = ika;
	}

	public Puu() {
		super();
	}


	// tulostaa puun lajin ja korkeuden tällä hetkellä (0.4 m*12=4.8 m)
	public String toString() {
		double korkeus;
		
		korkeus = (double) vuosikasvu * ika;
		return "Puu [laji=" + laji + ", korkeus="
				+ String format("%.2f"), korkeus);
	}
	
	// lisää ikää 5 vuodella
	public void lisaaVuosia(int vuosia){
		this.ika = this.ika + vuosia;
		
	}
	
}
	

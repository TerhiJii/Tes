package Viikko2;

import java.util.Arrays;

public class Vaunu {
	
	private static final int LUKUMAARA = 20; 
	Matkustaja matkustajat[];
	int maxMatkustajia;
	int matkustajiaVaunussa;
	
	
	public Vaunu(){
		matkustajat = new Matkustaja[LUKUMAARA];
		this.maxMatkustajia = 0;
		this.matkustajiaVaunussa = 0;
		
	}
	
	public Vaunu(int max) {
		matkustajat = new Matkustaja[max];
		this.maxMatkustajia = max;
		this.matkustajiaVaunussa = 0;
	}

	
	public void lisaaMatkustaja(Matkustaja m){
		this.matkustajat[matkustajiaVaunussa] = m;
		this.matkustajiaVaunussa ++;
	}
	
	//metodi poistaa viimeisen lisätyn matkustajan.
	public void poistaViimeinen(){
		this.matkustajat[matkustajiaVaunussa] = null;
		this.matkustajiaVaunussa --;
	}
	
	//metodi, joka laskee, montako paikkaa vaunussa on vielä vapaana
	public int vapaatPaikat(){
		int vapaitaPaikkoja = this.maxMatkustajia - this.matkustajiaVaunussa;
		return vapaitaPaikkoja;
	}
	
	//metodi, joka laskee vaunun matkustajien maksaman yhteishinnan
	public double yhteishinta(){
		double yhteishinta = 0;
		
		for (int i=0; i<this.matkustajiaVaunussa; i++)
			yhteishinta = yhteishinta + matkustajat[i].getPaikanHinta();
		
		return yhteishinta;
	}
	
	public boolean vaunuTaynna(){
		if (this.matkustajiaVaunussa == this.maxMatkustajia)
			return true;
		else return false;
		
	}

	@Override
	public String toString() {
		return "Vaunun matkustajat [matkustajat=" + Arrays.toString(matkustajat)
				+  "]\n";
	}

}

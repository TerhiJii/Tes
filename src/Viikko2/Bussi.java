package Viikko2;

import java.util.Arrays;

public class Bussi {
	private static final int LUKUMAARA = 10; 
	Matkustaja matkustajat[];
	int maxMatkustajia;
	int matkustajiaBussissa;
	

	public Bussi(int max) {
		matkustajat = new Matkustaja[max];
		this.maxMatkustajia = max;
		this.matkustajiaBussissa = 0;
	}

	public Bussi(){
		matkustajat = new Matkustaja[LUKUMAARA];
		this.maxMatkustajia = 0;
		this.matkustajiaBussissa = 0;
		
	}
	
	
	public void lisaaMatkustaja(Matkustaja m){
		if (matkustajiaBussissa < maxMatkustajia)
			this.matkustajat[matkustajiaBussissa] = m;
		this.matkustajiaBussissa ++;
	}
	
	//metodi poistaa viimeisen lisätyn matkustajan.
	public void poistaViimeinen(){
		this.matkustajat[matkustajiaBussissa] = null;
		this.matkustajiaBussissa --;
	}
	
	//metodi, joka laskee, montako paikkaa bussissa on vielä vapaana
	public int vapaatPaikat(){
		int vapaitaPaikkoja = this.maxMatkustajia - this.matkustajiaBussissa;
		return vapaitaPaikkoja;
	}
	
	//metodi, joka laskee bussin matkustajien maksaman yhteishinnan
	public double yhteishinta(){
		double yhteishinta = 0;
		
		for (int i=0; i<this.matkustajiaBussissa; i++)
			yhteishinta = yhteishinta + matkustajat[i].getPaikanHinta();
		
		return yhteishinta;
	}

	@Override
	public String toString() {
		return "Bussin matkustajat [matkustajat=" + Arrays.toString(matkustajat)
				+  "]";
	}
	
	


}

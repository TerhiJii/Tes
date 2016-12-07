package Viikko2;

import java.util.Arrays;

public class FirmanKoneet {

	private static final int LUKUMAARA = 10; 
	Tietokone tietokoneet[];
	int maksimi;
	int koneitaHankittu;

	public FirmanKoneet() {
		tietokoneet = new Tietokone[LUKUMAARA];
		this.maksimi = 0;
		this.koneitaHankittu = 0;
	}

	public FirmanKoneet(int lukumaara, int max) {
		tietokoneet = new Tietokone[lukumaara];
		this.maksimi = max;
		this.koneitaHankittu = 0;

      }
	
	public void lisaaKone(Tietokone t){
		this.tietokoneet[koneitaHankittu] = t;
		this.koneitaHankittu ++;
	}
	
	public double yhteishinta(){
		double yhteishinta = 0;
		
		for (int i=0; i<koneitaHankittu; i++)
			yhteishinta = yhteishinta + tietokoneet[i].getHankintahinta();
		
		return yhteishinta;
	}

	@Override
	public String toString() {
		return "FirmanKoneet [tietokoneet=" + Arrays.toString(tietokoneet)
				+ ", maksimi=" + maksimi + ", koneitaHankittu="
				+ koneitaHankittu + "]";
	}
	
	

} 

package Viikko2;

public class Kissa {
	String nimi;
	
	
public Kissa(String nimi) {
		this.nimi = nimi;
	}


public String toString() {
	return " "+ nimi;
	}

public void karkuun (Koira koira){
	
	System.out.println(this.nimi+" juoksee karkuun"+koira+"a.");
	
	}

}




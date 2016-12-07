package Viikko1;

public class Taulukko {

	// TaulukkoTesti.java testausta varten
	// taulukon enimmäiskoko
	int MAX = 4;
	
	double[] taulu = new double[MAX];



	public Taulukko(){
		for (int i=0; i<MAX; i++)
  		taulu[i] = 0.0;	
  }

	public void asetaTaulukko(double[] t){
		for (int i=0; i < t.length; i++){
			taulu[i] = t[i];
		}
	}

	// metodit



	// laskee taulukon alkioiden summan
    public double laskeSumma(double[] taulu) {
    	double summa=0;

    	for (int i=0; i < taulu.length; i++){
    		summa = summa + taulu[i];
    	}

        return summa;
    }
    
    // laskee taulukon alkioiden keskiarvon
	public double laskeKeskiarvo(double[] taulu) {
    	double keskiarvo = 0;
    	double summa = 0;

    	for (int i=0; i < taulu.length; i++){
    		summa = summa + taulu[i];
    	}

    	keskiarvo = summa/taulu.length;

        return keskiarvo;
    }

    




}

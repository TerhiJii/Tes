/**
 * 
 */
package Viikko1;

/**
 * @author oppi
 *
 */
public class Henkilo {

	private String nimi; 
	private int ika;
	private int pituus;
	private int paino;
	
	// Konstruktorit, jossa luokan muuttujien arvojen alustaminen.
	public Henkilo( ){
		nimi = null;
		ika = 0;
		pituus = 0;
		paino = 0;
	}

	public Henkilo (String n, int i, int pit, int pain){
		nimi = n;
		ika = i;
		pituus = pit;
		paino = pain;
	}
	
	// Jäsenmuuttujat asetetaan aseta-alkuisilla metodeilla!
	  public void aseta_ika(int arvo){
	  	ika = arvo;
	  }
	  public void aseta_paino(int paino){
	  	this.paino = paino;
	  }
	  public void aseta_pituus(int pituus){
	  	this.pituus = pituus;
	  }
	  public void aseta_nimi(String nimi){
	  	this.nimi = nimi;
	  }
	
	// Tulostaa henkilön tiedot
	 public void tulosta( ){
	 	System.out.print("Nimi:" + nimi+ "\n" + "ikä:" + ika+"\n" + "pituus:" + pituus+ "\n" + "paino:" + paino);
	 }
	 public String toString( ){
	 	return ("Nimi:" + nimi+ "\n" + "ikä:" + ika+"\n" + "pituus:" + pituus+ "\n" + "paino:" + paino);
	 }
	
	// Mitä muita metodeita tänne voisi tulla?

	 public void tervehdi(){
	 	System.out.println("Moi " +nimi+"!");
	 }

	 
	 //tämä ei toimi oikein...
	 public double laskePainoindeksi(){
	 	
	 	double PI;
	 	double pituusMetreina;

	 	pituusMetreina = pituus / 100;

	 	PI = paino / (pituusMetreina*pituusMetreina);

	 	return PI;
	 }

}

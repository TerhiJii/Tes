/**
 * 
 */
package Viikko1;

import java.util.Scanner;

/**
 * @author oppi
 *
 */
public class OmatFunktiot {

	/**
	 * @param args
	 */
	
	
    // Funktio, joka laskee taulukon alkioiden summan
    public static double laskeSumma(double[] taulukko) {
    	double summa = 0;

    	for (int i=0; i < taulukko.length; i++){
    		summa = summa + taulukko[i];
    	}

        return summa;
    }
    
    // Funktio, joka laskee taulukon alkioiden keskiarvon
	public static double laskeKeskiarvo(double[] taulukko) {
    	double keskiarvo = 0;
    	double summa = 0;

    	for (int i=0; i < taulukko.length; i++){
    		summa = summa + taulukko[i];
    	}

    	keskiarvo = summa/taulukko.length;

        return keskiarvo;
    }

     // Funktio, joka laskee taulukon alkioiden keskihajonnan
	/*Keskihajonnan laskeminen: neliöjuuri poikkeamien summasta jaettuna taulukon alkioiden 
	kokonaismäärällä, eli kaavana
	n = sum((ka-arvo)^2))/lkm
	sqrt(n)*/

	/*public static double laskeKeskihajonta(double[] taulukko) {
    	double keskiarvo = 0;
    	double summa = 0;
    	double keskihajonta = 0;
    	double poikkeamaSumma = 0;

    	for (int i=0; i < taulukko.length; i++){
    		summa = summa + taulukko[i];
    	}

    	keskiarvo = summa/taulukko.length;

    	poikkeamaSumma = (summa((keskiarvo)^2))/taulukko.length;
		keskihajonta = sqrt(poikkeamaSumma);


        return keskihajonta;
    } */





	// main testausta varten
	public static void main(String[] args) {
		

		double[] testitaulu = new double[4];
		double testiTulos = 0;

		Scanner lukija = new Scanner(System.in);

		// kaikki laskettavat arvot tuodaan komentoriviparametreina, erotellaan välilyönnillä
		
		
		System.out.println("Anna 4 taulukon arvoa erotettuna välilyönnillä (esim. 2.0):");
		for(int i = 0; i < testitaulu.length; i++) {
      		testitaulu[i] = lukija.nextDouble();
    		}


		System.out.println("Taulukon sisältö:");
		for (int i =0; i < testitaulu.length; i++) {
			  System.out.print(testitaulu[i] + " ");
		}


		System.out.println();

		testiTulos = laskeSumma(testitaulu);

		System.out.println("laskeSumma funktion palautusarvo: " +testiTulos);

		testiTulos = laskeKeskiarvo(testitaulu);

		System.out.println("laskeKeskiarvo funktion palautusarvo: " +testiTulos);

		// laskeKeskihajonta ei toimi!!

		//testiTulos = laskeKeskihajonta(testitaulu);

		//System.out.println("laskeKeskihajonta funktion palautusarvo:" +testiTulos);

		

	}

}

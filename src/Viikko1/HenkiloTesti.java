/**
 * 
 */
package Viikko1;

import java.util.Scanner;

/**
 * @author oppi
 *
 */
public class HenkiloTesti {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// testataan Henkilo luokan metodit

	Scanner lukija = new Scanner(System.in);

	Henkilo testihlo = new Henkilo("Reino", 37, 175,83);

	testihlo.tulosta();

	System.out.println();
	System.out.println("---------------------------------");

	Henkilo testihlo2 = new Henkilo();

	System.out.println("Anna henkilön nimi:");
	testihlo2.aseta_nimi(lukija.nextLine());
	
	System.out.println("Anna henkilön ikä:");
	testihlo2.aseta_ika(lukija.nextInt());

	System.out.println("Anna henkilön pituus:");
	testihlo2.aseta_pituus(lukija.nextInt());
	
	System.out.println("Anna henkilön paino:");
	testihlo2.aseta_paino(lukija.nextInt());
	
	testihlo2.tulosta();
	System.out.println();
	System.out.println("---------------------------------");

	testihlo2.tervehdi();

	System.out.println("Painoindeksisi on:" +testihlo2.laskePainoindeksi());



	}

}

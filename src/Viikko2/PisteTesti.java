package Viikko2;

import static org.junit.Assert.*;

import org.junit.Test;

public class PisteTesti {
	
	/*luo pääohjelmassa Piste-luokasta olio.  Aseta olion jäsenmuuttujille arvot 
	 * 	setPoint ()-metodillaa ja tulosta asetettu pisteen arvo */

	public static void main(String[] args) {
		Piste testiPiste = new Piste();
		
		testiPiste.setPoint(50, 100);
		
		System.out.println(testiPiste.toString());
	}

}

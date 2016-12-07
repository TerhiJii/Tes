/**
 * 
 */
package Viikko1;

import java.util.Scanner;

/**
 * @author oppi
 *
 */
public class Nopanheitto {
	
	/*Kirjoita ohjelma, joka tulostaa jakauman kahden arpanopan yhteisheiton tuloksesta, kun heittojen 
lukumäärä pyydetään  käyttäjältä*/

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Scanner lukija = new Scanner(System.in);
		
		System.out.println("Heittojen lukumäärä: ");
		int luku = lukija.nextInt();
		
		for (int i=0; i < luku; i++)
		{
		
			
			for (i=1; i <=luku; i++){
				int tulos = 1 + (int)( Math.random() * 6 );
				int tulos2 = 1 + (int)( Math.random() * 6 );
				
				int summa = tulos + tulos2;
			
				System.out.println(i+ ". heittojen summa on " +summa);
			}
		}
		

	}

}

/**
 * 
 */
package Viikko1;

import java.util.Scanner;


/**
 * @author oppi
 *
 */
public class Arvosanat {

	

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] arvosanat = new int[3];
		Scanner lukija = new Scanner(System.in);
		
		

//arvosanan kysely		
		for (int i = 0; i < arvosanat.length; i++) {
		System.out.print("Anna arvosana 0 - 5:");
		int luku = lukija.nextInt();
		arvosanat[i] = luku;
		}
		
//arvosanan tulostus taulusta
		
		for (int i =0; i < arvosanat.length; i++) {
			  System.out.print(arvosanat[i] + " ");
			}
		
		System.out.println();

				
		
		for (int etsittava = 0; etsittava < arvosanat.length; etsittava++)
		{
//			boolean found = false;
			
			System.out.print(etsittava+ ":  ");

			
			for ( int i = 0; i < arvosanat.length ; i++)
			{
				if (arvosanat[ i ]  == etsittava)
				{
 //                      found = true;  
                       
//                       System.out.println("Löytyi" +etsittava);
                       System.out.print("*");
                       
				}
			
			}
			System.out.println();
		}
			
		

	}

}

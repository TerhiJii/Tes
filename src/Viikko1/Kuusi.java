/**
 * 
 */
package Viikko1;

/**
 * @author oppi
 *
 */
public class Kuusi {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		for (int i=0; i<5; i++){
			
			if (i==0){
				for (int x=0; x<4;x++)
					System.out.print(" ");
				System.out.println("*");
			}
			else if (i==1){
				for (int x=0; x<3;x++)
					System.out.print(" ");
				System.out.println("***");
			}
			else if(i==2){
				for (int x=0; x<2;x++)
					System.out.print(" ");
				System.out.println("*****");
			}
			else if(i==3){
				System.out.print(" ");
				System.out.println("*******");
			}
			else{
				System.out.println("*********");
			}
		}

		for (int i = 0; i <4; i++){
			System.out.println("   ***");
		}

	}

}
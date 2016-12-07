package Viikko2;

public class PuuTesti {

	public static void main(String[] args) {
		Puu manty = new Puu();

		 manty.laji = "Mänty";

		 manty.vuosikasvu = 0.4;

		 manty.ika = 12;

		 System.out.println(manty) ;    

		 manty.lisaaVuosia(5); 
		 
		// tulostaa puun lajin ja korkeuden tällä hetkellä (0.4 m*17=6.8 m)

		 System.out.println(manty);    
	}

}

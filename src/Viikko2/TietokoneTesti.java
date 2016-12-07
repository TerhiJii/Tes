package Viikko2;

public class TietokoneTesti {

	public static void main(String[] args) {
		//Tietokone luokan testit
		Tietokone hp = new Tietokone (650.00, 5, "HP Elitebook");
		Tietokone apple = new Tietokone (1190.00, 2, "Apple MacBook");
		Tietokone lenovo = new Tietokone(0.0, 0, null);
		
		lenovo.setHankintahinta(790.00);
		lenovo.setIka(3);
		lenovo.setNimi("Lenovo ThinkPad");
		
		Tietokone fujitsu = new Tietokone (950.00, 1, "Fujitsu Siemens");
		
		//System.out.println(hp);
		
		//FirmanKoneet luokan testit
		
		FirmanKoneet testiYritys = new FirmanKoneet(4, 10);
		
		testiYritys.lisaaKone(hp);
		testiYritys.lisaaKone(apple);
		testiYritys.lisaaKone(lenovo);
		testiYritys.lisaaKone(fujitsu);
		
		System.out.println(testiYritys);
		
		double yhthinta = testiYritys.yhteishinta();
		
		System.out.println("Yhteishinta on: "+yhthinta);
		

	}

}

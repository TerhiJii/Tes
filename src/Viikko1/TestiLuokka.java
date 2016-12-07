package Viikko1;

public class TestiLuokka {

	public static void main(String[] args) {
		Kissa kissa = new Kissa();
		Kissa kissa1 = new Kissa();
		Koira koira = new Koira();
//kissa taulu		
		Kissa[] kissat = new Kissa[2];
		kissat[0] = kissa;
		kissat[1] = kissa1;
		
		kissa.nimi = "Mirri";
		kissa1.nimi = "Mörri";
		koira.nimi = "Musti";
	
		System.out.println("\n" +koira +"\n");
		
//tulostetaan kaikki kissat
		
		for (int i = 0; i < kissat.length; i++)
			System.out.println(kissat[i]);
		
		koira.jahtaa(kissa);
		
		kissa.karkuun(koira);
		

	}

}

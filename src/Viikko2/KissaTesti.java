package Viikko2;

public class KissaTesti {

	public static void main(String[] args) {
		
		Kissa katti = new Kissa("Mirri");

		Koira musti = new Koira("Musti");

		System.out.println(katti + "\n" + musti);

		musti.jahtaa(katti);

		katti.karkuun(musti);


	}

}

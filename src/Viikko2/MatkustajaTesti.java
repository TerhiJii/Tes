package Viikko2;

public class MatkustajaTesti {

	public static void main(String[] args) {
		Matkustaja pekka = new Matkustaja("Pekka","Tampere", 35.50);
		Matkustaja aino = new Matkustaja("Aino", "Kerava", 14.30);
		Matkustaja eki = new Matkustaja("Erkki", "Kuopio",79.40);
		Matkustaja virpi = new Matkustaja("Virpi", "Järvenpää", 18.70);
		Matkustaja aimo = new Matkustaja("Aimo", "Jyväskylä", 52.80);
		Matkustaja emmi = new Matkustaja("Emmi", "Orivesi", 38.20);
		Matkustaja onni = new Matkustaja("Onni", "Tampere", 35.50);
		// Lisätään bussiin kuusi matkustajaa
		Bussi pikabussi = new Bussi(20); // 20-paikkainen bussi
		pikabussi.lisaaMatkustaja(pekka);
		pikabussi.lisaaMatkustaja(aino);
		pikabussi.lisaaMatkustaja(eki);
		pikabussi.lisaaMatkustaja(virpi);
		pikabussi.lisaaMatkustaja(aimo);
		pikabussi.lisaaMatkustaja(emmi);
		System.out.println(pikabussi);
		// ja poistetaan viimeksi lisätty
		pikabussi.poistaViimeinen();
		// ja lisätään vielä yksi
		pikabussi.lisaaMatkustaja(onni);
		 // tulostuu kuuden matkustajan tiedot. (emmi poistettu).
		System.out.println(pikabussi);
		
		System.out.println("vapaat paikat: " + pikabussi.vapaatPaikat());
		System.out.printf("Matkustajien liput maksavat yhteensä %.2f euroa\n",
		         pikabussi.yhteishinta());
		
		System.out.println("Juna testit");
		System.out.println("---------------------------");
		
		Vaunu vaunu1 = new Vaunu();
		Vaunu vaunu2 = new Vaunu();
		Vaunu vaunu3 = new Vaunu();
		
		vaunu1.lisaaMatkustaja(pekka);
		vaunu1.lisaaMatkustaja(aino);
		
		vaunu2.lisaaMatkustaja(eki);
		vaunu2.lisaaMatkustaja(aimo);
		
		
		Juna testijuna = new Juna(3);
		
		testijuna.lisaaVaunu(vaunu1);
		testijuna.lisaaVaunu(vaunu2);
		testijuna.lisaaVaunu(vaunu3);
		
		System.out.println(testijuna);
	}

}

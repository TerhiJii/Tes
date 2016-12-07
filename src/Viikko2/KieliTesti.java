package Viikko2;

public class KieliTesti {

	public static void main(String[] args) {
		//Kieli suomi = new Kieli ("suomi", "fi");
		Kieli ruotsi = new Kieli ("ruotsi", "sv");
		Kieli englanti = new Kieli ("englanti", "en");
		
		Kieli suomi = new Kieli();

		suomi.nimi = "suomi";

		suomi.koodi = "fi"; 
		
		suomi.tulosta();
		ruotsi.tulosta();
		englanti.tulosta();
		
		//luodut kieli-oliot taulukkoon
		
		Kieli[] kielitaulu = new Kieli[3];
		
		kielitaulu[0] = suomi;
		kielitaulu[1] = ruotsi;
		kielitaulu[2] = englanti;
		
		System.out.println("Kielitaulun sisältö:");
		
		for (int i=0; i<3; i++){
			kielitaulu[i].tulosta();
		}
		
		

	}

}

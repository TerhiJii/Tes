package Viikko2;

public class Kieli {
	
	String nimi;
	String koodi;
	
	
	
	public Kieli(String nimi, String koodi) {
		this.nimi = nimi;
		this.koodi = koodi;
	}



	public Kieli() {
		// TODO Auto-generated constructor stub
	}



	public void tulosta(){
		System.out.println(nimi+" "+koodi);
	}
	
	

}

package Viikko2;

public class Koira {
	String nimi;

	public Koira(String nimi) {
		super();
		this.nimi = nimi;
	}

	public String toString() {
		return " "+ nimi;
	}
	
	public void jahtaa(Kissa kissa){
		
		System.out.println(this.nimi+" jahtaa"+kissa+"a.");
	}
	
	

}

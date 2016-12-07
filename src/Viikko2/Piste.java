package Viikko2;

public class Piste {

	/*jäsenmuuttujina ovat xPos ja yPos(molemmat int-tyyppisiä).  
	•Määrittele jäsenfunktio setPoint(), jolla asetat jäsenmuuttujien arvot.  
	•Tee myös metodi toString (), joka tulostaa jäsenmuuttujien arvot. */

	int xPos;
	int yPos;

	public Piste (){
		this.xPos = 0;
		this.yPos = 0;
	}

	public void setPoint(int xPos, int yPos) {
		this.xPos = xPos;
		this.yPos = yPos;
	}
	public String toString() {
		return "xPos=" + xPos + ", yPos=" + yPos;
	}
	
	



}

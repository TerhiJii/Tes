package Viikko2;

import java.util.Arrays;

public class Juna {
	private static final int MINVAUNUMAARA = 3;
	private static final int MAXVAUNUMAARA = 12;
	Vaunu vaunut[];
	int vaunujenLkm;
	int vaunujaJunassa;
	
	public Juna() {
		vaunut = new Vaunu[MINVAUNUMAARA];
		this.vaunujenLkm = 0;
		this.vaunujaJunassa = 0;
	}
	
	public Juna (int vaunujenLkm){
		vaunut = new Vaunu[vaunujenLkm];
		this.vaunujenLkm = vaunujenLkm;
		this.vaunujaJunassa = 0;
	}

	public void lisaaVaunu(Vaunu v){
		this.vaunut[vaunujaJunassa] = v;
		this.vaunujaJunassa ++;
		
	}
	
	public void sijoitaMatkustaja(){
	
			
	}

	@Override
	public String toString() {
		return "Juna ["
				+ (vaunut != null ? "vaunut=" + Arrays.toString(vaunut) : "")
				+ "]";
	}
	
	
	


}

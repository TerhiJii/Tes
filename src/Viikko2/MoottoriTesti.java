package Viikko2;

import static org.junit.Assert.*;


import org.junit.Test;
import org.mockito.Mock;

public class MoottoriTesti {
	

	


	@Test
	public void testMeneRikki() {
		int rikkinaisiaSylintereita;
		Moottori testiMoottori = new Moottori(200, 12, 0);
		
		rikkinaisiaSylintereita = testiMoottori.meneRikki();
		
		assertTrue(rikkinaisiaSylintereita <= testiMoottori.sylinterienMaara);
			
		}
		
		
	}



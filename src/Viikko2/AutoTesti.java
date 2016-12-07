package Viikko2;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;


import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;



public class AutoTesti {
	
		@Mock
		Ajaja mockAjaja;
		Moottori mockMoottori;
		
		@Before
		public void setUp() {
			when(mockMoottori.getSylinterienMaara()).thenReturn(6);
			when(mockMoottori.getSylintereitaRikki()).thenReturn(2);
		}

		@Test
		public void testLaskeNopeus() {
			Auto testiAuto = new Auto ("Audi", "A8", 210, mockMoottori, mockAjaja);
			
			assertEquals(23.3333, testiAuto.laskeNopeus(), 0.001);
		
		}
		
		@Test
		public void testLaskeNopeus2() {
			Auto testiAuto = new Auto ("VW", "Passat", 200, mockMoottori, mockAjaja);
			
			assertEquals(22.222, testiAuto.laskeNopeus(), 0.001);
		
		}
		
		@Test
		public void testSetGetHuippunopeus(){
			Auto testiAuto = new Auto ("Audi", "A8", 0 , mockMoottori, mockAjaja);
			
			testiAuto.setHuippunopeus(210);
			
			assertEquals(210, testiAuto.getHuippunopeus());
		
			}
}
		



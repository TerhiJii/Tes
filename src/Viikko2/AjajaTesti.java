package Viikko2;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;

import Viikko2.Ajaja.Ajotapa;

public class AjajaTesti {
	
	@Mock
	Auto mockAuto;

	
	@Before
	public void setUp() {
		when(mockAuto.laskeNopeus()).thenReturn(100.0);
		
	}
	

	@Test
	public void testAja() {
		Ajaja testiAjaja = new Ajaja (mockAuto, "Teuvo", Ajotapa.TAVALLINEN );
		
		double testiArvo;	
		
		System.out.println(testiAjaja.toString());
		
		testiArvo = testiAjaja.aja(5);
		
		assertEquals(350.0, testiArvo, 0.001);
		
	}
	
	@Test
	public void testAja2() {
		Ajaja testiAjaja = new Ajaja (mockAuto, "Tauno", Ajotapa.AGRESSIIVINEN );
		
		double testiArvo;
		
		testiArvo = testiAjaja.aja(10);
		
		assertEquals(1000.0, testiArvo, 0.001);
		
		
	}

}

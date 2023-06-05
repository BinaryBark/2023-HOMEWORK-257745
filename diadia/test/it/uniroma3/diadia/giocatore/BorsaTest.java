package it.uniroma3.diadia.giocatore;

import static org.junit.Assert.*;

import org.junit.Test;

import it.uniroma3.diadia.attrezzi.Attrezzo;
import it.uniroma3.diadia.giocatore.Borsa;

public class BorsaTest {

	Borsa b1 = new Borsa();
	Attrezzo spadone = new Attrezzo("spadone", 7);
	
	@Test
	public void testPesoDefault() {
		assertEquals(10, b1.getPesoMax());
	}
	
	@Test
	public void testAttrezzo() {
		b1.addAttrezzo(spadone);
		assertEquals(spadone, b1.getAttrezzo("spadone"));
	}
	
	@Test
	public void testAddAttrezzoPesoMinoreDiDieci() {
		assertTrue(b1.addAttrezzo(spadone));

	}
}

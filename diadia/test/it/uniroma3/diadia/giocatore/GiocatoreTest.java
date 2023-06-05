package it.uniroma3.diadia.giocatore;

import static org.junit.Assert.*;

import org.junit.Test;

import it.uniroma3.diadia.giocatore.Giocatore;

public class GiocatoreTest {

	
	Giocatore g1 = new Giocatore();
	
	
	@Test 
	public void testSetCfu() {
		g1.setCfu(8);
		assertEquals(8,g1.getCfu());
	}
	
	@Test
	public void testGetBorsa() {
		assertNotNull(g1.getBorsa());
	}
	
	
}

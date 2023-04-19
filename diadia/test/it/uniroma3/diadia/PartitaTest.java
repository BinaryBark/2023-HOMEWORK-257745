package it.uniroma3.diadia;


import static org.junit.Assert.*;

import org.junit.Test;

import it.uniroma3.diadia.ambienti.*;
import it.uniroma3.diadia.giocatore.*;

public class PartitaTest {

	Partita p1 = new Partita();
	Labirinto l1 = new Labirinto();
	Giocatore g1 = new Giocatore();
	Stanza s1 = new Stanza("stanza");
	
	
	@Test
	public void testGetStanzaVincente() {
		assertEquals("Biblioteca", l1.getStanzaVincente());
	}

	@Test
	public void testGetStanzaCorrente() {
		assertNull(p1.getStanzaCorrente());
	}

	@Test
	public void testGetCfu() {
		assertNull(g1.getCfu());
	}

}

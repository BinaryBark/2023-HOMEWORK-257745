package it.uniroma3.diadia.ambienti;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import it.uniroma3.diadia.attrezzi.Attrezzo;

public class StanzaBuiaTest {

	private StanzaBuia stanza ;
	private Attrezzo lucetta;
	
	
	@Before
	public void setUp() throws Exception{
		this.stanza = new StanzaBuia("stanzaBuia", "lucetta");
		this.lucetta = new Attrezzo("lucetta", 1);
	}
	
	@Test
	public void testGetDescrizioneConAttrezzo() {
		stanza.addAttrezzo(lucetta);
		assertEquals (stanza.getDescrizione(), stanza.toString());
	}
	
	@Test
	public void testGetDescrizioneSenzaAttrezzo() {
		String a = "qui c'è buio pesto";
		assertEquals(a, stanza.getDescrizione());
	}
}

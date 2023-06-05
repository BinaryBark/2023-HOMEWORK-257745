package it.uniroma3.diadia.ambienti;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import it.uniroma3.diadia.attrezzi.Attrezzo;

public class StanzaBloccataTest {

	private StanzaBloccata sb;
	private Attrezzo a;
	private Stanza s;
	
	@Before
	public void setUp() throws Exception {
		this.sb = new StanzaBloccata("stanza bloccata", "ovest", "grimaldello");
		this.a = new Attrezzo("grimaldello", 1);
		this.s = new Stanza("stanza1"); 
		sb.impostaStanzaAdiacente("ovest", s);
	}

	@Test
	public void testGetStanzaAdiacenteDirezioneBloccata() {
		assertEquals(sb, sb.getStanzaAdiacente("ovest"));
	}
	
	@Test
	public void testGetStanzaAdiacenteDirezioneSbloccata() {
		sb.addAttrezzo(a);
		assertEquals(s, sb.getStanzaAdiacente("ovest"));
		
	}

	@Test
	public void testGetDescrizioneDirezioneSbloccata() {
		sb.addAttrezzo(a);
		assertEquals(sb.toString(), sb.getDescrizione());
	}
	
	@Test
	public void testGetDescrizioneDirezioneBloccata() {
		String e = "Stanza bloccata nella direzione: ovest"+"\nPrendi il grimaldello e posalo nella stanza";
		assertEquals(e, sb.getDescrizione());
		
	}

}

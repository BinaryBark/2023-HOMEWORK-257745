
import static org.junit.Assert.*;

import org.junit.Test;

public class StanzaTest {

	Stanza s1 = new Stanza("s1");
	Stanza s2 = new Stanza("s2");
	Attrezzo m = new Attrezzo("martello",40);

	@Test 
	public void testGetStanzaAdiacente() {
		assertNull(s1.getStanzaAdiacente("sud"));
	}
	
	@Test
	public void testImpostaStanzaAdiacente() {
		s1.impostaStanzaAdiacente("sud", s1);
		assertEquals(s2, s1.getStanzaAdiacente("sud"));
	}
	
	@Test
	public void testAddAttrezzo() {
		assertTrue(s1.addAttrezzo(m));
	}
	
}
	
 
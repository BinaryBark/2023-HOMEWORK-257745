
import static org.junit.Assert.*;
import org.junit.Test;

public class PartitaTest {

	Partita p = new Partita();
	Stanza s = new Stanza("Stanza");
	
	@Test
	public void testGetStanzaVincente() {
		assertEquals("Biblioteca", p.getStanzaVincente().getNome());
	}

	@Test
	public void testSetStanzaCorrente() {
		p.setStanzaCorrente(s);
		assertEquals(s, p.getStanzaCorrente());
	}

	@Test
	public void testIsFinita() {
		assertFalse(p.isFinita());
	}

}

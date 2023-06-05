package it.uniroma3.diadia.ambienti;

import it.uniroma3.diadia.IO;
import it.uniroma3.diadia.attrezzi.Attrezzo;

public class StanzaBuia extends Stanza{

	private String lanterna;

	public StanzaBuia(String nome, String lanterna) {
		super(nome);
		this.lanterna = lanterna;
	}

	@Override
	public String getDescrizione() {
		String buio = new String();
		buio = "qui c'è buio pesto";
		if(!this.hasAttrezzo(lanterna))
			return buio;
		return super.getDescrizione();
	}
}

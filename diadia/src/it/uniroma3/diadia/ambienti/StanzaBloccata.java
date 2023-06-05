package it.uniroma3.diadia.ambienti;

public class StanzaBloccata extends Stanza{

	private String direzioneBloccata;
	private String passepartout;
	
	public StanzaBloccata(String nome, String diredirezioneBloccata, String passepartout) {
		super(nome);
		this.direzioneBloccata = diredirezioneBloccata;
		this.passepartout = passepartout;
	}
	
	@Override
	public Stanza getStanzaAdiacente(String direzione) {
		if(direzioneBloccata.equals(direzione) && !this.hasAttrezzo(passepartout)) {
			return this;
	}
		return super.getStanzaAdiacente(direzione);
	}
	
	@Override
	public String getDescrizione() {
		String bloccata = "Stanza bloccata nella direzione: "+ direzioneBloccata+"\nPrendi il " + passepartout + " e posalo nella stanza";

		if(!this.hasAttrezzo(passepartout))
			return bloccata;
		return super.getDescrizione();
	}
}

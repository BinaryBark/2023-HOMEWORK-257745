package it.uniroma3.diadia.comandi;

import it.uniroma3.diadia.IO;
import it.uniroma3.diadia.Partita;
import it.uniroma3.diadia.attrezzi.Attrezzo;

public class ComandoPosa implements Comando {

	private IO io;
	private String nomeAttrezzo;
	private static final String NOME = "posa";
	
	@Override
	public void esegui(Partita partita) {
	  
			Attrezzo a = partita.getGiocatore().getBorsa().getAttrezzo(nomeAttrezzo);
			
			if(partita.getStanzaCorrente().getNumeroAttrezziPossibili()>0) {
			partita.getGiocatore().getBorsa().removeAttrezzo(nomeAttrezzo);
			partita.getLabirinto().getStanzaCorrente().addAttrezzo(a);
		}
			else {
				io.mostraMessaggio("Non c'e' spazio nella stanza per poter inserire questo attrezzo!");
			}
	}

	@Override
	public void setParametro(String parametro) {
		// TODO Auto-generated method stub

	}

	@Override
	public String getNome() {
		 
		return NOME;
	}

	@Override
	public String getParametro() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setIo(IO io) {
		this.io=io;
		
	}

}

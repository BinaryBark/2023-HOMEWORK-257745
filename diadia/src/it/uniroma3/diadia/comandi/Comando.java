package it.uniroma3.diadia.comandi;


//import java.util.Scanner;
import it.uniroma3.diadia.IO;
import it.uniroma3.diadia.Partita;

/**
 * Questa classe modella un comando.
 * Un comando consiste al piu' di due parole:
 * il nome del comando ed un parametro
 * su cui si applica il comando.
 * (Ad es. alla riga digitata dall'utente "vai nord"
 *  corrisponde un comando di nome "vai" e parametro "nord").

 */

public interface Comando {

	/*  
	private String nome;
	private String parametro;



	public Comando(String istruzione) {
		Scanner scannerDiParole = new Scanner(istruzione);

		// prima parola: nome del comando
		if (scannerDiParole.hasNext())
			this.nome = scannerDiParole.next(); 

		// seconda parola: eventuale parametro
		if (scannerDiParole.hasNext())
			this.parametro = scannerDiParole.next();
		scannerDiParole.close();
	}
	 */
	/**
	 * esecuzione del comando
	 */
	public void esegui(Partita partita);
	/**
	 * set parametro del comando
	 */
	public void setParametro(String parametro);

	public String getParametro();

	public String getNome();

	public void setIo(IO io);

}
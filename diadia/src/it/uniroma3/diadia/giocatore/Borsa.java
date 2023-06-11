package it.uniroma3.diadia.giocatore;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import it.uniroma3.diadia.attrezzi.Attrezzo;

public class Borsa {

	public final static int DEFAULT_PESO_MAX_BORSA = 10;
	private List<Attrezzo> attrezzi;
	//private Attrezzo[] attrezzi;
	private int numeroAttrezzi;
	private int pesoMax;

	public Borsa() {
		this(DEFAULT_PESO_MAX_BORSA);
	}

	public Borsa(int pesoMax) {
		this.pesoMax = pesoMax;
		this.attrezzi = new ArrayList<Attrezzo>();
		//this.attrezzi = new Attrezzo[10]; // speriamo bastino...
		this.numeroAttrezzi = 0;
	}

	public boolean addAttrezzo(Attrezzo attrezzo) {
		if (this.getPeso() + attrezzo.getPeso() > this.getPesoMax()) {
			return false;
		}
		if (this.numeroAttrezzi>=10) {
			return false;
		}
		//this.attrezzi[this.numeroAttrezzi] = attrezzo;
		this.numeroAttrezzi++;
		return this.attrezzi.add(attrezzo);
		//return true;
	}

	public int getPesoMax() {
		return pesoMax;
	}
	/*
	public Attrezzo getAttrezzo(String nomeAttrezzo) {
		Attrezzo a = null;
		for (int i= 0; i<this.numeroAttrezzi; i++)
			if (this.attrezzi[i].getNome().equals(nomeAttrezzo))
				a = attrezzi[i];
		return a;
	}
	 */
	public Attrezzo getAttrezzo(String nomeAttrezzo) {
		Attrezzo a = null;
		for (Attrezzo attrezzo : this.attrezzi) {
			if (attrezzo.getNome().equals(nomeAttrezzo)) {
				a = attrezzo;
				break;
			}
		}
		return a;
	}

	public int getPeso() {
		int peso = 0;
		for (Attrezzo attrezzo : attrezzi)
			peso += attrezzo.getPeso();
		//peso += this.attrezzi[i].getPeso();
		return peso;
	}

	public boolean isEmpty() {
		return this.numeroAttrezzi == 0;
	}

	public boolean hasAttrezzo(String nomeAttrezzo) {
		return this.getAttrezzo(nomeAttrezzo)!=null;
	}

	public Attrezzo removeAttrezzo(String nomeAttrezzo) {
		Iterator<Attrezzo> iterator = attrezzi.iterator();
		Attrezzo a = null;
		if(nomeAttrezzo!=null) {
			while(iterator.hasNext()) {
				Attrezzo attrezzo = iterator.next();
				if (attrezzo.getNome().equals(nomeAttrezzo)) {
					a = attrezzo;
					iterator.remove();
					break;
				}
			}
		}
		return a;
	}


	public int getPesoRimanente(Attrezzo a) {
		return this.getPesoMax()-this.getPeso();
	}

	public String toString() {
		StringBuilder s = new StringBuilder();
		if (!this.isEmpty()) {
			s.append("Contenuto borsa ("+this.getPeso()+"kg/"+this.getPesoMax()+"kg): ");
			for (Attrezzo attrezzo : attrezzi)
				s.append(attrezzo.toString()).append(" ");
		}
		else
			s.append("Borsa vuota");
		return s.toString();
	}


}

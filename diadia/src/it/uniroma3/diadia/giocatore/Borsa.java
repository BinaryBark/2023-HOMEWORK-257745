package it.uniroma3.diadia.giocatore;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeMap;
import java.util.TreeSet;

import it.uniroma3.diadia.attrezzi.Attrezzo;

public class Borsa {

	public final static int DEFAULT_PESO_MAX_BORSA = 10;
	private Map<String, Attrezzo> nome2attrezzi;
	//private List<Attrezzo> attrezzi;
	//private Attrezzo[] attrezzi;
	private int numeroAttrezzi;
	private int pesoMax;
	private int pesoAttuale;

	public Borsa() {
		this(DEFAULT_PESO_MAX_BORSA);
	}

	public Borsa(int pesoMax) {
		this.pesoMax = pesoMax;
		this.nome2attrezzi = new TreeMap<>();
		//this.attrezzi = new ArrayList<Attrezzo>();
		//this.attrezzi = new Attrezzo[10]; // speriamo bastino...
		this.numeroAttrezzi = 0;
		this.pesoAttuale = 0; 
	}

	public boolean addAttrezzo(Attrezzo attrezzo) {
		if (this.getPeso() + attrezzo.getPeso() > this.getPesoMax()) {
			return false;
		}
		this.nome2attrezzi.put(attrezzo.getNome(), attrezzo);
		this.numeroAttrezzi++;
		this.pesoAttuale += attrezzo.getPeso();
		return true;
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
		if(nomeAttrezzo != null && nome2attrezzi.containsKey(nomeAttrezzo)) {
			a = this.nome2attrezzi.get(nomeAttrezzo);
		}
		return a;
	}

	public int getPeso() {
		return this.pesoAttuale;
	}

	public boolean isEmpty() {
		return this.numeroAttrezzi == 0;
	}

	public boolean hasAttrezzo(String nomeAttrezzo) {
		return this.getAttrezzo(nomeAttrezzo)!=null;
	}

	public Attrezzo removeAttrezzo(String nomeAttrezzo) {
		Attrezzo a = null ;

		if(nomeAttrezzo!=null) {
			a = nome2attrezzi.remove(nomeAttrezzo);
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
			s.append("\n");
			s.append(nome2attrezzi.toString()+" ");
			s.append("\n");
		}
		else
			s.append("Borsa vuota");
		return s.toString();
	}

	List<Attrezzo> getContenutoOrdinatoPerPeso(){
		//restituisce la lista degli attrezzi nella borsa ordinati per peso e quindi, a parità di peso, per nome
		Set<Attrezzo> s = new TreeSet<>();  //perchè treeset viene inizializzato senza argomenti?
		s.addAll(this.nome2attrezzi.values());
		List<Attrezzo> l = new ArrayList<>();  
		l.addAll(s);
		return l;
	}
	
	SortedSet<Attrezzo> getSortedSetOrdinatoPerPeso(){
		restituisce l'insieme gli attrezzi nella borsa
		ordinati per peso e quindi, a parità di peso, per
		nome
	}
	
	SortedSet<Attrezzo> getContenutoOrdinatoPerNome(){
		//restituisce l'insieme degli attrezzi nella borsa ordinati per nome
		return new TreeSet<Attrezzo>(this.nome2attrezzi.values());
	}

	Map<Integer,Set<Attrezzo>> getContenutoRaggruppatoPerPeso(){
		/*restituisce una mappa che associa un intero (rappresentante un peso) con l’insieme 
		 * (comunque non vuoto) degli attrezzi di tale peso: tutti gli attrezzi dell'insieme che 
		 * figura come valore hanno lo stesso peso pari all'intero che figura come chiave*/
		Map<Integer, Set<Attrezzo>> a2p = new TreeMap<>();
		
	}
}

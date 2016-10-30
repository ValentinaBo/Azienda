package AziendaPackage;

import java.util.ArrayList;

public class Consulente extends Collaboratore{
	
	ArrayList<Fattura> fattureEmesse = new ArrayList<Fattura>();
	int totalePagato = 0;
	
	public Consulente (String nome, String cognome, int dataDiNascita, String luogoDiNascita,
			String codiceFiscale){
		super (nome, cognome, dataDiNascita, luogoDiNascita, codiceFiscale);
	}
	
	
	
	public void riceviPagamento(Fattura pagata){
		pagata.pagaFattura();
		totalePagato += pagata.getImporto();
	}
	
	public int getTassePagate(int n){
		return n*40/100;
	}
	
	public void emettiFattura(int importo, String emittente, String ricevente){
		
		Fattura current = new Fattura(importo, emittente, ricevente);
		fattureEmesse.add(current);	
	}
		
	public ArrayList<Fattura> getFattureEmesse(){
		return fattureEmesse;
	}

}
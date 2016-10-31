package AziendaPackage;

public class Fattura {
	private int importo;
	private String emittente;
	private String ricevente;
	private boolean pagata = false;
	private int numeroSerie;
	private static int nextNum = 0;
	
	public Fattura(int importo, String emittente, String ricevente){
		this.importo = importo;
		this.emittente = emittente;
		this. ricevente = ricevente;
		numeroSerie = nextNum;
		nextNum++;
	}
	
	public boolean getStatoPagamento(){
		return pagata;
	}
	
	public void pagaFattura(){
		pagata = true;
	}
	
	public int getNumeroSerie(){
		return numeroSerie;
	}
	
	public int getImporto(){
		return importo;
	}
	
	public String getEmittente(){
		return emittente;
	}
	
	public String getRicevente(){
		return ricevente;
	}
}

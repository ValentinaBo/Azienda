package AziendaPackage;

public class Commessa {
	private String nomeProgetto;
	private int compenso;
	private int oreLavorate = 0;
	
	public Commessa(String nomeProgetto, int compenso){
		this.nomeProgetto = nomeProgetto;
		this.compenso = compenso;
	}
	
	public void logHours(int n){
		oreLavorate += n;
	}

	public String getNomeProgetto(){
		return nomeProgetto;
	}
	
	public int getCompenso(){
		return compenso;
	}
	
	public int getOreLavorate(){
		return oreLavorate;
	}
}

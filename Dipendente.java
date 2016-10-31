package AziendaPackage;

public class Dipendente extends Collaboratore {
	
	private int stipendioMensile;
	private int stipendioTotaleRicevuto = 0;
	private int malattiaTotale = 180;
	private int malattiaRimanente = 180;
	private boolean isManager;
	
	public Dipendente (String nome, String cognome, int dataDiNascita, String luogoDiNascita,
			String codiceFiscale, int stipendioMensile, boolean isManager){
		super(nome, cognome, dataDiNascita, luogoDiNascita, codiceFiscale);
		this.stipendioMensile = stipendioMensile;
		this.isManager = isManager;
	}
	
	
	public int getAccessiAltrui(Collaboratore p){
		if (isManager == true){
			return p.getLogTrack();
		} else {
			System.out.println("Non hai l'autorizzazione necessaria ad accedere a questi dati.");
			return -1;
		}
	}
	
	public void usaMalattia(int giorni){
		malattiaRimanente -= giorni;
	}
	
	public int getMalattiaRimanente(){
		return malattiaRimanente;
	}
	
	public int getMalattiaTotale(){
		return malattiaTotale;
	}
	
	public int getTassePagate(int n){
		return n * 30 / 100;
	}
	
	public void riceviStipendio(){
		//TO DO ogni mese
		stipendioTotaleRicevuto += stipendioMensile;
	}
	
	public int getStipendioTotaleRicevuto(){
		return stipendioTotaleRicevuto;
	}
	
	public int getStipendioMensile(){
		return stipendioMensile;
	} 
	

	

	
	
}

//nuova versione

package AziendaPackage;
import java.util.Scanner;

public class AziendaMain {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		Dipendente johnny = new Dipendente("Johnny", "Cash", 25, "Milano", "FRIE846HF", 1200, false);
		Dipendente valentina = new Dipendente("Valentina", "Bottari", 8, "Piacenza", "FWI84FH8", 1500, true);
		Consulente robert = new Consulente("Robert", "Smith", 15, "Londra", "NF39TH44J");
		
		System.out.println("Quale personaggio scegli? \nDipendente Johnny = 1 \nDipendente Manager Valentina = 2 "
				+ "\nConsulente Robert = 3");
		
		int personaggioInput = in.nextInt();
		Collaboratore personaggioScelto;
		
		if (personaggioInput == 1){
			personaggioScelto = johnny;
		} else if (personaggioInput == 2){
			personaggioScelto = valentina;
		} else if (personaggioInput == 3){
			personaggioScelto = robert;
		}
		

		System.out.println("Cosa vorresti fare? \n");

		
		
		
	
		
	/*		
		System.out.println("Nome: " + johnny.getNome()+ " \nStipendio Mensile: " + johnny.getStipendioMensile() + 
				". Stipendio totale ricevuto: "+ johnny.getStipendioTotaleRicevuto() + ". Tasse totali pagate: " + 
				johnny.getTassePagate(johnny.getStipendioTotaleRicevuto()) + ". Malattia rimanente: " +
				johnny.getMalattiaRimanente() + ". Numero log in: " + johnny.getLogTrack() + ". User number: " + 
				johnny.getUserNumber());
		
		System.out.println("Nome: " + valentina.getNome()+ " \nStipendio Mensile: " + valentina.getStipendioMensile() + ". Stipendio totale ricevuto: " +
				valentina.getStipendioTotaleRicevuto() + ". Tasse totali pagate: " + 
				valentina.getTassePagate(valentina.getStipendioTotaleRicevuto()) + ". Malattia rimanente: " +
				valentina.getMalattiaRimanente() + ". Numero log in: " + valentina.getLogTrack() + ". User number: " + 
				valentina.getUserNumber());
		
		System.out.println("Nome: " + robert.getNome()+ " \nNumero log in: " + robert.getLogTrack() + ". User number: " + 
				robert.getUserNumber()); 
		System.out.println();
		
		valentina.usaMalattia(2);
		valentina.logIn();
		johnny.logIn();
		valentina.logOut();
		valentina.riceviStipendio();
		valentina.riceviStipendio();
		johnny.riceviStipendio();
		robert.emettiFattura(100, "Smith", "Azienda");
		robert.emettiFattura(50, "Smith", "Azienda2");
		robert.fattureEmesse.get(0).pagaFattura();
		
		
		System.out.println("Nome: " + johnny.getNome()+ " \nStipendio Mensile: " + johnny.getStipendioMensile() + 
				". Stipendio totale ricevuto: "+ johnny.getStipendioTotaleRicevuto() + ". Tasse totali pagate: " + 
				johnny.getTassePagate(johnny.getStipendioTotaleRicevuto()) + ". Malattia rimanente: " +
				johnny.getMalattiaRimanente() + ". Numero log in: " + johnny.getLogTrack() + ". User number: " + 
				johnny.getUserNumber());
		
		System.out.println("Nome: " + valentina.getNome()+ " \nStipendio Mensile: " + valentina.getStipendioMensile() + ". Stipendio totale ricevuto: " +
				valentina.getStipendioTotaleRicevuto() + ". Tasse totali pagate: " + 
				valentina.getTassePagate(valentina.getStipendioTotaleRicevuto()) + ". Malattia rimanente: " +
				valentina.getMalattiaRimanente() + ". Numero log in: " + valentina.getLogTrack() + ". User number: " + 
				valentina.getUserNumber());
		
		for (Fattura tmp:robert.getFattureEmesse()){
			System.out.println(tmp.getNumeroSerie() + " Importo: " + tmp.getImporto() + " Stato pagamento: " + tmp.getStatoPagamento());
		}
		
		System.out.println("Nome: " + robert.getNome()+ " \nNumero log in: " + robert.getLogTrack() + ". User number: " + 
				robert.getUserNumber() + "Fatture: " + robert.getFattureEmesse().get(1).getNumeroSerie()); 
		
		
		System.out.println(valentina.getAccessiAltrui(robert));
		
		*/
	}

}

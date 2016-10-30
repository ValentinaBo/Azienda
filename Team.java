package AziendaPackage;

import java.util.ArrayList;

public class Team {
	
	ArrayList<Collaboratore> membri = new ArrayList<Collaboratore>();
	String nomeTeam;
	boolean inCorso = true;
	
	public Team(String nomeTeam){
		this.nomeTeam = nomeTeam;
	}
	
	public void chiudiProgetto(){
		inCorso = false;
	}
	
	public boolean getStatoProgetto(){
		return inCorso;
	}
	
	public void addPerson(Collaboratore p){
		membri.add(p);
	}
	
	public ArrayList<Collaboratore> getMembri(){
		return membri;
	}
	
	public String getNomeTeam(){
		return nomeTeam;
	}
}

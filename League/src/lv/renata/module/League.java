package lv.renata.module;

import java.util.ArrayList;

public class League {
	private String name;
	private ArrayList <Team> nameOfTeams;
	
	//jaaizsauc kontruktors, bet izsaukshanas briidii varam padot tikai nosaukumu un shajaa mirklii izveidosies jauns koamndas nosaukums
	public League (String leagueName){
		this.name = leagueName;
		this.nameOfTeams = new ArrayList <>();
		
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public ArrayList<Team> getNameOfTeams() {
		return nameOfTeams;
	}
	public void setNameOfTeams(ArrayList<Team> nameOfTeams) {//masiivs saturees objektus no klases team
		this.nameOfTeams = nameOfTeams;
	}
	public void recordWinAndLoss (Team winner, Team loser){
		
		winner.setWins(1);
		loser.setLosses(1);
	}	
	@Override
	public String toString() {
		return "League [name=" + name + ", nameOfTeams=" + nameOfTeams + "]";
	}

	
	}
	
	
	
	
	
 

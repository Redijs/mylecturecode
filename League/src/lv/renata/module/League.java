package lv.renata.module;

import java.util.ArrayList;

public class League {
	private String name; //instances mainiigais
	public ArrayList <Team> nameOfTeams; // instances mainiigais, tas, ko arrays turees sevii ir objekts Team.
	
	//jaaizsauc kontruktors, bet izsaukshanas briidii varam padot tikai nosaukumu un shajaa mirklii izveidosies jauns koamndas nosaukums
	
	
	public League (String leagueName){//pieshkir liigai vaardu un pieglabaa vietas komandu vaardiem, kas tajaa piedalaas?
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
	public void setNameOfTeams(ArrayList<Team> nameOfTeams) {//masiivs saturees objektus no klases team, visu ievadiito komandu nosaukumus
		this.nameOfTeams = nameOfTeams;
//	}
//	public void recordWinAndLoss (Team winner, team loser){
//		
//		
//		winner.wins++;
//		loser.losses++;
	}	
	

public void recordWinAndLoss (String winnerName, String loserName){
	Team winner; 
	Team loser;
	
	winner = this.teamWithName(winnerName);
	loser = this.teamWithName(loserName);
	
	winner.wins++;
	loser.losses++;
	
}public void recordTies (Team teamA, Team teamB){
		teamA.ties++;
		teamB.losses++;
	}
	
	@Override
	public String toString() {
		return "League [name=" + name + ", nameOfTeams=" + nameOfTeams + "]";
	}
	public Team teamWithName (String nameToLookFor){
		Team teamCreated = null; //tas pats, kas int num = 0; iedodam saakotneejo veertiibu, ko varam peec tam mainiit
		// ja augsheejais neatradiis, tad buus null. Ja atradiis, return atdos atpakalj, vaardu.
		for(Team team : this.nameOfTeams){
			if (team.name.equals(nameToLookFor)){
				teamCreated = team;
			}
		}
		return teamCreated;
		
				
	}

	
	}
	
	
	
	
	
 

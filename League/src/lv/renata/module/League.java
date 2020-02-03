package lv.renata.module;

import java.util.ArrayList;

public class League {
	private String name;
	private ArrayList <Team> nameOfTeams;
	
	
	//jaaizsauc kontruktors, bet izsaukshanas briidii varam padot tikai nosaukumu un shajaa mirklii izveidosies jauns koamndas nosaukums
	public League (String leagueaName){
		this.name = leagueName;
		this.nameOfTeams = new ArrayList <>();
		
	}
	
	public String getName() {
		return name;
	}
	public void setNameLeague(String nameLeague) {
		this.name = nameLeague;
	}
	public ArrayList<Team> getNameOfTeams() {
		return nameOfTeams;
	}
	public void setNameOfTeams(ArrayList<Team> nameOfTeams) {
		this.nameOfTeams = nameOfTeams;
	}

	@Override
	public String toString() {
		return "League [name=" + name + ", nameOfTeams=" + nameOfTeams + "]";
	}

	
	}
	
	
	
	
	
 
}

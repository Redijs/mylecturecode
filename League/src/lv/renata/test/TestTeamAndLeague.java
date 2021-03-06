package lv.renata.test;

import java.util.ArrayList;

import lv.renata.module.League;
import lv.renata.module.Team;

public class TestTeamAndLeague {

	
	public static void main(String[] args) {
	ArrayList<Team> khlTeam = new ArrayList<>();
	
	
		Team ska = new Team("SKA");
		Team cska = new Team("CSKA");
		Team dinamo = new Team("DINAMO");
		Team spartak = new Team("Spartak");
		Team torpedo = new Team("Torpedo");
		Team jokerit = new Team("Jokerit");
		
		System.out.println("Team total points: " +ska.totalPoints());
		
		//add teams to league
		khlTeam.add(ska);
		khlTeam.add(cska);
		khlTeam.add(dinamo);
		khlTeam.add(spartak);
		khlTeam.add(torpedo);
		khlTeam.add(jokerit);
		
		for (Team t : khlTeam){
			System.out.println(t.getName());
		}
		
		League khl = new League("KHL");
	//	khl.nameOfTeams.add(dinamo);
		
		
		
		khl.setNameOfTeams(khlTeam);
		khl.recordWinAndLoss("CSKA", "DINAMO");
		khl.recordWinAndLoss("SKA", "DINAMO");
		
		khl.recordTies(ska, cska);
		
		
		System.out.println("Team SKA total points: " +ska.totalPoints());
		System.out.println(khl.toString());
	}

}

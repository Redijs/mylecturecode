package lv.renata.test;

import java.util.ArrayList;

import lv.renata.module.League;
import lv.renata.module.Team;

public class TestTeamAndLeague {

	
	public static void main(String[] args) {
	ArrayList<Team> arrTeam = new ArrayList<>();
		Team ska = new Team("SKA");
		Team cska = new Team("CSKA");
		arrTeam.add(ska);
		arrTeam.add(cska);
		League khl = new League("KHL");
		//khl.nameOfTeams.add(cska);
		
		khl.setNameOfTeams(arrTeam);
		System.out.println(khl.toString());

	}

}

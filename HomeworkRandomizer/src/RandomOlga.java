
//Sandras piemers https://github.com/SandraJ526/Java_SGT_pB/blob/master/TeamsForProject/src/TeamsForProject.java
//Gundegas piemeers https://github.com/gundegaA/MyLectures/blob/master/MDrandomGroup/src/RandomGroup.java
// https://github.com/Olga-Golubeva/Homeworks/blob/master/Random/src/lv/olga/random/ScannerNamesShuffle.java
	package lv.olga.random;

	import java.util.ArrayList;
	import java.util.Collections;
	import java.util.Scanner;

	public class RandomOlga{
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			ArrayList<String> names = new ArrayList<String>();
			for (int i = 0; i < 19; i++) {
				System.out.println("Enter your name");

				names.add(sc.nextLine());

			}
			System.out.println(names);

			Collections.shuffle(names);

			System.out.println("First team is: ");
			ArrayList<String> team1 = new ArrayList<>();
			for (int i = 0; i < 3; i++) {
				team1.addAll(names);

				System.out.println(team1.get(i));
			
			names.remove(team1.get(i));
			}
			
			System.out.println("Next team is: ");
			ArrayList<String> team2 = new ArrayList<>();
			Collections.shuffle(names);
			for (int i = 0; i < 3; i++) {
				team2.addAll(names);
			
				System.out.println(team2.get(i));
				names.remove(team2.get(i));

			}
			System.out.println("Next team is: ");
			ArrayList<String> team3 = new ArrayList<>();
			Collections.shuffle(names);
			for (int i = 0; i < 3; i++) {
				team3.addAll(names);
			
				System.out.println(team3.get(i));
				names.remove(team3.get(i));
					
		}
			System.out.println("Next team is: ");
			ArrayList<String> team4 = new ArrayList<>();
			Collections.shuffle(names);
			for (int i = 0; i < 3; i++) {
				team4.addAll(names);
			
				System.out.println(team4.get(i));
				names.remove(team4.get(i));
		}
	}
	}

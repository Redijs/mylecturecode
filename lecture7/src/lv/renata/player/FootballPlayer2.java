package lv.renata.player;

public class FootballPlayer2 {
	String name; // = "Ronaldo", jo to izdariijaam otrajaa failaaa
	String position;
	int ShirtNumber;
	boolean build;
	long height;
	int weight;
	
	
	public String getName(){
		return name;
	}
	public String getPosition(){
		return position;
	}
	public int getShirtNumber(){
		return ShirtNumber;
	}
	public boolean getBuild(){
		return build;
	}
	public long getheight(){
		return height;
		
	}
	public int getWeight(){
		return weight;
	}
	
	public void setName(String name){//
		this.name = name; //this konkreeti shiis klases instances mainiigais // 
		
	}
}

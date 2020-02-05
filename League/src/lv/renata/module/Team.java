package lv.renata.module;

public class Team {

	String name;
	int wins;
	int losses;
	int ties;
	
	public Team (String nameOfTeam){//kontruktoram tikai name jaabuut setotam ("Dinamo", )
	this.name = nameOfTeam; // nosaukums vienmeer buus zinaams
	this.wins = 0; // kaa atskaites punkts, saakumaa komandaam 0 uzvaru, zaudeejumu, neizshkirtu.
	this.losses = 0;
	this.ties = 0;
	}
	
	
	
	
	public int getWins() {
		return wins;
	}
	public void setWins(int wins) {
		this.wins = wins;
	}
	public int getTies() {
		return ties;
	}
	public void setTies(int ties) {
		this.ties = ties;
	}
	public String getName() {
		return name;
	}
	public int getLoses() {
		return losses;
	}
	
	

	@Override
	public String toString() {
		return "Team [name=" + name + ", wins=" + wins + ", losses=" + losses
				+ ", ties=" + ties + "]";
	}
	public int gamesPlayed(){
		return this.wins + this.ties + this.losses;
		
	}
	
}

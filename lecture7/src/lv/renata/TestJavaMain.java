package lv.renata;

import lv.renata.geometricfigures.Circle;
import lv.renata.player.FootballPlayer;

public class TestJavaMain {

	
	public static void main(String[] args) {
		FootballPlayer player = new FootballPlayer("Ronaldo", "Forward", 7, true, 185, 83);//saakumaa sarkans, ar labo Import class, augshaa paraadiisies klases rinda
		Circle figure = new Circle();
		
		System.out.println(figure.getColor()+ " "+ figure.getRadius());
		System.out.println("___________________________");
		
		//player.getPosition();// peec player. atversies saraksts ar parametriem, izvelamies, bet tai nebuus veertiibas
		//player.setName("Ronaldo");
		//player.getName();
		System.out.println(player.getName());
		System.out.println(player.getPosition());
		System.out.println(player.getShirtNumber());
		System.out.println(player.isBuild());
		System.out.println(player.getHeight());
		System.out.println(player.getWeight());
		
		player.setShirtNumber(10); //pamainiijaam numuru
		System.out.println("______________________________________");
		
		System.out.println(player.getName());
		System.out.println(player.getPosition());
		System.out.println(player.getShirtNumber());
		System.out.println(player.isBuild());
		System.out.println(player.getHeight());
		System.out.println(player.getWeight());
	}

}

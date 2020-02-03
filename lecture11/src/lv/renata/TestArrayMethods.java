package lv.renata;

import java.util.ArrayList;

public class TestArrayMethods {

	

		public static void main(String[] args) {
			ArrayList <String> cars = new ArrayList<>(); 
			
			cars.add("Volvo"); 
			cars.add("BMW");
			cars.add("Ford");
			cars.add("Mazda");
			
			cars.indexOf("BMW"); // kursh arajaa peec kaartas ir BMW, kaads index
			System.out.println(cars.indexOf("BMW"));
			System.out.println(cars.isEmpty());// vai shis indeks ir tukshs
			System.out.println(cars.get(3));// vai eksistee elements ar indexu 4? Nee, jo mums 4 elementi, aiznjemti liidz 3 indexam ieskaitot
			System.out.println(cars.set(0, "Opel")); //pamainiija nulto indexu no veca Volvo uz Opel, replacement!!!
			cars.clear(); // iztuksho visu peec sevis
			
			System.out.println("++++++++++++++++++++++");	
			for  (String c : cars) { // biezhi mainiigaa nosaukums ir vienskaitlii car, bet var buut jebkursh
				 System.out.println(c);
			}
			System.out.println("__________________________");
			cars.remove("Ford"); // izneema
			cars.remove ("Muzdu"); //neiznjeema, jo neatrada taaadu
			for (String car : cars){
				System.out.println(car);
			}
			
		}

}

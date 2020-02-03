package lv.renata;

import java.util.ArrayList;

public class TestArrayListCars {
/// ievadiit mashiinu nosaukumus, vismaz 4. izmantot for each loop un izprinteet visu araju
	
	public static void main(String[] args) {
		ArrayList <String> cars = new ArrayList<>(); 
		
		cars.add("Volvo"); 
		cars.add("BMW");
		cars.add("Ford");
		cars.add("Ford");
		
		for  (String c : cars) { // biezhi mainiigaa nosaukums ir vienskaitlii car, bet var buut jebkursh
			 System.out.println(c);
			}

		
	}

}

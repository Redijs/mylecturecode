package lv.renata.repeatarrays;

import java.util.Scanner;

public class maajasdarbsNoSestdienas {
  
	
	
		//maajaasdarbs // ar for loop ???
		// user input array lenght
		//user add to element value;
		//array values are printed to console
		
		//create methods for printing out arrays values
	

	public static void main(String[] args) {
	Scanner input = new Scanner (System.in);
	System.out.println("Input vallue: ");
	
	int inputValue;
	
	while (input.hasNext()){
		if (input.hasNextInt()){
			inputValue = input.nextInt();
			System.out.println("Your input is integer: " + inputValue);
			
			}else{
				System.out.println("Your input is not integer! ");
				input.next();
			}
	}

	}

}

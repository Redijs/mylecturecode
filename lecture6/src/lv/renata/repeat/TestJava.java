package lv.renata.repeat;

import java.util.Scanner;

public class TestJava {

	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);//iedodam parametru iekavaas, in - ka pados informaaciju
		
		System.out.println("Input value ");
		
	
		int inputvalue;
		boolean done;
	
		while(!(input.hasNextInt())){//paarbaudiis, vai ievadiitais ir integers	// != not equal
			if (input.hasNextInt()){
				inputvalue = input.hasNextInt();
				done =true;
				
			}else{
				done = false;
			}
			//System.out.println("Assign to variable with type int "+inputvalue);
		
		}
	}
}
/// shitais neatrisinaats //
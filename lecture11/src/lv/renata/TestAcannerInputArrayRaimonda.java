package lv.renata;

import java.util.Scanner;

public class TestAcannerInputArrayRaimonda {

	
	public static void main(String[] args) {
		String [] strArr = new String [3]; // arrajs strArr ar 3 indeksiem
		Scanner sc = new Scanner(System.in);//izveidots skaneris
		System.out.println(strArr.length + " users in array: ");
			for(int i=1; i< strArr.length; ++i){
				strArr [i] =sc.nextLine();
				
			}
			
		System.out.println("Do you want to print array? ");
		System.out.println("Type (Print)");
		System.out.println("Type (Not Print)");
			String statusCheck = sc.nextLine();
			
		if (statusCheck.equals("Print")){
			printArray(strArr);
		}else if (statusCheck.equals ("Not Print")){
			System.out.println("Exit");
		}else{
			System.out.println("Your enter is wrong ");
		}

	}

	private static void printArray(String[] strArr) {
		for (int i =0; i<strArr.length; i++){
			System.out.println(strArr[i]+ " this user is added to array");
		}
		
		
	}

}

package lv.renata;

import java.util.Arrays;
import java.util.Scanner;


public class TestScannerInputArray {

	//vajadziigs masiivs Strinf [] strArr
	//vajag Scanneri, nosaukumns sc
	//sc.nextLine()
	//Jaaizdara - ievadot stringaa, saglabaasies masiiivaa
	//k a izdariit, ka pie katra naakoshaa ievadiitaa v
	
	
	public static void main(String[] args) {
		String [] strArr = {"Toms", "Elīna", "Rebeka"};
		int lengthOfArrays = strArr.length;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter name 1: ");
		String name = sc.nextItnt();
		sc.nextLine(); 
		System.out.println("Enter name 2: ");
		String name = sc.nextLine(); 
		System.out.println("Enter name 3: ");
	 
	}

}

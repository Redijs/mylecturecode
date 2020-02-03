package lv.renata;

import java.util.ArrayList;

public class TestArrayList {

	
	public static void main(String[] args) {
		String [] arr = new String [2]; // visas metodes parastajaa arajaa
		System.out.println(arr.length);
		arr [0]= "ElementName"; //nultajam indexam pieshkirt veertiibu ElementName
		
		
		
		System.out.println(arr[0]);
		ArrayList <String> array = new ArrayList<>(); //visas veertiibas listarajaa
		System.out.println(array.size());// cik elementu ir arajlistaa
		array.add("Element to Array"); //pievienot veertiibu Element to Array
		array.add("Element A");
		array.add("Element B");
		//array.add(3);// neies cauri, jo saakotneeji nodefineejaam String tipu, ies, ja buus ("3")
		System.out.println(array); // izprintee visas iepriekshpievienotas veertiibas
	}

}

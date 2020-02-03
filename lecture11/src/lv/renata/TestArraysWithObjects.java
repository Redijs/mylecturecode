package lv.renata;

import java.util.ArrayList;
import java.util.Collections;

public class TestArraysWithObjects {

	
	public static void main(String[] args) {
		Integer intObj = 40;
		Double doubleObj = 40.24;
		
		System.out.println(intObj);
		
		ArrayList <Integer> intArrays = new ArrayList<>(); // katraa elementaa saglabaas intus, nav saistiits ar augsheejo
		//<> shajaas iekavaas jaaraksta klase Integers, nevis mainiigaa tips int. 
		//ArrayList saturees klasi Integer un visu, ko taa saturees.
		intArrays.add (40);
		intArrays.add (23);
		//intArrays.add("14"); //neder, jo stringus nevar likt Integer klasee
		intArrays.add(14);
		intArrays.add(60);
		
		System.out.println(intArrays);
		
		Collections.sort(intArrays);
		System.out.println(intArrays);//pieaugoshaa seeciibaa
	}

}

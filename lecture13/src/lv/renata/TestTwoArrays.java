package lv.renata;

import java.util.ArrayList;
import java.util.Arrays;

public class TestTwoArrays {

	//tas ir tas maajasdarbs no 11.lekcijas
	//TestSnnerInputArray
	
	public static void main(String[] args) {
		int [] arr1 = {2, 3, 5, 6, 8, 10, 3};
		int [] arr2 = {2, 7, 6, 3};
		
		ArrayList <Integer> arrList = new ArrayList<>();//vieta, kur pieglabaajam atrastos skaitljus
		
		for(int i : arr1){ //pirmais for each loop
			for(int j : arr2){
				if(i==j){ // ka jaatrod divi vienaadi cipari
					arrList.add(i); // ja mazaakaa arrailista elements sakritiis ar lielaaka arajlista elementu, jaapievieno ar Add shis skaitlis
					break;
					
				}
			}
		}
		System.out.println(Arrays.asList(arrList));// aslist var izprinteet ciparus kaa list
	}

}

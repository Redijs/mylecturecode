package lv.renata;

public class TestArraysAndLists {

	public static void main(String[] args) {
		String[] arr = new String[10];
		String[] arrWidth = { "1", "1", "1", "1", "1", "1", "1", "1", "1", "1" }; // vienkaarshaakais 	// variants
		arrToString(arr);
		System.out.println("******************************************");
		
		arrToString(arrWidth);
		System.out.println("******************************************");
		addElementToArray(arr);
		System.out.println("******************************************");
		
		for (int i = 0; i < arr.length; i++) { // darbosies, kameer array neizbeigsies

		}
		for (int i = 0; i < arr.length; i++) {
			System.out.println("index numbers are: " + i + " " + arrWidth[i]); // lai vnk izprintee
																				
		}
	}

	public static void arrToString(String[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.println("index numbers are: " + i + " " + arr[i]); 
																			
		}
	}
	public static void addElementToArray (String [] arr){
		for(int i = 0; i < arr.length; i++){
			arr[i] = arr[i] + i;
		}
		arrToString(arr);
		
		
	}
}

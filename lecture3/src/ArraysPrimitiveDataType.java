public class ArraysPrimitiveDataType {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		int[] arrays;// aDeclare array with type int
		// int arrays2 []; //var taa rakstiit, bet nav ljoti pareizi
		arrays = new int[2];// var ielikt vairaak kaa 2 elementus

		int[] arr = new int[10];

		int[] arrTest = new int[5];// var satureet 5 kastiites

		arrTest[0] = 10;
		arrTest[1] = 3; //ja ielikt 3.0, buus kljuuda
		arrTest[4] = 4;

		System.out.println(arrTest[0] + " " + arrTest[1] + " " + arrTest[2]
				+ " " + arrTest[3] + " " + arrTest[4]);

		System.out.println("vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv");
		double[] doubleArray = new double[3]; // declaration jaaizveido masiivs
												// ar 3 indeksiem
		doubleArray[0] = 0.5;
		doubleArray[1] = 1;
		doubleArray[2] = 0.2;

		System.out.println(doubleArray[0] + " " + doubleArray[1] + " "
				+ doubleArray[2]);
		System.out.println("vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv");
		
		char[] charArray = new char [2];
		charArray [0] = 77;
		charArray [1] = 'f';
			System.out.println(charArray [0] + " " + charArray [1]);
			System.out.println("vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv");
			
		boolean [] booleanArray = new boolean [2];
		booleanArray [0] = true;
		booleanArray [1] = false;
			System.out.println(booleanArray [0] + " " + booleanArray [1]);
			System.out.println("vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv");
			
		
		int checkLenght = arrTest.length;
		System.out.println( "Array lenght is "+ checkLenght);
		System.out.println("vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv");
		
		int checkLenght2 = booleanArray.length;
		System.out.println( "Array lenght is "+ checkLenght2);
		System.out.println("vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv");
		
		System.out.println(booleanArray [booleanArray.length-1]);
	}

}

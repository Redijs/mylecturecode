import java.util.Arrays;


public class ArraysInitialization {

	
	public static void main(String[] args) {
		int [] numbersOfArrays = {33, 45, 23, 56}; //sitaa vini aizpilda indexu 0, 1, 2, 3
		int lenghtOfArrays = numbersOfArrays.length ;
	
		System.out.println(lenghtOfArrays);
		
		numbersOfArrays [3] = 20; // pamainaam kastiites ar indexu 3 veertiibu jeb elementu uz 20(bija 56)
		System.out.println(Arrays.toString(numbersOfArrays));
	}

}

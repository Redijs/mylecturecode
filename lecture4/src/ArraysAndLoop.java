import java.util.Arrays;


public class ArraysAndLoop {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Declare variable
		int  [] marks = {76, 23, 42, 100, 99, 10, 56};
		//Make toString all elements of array
		//Print in console
		
		System.out.println("[" + marks[0]+ "," + marks [1] + "," + marks[2] + "]"); //slikts variants
		System.out.println(Arrays.toString(marks));
		System.out.println("VVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVV");
				
		System.out.println("[");
		for(int i = 0; i  < marks.length -1; i++){
		System.out.print(marks [marks[i] + ", "]);	
		
		}
		System.out.print(marks[marks.length-1]+ "]";
		System.out.println("/n"+marks.length);
		
		System.out.println();
	
		}
			System.out.print(marks[marks.length -1] +"]"); // ja vnk Syste.out.print - tad print in one line
		}	
}

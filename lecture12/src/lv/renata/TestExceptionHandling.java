package lv.renata;

public class TestExceptionHandling {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			
			int number1 = 0;
			int number2 = 10;
			int result = number2 / number1;
				System.out.println(result);
		}catch (Exception e ){ // e ir mainiigaa nosaukums
			System.out.println("Check code in try block: " + e); // paraadiis exceptionu
		}
		
		try{
		int [] myNumbers = {1, 3, 4};
		System.out.println(myNumbers [2]);// pameegini arii 10, lai ir ar kljuudaam
		}catch(Exception e2){
			System.out.println("Error in array: ");
		}finally{
			System.out.println("The try catch block is finished. ");
		}
	}

}

public class ControlFlowIF {

	
	public static void main(String[] args) {
		int x = 10;
		int y = 22;
		
		if (x>y){ //ja  sis ir false, zemaakais bloks neaiziet, neparaadaas
			System.out.println("x < y");
		}
		int numberCheck = 21;
		
		if(numberCheck % 2 == 0){ //
			System.out.println(numberCheck + " is even");
		}else{
			System.out.println(numberCheck + " is odd");
		}
		System.out.println(" ");
		
		
		int mark = 50;
		if (mark >= 50){
			System.out.println("PASS");
		
		}else{
			System.out.println("FAIL");
		}
		System.out.println();
		System.out.println("DONE");
	}

}

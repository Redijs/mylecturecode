
public class ForLoopAndIfElseBlock {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int [] numbers = {1, 4, 2, 3};
		//Find in array number ?3? and print his name in Console
		int findNumber = 3;
		int numberFind = 0;
		
		for(int i = 0; i < numbers.length; i++){
			if (numbers[i] == findNumber){ 
				numberFind = numbers[1];
				
			}
		}
		if (numberFind == 1){
			System.out.println("ONE");
		}else if (numberFind == 2){
			System.out.println("TWO");
		}else if (numberFind == 3){
			System.out.println("TTHREE");
		}else if (numberFind == 4){
			System.out.println("FOUR");
		}else{
				System.out.println("No number in array");
			}
			
	}
	}
///Jaapierakstaa, ko katra rindinja dara

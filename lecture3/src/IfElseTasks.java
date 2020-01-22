
public class IfElseTasks {

	public static void main(String[] args) {
		int time = 4;
		
		if (time < 10){
			if(time > 6 && time < 10){// ja abiem ir true un true, tad izpildisies, ja true un false, tadd neizpildiisies
				System.out.println("Morning");
			}else{
				System.out.println("Go to sleep");	
			}
				
		}else{
			System.out.println("Good day!");
		}

	}

}

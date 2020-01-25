package lv.renata;

public class RefactorMethod {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		getGreeting(20); //sheit mainaam veertiibu un skataamies uz rezultaatu, var arii nelikt, bet nodefineet naakamajaa
		System.out.println(getGreeting (20)); // bez shii neizprinteesies
		getGreetingWithVoid (3);
		
	}
	public static String getGreeting (int time){
		if(time < 8){
			return "Good morning";
		}else if(time <=18){
			return "Good day";
		}else{
			return "Good evening";
	}
}
	public static void getGreetingWithVoid(int time){
		if(time < 8){
			System.out.println("Good morning");
		}else if(time <=18){
			System.out.println("Good day");
		}else{
			System.out.println("Good evening");
}
	
	}
}

package lv.renata; //strukturee muusu kodu

public class LearnMethods {

	/**
	 * @param args
	 */
	//void - not returned type
	//static - vinjam nevajag veidot klases objektu, lai izsauktu metodi
	//public / private / protected
	public static void main(String[] args) {//
		
		getMyName ();
		getMyName ();
		getMyName ();
		getMyName ();
		System.out.println("___________________________________");
		getMyCity ();
		
		
		LearnMethods classObject = new LearnMethods(); //izveidojaam klasee klases objektu
		
		classObject.doYouHaveCat();
		
	}
	public static void getMyName (){ // metodi var rakstiit tikai klases iekshpusee
		System.out.println("My name is Renāta");
	}
	public static void getMyCity (){
		getMyName ();
		System.out.println("My city is Krāslava");
	}
	public static void doYouHaveCat (){// bez static keyword nekaa nebuus, ja bez taa, tad vajag izsaukt objektu LearnMethods classObject = new LearnMethods();
		System.out.println("No");
	}
}

package lv.renata.repeatJavaClassOOP;

public class MyClassMethods {
	
	public MyClass myClass; // MyClass ir objekts
	
	//public MyClassMethods (MyClass myClass){
//		this.myClass = myClass;
//	}
	
	
	
	public static void myMethod(){ // void atgriezh visu, kas shajaa metodee ir iekshaa
		System.out.println("Hello world!");
	}
	public String myStringMethod(){
		myMethod();
		
		return "Hell";
	}
	
	public double returnDouble(){
		return 60.3;
		
	}
	public char returnChar(int a, int b){
		int charFromInt = a+b;
		char charVariable = (char)charFromInt; // custoshana - paarveidojam int par charu
		
		return charVariable;
		
	}
}

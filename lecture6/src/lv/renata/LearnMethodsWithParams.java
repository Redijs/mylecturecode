package lv.renata;

public class LearnMethodsWithParams {

	// cast
	public static void main(String[] args) {
		
		double radius = 59.2;
		String color = "red";
		
		int resultWithCastInt = getArea(radius); //this method cast  double to int
		double result = getAreaForCircle (radius);
		System.out.println("Area: "+resultWithCastInt);
		System.out.println("Area: "+result);
		
		
		System.out.println(getColorAndArea (color , result ));

	}
	
	public static int getArea(double radius){ // sheit ir cast, integeru paartaisa par double 
		double result = Math.PI * (radius * radius);
		return (int)result;
	}
	
	public static double getAreaForCircle(double radius){ //radius ir parametrs  seit
		double result =  Math.PI * (radius * radius);
		return result;
		
	}
	public static String getColorAndArea (String color, double area ){//objektu datu tips String
		return "Color: "+ color + " and area: " + area; // atgriezh stringu
		
	}
}


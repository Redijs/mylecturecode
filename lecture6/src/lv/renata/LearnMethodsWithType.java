package lv.renata;

public class LearnMethodsWithType {

	
	public static void main(String[] args) {
		//getArea ();
		//System.out.println(getArea()); // var arii shaadi pierakstiit, nevis double area = getArea();
		
		double area = getArea(); //tas ir tas pats kas inicianilizeet double areaNew =  40;
		//System.out.println("Area of rectangle: "+area);//Syso var atrasties sheit

		}
		public static double getArea(){ // metodes tipam un resultatam jaasakriit
			double num1 = 20.3;
			double num2 = 10.0;
		
			double result = num1*num2;
			System.out.println("Area of rectangle: "+result);//Syso var atrasties arii sheit, tik mainiigais jaanomaina uz result
			return result;

	}
}

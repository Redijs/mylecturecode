package lv.renata;

import lv.renata.interfaces.Rectangle;
import lv.renata.interfaces.Shape;
import lv.renata.interfaces.Triangle;

public class TestInterface {

	
	public static void main(String[] args) {
		int num1 = 20;
		int num2 = 34;

			Rectangle rect = new Rectangle (num1, num2);
			System.out.println(rect.getLength() + " " + rect.getWidth());
			System.out.println("____________________");
			
			Shape figure = new Rectangle(5, 10);
			System.out.println(figure.toString());
			System.out.println(figure.getArea());
			System.out.println("____________________");
			
			Shape figure1 = new Triangle (20, 50);
			System.out.println(figure1.toString());
			System.out.println(figure1.getArea());
			
			Shape figure2 = new Rectangle();
			System.out.println(figure2.getColor()); // maajaas jaasalabo klases
			
			Rectangle figure4 = new Rectangle();
			System.out.println(figure4.getColor()); // maajaas jaasalabo klases
			
			
			
	}

}

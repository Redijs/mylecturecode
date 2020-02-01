package lv.renata;

import lv.renata.polymorphism.Animal;
import lv.renata.polymorphism.Cat;
import lv.renata.polymorphism.Dog;

public class TestPolymorphism {

	
	public static void main(String[] args) {
		Animal myAnimal = new Animal(); //atsaucamies uz klasi Animal
		Animal myDog = new Dog();
		Animal myCat = new Cat();
		
		myAnimal.animalSound(); //izsaucaam sho metodi
		myDog.animalSound();
		myCat.animalSound();
		
	}
	

}

package lv.renata;

import lv.renata.repeatJavaClassOOP.ClassExtendsAbstractClass;
import lv.renata.repeatJavaClassOOP.EncapsClass;
import lv.renata.repeatJavaClassOOP.ImplementInterface;
import lv.renata.repeatJavaClassOOP.MyClass;
import lv.renata.repeatJavaClassOOP.MyClassConstructor;
import lv.renata.repeatJavaClassOOP.MyClassMethods;
import lv.renata.repeatJavaClassOOP.MyEnums;



public class TestOOP {
	
	public static void main (String [] args){//public - ka publiski pieejama, var piekljuut, static - neveidojam objektus no klases
		MyClass newObj = new MyClass(); //sagatavoju vietu konkrētam klases objektam
		//newObj.getClass(); // ar . jeb dot var izsaukt visas iespējamas metodes
		//newObj.x = 0; // paarrakstam v ert ibu mainiigajam x
		MyClass newObj2 = new MyClass(); //cits objekts, bet liidziigas strukturas
		String strObj = "hello";
		String strObj2 = "hello";
		
		
		System.out.println(newObj.equals(newObj2));// saliidzina 2 objektus ar metodi equals, labi saliidzinaat stringus
		System.out.println(strObj.equals(strObj2));
		
		System.out.println(newObj.x);
		
		//MyClassMethods myObjMethod = new MyClassMethods();
		//myObjMethod.myMethod();
		//myObjMethod.myStringMethod();
		//System.out.println(myObjMethod.myStringMethod());
		MyClassMethods myObjMethod = new MyClassMethods();
		double numberDouble = 0;
		numberDouble = myObjMethod.returnDouble();
		System.out.println(numberDouble);
		
		System.out.println(myObjMethod.returnChar(100, 20));
		MyClassConstructor myConstructorObj1 = new MyClassConstructor(1990L, "BMW");
		MyClassConstructor myConstructorObj2 = new MyClassConstructor(2010L, "BMW" );
		MyClassConstructor myConstructorObj3 = new MyClassConstructor(2020L, "BMW");
		MyClassConstructor myConstructorObj4 = new MyClassConstructor(2000L, "Volvo");
		
		System.out.println(myConstructorObj1.getModelName().equals(myConstructorObj4.getModelName())); //vai sakriit
		
		System.out.println(myConstructorObj1.getModelName()); //izprinteet vaardu
		
		
		EncapsClass objEncps = new EncapsClass();// pieshkirt veertiibas objekta instances mainiigajiem caur metodi (getter vai setter)
		System.out.println(objEncps.getUser());
		objEncps.setUser("Renāta"); /// Syso nevajag, jo clasee taa metode ir voids. Bet veel neko neizdot outputaa, jo tikai seto
		System.out.println(objEncps.getUser()); // sheit jau izprintees
		
		
		ImplementInterface objInterface = new ImplementInterface();
		objInterface.sendEmail();
		System.out.println(objInterface.sendEmailCount());
		System.out.println(objInterface.sendEmailCount());
		
		MyEnums status = MyEnums.LOW;
		System.out.println("This object is to "+ status);
		System.out.println(MyEnums.LOW);
		
		switch(status){
		case LOW: 
			System.out.println("Low status");
			break;
		case MEDIUM:
			System.out.println("Medium status");
			break;
		case HIGH: 
			System.out.println("High status");
			break;
		default:
			System.out.println("No status");
		}
		
		//wrapper klases
		String numberStr = "240";// jaapaarveido stringu par primitiivo datu tipu
		int numberInt = Integer.parseInt(numberStr); // parse - paarveidot!!!
		int result = 30 + numberInt;
		System.out.println(numberInt);// vnk izprintee, to ko luudzam
		System.out.println(result); // paarveido par integeriem
		
		String numberStringValue = "20";
		Integer valueInt = Integer.valueOf(numberStringValue);
		System.out.println(valueInt);
		
		
		//abstract class
		ClassExtendsAbstractClass objAbstrClass = new ClassExtendsAbstractClass();
		objAbstrClass.sleep();
		objAbstrClass.abstractMethod();
		
	}

}


public class Calculator {

	public static void main(String[] args) {
	char operatorMath = '%';
	double num1 = 88.5;
	double num2 =10.5;
	double result;
	
	
	
	if (operatorMath =='+'){
		result = num1 + num2;
		System.out.println(num1 + num2);		
	}else if(operatorMath =='/'){
		result = num1 / num2;
		System.out.println(num1 / num2);	
	}else if(operatorMath =='*'){
		result = num1 * num2;
		System.out.println(num1 * num2);
	}else if (operatorMath =='-'){
		result = num1 - num2;
		System.out.println(result);
	}else if(operatorMath =='%'){
		if (num1 >= num2){			 // nested if
			result = num1 % num2;    // nested if
		System.out.println(result);  // nested if
		}else{ 
			System.out.println("If num1 is less than num2" + "than result is num1:" +num1);
		}
	}else{
		System.out.println("Wrong data");
	
	}
	// piemers tam pasham ar switchu, mainiigie augshaa
	System.out.println("-----------------------------------------------");
	switch (operatorMath){
	case '+':
		result = num1 + num2;
		System.out.println(result);
		break;       //ja nebutu break, tad visu case rezultatus uzraditu
	case '/':
		result = num1 / num2;
		System.out.println(result);
		break;
	case '*':
		result = num1 *num2;
		System.out.println(result);
		break;
	case '-':
		result = num1 - num2;
		System.out.println(result);
		break;
	case '%':
		if (num1 >= num2){
		result = num1 % num2;
		System.out.println(result);
		}else{ 
			System.out.println("If num1 is less than num2" + "than result is num1:" +num1);
		}
		break;
	default:
		System.out.println("No suchoperator");
	}
	
	
	
	
	}
}

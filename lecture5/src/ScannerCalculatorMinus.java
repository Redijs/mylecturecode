import java.util.Scanner;


public class ScannerCalculator {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); // izmantojam klasi, kura piedava taisiit inputu konsolee
		System.out.println("Number 1: ");
		int num1 = sc.nextInt(); // mums ir mainiijais, kas sagaida veertiibu
		System.out.println("Number 2: "); // pieshkiram rezultATU, KO IEVADIISIM KONSOLEE
		int num2 = sc.nextInt(); // otrais mainiigais
		sc.nextLine(); // bugs, ka peec intigera jaaieliek tuksha liinija, lai var turpinaat ar Stringu
		System.out.println("Input operator /+-*% : ");
		String operatorSymbol = sc.nextLine();
		
		int result = 0;
		
		if (operatorSymbol.equals("+")){ // atsaaucaamies uz string metodi EQUALS, kas ljauj saliidzinaa
			result = num1 - num2;
		}else if (operatorSymbol.equals ("/")){
			result = num1 / num2;
		}
		
		//System.out.println(" test result: "+ result);
		System.out.println(result + " = " + num1 + " " +operatorSymbol + " " +num2);

	}

}

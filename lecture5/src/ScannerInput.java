import java.util.Scanner;


public class ScannerInput {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); // tas pats kaa Scanner tips, sc ir skanera nosaukums, tas vienads ar new
		
		System.out.println("Enter number");
		int number = sc.nextInt();
		sc.nextLine(); // lai paraadaas 2.liinija peec pirmaas
		System.out.println("Enter name: ");
		String name = sc.nextLine();
		
		System.out.println("Your number is "+ number);
		System.out.println("Your name is "+ name);
		
	}

}
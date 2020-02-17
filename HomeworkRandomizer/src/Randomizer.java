import java.util.Scanner;

public class Randomizer {
		     public static void main(String []args){
	        Scanner skeneris = new Scanner(System.in);
	        System.out.println("Enter username 1");
	        String userName1;
	       userName1 = skeneris.nextLine();

	        System.out.println("Enter username 2");
	        String userName2;
	        userName2 = skeneris.nextLine();

	        System.out.println("Enter username 3");
	        String userName3;
	        userName3 = skeneris.nextLine();
	           
	      System.out.println("Username 1 is: " + userName1);
	      System.out.println("Username 2 is: " + userName2);
	      System.out.println("Username 3 is: " + userName3);    

	      String [] saraksts = new String[3];
	      saraksts[0] = userName1;
	 saraksts[1] = userName2;
	 saraksts[2] = userName3;
	      System.out.println(saraksts[0] + " " + saraksts[1] + " " + saraksts[2]);
	     }
	}
//// sākumā skenerii ievada visus lietottaajus.
/// vinji jaaieraksta 3 grupaas, jeb 3 arajos,


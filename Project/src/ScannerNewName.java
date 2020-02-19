import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
public class ScannerNewName {
		
		public static void main (String []args) throws IOException{
	    Scanner skeneris = new Scanner(System.in);
	    System.out.println("Please write father's first name: "); 
	    String fatherName;
	    fatherName = skeneris.nextLine(); 

	    System.out.println("Please write mother's first name:");
	    String motherName;
	    motherName = skeneris.nextLine();
	    
	  	   
	   String substringFatherBegin = fatherName.substring(0, 3);
	   String substringFatherEnd = fatherName.substring(fatherName.length() -3);
	    
	   String substringMotherBegin = motherName.substring(1,3);
	   char substringMotherBeginFirst = motherName.charAt(0);
	   String substringMotherEnd = motherName.substring (motherName.length() -3);
	   
	   boolean x = false;
	   String gender = "";
	   
	   do {
		   System.out.println("If you know your child's gender, enter M/F, if not, enter O");
		   gender = skeneris.next();
		   switch(gender.toUpperCase()){
		   
		   case "M":
		   System.out.println("Your child' s name is: " + substringMotherBeginFirst+substringMotherBegin
		   + substringFatherEnd);
		   x=true;
		   break;
		   
		   case "F":
		   System.out.println("Your child' s name is: " + substringFatherBegin + substringMotherEnd);
		   x=true;
		   break;
		   
		   case "O":
		   System.out.println("Your child' s name variants are: " +substringMotherBeginFirst+ substringMotherBegin
		   + substringFatherEnd+ " and " + substringFatherBegin + substringMotherEnd);
		   x = true;
		   break;
		   
		   default:
		   System.out.println("Invalid input - must enter M, F or O (upper or lower case)");
		   break;
		   }
	} while(x == false);
	   
	   System.out.println("Congratulations!!! ");
	   System.out.println("                ");
	   boolean y = false;
	  	  
	   do {
	       System.out.println("If you would like to try one more time, enter M, F or O for gender. If no, enter N!");
	       gender = skeneris.nextLine();
	       switch(gender.toUpperCase()){
	       case "M":
	           System.out.println("Here you have one more variant of your child's name: "+ substringMotherBeginFirst+substringMotherBegin+substringFatherBegin.toLowerCase()+ "s"); 
	           y=true;
	           break;
	           
	           case "F":
	           System.out.println("Here you have one more variant of your child's name: " + substringMotherBeginFirst+substringMotherBegin+substringFatherBegin.toLowerCase()+ "a"); 
	           y=true;
	           break;
	           
	           case "O":
	               System.out.println("Here you have one more variant of your child's name: " + substringMotherEnd + substringMotherBegin+ "a" + " and " + substringFatherEnd + substringFatherEnd + "s" ); 
	                   y = true;
	                   break;
	                   
	           case "N":
	               System.out.println("Congratulations!"); 
	                   y = true;
	                   break;
	        default:
	                System.out.println("Invalid input - must enter M, F or O (upper or lower case)"); 
	                gender = skeneris.nextLine(); 
	                break;
	       }
	       
	   } while(y == false);

	   
	   	File fileObj = new  File("ChildNameCertificate.txt");
		FileWriter fw = new FileWriter (fileObj, true); 
		//fw.write("HKo rakstīsim"); 
		//fw.close();
	  
	  

	}
}
		

import java.util.Scanner;
public class StupidCode {
		
		public static void main (String []args){
	    Scanner skeneris = new Scanner(System.in);
	    System.out.println("Please write father's first name: "); 
	    String fatherName;
	    fatherName = skeneris.nextLine(); 

	    System.out.println("Please write mother's first name:");
	    String motherName;
	    motherName = skeneris.nextLine();
	    
	   System.out.println("If you know your child's gender, enter M/F, if not, enter N");
	   String gender;
	   gender = skeneris.nextLine();
	   
	   
	   String substringFatherBegin = fatherName.substring(0, 3);
	   String substringFatherEnd = fatherName.substring(fatherName.length() -3);
	    
	   String substringMotherBegin = motherName.substring(1,3);
	   char substringMotherBeginFirst = motherName.charAt(0);
	   String substringMotherEnd = motherName.substring (motherName.length() -3);
	   
	  
	  if (gender.equals ("M")){
		  System.out.println("Your child' s name is: " +substringMotherBeginFirst +substringMotherBegin +substringFatherEnd);
	  }else if(gender.equals ("F")){
		  System.out.println("Your child' s name is: " +substringFatherBegin + substringMotherEnd);
	  }else if (gender.equals ("N")){
			  System.out.println("Your child' s name is: " +substringFatherBegin + substringMotherEnd + " or " + substringMotherBegin +substringFatherEnd);
	  } else{
		  System.out.println("Wrong input! Try again");
		  System.out.println("If you know your child's gender, enter M/F, if not, enter N");
		   gender = skeneris.nextLine();
		 
		   
		   if (gender.equals ("M")){
				  System.out.println("Your child' s name is: " +substringMotherBeginFirst +substringMotherBegin +substringFatherEnd);
			  }else if(gender.equals ("F")){
				  System.out.println("Your child' s name is: " +substringFatherBegin + substringMotherEnd);
			  }else if (gender.equals ("N")){
					  System.out.println("Your child' s name is: " +substringFatherBegin + substringMotherEnd + " or " + substringMotherBegin +substringFatherEnd);
			  } else{
				  System.out.println("Wrong input! Try again");
				  System.out.println("If you know your child's gender, enter M/F, if not, enter N");
				   gender = skeneris.nextLine();
	  }
	  
	  
	   
		  System.out.println("Do you like it? Yes/No");
	  String answer = skeneris.nextLine();
	  if (answer.equals("Yes")){
		  System.out.println("Congratulations! You can go register your cild' s name!");
	  }else if (answer.equals("No")){
		  System.out.println("Your child's name is "+ substringMotherBegin + substringFatherEnd );
		  
		  
	  }
/////////////////	  
//	  boolean checkIn = true;
//	  String str = "";
//	  while (checkIn){
//		  System.out.println("Input string:");
//		  Scanner sc = new Scanner (System.in);
//		  str = sc.nextLine();
//		  if (str.equals(checkIt(str))){
//			  System.out.println("Input "+str);
//		}else{
//			str =sc.nextLine();
//			
//		}
//	  }
//public static String checkIt (String str){
//	if (str.equals(("M")){
//		return "M";
//	}else if (str.equals("F")){
//		return "F";
//	}else{
//		return "";
//		
//	}
}
	}
}
		
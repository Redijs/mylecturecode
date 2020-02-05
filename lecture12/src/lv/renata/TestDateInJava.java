package lv.renata;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class TestDateInJava {


	public static void main(String[] args) {
		LocalDateTime myDateObj = LocalDateTime.now(); // laiks shajaa briidii		
		System.out.println("Time in machine: "+myDateObj);

		
		DateTimeFormatter myFormatObjTime = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss"); //meeneshi vienmeer ar lieliem burtiem MM
		String formatedDate = myDateObj.format(myFormatObjTime);
		
		System.out.println("After format time: "+formatedDate);
		
	}
	

}

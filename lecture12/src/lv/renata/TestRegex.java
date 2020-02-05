package lv.renata;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TestRegex {

	
	public static void main(String[] args) {
		String inputStr = "ab0c30u304_9";
		String regexStrExp = "[a-z]+";// ka peec burta pa vidu turpinaas mekleet ciparus. ja + nonjemt, pa vienam meklees
		
		System.out.println(inputStr.charAt(0)); //string ir character sekvence, ja veelamies izdrukaat ciparus, jaaizsauc konkreets index
		System.out.println(inputStr.charAt(1));
		
		
		Pattern pattern = Pattern.compile(regexStrExp);// piedaavaajaam peec kaa mekleet, regex expression
		Matcher matcher = pattern.matcher(inputStr);//saliidzina no input stringa regex expression un grupee???
		
		
		while (matcher.find()){ // find booleans, ja atrod, tad 
			System.out.println("find() found substring " + matcher.group()); // ja atradiis, tad izprintees un sagrupees
			
    }
		String replaceSymbols = "lv";
		String outputStr = matcher.replaceFirst(replaceSymbols);
		System.out.println(outputStr);
	}

}

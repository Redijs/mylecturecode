package lv.renata.inputoutput;

import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class TestChangeStringToFile {
//Maajaas
	//input username from aray
	//input usernames from scanner
	
	
	public static void main(String[] args) throws Exception{
//		String defaultStr = "Hello user userName ";
//		String lastString = defaultStr.replace("userName", " "); //metode meklee userName un aizstaata ar tukšumu
//		System.out.println(lastString +"Renāta");
		
		File file = new File ("DefaultText.txt"); //atrada failu
		
		Scanner sc = new Scanner(file); //
		String stringFromTextFile = " ";
				while(sc.hasNextLine()){
			stringFromTextFile = sc.nextLine(); 
		}
		//System.out.println("Check: " + stringFromTextFile);
		String lastString = stringFromTextFile.replace("userName", " "); //metode meklee userName un aizstaata ar tukšumu
		String userName = "Renāta Vorslova";
		File fileForUser = new File (userName + " .txt");
		FileWriter fw = new FileWriter (fileForUser, true);
		fw.write(lastString+userName);
		
		fw.close();
	}

}

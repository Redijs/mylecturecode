package lv.renata.inputoutput;

import java.io.File;
import java.io.FileWriter;

public class TestCreateAndWriteFile {

	
	public static void main(String[] args) throws Exception {
	File fileObj = new  File("newfile.txt");
		FileWriter fw = new FileWriter (fileObj, true); //otrs variants, kaa izveidot failu 
		fw.write("Hello we work now??"); //pappildus varam ierakstiit jaunu tekstu failaa
		fw.close();
	
	
//	if (fileObj.createNewFile()){
//		System.out.println("File created:  "+ fileObj.getName()); // pie pirmaa run izveido teksta failu mapiitee
//	}else{
//		System.out.println("File exists.");  					//pie otraa run apstiprina, ka fails eksistee
//	}
	
	
	}

}

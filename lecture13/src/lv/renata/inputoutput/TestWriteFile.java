package lv.renata.inputoutput;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

public class TestWriteFile {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception{
	File file = new File ("Data.txt"); 
	BufferedWriter bw = new BufferedWriter (new FileWriter(file));
	String stringToFile = "Hi there!";
	bw.write(stringToFile); // paarrakstiiija muusu failaa visu tekstu pret Hi there
	
	bw.close();// lai neraksta nepaartraukti
	
	

	}

}

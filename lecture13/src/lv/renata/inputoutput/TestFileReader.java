package lv.renata.inputoutput;

import java.io.FileReader;

public class TestFileReader {

	
	public static void main(String[] args) throws Exception {
		FileReader fr = new FileReader("Data.txt");
		
		int i;
		char test = 101;
		
		while((i=fr.read()) != -1){
			System.out.print((char)i); //println un print mainaam, lai izprintee vienaa rindaa, nevis stabinjaa
		}

	}

}

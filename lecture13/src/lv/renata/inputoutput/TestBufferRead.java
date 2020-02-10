package lv.renata.inputoutput;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class TestBufferRead {

	
	public static void main(String[] args) throws Exception { //shai metodei pieglabaa jeb ietur (handlins) exceptionuS
		File file = new File("Data.txt");
		FileReader filReader = new FileReader(file); // otrs variants kaa pierakstiits
		BufferedReader buffReader = new BufferedReader (new FileReader(file)); //konstruktors, kuraa jaainicializee objekts
		
		String stringFileData;
		
		while ((stringFileData = buffReader.readLine()) !=null){
			System.out.println(stringFileData);
		}

	}

}

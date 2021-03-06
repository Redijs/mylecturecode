package lv.renata.inputoutput;

import java.io.File; // visus uz leju var izdzest, bet sheit atstaat java.io.*
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class TestReadFile {

	public static void main(String[] args) {
		InputStream inputStream;
		OutputStream outputStream;
		int c;
		final int EOF = -1; // konstante
		outputStream = System.out; // /vienmeer, kur ir dariishanaas ar failiem,
									// buus vajadziigs exception handling

		try { // vai fails vispaar eksistee paarbauda
			File inputFile = new File("Data.txt");
			inputStream = new FileInputStream(inputFile);

			try {// ja atrod, jaanolasa bytus, kas atrodas failaa
				while ((c = inputStream.read()) != EOF) {
					outputStream.write(c);
				}
			} catch (IOException e) {// ja nevar nolasiit, izprinteetu eroru un
										// kaads tas ir
				System.out.println("Error: " + e.getMessage());
			} finally {// shim obligaati jaizpildaas, lai aiztaisiitu ciet
				try {
					inputStream.close();
					outputStream.close();// ar shiem aiztaisaam ciet, kad
											// nobeigsies
				} catch (IOException e) {
					System.out.println("File did not close");
				}
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			System.exit(1);
		}
	}

}

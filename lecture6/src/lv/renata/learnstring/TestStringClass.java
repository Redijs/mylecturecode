package lv.renata.learnstring;

public class TestStringClass {

	
	public static void main(String[] args) {
		String str = "   In d ex";
		String strClass = new String("Index parm");//ja new String () -defoltais konstruktors bez parametriem
		
		
		System.out.println(str);
		System.out.println("String like obj" +strClass);

		
		int stringLenght =str.length();
		System.out.println(stringLenght);
		
		System.out.println(str.charAt(4)); //atrod stringa pirmo indexu, kas ir n. Ja vajag pirmo burtu, tad jaaprasa 0
		
		
		System.out.println(str.toLowerCase());//p arveido visu par maziem burtiem
		
		System.out.println(str.toUpperCase());
		
		System.out.println(str.trim()); // nonjem space atstarpes
		
		System.out.println(str.replace (" ", "")); // to, kas ir ar space nomaina pret to, kur truukst space
		
		System.out.println("__________________________________");
		
		String s1 = "Hello";
		String s2 = "Hello";
		String s3 = "NotHello";
		
		System.out.println(s1 == s2);
		System.out.println(s1==s1);
		System.out.println(s1==s3);
		System.out.println(s1.equals(s2));//labaak jaaizmanto equals metodi
		System.out.println(s2.equals(s3));
		System.out.println(!s1.equals(s2)); // atgriezh preteejo veertiibu, ja buutu equal
		System.out.println(!s2.equals(s3)); // atgriezh preteejo veertiibu, ja buutu equal
		
		System.out.println("____________________________");
	}

}

package lv.renata;

public class TestThrow {

	
	public static void main(String[] args) {
		checkAge (10);
		

	}
	public static void checkAge (int age){
		if (age< 18){
			throw new ArithmeticException("Access denied"); // mees jau saakotneeji domaajam, kas vareetu nobrukt sisteemaa
				
		}else{
			System.out.println("Access granted");
		}
	}
}

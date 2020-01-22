public class TestIfElseAndBlocks {

	public static void main(String[] args) {
		System.out.println("********************");
		System.out.println("********************");

		boolean test = true;
		int result;

		if (test) {// ja sis true, izpildiisies abas nakamas syso rindas
			int number = 100;
			System.out.println("TRUE");
			System.out.println(number + number);
			result = number + number;

			System.out.println("Result value is" + result);

		} else {
			System.out.println("FALSE");
		}

		System.out.println("After if else block");

		boolean test2 = true;
		int number = 300;
		
		if (test2) {
			System.out.println("TRUE");
			result = number + number;

			System.out.println("Result value is" + result);
		} else {
			System.out.println("FALSE");
		}
	}
}

public class ForLoopAndIfElseBlock {

	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) {// iekshaa loopaa var ielikt breaku , lai
										// tas neiet bezgaliigi
			if (i == 4) {
				System.out.println("Number of i is " + 1);
				break;
			}
			System.out.println(i);
		}
		System.out.println("-----------------------------------------");
		for (int i = 0; i < 10; i++) {
			if (i == 4) {
				System.out.println("Number of i is " + 1); //kad izlaizh 4, bet turpina talak
				continue;
			}
			System.out.println(i);
		}
	}
}

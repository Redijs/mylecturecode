
public class ArraysSumForLoop {

	
	public static void main(String[] args) {
		int  [] marks = {76, 23, 42, 10, 56, 75};
		//Summ all values in arrays
		//print in console
		
//		int result = 10;
//		System.out.println("result value: " +result); // seit result ir 10
//		int testInt = 90;
//		result = 200; // sheit mees nomainaam veertiibu resultam uz 200, vairs nav 10.
//		System.out.println("result value: " +result);
		
		int sum = 0;
		
		for (int i = 0; i < marks.length; i++){
			sum += marks [i];
			
			System.out.println("Sum of marks: " +sum);
	
			System.out.println(marks [0]+ marks[1]+ marks[2]);
			int sumTest = 0;
			sumTest = sumTest + 200; // 200
			sumTest = sumTest + 220; // 200+220=420
			sumTest = sumTest + 240; //420+240=660
			System.out.println("1 Testing + operator: " +sumTest);
			
			sumTest += 200; // 200
			sumTest += 220; // 200+220=420
			sumTest += 240; //420+240=660
			System.out.println("2 Testing += operator: " +sumTest);
			
			
			//-= and look how this operator works
			int subOperator = 660;
			subOperator -= 200;
			subOperator -= 220;
			subOperator -= 240;
			System.out.println("3 Testing -= operator: " +sumTest);
			
			
			//cits pieraksts
			subOperator = subOperator - 200;
			subOperator = subOperator - 240;
			subOperator = subOperator - 240;
	
			System.out.println("4 Testing - operator: " +sumTest);
					
		
	}

}
}


package lv.renata;

import lv.renata.users.Teacher;

public class TestPerson {


	public static void main(String[] args) {
		
		String [] strArr = new String[12]; //cik vietas deklareesim jaatziimee []
		strArr[0] = "Sport";
		strArr[1] = "Math";
		System.out.println(strArr[0]+ " , "+ strArr[1]);
		System.out.println("_______________________");
		
		Teacher teacher1 = new Teacher ("Toms", "Riga");
		System.out.println(teacher1.toString());
//		teacher1.addCourse("Sport"); // System.out.println(Arrays.toString(this.courses)); un visi uz leju
//		teacher1.addCourse("Math");
//		teacher1.addCourse("Biology");
//		teacher1.addCourse("History");
		String [] courses = {"Sport", "Math", "Biology", "History"};
		
		// for-each loop
		for(Stringcourse: courses){//
			teacher1.addCourse (course);
			
		}
		
		
		

	}

}

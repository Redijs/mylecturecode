package lv.renata;

import lv.renata.users.Teacher;

public class TestPerson {

	public static void main(String[] args) {

		String[] strArr = new String[12]; // cik vietas deklareesim jaatziimee
											// []
		strArr[0] = "Sport";
		strArr[1] = "Math";
		System.out.println(strArr[0] + " , " + strArr[1]);
		System.out.println("_______________________");

		Teacher teacher1 = new Teacher("Toms", "Riga");
		System.out.println(teacher1.toString());
		// teacher1.addCourse("Sport"); //
		// System.out.println(Arrays.toString(this.courses)); un visi uz leju
		// teacher1.addCourse("Math");
		// teacher1.addCourse("Biology");
		// teacher1.addCourse("History");
		String[] courses = { "Sport", "Math", "Biology", "History" };

		// for-each loop
		for (String course : courses) {//
			teacher1.addCourse(course);

		}

		System.out.println("_______________________");
		Teacher t1 = new Teacher("Toms B", "Riga iela");
		System.out.println(t1.toString());
		String[] coursesForT1 = { "CS10", "AL", "BIO", "CS10" };
		for (String core : coursesForT1) { // peex Stringa kkads nosaukums, peec
											// : Stringa nosaukums coursesForT1
			if (t1.addCourses(core)) { // katru reizi izies cauri visiem
										// kursiem??
				System.out.println(core + " added");
			} else {
				System.out.println(core + " cannot be added");
			}

		}

		for (String core : coursesForT1) { // peex Stringa kkads nosaukums, peec
											// : Stringa nosaukums coursesForT1
			if (t1.removeCourses(core)) { // katru reizi izies cauri visiem
											// kursiem??
				System.out.println(core + " removed");
			} else {
				System.out.println(core + " cannot be removed");

			}
		}
	}

}

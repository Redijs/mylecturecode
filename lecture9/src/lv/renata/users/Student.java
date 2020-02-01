package lv.renata.users;

public class Student extends Person {
	private int numCourses;
	private String[] courses;
	private int[] grades;

	private static final int MAX_COURSES = 12; // cik daudz elementus vareesim
												// saglabaat masiivaa

	public Student(String name, String address) {
		super(name, address); // panemam no parent klases shoos mainiigos
		this.numCourses = 0;
		this.courses = new String[MAX_COURSES];
		this.grades = new int[MAX_COURSES];

	}

	public void addCourseGrade(String course, int grade) {
		courses[numCourses] = course; //
		grades[numCourses] = grade;
		++numCourses;
	}

	public void printGrades() { /// ieguut asrakstu ar visaam atziimeem
		System.out.println();
		for (int i = 0; i < numCourses; ++i) {
			System.out.println(" " + courses[i] + ":" + grades[i]);
		}
		System.out.println();
	}

	public double getAverageGrade() { // ieguut videejo atzimi
		int sum = 0;
		for (int i =0; i < numCourses; i++){
			sum = sum + grades[i];
			
		
			
		}
		return (double)sum/numCourses; // kastojam int uz double
	}

	public String toString() {
		return "Student: " + super.toString(); // piedaavaa paarmantot metodes,
												// kas atrodas parent klasee
	}
}

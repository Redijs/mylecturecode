package lv.renata;

public class MotherName {
	String motherName = " ";

	MotherName(String name) {
		this.motherName = name;
	}

	public String getName() {
		return motherName.toUpperCase();
	}

	public String end(String name) {
		this.motherName = name;
		String end = motherName.substring(motherName.length() - 3);
		return end;
	}

	public String begin(String name) {
		this.motherName = name;
		String begin = motherName.substring(0, 3);
		return begin;
	}

}

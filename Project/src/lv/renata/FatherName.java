package lv.renata;

public class FatherName {
	String fatherName = " ";

	FatherName(String name) {
		this.fatherName = name;
	}

	public String getName() {
		return fatherName.toUpperCase();
	}

	public String end(String name) {
		this.fatherName = name;
		String end = fatherName.substring(fatherName.length() - 3);
		return end;
	}

	public String begin(String name) {
		this.fatherName = name;
		String begin = fatherName.substring(0, 3);
		return begin;
	}

}

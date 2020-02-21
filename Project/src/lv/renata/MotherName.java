package lv.renata;

public class MotherName {
	String motherName = " ";
	char firstMotherLetter = 0;

	MotherName(String name) {
		this.motherName = name;
	}

	public String getName() {
		return motherName.toUpperCase();
	}

	public String subStringEnd(String name) {
		this.motherName = name;
		String subStringEnd = motherName.substring(motherName.length() - 3);
		return subStringEnd;
	}

	public String subStringBegin(String name) {
		this.motherName = name;
		String subStringBegin = motherName.substring(0, 3);
		return subStringBegin;
	}

}


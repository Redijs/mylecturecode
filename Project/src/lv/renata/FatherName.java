package lv.renata;


public class FatherName {
	String fatherName = " ";
	char fatherLetter = 0;

	FatherName(String name) {
		this.fatherName = name;
	}

	public String getName() {
		return fatherName.toUpperCase();
	}

	public String subStringEnd(String name) {
		this.fatherName = name;
		String subStringEnd = fatherName.substring(fatherName.length() - 3);
		return subStringEnd;
	}

	public String subStringBegin(String name) {
		this.fatherName = name;
		String subStringBegin = fatherName.substring(0, 3);
		return subStringBegin;
	}

	public void firstLetterUpper() {
		fatherLetter = fatherName.charAt(0);
	}

}



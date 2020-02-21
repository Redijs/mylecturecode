package lv.renata;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class NameGenerator {

	public static void main(String[] args) throws IOException {
		String childName = "";

		System.out.println("Please write father's first name: ");

		Scanner skeneris = new Scanner(System.in);

		FatherName fatherName = new FatherName(skeneris.nextLine());
		System.out.println("Please write mother's first name: ");
		MotherName motherName = new MotherName(skeneris.nextLine());
		System.out.println("You entered: " + fatherName.getName() + " and "
				+ motherName.getName());

		GenderChoice gender = new GenderChoice();
		String skenObj = "";
		childName = "";
		boolean x = false;

		do {
			System.out
					.println("If you know your child's gender, enter M for male and F for female, if not, enter O");
			skenObj = skeneris.next();
			switch (gender.getGender(skenObj).toUpperCase()) {
			case "M":
				childName = motherName.subStringBegin(motherName.getName())
						+ fatherName.subStringEnd(fatherName.getName());
				System.out.println("Your child's name is: " + childName);

				x = true;
				break;
			case "F":
				childName = fatherName.subStringBegin(fatherName.getName())
						+ motherName.subStringEnd(motherName.getName());
				System.out.println("Your child's name is: " + childName);
				x = true;
				break;
			case "O":
				childName = motherName.subStringBegin(motherName.getName())
						+ fatherName.subStringEnd(fatherName.getName())
						+ " and "
						+ fatherName.subStringBegin(fatherName.getName())
						+ motherName.subStringEnd(motherName.getName());
				System.out.println("Your child's name variants are: "
						+ childName);
				x = true;
				break;
			default:
				System.out
						.println("Invalid input - must enter M, F or X (upper or lower case)");
				break;
			}
		} while (x == false);

		System.out.println("Congratulations!");
		boolean y = false;

		do {
			System.out
					.println("Do you like the name(-s)? If you would like to try one more time, enter M, F or O for gender. If no, enter N!");
			skenObj = skeneris.next();
			switch (gender.getGender(skenObj).toUpperCase()) {
			case "M":
				childName = motherName.subStringBegin(motherName.getName())
						+ fatherName.subStringBegin(fatherName.getName()) + "S";
				System.out
						.println("Here you have one more variant of your child's name: "
								+ childName);
				y = true;
				break;
			case "F":
				childName = motherName.subStringBegin(motherName.getName())
						+ fatherName.subStringBegin(fatherName.getName()) + "A";
				System.out
						.println("Here you have one more variant of your child's name: "
								+ childName);
				y = true;
				break;
			case "O":
				childName = fatherName.subStringEnd(fatherName.getName())
						+ fatherName.subStringBegin(fatherName.getName())
						+ "S and "
						+ motherName.subStringEnd(motherName.getName())
						+ motherName.subStringBegin(motherName.getName()) + "A";
				System.out
						.println("Here you have one more variant of your child's name: "
								+ childName);
				y = true;
				break;
			case "N":
				System.out.println("Congratulations!");
				y = true;
				break;
			default:
				System.out
						.println("Invalid input - must enter M, F or X (upper or lower case)");
				break;
			}
		} while (y == false);

		System.out.println("-------------------------------------");

		System.out
				.println("Would you like to print it in a document? Enter Y for yes and N for no!");
		Scanner skeneris1 = new Scanner(System.in);
		String printChoice;
		printChoice = skeneris1.nextLine();

		if (printChoice.equals("Y") || printChoice.equals("y")) {
			System.out.println("Your document is created");
			File fileObj = new File("ChildNameCertificate.txt");
			BufferedWriter br = new BufferedWriter(new FileWriter(fileObj));
			br.write(childName);
			br.close();

		} else if (printChoice.equals("N") || printChoice.equals("n")) {
			System.out.println("Have a nice day!");
		}
	}
}

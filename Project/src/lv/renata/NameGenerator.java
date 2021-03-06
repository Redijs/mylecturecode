package lv.renata;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class NameGenerator {

	public static void main(String[] args) throws IOException {
		Scanner skeneris = new Scanner(System.in);
		String skenObj = "";

		System.out.println("Please write father's first name: ");
		FatherName fatherName = new FatherName(skeneris.nextLine());
		System.out.println("Please write mother's first name: ");
		MotherName motherName = new MotherName(skeneris.nextLine());
		System.out.println("You entered: " + fatherName.getName() + " and "
				+ motherName.getName());

		String childName = "";
		String childNameM1 = motherName.begin(motherName.getName())
				+ fatherName.end(fatherName.getName());
		String childNameF1 = fatherName.begin(fatherName.getName())
				+ motherName.end(motherName.getName());
		String childNameM1F1 = motherName.begin(motherName.getName())
				+ fatherName.end(fatherName.getName()) + " and "
				+ fatherName.begin(fatherName.getName())
				+ motherName.end(motherName.getName());
		String childNameM2 = motherName.begin(motherName.getName())
				+ fatherName.begin(fatherName.getName()) + "S";
		String childNameF2 = motherName.begin(motherName.getName())
				+ fatherName.begin(fatherName.getName()) + "A";
		String childNameM2F2 = fatherName.end(fatherName.getName())
				+ fatherName.begin(fatherName.getName()) + "S and "
				+ motherName.end(motherName.getName())
				+ motherName.begin(motherName.getName()) + "A";

		GenderChoice gender = new GenderChoice();

		boolean x = false;

		do {
			System.out
					.println("If you know your child's gender, enter M for male and F for female, if not, enter X");
			skenObj = skeneris.next();
			switch (gender.getGender(skenObj).toUpperCase()) {
			case "M":
				childName = childNameM1;
				System.out.println("Your child's name is: " + childName);
				x = true;
				break;
			case "F":
				childName = childNameF1;
				System.out.println("Your child's name is: " + childName);
				x = true;
				break;
			case "X":
				childName = childNameM1F1;
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
					.println("Do you like the name(-s)? If you would like to try one more time, enter M, F or X for gender. If no, enter N!");
			skenObj = skeneris.next();
			switch (gender.getGender(skenObj).toUpperCase()) {
			case "M":
				childName = childNameM2;
				System.out
						.println("Here you have one more variant of your child's name: "
								+ childName);
				y = true;
				break;
			case "F":
				childName = childNameF2;
				System.out
						.println("Here you have one more variant of your child's name: "
								+ childName);
				y = true;
				break;
			case "X":
				childName = childNameM2F2;
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

		if (printChoice.equalsIgnoreCase("Y")) {
			System.out.println("Your document is created!");
			File fileObj = new File("ChildNameCertificate.txt");
			BufferedWriter br = new BufferedWriter(new FileWriter(fileObj));
			br.write("Your generated child's name is: " + childName);
			br.close();

		} else if (printChoice.equalsIgnoreCase("N")) {
			System.out.println("Have a nice day!");
			skeneris1.close();
		}
		skeneris.close();
	}
}
package week4;

import java.util.Scanner;

class InputName {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter your age: ");
		int age = input.nextInt();
		if (age >= 0 && age <= 2 ) {
			System.out.println("Infant");
		} else if (age >= 3 && age < 12) {
			System.out.println ( "Child");
		} else if ( age >= 13 && age <= 19) {
			System.out.println("Adult");
		} else if (age >= 20) {
			System.out.println("Adult");
		} else {
			System.out.println(" You have entered an invalid number");

	 }
		
  }

}

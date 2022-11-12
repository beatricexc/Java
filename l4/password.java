package habarnam;

import java.util.Scanner;

public class MySweetProgram {
	
	public static void main (String args[]) {
		String password = "let me in";
		System.out.println("Guess the password: ");
		
		Scanner scanner = new Scanner (System.in);
		String guess = scanner.nextLine();
		
		if (password.toLowerCase().equals(guess.toLowerCase())) //method chaining 
		{
			System.out.println("You guessed the password");
			return;
			
		} else if ("don't stop believing".toLowerCase().equals(guess.toLowerCase())) {
			System.out.println("You got the second password ");	
		} else {
			System.out.println("Ths is false");
		}
	}
}
	

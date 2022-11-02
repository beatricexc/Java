package nope;

import java.util.Scanner;

public class GoAway{
	public static void main(String[]args) {
		System.out.println("Tell me your name: ");
		
		Scanner input = new Scanner(System.in);
		String name = input.nextLine();
		
		switch(name) {
			case "Leo":
				System.out.println("Go away!");
				break; // the break prevents a fall through
			case "Clare":
				System.out.println("Welcome, my dear");
				break;
		  default:
			  System.out.println("I don't know you, bye!");
			  break;
		}
	}
	
	
}

import java.util.Scanner;

public class MySweetProgram {

	public static void main(String[] args) {
		System.out.println("What is your name?");
		
		Scanner input = new Scanner(System.in);
		String name = input.nextLine();
	
		
		if (name.equals("Cece")) {
			System.out.println("You are strong and brave, " + name + ", don't you ever forget that!");
		} else {
			System.out.println (" I don't know who you are, "+ name + ", so not sure what to tell you");
			
		}
		
	}
}	

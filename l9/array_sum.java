package habarnam;

//import java.util.Scanner;
import java.util.Arrays;

public class MySweetProgram {
	public static void main (String [] args) {
		
		double[] myArray = { 2, 5, 6, 33, 42, 12, 9, 19, 3, 7}; // generate an array of numbers of your choice
		
		double sum = 0;
		for (int i = 0; i < 10; i ++) { //loop through the array elements to calculate the sum
			sum = sum + myArray[i];
		}
		double average = sum/10; // calculate the average of the sum
		//Scanner input = new Scanner(System.in);
		System.out.println("Average of " + Arrays.toString(myArray) +  " is: \n" + average);
	}

}

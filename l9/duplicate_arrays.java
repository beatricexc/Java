package habarnam;

//import java.util.Scanner;
import java.util.Arrays;
// Write a Java program to find the duplicate values of an array of integer values.


public class MySweetProgram {
	public static void main (String[]args) {
		
	int [] myArray = {1,2,3,3,5,6,7,7,9,10};
	for ( int i = 0; i < myArray.length; i ++)
	{
		for ( int j = i; j < myArray.length; j ++) {
			if (myArray[i]==myArray[j] && i != j) {
				System.out.println(myArray[j] + " is a duplicate value in the array");
			 }
	   }
	
	 }

  }

}

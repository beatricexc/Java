package habarnam;

//import java.util.Scanner;
import java.util.Arrays;
// Write a Java program to find the duplicate values of an array of string values.


public class MySweetProgram {
	public static void main (String[]args) {
		
	String [] myArray = {
			"Meta", 
			"Teta",
			"Beta",
			"Beta",
			"Meta"};
	
	for ( int i = 0; i < myArray.length; i ++)
	{
		for ( int j = i; j < myArray.length; j ++) {
			if (myArray[i].equals(myArray[j]) && i != j) {
				System.out.println(myArray[j] + " is a duplicate value in the array");
			   }
		    }
	    }
	
    }
}

import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    //System.out.println('Ge')
    Scanner input = new Scanner(System.in);
    System.out.println("Provide the first number: ");
    int num1 = input.nextInt(); 
    System.out.println("Provide the second number: ");
    int num2 = input.nextInt();
    System.out.println("Provide the third number: ");
    int num3 = input.nextInt();
    int numbersAverage = (num1 + num2 + num3)/3;
    System.out.println("The average of the 3 numbers is: " + numbersAverage);

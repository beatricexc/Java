//Exercise: Area Calculator Week 4

import java.util.Scanner; // user input

class Main {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Enter the radius");
    double radius = input.nextDouble();
    if (radius >= 0) {
      double area = radius * radius * 3.142;
      System.out.println("The area is: " + area);
    } else {
      System.out.println("invalid input");
    }

  }

}

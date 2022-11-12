package habarnam;

import java.math.BigDecimal;
import java.util.Scanner;

public class MySweetProgram {
	public static void main (String args[]) {
		Scanner scanner = new Scanner (System.in);
//		String x = scanner.nextLine();
//		System.out.println(x);
//		int y = scanner.nextInt();
//		System.out.println(y);
//		int a = y + 10;
//		System.out.println(a);
//		BigDecimal money = scanner.nextBigDecimal(); // it needs  the math library imported
		// BigDecimal is trustworthy when it comes to precision
		int z = scanner.nextInt(8); // nextInt with a radix
		System.out.println(z);
	}
}

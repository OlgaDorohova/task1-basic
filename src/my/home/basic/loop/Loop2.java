package my.home.basic.loop;

import java.util.Scanner;

//calculate function in [a,b] with h step

public class Loop2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		double a = Double.valueOf(scanner.next());
		double b = Double.valueOf(scanner.next());
		double h = Double.valueOf(scanner.next());

		double result[] = new double[(int) (Math.abs(a - b) / h) + 1];
		int j = 0;
		for (double d = Math.min(a, b); d <= Math.max(a, b); d += h, j++) {
			result[j] = (d <= 2) ? -d : d;
		}

		System.out.println("Result: ");
		for (double d : result) {
			System.out.printf("%.2f, ", d);
		}
		
	}

}

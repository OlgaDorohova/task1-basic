package my.home.basic.loop;

import java.util.Scanner;

// dividers

public class Loop7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int m = scanner.nextInt();

		int min = Math.min(n, m);
		int max = Math.max(m, n);

		for (int i = min; i <= max; i++) {	
			System.out.println();
			System.out.print("Diviedrs of " + i + ": ");
			
			for (int j = 2; j < i; j++) {
				if (i % j == 0) {
					System.out.print(j + " ");
				}
			}
		}

	}

}

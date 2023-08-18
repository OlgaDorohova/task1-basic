package my.home.basic.loop;

//find sum all numbers to n 

import java.util.Scanner;

public class Loop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		int number = scanner.nextInt();
		int sum = 0;

		for (int i = 0; i <= number; i++) {
			sum += i;
		}

		System.out.println("Sum = " + sum);

	}

}

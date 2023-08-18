package my.home.basic.loop;

import java.util.Scanner;

//sum of numbers less than abs

public class Loop5 {
	@SuppressWarnings("resource")
	public static void main(String [] args) {
		Scanner scanner = new Scanner(System.in);
		double e = Double.valueOf(scanner.next());
		double sum = 0;
		double temp;
		
		for(int i = 0; i < e; i++) {
			temp = Math.pow(2,-i) + Math.pow(3, -i);
			System.out.println(temp);
			if(Math.abs(temp) <= e) {
				sum += temp;
			}

		}
		
		System.out.println(sum);
		
	}

}

package my.home.basic.loop;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

//has the same numbers

public class Loop8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		String[] firstNum = scanner.next().split("");
		String[] secondNum = scanner.next().split("");
		Map<String, Integer> hMap = new HashMap<String, Integer>();
		
		for (String str : firstNum) {
			hMap.put(str, 1);
		}

		for (String str : secondNum) {
			if (hMap.get(str) != null) {
				hMap.put(str, hMap.get(str) + 1);
			}
		}

		System.out.println("The same numbers are ");
		for (Map.Entry<String, Integer> item : hMap.entrySet()) {
			if (item.getValue() >= 2) {
				System.out.print(item.getKey() + " ");
			}
		}

	}

}

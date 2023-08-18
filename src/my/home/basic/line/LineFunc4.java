package my.home.basic.line;

//ƒано действительное число R вида nnn.ddd (три цифровых разр€да 
//в дробной и целой част€х). ѕомен€ть местами
//дробную и целую части числа и вывести полученное значение числа.


import java.util.Scanner;

public class LineFunc4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		String input [] = scanner.nextLine().split("\\.");
		
		System.out.println("Reverse data: " + 
						Double.valueOf(input[1] + "." + input[0]));

	}

}

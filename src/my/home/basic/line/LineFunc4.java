package my.home.basic.line;

//���� �������������� ����� R ���� nnn.ddd (��� �������� ������� 
//� ������� � ����� ������). �������� �������
//������� � ����� ����� ����� � ������� ���������� �������� �����.


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

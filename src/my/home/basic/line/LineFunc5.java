package my.home.basic.line;

//���� ����������� ����� �, ������� ������������ ������������ 
//���������� ������� � ��������. �������
//������ �������� ������������ � �����, ������� � �������� � ��������� �����:
//��� ����� SSc.

import java.util.Scanner;

public class LineFunc5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		int time = scanner.nextInt();
		
		int hour = time / 3600;
		int minute = (time / 60) % 60;
		int second = time % 60;
		
		System.out.println(hour + " hours " + minute + " minutes " + 
							second + " seconds.");
		
	}

}

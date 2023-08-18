package my.home.basic.line;

//Для данной области составить линейную программу, которая печатает true, 
//если точка с координатами (х, у)
//принадлежит закрашенной области, и false — в противном случае

public class LineFunc6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] xDir = {-4, 4};
		int [] yDir = {-3, 4};
		
		int pointX = 0;
		int pointY = -2;
		
		if((pointX >= xDir[0] && pointX <= xDir[1]) &&
				(pointY >= yDir[0] && pointY <= yDir[1])) {
			System.out.println("True");
		} else {
			System.out.println("False");
		}

	}

}

package my.home.basic.line;

//calculate trigonometric function
//(sin(x) + cos(y)) / (cos(y) - sin(x)) * tg(xy)

public class LineFunc3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double x, y;
		double result;
		
		x = 5;
		y = 50;
		
		if((Math.cos(y) - Math.sin(x)) != 0) {
			result = ((Math.sin(x) + Math.cos(y)) / (Math.cos(y) - Math.sin(x))) * 
					Math.tan(x * y);
			System.out.println(result);
		} else {
			System.out.println("Dividing by zero");
		}

	}

}

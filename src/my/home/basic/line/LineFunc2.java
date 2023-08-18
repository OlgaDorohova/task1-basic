package my.home.basic.line;

//calculate function 
// (b + sqrt(pow(b,2) + 4ac)) / (2a) - pow(a,3) * c + pow(b,-2);


public class LineFunc2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double a, b, c;
		double result;
		double dis;
		
		a = 1;
		b = 2;
		c = 3;
		
		dis = Math.pow(b, 2) + 4 * a * c;
		
		if(dis >= 0) {
			result = (b + Math.sqrt(dis)) / 2 * a - 
					Math.pow(a, 3) * c + Math.pow(b, -2);
			
			System.out.println(result);
		} else {
			System.out.println("Impossible to count");
		}
		
		

	}

}

package my.home.basic.branch;

//calculate function

public class BranchFunc5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			System.out.println(resultFunc(1));
			System.out.println(resultFunc(5));
				
		}

	public static double resultFunc(double x) {
		return (x <= 3) ? (x * x - 3 * x + 9) : 
			(1 / (Math.pow(x, 3) + 6));
	}	

}


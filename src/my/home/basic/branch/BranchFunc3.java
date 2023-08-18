package my.home.basic.branch;

//one line passed through three dots


public class BranchFunc3 {
	public static void main(String [] args) {
		
		double [] point1 = {1, 1};
		double [] point2 = {2, 2};
		double [] point3 = {3, 5};
		
		if((point3[1] - point1[1]) * (point2[0] - point1[0]) ==
				(point3[0] - point1[0]) * (point2[1] - point1[1])) {
			System.out.println("The line passed through three points");
		} else {
			System.out.println("The line doesn't pass through three points");
		}
	}

}

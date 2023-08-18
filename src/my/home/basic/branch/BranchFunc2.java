package my.home.basic.branch;

//find max{min(a, b), min(c, d)}

public class BranchFunc2 {
	public static void main(String [] args) {
		
		int a, b, c, d;
		int min1, min2, max;
		
		a = 11;
		b = 28;
		c = 50;
		d = 6;
		
		min1 = (a < b) ? a : b;
		min2 = (c < d) ? c : d;
		
		max = (min1 > min2) ? min1 : min2;
		
		System.out.println(max);
	}

}

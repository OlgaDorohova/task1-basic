package my.home.basic.branch;

// a brick and a hole

public class BranchFunc4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Hole size
		int A = 10;
		int B = 5;
		
		//Brick size
		int x = 9;
		int y = 4;
		int z = 20;
		
		int min1, min2;
		
		if(x < y) {
			min1 = x;
			min2 = y;
		} else {
			min1 = y; 
			min2 = x;
		}
		
		if(min2 > z) min2 = z;
		
		if((min1 < A && min1 < B) && (min2 < A || min2 < B)) {
			System.out.println("Brick is less than hole");
		} else {
			System.out.println("Brick is large than hole");
		}
		
		
	}

}

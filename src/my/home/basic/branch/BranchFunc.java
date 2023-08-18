package my.home.basic.branch;

//Is a triangle exist?

public class BranchFunc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int angel1 = 35;
		int angel2 = 90;
		int angel3 = 180 - angel2 - angel1;;
		
		if(angel3 > 0) {
			System.out.println("This triangle exists");
			if(angel1 == 90 || angel2 == 90 || angel3 == 90) {
				System.out.println("It's a right triangle");
			}
		} else {
			System.out.println("This triangle doesn't exist");
		}

	}

}

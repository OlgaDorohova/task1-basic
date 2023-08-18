package my.home.basic.loop;

//multiply of two hundred squares
public class Loop4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		long mult = 1;

		for (int i = 1; i <= 200; i++) {
			if(mult * i * i >= mult) {
				mult *= i * i;
				System.out.println(mult);
			}
			else {
				System.out.println("Cannot calculate multiply - variable overflow.");
				break;
			}

		}
	}

}

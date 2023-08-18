package my.home.basic.loop;

//multiply of hundred squares

public class Loop3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		long mult = 1;
		int i = 1;

		while (i <= 100) {
			if (mult * i * i >= mult) {
				mult *= i * i;
				i++;
			} else {
				System.out.println("Cannot calculate multiply - variable overflow.");
				System.out.println(mult);
				break;
			}
		}
	}

}

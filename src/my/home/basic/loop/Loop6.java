package my.home.basic.loop;

//CODEPOINTS

public class Loop6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//if we have a symbol or a string
		String string = ",";
		
		
		char[] charArray = string.toCharArray();

		for (int i = 0; i < charArray.length; i++) {
			System.out.print(Character.codePointAt(charArray, i) + " ");
		}
		
		System.out.println();
		
		//if we have int value
		int num = 65;
		char ch;
		ch = (char)num;
		
		System.out.println(ch);
		

	}

}

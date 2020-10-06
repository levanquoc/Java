package pk1;

import java.util.Random;

public class Ex5 {
	public static void main(String[] args) {
		Random rd=new Random();
		int number1=rd.nextInt(11)+10;
		System.out.println("Number: "+number1);
	}
}

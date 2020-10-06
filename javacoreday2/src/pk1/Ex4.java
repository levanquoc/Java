package pk1;

import java.util.Random;

public class Ex4 {
	public static void main(String[] args) {
	Random rd=new Random();
	//khai bao de lay sao ngau nhien
	int number1=rd.nextInt(21);
	int number2=rd.nextInt(21);
	int sum=number1+number2;
	System.out.println("Number 1: "+number1);
	System.out.println("Number 2 :"+number2);
	System.out.println("Sum: "+sum);
	
	
	}

}

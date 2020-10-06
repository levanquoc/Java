package pk1;

import java.util.Scanner;

public class Ex10 {
public static void main(String[] args) {
	//viet chuong trinh 1 nhap vao 1 so int [5:20]
	//kiem tra so do la chan hay le
	Scanner input =new Scanner(System.in);
	int number;
	do {
		System.out.println("Nhap vap so :");
		 number=Integer.parseInt(input.nextLine());

	}while(number<5 || number>20);
	if (number%2==0)
	{
		System.out.println("so chan");
	}
	else {
		System.out.println("So le");
	}
}
}

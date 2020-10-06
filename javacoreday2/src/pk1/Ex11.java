package pk1;

import java.util.Random;
import java.util.Scanner;

public class Ex11 {
public static void main(String[] args) {
	// viet chuong trinh game nhu sau
	// May tao ra Doi A gom 3 so ngau nhien tu 1-9.
	//Sau do hien thi 1 so ngau nhien cho doi b
	//May tao ra doi B gom 3 so nhap tu 3 phim
	//Sao cho tong 3 so doi B>3 tong so Doi A
	// vi du doi A tong la 8 thi doi b tong la 11
	Random rd=new Random();
	int number1=rd.nextInt(9)+1;
	int number2=rd.nextInt(9)+1;
	int number3=rd.nextInt(9)+1;
	int sum=number1+number2+number3;
	int sum1;
	int d=0;
	int so1,so2,so3;
	System.out.println("Number1 :" +number1);
	System.out.println("Number2 :" +number2);
	System.out.println("Number3 :" +number3);
	
	System.out.println("Sum :" +sum);
	Scanner input=new Scanner(System.in);
	do {
		do {
	System.out.println("nhap so 1");
	 so1=Integer.parseInt(input.nextLine());
		}while(so1>sum-2);
	System.out.println("nhap so 2");
	so2=Integer.parseInt(input.nextLine());
	System.out.println("nhap so 3");
	 so3=Integer.parseInt(input.nextLine());
	sum1=so1+so2+so3;
	d++;
	}while(sum1-sum!=3 && d<3);
}
}

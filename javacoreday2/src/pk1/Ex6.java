package pk1;

import java.util.Scanner;

public class Ex6 {
public static void main(String[] args) {
	Scanner input= new Scanner(System.in);
	System.out.println("Nhap vao ho ten: ");
	String ten=input.nextLine();
	System.out.println("Nhap vao tuoi:");
	int tuoi=input.nextInt();
	System.out.println("Ho ten :"+ten);
	System.out.println("tuoi:"+tuoi);
	//dong ket noilE
	input.close();
	
}
}

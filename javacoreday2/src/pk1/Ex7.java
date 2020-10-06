package pk1;

import java.util.Scanner;

public class Ex7 {
public static void main(String[] args) {
	Scanner input= new Scanner(System.in);
	System.out.println("Nhap vao ho ten: ");
	String ten=input.nextLine();
	System.out.println("Nhap vao so ao:");
	int soAo=Integer.parseInt(input.nextLine());
	System.out.println("Nhap vao quoc tich:");
	
	String quocTich=input.nextLine();
	System.out.println("Ho ten :"+ten);
	System.out.println("So ao:"+soAo);
	System.out.println("Quoc tịch:"+quocTich);//Enter
	//dong ket noilE
	input.close();
	
}
}

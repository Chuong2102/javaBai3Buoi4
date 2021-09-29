package BaiTap3Buoi4;
import java.util.Scanner;
public class Bai3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int a;
		int temp;
		int s = 0;
		
		System.out.println("Nhap a");
		a = input.nextInt();
		while(a != 0)
		{
			temp = a%10;
			s += temp;
			a /= 10;
		}
		
		System.out.println("Tong la :" + s);
	}

}

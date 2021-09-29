package BaiTap3Buoi4;
import java.util.Scanner;
public class Bai1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double f,c;
		Scanner input = new Scanner(System.in);
		
		System.out.println("Nhap do F");
		f = input.nextDouble();
		c = (f-32)/1.8;
		
		System.out.println("Do F: "+ f +" Do C: " +c);
		
	}

}

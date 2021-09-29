package BaiTap3Buoi4;
import java.util.Scanner;
public class Bai2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		double inch, meter;
		
		System.out.println("Nhap inch");
		inch  = input.nextDouble();
		meter = inch * 0.0254;
		
		System.out.println("Inch: " + inch + " Meter: "+meter);
	}

}

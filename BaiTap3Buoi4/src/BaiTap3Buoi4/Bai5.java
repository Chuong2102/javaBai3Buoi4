package BaiTap3Buoi4;
import java.util.Scanner;
public class Bai5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		double met,gio,phut,giay;
		double sM;
		double sK;
		double v;
		System.out.println("Nhap quang duong");
		sM = input.nextDouble();
		sK = sM/1000;
		System.out.println("Nhap quang gio");
		gio = input.nextDouble();
		System.out.println("Nhap quang phut");
		phut = input.nextDouble();
		System.out.println("Nhap quang giay");
		giay = input.nextDouble();
		
		
		v = sM/(gio*3600+phut*60+giay);
		System.out.println("Speed m/s: " + v);
		v = sK/(gio+(phut/60)+(giay/3600));
		System.out.println("Speed km/h: " + v);
		v = (sM/1609)/(gio+(phut/60)+(giay/3600));
		System.out.println("Speed miles/h: " + v);
	}

}

package BaiTap3Buoi4;
import java.util.Scanner;
public class Bai4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int m;
		int day, year;
		System.out.println("Nhap so phut");
		m = input.nextInt();
		
		day = m/(60*24);
		year = day/365;
		
		System.out.println(m +" minutes appproximately "+ year +" years and " + day + " days");
		
	}

}

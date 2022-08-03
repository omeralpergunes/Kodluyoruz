package deneme1;

import java.util.Scanner;
public class dikucgenprogram {

	public static void main(String[] args) {
		
		int a,b,c;
		double cevre, alan, u;

		
		Scanner girdi = new Scanner(System.in);
		System.out.print("1. Kenarı Giriniz : ");
		a = girdi.nextInt();
		System.out.print("2. Kenarı Giriniz : ");
		b = girdi.nextInt();
		System.out.print("3.Kenarı Giriniz:");
		c= girdi.nextInt();
		
		u=(a+b+c)/2;
		cevre = u*2;
		
		alan = u*(u-a)*(u-b)*(u-c);
		
		 System.out.println("Üçgein çevresi: " + cevre);
	     System.out.println("Üçgenin alanı: " + alan);
		
	}	

}

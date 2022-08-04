package deneme1;

import java.util.Scanner;

public class dairealanvecevre {

	public static void main(String[] args) {

		int r;
		double a;
		double area;
		double pi=3.14;
		
		Scanner inp = new Scanner(System.in);
		
		System.out.print("Dairenin Yarı çapını giriniz: ");
		r=inp.nextInt();
		System.out.print("Merkez açısının ölçüsünü giriniz: ");
        a = inp.nextDouble();
		
		double alan = pi*r*r;
		double cevre = 2* pi*r;
		area = (pi * (r * r) * a)/360;
		
		System.out.println("Dairenin Alanı: " + alan);
		System.out.println("Dairenin Çevresi: " + cevre);
		System.out.println("Dairenin Diliminin Alanı: " + area);

	}

}

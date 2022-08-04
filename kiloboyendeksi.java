package deneme1;

import java.util.Scanner;

public class kiloboyendeksi {

	public static void main(String[] args) {

		
		Scanner inp = new Scanner(System.in);
		System.out.print("Boyunuzu giriniz: ");
		double boy = inp.nextDouble();
		
		System.out.print("Kilonuzu giriniz:");
		double kilo = inp.nextDouble();
		
		double vukiend = kilo/(Math.pow((boy/100),2));
        System.out.println("Vücüt kütle indeksiniz: " + vukiend);

		
		
	}
}

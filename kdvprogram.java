package deneme1;

import java.util.Scanner;

public class kdvprogram {

	public static void main(String[] args) {
		
        Scanner input = new Scanner(System.in);
		double tutar, kdvtutar, kdvdahil, kdv = 0.18;
		
		System.out.print("Fiyat  Giriniz: ");
		tutar = input.nextDouble();
		
		kdvtutar=tutar*kdv;
		kdvdahil = kdvtutar + tutar;
		
		 System.out.println("KDV'siz tutar : " + tutar);
	     System.out.println("KDV Oranı: " + kdv);
	     System.out.println("KDV'li tutar: " +kdvdahil);
	     System.out.println("KDV tutarı: " + kdvtutar);
	}

}

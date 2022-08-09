package deneme1;

import java.util.Scanner;

public class odevminmax {

	public static void main(String[] args) {

		Scanner inp = new Scanner(System.in);
		System.out.print("Kac tane sayı gireceğinizi yazınız");
		int girSayi = inp.nextInt();
		int sayi, bSayi=0, kSayi=0;
		int i =1;
		int num;
		
		for(i=1; i<=girSayi; i++) {
			System.out.print(i + "Sayı Giriniz: ");
			num = inp.nextInt();
			
			if(i==1) {
				bSayi= num;
				kSayi = num;
			}
			
			if(num>bSayi) {
				bSayi = num;
			}
			if(num<kSayi) {
				kSayi=num;
			}
			
		}
		  System.out.println("Sonuç - En buyuk sayi: " + bSayi);
	        System.out.println("Sonuç - En kucuk sayi: " + kSayi);
	}

}

package deneme1;

import java.util.Scanner;

public class kombinasyonhesapla {

	public static void main(String[] args) {

		Scanner inp = new Scanner(System.in);
		
		int sayi1=1, sayi2=1, sayi3=1, n, r, sonuc=0;
		
		System.out.print("N sayisini giriniz: ");
		n=inp.nextInt();
		
		System.out.print("R sayisini giriniz: ");
		r=inp.nextInt();
		
		for(int i=1; i<=n; i++) {
			sayi1*=i;
		}
		for(int i=1; i<=r; i++) {
			sayi2*=i;
		}
		for(int i=1; i<=(n-r);i++) {
			sayi3*=i;
		}
		sonuc = (sayi1/(sayi2*sayi3));
		System.out.print("Kombinasyon " + sonuc);
	}

}

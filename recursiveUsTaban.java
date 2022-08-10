package deneme1;

import java.util.Scanner;

public class recursiveUsTaban {

	
	static int hesapla() {
		Scanner scan = new Scanner(System.in);
		System.out.print("Tabani Giriniz: ");
		int taban = scan.nextInt();
		System.out.print("Ussu Giriniz: ");
		int us = scan.nextInt();
		
		int result=1;
		
		for(int i=1; i<= us; i++) {
			result = result * taban;
			if(us==0) {
				return 1;
			}
		}
		System.out.print("Sonuc => " + result);
		return result;
	}
	
	public static void main(String[] args) {
		hesapla();
		
	}

}

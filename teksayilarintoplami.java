package deneme1;

import java.util.Scanner;

public class teksayilarintoplami {

	public static void main(String[] args) {

		int k;
		int total=0;
		
		Scanner scan = new Scanner(System.in);
		
		do {
		System.out.print("Sayı Giriniz: ");
		k= scan.nextInt();
		if(k%2==0 && k%4==0) {
			total = total + k;
		}
		}while(k % 2 == 0); 
		 
		System.out.print("Toplam: " + total);
		
	}

}

package deneme1;

import java.util.Scanner;
public class tekciftprogram {

	public static void main(String[] args) {
		
		int k; 
		Scanner inp = new Scanner(System.in);
		
		System.out.print("Sayı Giriniz: " );
		
		k= inp.nextInt();
		
		int tot = 0,  numCyc=0;
		double avarage;
		
		for(int i=0; i<=k; i++) {
			if(i%3==0 && i%4==0 && i>0) {
				tot = tot + i;
				numCyc++;
			}
		}
		
		avarage = tot / numCyc;
		System.out.print("Java döngüler ile 0'dan girilen sayıya kadar olan sayılardan 3 ve 4'e tam bölünen sayıların ortalaması: " + avarage);
	}

}

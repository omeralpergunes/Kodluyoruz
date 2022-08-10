package deneme1;

import java.util.Scanner;

public class recursiveAsalSayiProgrami {
	
	static void asal(int n, int i) {
		if(i==n) {
			System.out.println(n + " Bu bir asal sayıdır ");
			return;
		}
		
		else if (n%i==0){
			System.out.println(n + " Bu bir asal sayı değildir");
			return;
		}
		asal(n,i+1);
	}	
	
	
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Sayi Giriniz: ");
		int n = scan.nextInt();
		asal(n,2);
		
	}

}

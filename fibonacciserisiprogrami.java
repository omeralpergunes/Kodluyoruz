package deneme1;

import java.util.Scanner;

public class fibonacciserisiprogrami {

	public static void main(String[] args) {

		int a=0, b=1, total=0;
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Sayı Giriniz.");
		int num = scan.nextInt();
		
		for(int i=1; i<=num; i++) {
			total = a+b;
			System.out.print(a + "+" + b + " = " + total);
			
			a=b;
			b=total;
		}
		System.out.println();
		
	}

}

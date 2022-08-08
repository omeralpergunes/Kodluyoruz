package deneme1;

import java.util.Scanner;

public class harmoniksayi {

	public static void main(String[] args) {

		Scanner inp = new Scanner(System.in);
		System.out.print("N Sayısını Giriniz: ");
		
		int n = inp.nextInt();
		
		double result = 0.0;
		
		for(double i=1; i<=n; i++) {
			result += (1/i);
		}
		System.out.print(result);
	}

}

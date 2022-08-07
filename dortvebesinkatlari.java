package deneme1;

import java.util.Scanner;
public class dortvebesinkatlari {

	public static void main(String[] args) {

		int number;
		Scanner inp = new Scanner(System.in);
		System.out.print("Sınır Sayısı Giriniz: ");
		number=inp.nextInt();
		
		for(int i=1;i<=number;i*=4) {
			System.out.println(i + " ");
		}
	
		for(int i=1; i<=100; i*=5) {
			System.out.println(i + " ");

		}
	}

}

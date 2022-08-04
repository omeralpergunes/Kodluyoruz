package deneme1;

import java.util.Scanner;
public class calculator {

	public static void main(String[] args) {

		int n1, n2, select;
		Scanner input = new Scanner(System.in);
		System.out.print("İlk Sayıyı Giriniz:	" );
		n1 = input.nextInt();
		System.out.print("İkinci Sayıyı Giriniz:	" );
		n2 = input.nextInt();
		

        System.out.println();
        System.out.println("1-) Toplama\n2-) Çıkarma\n3-) Çarpma\n4-) Bölme");
        System.out.println();
        System.out.print("Seçiminiz: ");
        select = input.nextInt();
        System.out.println();
		
        switch(select) {
        
        case 1 -> System.out.print("Toplam " + (n1+n2));
        case 2 -> System.out.print("Çıkarma " + (n1-n2));
        case 3 -> System.out.print("Çarpma " + (n1*n2));
        default -> System.out.print("Bölme " + (n1/n2));
        }
	}

}

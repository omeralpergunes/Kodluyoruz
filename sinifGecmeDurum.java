package deneme1;

import java.util.Scanner;
public class sinifGecmeDurum {

	public static void main(String[] args) {

		   double mat, fizik, turkce, kimya, muzik, ortalama = 0, sayac = 0;

	        Scanner input = new Scanner(System.in);
	        System.out.print("Matematik puanınız: ");
	        mat = input.nextDouble();

	        while (mat < 0 || mat > 100) {
	            System.out.println("0 ile 100 arasında bir değer girin.");
	            System.out.print("Matematik puanınız: ");
	            mat = input.nextDouble();
	        }
	        	ortalama += mat;
	            sayac += 1;

	        System.out.print("Fizik puanınız: ");
	        fizik = input.nextDouble();

	        while (fizik < 0 || fizik > 100) {
	            System.out.println("0 ile 100 arasında bir değer girin. ");
	            System.out.print("Fizik puanınız: ");
	            fizik = input.nextDouble();
	        }
	        	ortalama += fizik;
	            sayac += 1;

	        System.out.print("Türkçe puanınız: ");
	        turkce = input.nextDouble();

	        while (turkce < 0 || turkce > 100) {
	            System.out.println("0 ile 100 arasında bir değer girin. ");
	            System.out.print("Türkçe puanınız: ");
	            turkce = input.nextDouble();
	        }
	        	ortalama += turkce;
	            sayac += 1;

	        System.out.print("Kimya puanınız: ");
	        kimya = input.nextDouble();

	        while (kimya < 0 || kimya > 100) {
	            System.out.println("0 ile 100 arasında bir değer girin. ");
	            System.out.print("Kimya puanınız: ");
	            kimya = input.nextDouble();
	        }
	        	ortalama += kimya;
	            sayac += 1;

	        System.out.print("Müzik puanınız: ");
	        muzik = input.nextDouble();

	        while (muzik < 0 || muzik > 100) {
	            System.out.println("0 ile 100 arasında bir değer girin. ");
	            System.out.print("Müzik puanınız: ");
	            muzik = input.nextDouble();
	        }
	        	ortalama += muzik;
	            sayac += 1;

	            ortalama = ortalama / sayac;

	        System.out.println("Not ortalamanız: " + ortalama);

	        if (ortalama < 55) {
	            System.out.println("Sınıfta kaldınız. Seneye Tekrar Görüşmek üzere");
	        } else {
	            System.out.println("Sınıfı geçtiniz! Tebrikler!");
	        }
	    }


		

	}

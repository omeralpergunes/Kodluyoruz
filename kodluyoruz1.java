package deneme1;

import java.util.Scanner;

public class kodluyoruz1 {

	public static void main(String[] args) {
	
		int matematik, fizik, kimya, türkçe, tarih, müzik;
		
		Scanner ort = new Scanner(System.in);
		System.out.print("Matematik Notu");
		matematik = ort.nextInt();
		
		System.out.print("Fizik Notu");
		fizik = ort.nextInt();
		
		System.out.print("Kimya Notu");
		kimya = ort.nextInt();
		
		System.out.print("Türkçe Notu");
		türkçe = ort.nextInt();
		
		System.out.print("Tarih Notu");
		tarih = ort.nextInt();
		
		System.out.print("Müzik Notu");
		müzik = ort.nextInt();
		
		int toplam = (matematik+fizik+kimya+türkçe+tarih+müzik);
		double ortalama = toplam / 6.0;
		
		System.out.print("Ortalama:"+ ortalama);
		
		System.out.println(ortalama>=60? "Sınıfı Geçti" : "Sınıfta Kaldı");
	}

}

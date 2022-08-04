package deneme1;

import java.util.Scanner;

public class meyvekgfiyat {

	public static void main(String[] args) {

		double armut = 2.14, elma = 3.67, domates = 1.11, muz = 0.95, patlican = 5.00;
		double arki, elki, doki, muzki, patki, toptutar;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Armut Kaç Kilo?");
		arki = scanner.nextDouble();
		armut = armut * arki;
		
		System.out.print("Elma Kaç Kilo?");
		elki = scanner.nextDouble();
		elma = elma * elki;


        System.out.println("Domates Kaç Kilo ? :");
        doki= scanner.nextDouble();
        domates= domates*doki;

        System.out.println("Muz Kaç Kilo ? :");
        muzki= scanner.nextDouble();
        muz= muz*muzki;

        System.out.println("Patlıcan Kaç Kilo ? :");
        patki= scanner.nextDouble();
        patlican= patlican*patki;

        toptutar= armut+elma+domates+muz+patlican;
        System.out.println("Toplam Tutar : "+toptutar+ "Türk Lirası");

		
	}

}

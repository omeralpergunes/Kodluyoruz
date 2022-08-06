package deneme1;

import java.util.Scanner;

public class artikyilprogrami {

	public static void main(String[] args) {

		int year;
		boolean leapYear=false;
		
		Scanner inp = new Scanner(System.in);
		System.out.print("Yil Giriniz: ");
		year=inp.nextInt();
		
		if(year%4==0) {
			if(year%100==0) {
				if(year%400==0) {
					leapYear=true;
				}
				else {
					leapYear=false;
				}
			}else {
				leapYear=true;
			}
		}else {
			leapYear=false;
		}
		if(leapYear) {
			System.out.print(year + " / Girmis oldugunuz yil artik bir yildir");
		}else {
			System.out.print(year + " / Girmis oldugunuz yil artik bir yil degildir");
		}
	}

}

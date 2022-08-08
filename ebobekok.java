package deneme1;

import java.util.Scanner;

public class ebobekok {

	public static void main(String[] args) {

		int s1, s2;
		boolean a = false;
		
		Scanner scan = new Scanner(System.in);
		
		do {
			System.out.print("1. Sayiyi  Giriniz: ");
			s1 = scan.nextInt();
		
			System.out.print("2. Sayiyi Giriniz: ");
			s2=scan.nextInt();
		
			if(s1<=0 || s2<=0){
		
			System.out.print("Pozitif bir değer giriniz");
			
			
		}else {
			a = true;
		}
		}
		while(!a);
		if(s2<s1) {
			int tS2= s2;
			s2=s1;
			s1=tS2;
		}
		int ebob = s1;
		while(ebob>=1) {
			if((s1%ebob == 0 ) && (s1%ebob==0)) {
				System.out.print("Ebob:  " + ebob);
				break;
			}else {
				ebob--;
			}
		}
		
		int ekok = s2;
        while (ekok <= (s1 * s2)) {
            if ((ekok % s1 == 0) && (ekok % s2 == 0)) {
                System.out.println("Ekok : " + ekok);
                break;
            } else {
            	ekok++;
            }
        }}}
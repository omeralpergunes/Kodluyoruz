package deneme1;

import java.util.Scanner;

public class deseneGoreMetotOlusturma {

	static int negativeNumber(int x) {
		if(x<=0) {
			return x;
		}
		
		else {
			System.out.print(x + " ");
			int negative = negativeNumber(x-5);
			return negative;
		}
		
	}
	
	static int positiveNumber(int x, int y) {
		if(x>y) {
			return x;
		}
		else {
			System.out.print(x + " ");
			return positiveNumber(x+5,y);
			
		}
	}

	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		while(true) {
			System.out.print("Sayi Giriniz: ");
			int sayi = scan.nextInt();
			
			positiveNumber(negativeNumber(sayi),sayi);
			
			if(sayi==0) {
				break;
			}
			System.exit(sayi);
			}
		}
		
		
	}



package deneme1;

import java.util.Arrays;
import java.util.Scanner;

public class diziElemanSiralama {

	public static void main(String[] args) {

		Scanner inp = new Scanner (System.in);
		System.out.print("Eleman sayisini giriniz: ");
		int elSay = inp.nextInt();
		
		int [] list = new int [elSay];
		
		for(int i=0; i<elSay;i++) {
			System.out.print((i+1)+ ". Eleman: ");
			list[i]=inp.nextInt();
		}
		Arrays.sort(list);
		System.out.print("Siralamamiz: " + Arrays.toString(list));
		
	}

}

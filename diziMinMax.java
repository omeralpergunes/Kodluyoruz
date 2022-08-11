package deneme1;

import java.util.Arrays;
import java.util.Scanner;

public class diziMinMax {
	   public static void main(String[] args) {

	        int[] list = {15,12,788,1,-1,-778,2,0};
	        Arrays.sort(list);

	        Scanner input = new Scanner(System.in);
	            System.out.print("Sayi giriniz: ");
	            int sayi = input.nextInt();

	        for (int i = 0; i < list.length; i++){

	            if (sayi < list[i]){
	                System.out.println("Girilen sayidan buyuk en yakin sayi : " + list[i]);
	                System.out.println("Girilen sayidan kucuk en yakin sayi : " + list[i-1]);
	                break;
	            }


	        }
	    }

}















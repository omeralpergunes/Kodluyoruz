package deneme1;

import java.util.Scanner;

public class elmasprogram {

	public static void main(String[] args) {

		Scanner klavye = new Scanner(System.in);
        System.out.println("Sayı Giriniz :");
        int n = klavye.nextInt();

        for (int i = 0; i <= n ; i++) {
            for (int j = 0; j < (n - i); j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= (i*2) - 1; k++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }
        for(int a=1; a<n; a++) {
        	for(int b=1; b<=a-1; b++) {
        		System.out.print(" ");
        		
        	}
        	for(int c=1; c<=(2*n - (2*a -1)); c++) {
        		System.out.print("*");
        	}
        	System.out.println();
        }
        
      
        	


    }}

	


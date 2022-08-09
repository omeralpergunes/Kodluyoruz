package deneme1;

import java.util.Scanner;

public class tersucgenyapimi {

	public static void main(String[] args) {

		Scanner klavye = new Scanner(System.in);
        System.out.println("Sayı Giriniz :");
        int n = klavye.nextInt();
	
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

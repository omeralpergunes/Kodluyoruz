package deneme1;

import java.util.Scanner;

public class arrayTranspose {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.print("Satir sayisini giriniz => ");
		int satir = input.nextInt();
		System.out.print("Sutun sayisini giriniz => ");
		int sutun = input.nextInt();
	
		
		int[][] matris = new int [satir] [sutun];
		int[][] transpose = new int [sutun] [satir];
		
		
		//For döngülerini kullanıyoruz
		for(int i=0; i<matris.length;i++) {
			for(int k=0; k < matris[i].length;k++) {
				System.out.print("Satir => " + i + " / Sutun " + k + " deger giriniz => ");
				matris[i][k]=input.nextInt();
			}
			
		}
		for(int i=0; i< matris.length;i++) {
			for(int k=0; k<matris[i].length;k++) {
				transpose[k][i]=matris[i][k];
			}
		}
		
		for(int i=0; i<transpose.length; i++) {
			for(int k=0; k<transpose[i].length;k++) {
				System.out.print(transpose[i][k] + " ");
			}
			System.out.println();
		}
	}

}

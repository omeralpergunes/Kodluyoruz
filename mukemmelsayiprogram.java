package deneme1;

import java.util.Scanner;

public class mukemmelsayiprogram {

	public static void main(String[] args) {
		
		int n; 
		Scanner scan= new Scanner(System.in);
		n = scan.nextInt();
		
		int total=0;
		
		for(int i=1; i<n;i++) {
			if(n%i==0) {
				total+=i;
			}
		}
		if(n==total) {
			System.out.print("Bu bir mükemmel sayıdır");
		}
		else {
			System.out.print("Bu bir mükemmel sayı değildir.");
		}
			
				
		
	}

}

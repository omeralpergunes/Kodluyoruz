package deneme1;

public class asalsayiprogrami {

	public static void main(String[] args) {

		for(int i=2; i<=100;i++) {
			int s=0;
			
			for(int k=2; k<i; k++) {
				if(i%k==0) {
					s++;
				}	
			}
			if(s==0) {
				System.out.println(i+ " ");
			}
			
		}
	}

}

package deneme1;

public class harmonikOrtalama {

	public static void main(String[] args) {

		int [] list = {1, 2, 3, 4, 5, 6, 7, 8, 9};
		
		double sum=0;
		
		for(double i: list) {
			sum += 1/i;
		
		}
		
		System.out.print(sum);
	}

}

package deneme1;

import java.util.Arrays;

public class tekrarCiftSayi {

	static boolean isFind(int [] arr, int value) {
		for(int i:arr) {
			if(i==value) {
				return true;
			}
		}
		
		return false;
	}
	
	public static void main(String[] args) {

		int[] list = {8,8,5,5,4,6,4,6,7};
		int [] inputs = new int[list.length];
		int startIndex = 0;
		
		
		for(int i=0; i<list.length; i++) {
			for(int j=0; j<list.length;j++) {
				if(i!=j && (list[i] == list[j])) {
					if(!isFind(inputs , list[i])) {
					
						inputs[startIndex++]=list[i];
				}
					break;
		}
	}
			for(int n : inputs) {
				if((n !=0) && (n%2==0)) {
					System.out.print(n);
				}
			}
			}

	}
	

	}

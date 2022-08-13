package deneme1;

import java.util.Scanner;

public class palindromProgram {
	
    static Scanner scan =new Scanner(System.in);

    static boolean isPalindrom(String chr){
        int i=0;
        int j=chr.length()-1;
        while (i<j){
            if (chr.charAt(i) != chr.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
    public static void main(String[] args) {
    	
        System.out.print("Lütfen bir kelime giriniz.:");
        String deger= scan.nextLine();
        if (isPalindrom(deger)){
            System.out.println("Girmis olduğunuz kelime bir polindromdur.");
        }
        else {
            System.out.println("Girmis oldugunuz kelime polindrom değildir.");
        }

    }
}
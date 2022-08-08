package deneme1;
import java.util.Scanner;

public class armstrongsayi {

	public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        
        int number;
        
        System.out.print("Sayı giriniz : ");
        
        number = scanner.nextInt();
        
        int tempNumber = number;
        
        int basamakValue;
        
        int result = 0;
        
        while(tempNumber != 0){
            basamakValue = tempNumber % 10;
            result += basamakValue;
            tempNumber = tempNumber /10;
        }
        System.out.println("Girmiş olduğunuz sayının rakamları toplamı: " + result);


    }
}



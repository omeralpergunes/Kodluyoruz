package deneme1;

import java.util.Scanner;

public class ucakbiletiprogram {

	public static void main(String[] args) {
	     int distance = 0, age, tripType;
	        double normCost = 0;

	        Scanner input = new Scanner(System.in);

	        System.out.print("Mesafeyi giriniz(KM cinsinden): ");
	        distance = input.nextInt();

	        System.out.print("Yasinizi giriniz: ");
	        age = input.nextInt();

	        System.out.print("Yolculuk durumunu giriniz(1-) Tek Yon, 2-) Gidis-Donus): ");
	        tripType = input.nextInt();

	        if (distance > 0){
	            normCost = distance * 0.1;
	        }
	        else{
	            System.out.println("Mesafeyi ölçmek için geçerli bir değer giriniz");
	        }

	        if (age > 0){
	            if (age < 12){
	            	normCost -= (normCost * 0.50);
	            }
	            else if((age >= 12) && (age <=24)){
	            	normCost -= (normCost * 0.10);
	            }
	            else if(age >65){
	            	normCost -= (normCost * 0.30);
	            }
	        }
	        else{
	            System.out.println("Yas icin uygun deger giriniz");
	        }

	        if ((tripType == 1) || (tripType == 2)){
	            if (tripType == 2){
	            	normCost -= (normCost * 0.20);
	            	normCost *= 2;
	            }
	        }
	        else{
	            System.out.println("Yolculuk şekli için 1 ve 2 değerlerinden birini seçiniz");
	        }

	        System.out.println("Toplam tutar: " + normCost + " TL");
	    }
	}

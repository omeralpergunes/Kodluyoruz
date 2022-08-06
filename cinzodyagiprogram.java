package deneme1;

import java.util.Scanner;

public class cinzodyagiprogram {

	public static void main(String[] args) {

		int birthYear;
		Scanner input = new Scanner(System.in);
		
		System.out.print("Doğum Yılını Giriniz: ");
		birthYear = input.nextInt();
		
		switch(birthYear%12) {
		case 0 : System.out.println("Burcunuz: " + "Maymun ");
		case 1 : System.out.println("Burcunuz: " + "Horoz ");
		case 2 : System.out.println("Burcunuz: " + "Köpek ");
		case 3 : System.out.println("Burcunuz: " + "Domuz ");
		case 4 : System.out.println("Burcunuz: " + "Fare ");
		case 5 : System.out.println("Burcunuz: " + "Öküz ");
		case 6 : System.out.println("Burcunuz: " + "Kaplan ");
		case 7 : System.out.println("Burcunuz: " + "Tavşan ");
		case 8 : System.out.println("Burcunuz: " + "Ejderha ");
		case 9 : System.out.println("Burcunuz: " + "Yılan ");
		case 10 : System.out.println("Burcunuz: " + "At ");
        case 11 : System.out.println("Burcunuz: " +" Koyun");
           	break;
		
		default: System.out.println("Girmiş olduğunuz yıl hatalıdır");
		}
		
	}

}

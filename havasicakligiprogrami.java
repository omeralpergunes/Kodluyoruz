package deneme1;
import java.util.Scanner;

public class havasicakligiprogrami {

	public static void main(String[] args) {

		Scanner inp = new Scanner(System.in);

        int heat;

        System.out.print("Hava Sıcaklığını giriniz: ");
        heat = inp.nextInt();

        if (heat < 25) {
            if (heat >= 15){
                System.out.println("Pikniğe gidebilirsiniz.");
            } else if (heat >= 5) {
                System.out.println("Sinemaya gidebilirsiniz.");
            } else {
                System.out.println("Kayağa gidebilirsiniz.");
            }
        }
        else {
            System.out.println("Yüzmeye gidebilirsiniz.");
        }
    }
}

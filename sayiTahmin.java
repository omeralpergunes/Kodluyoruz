package deneme1;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class sayiTahmin{
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        Random rand = new Random();
        int number = rand.nextInt(100);

        int right = 0;
        int selected;
        int[] wrongSelected = new int[5];
        boolean isWin = false;
        boolean isWrong = false;

        while (right < 5) {
            System.out.print("Tahmin ettiğiniz sayiyi girin =>  ");
            selected = inp.nextInt();

            if (selected < 0 || selected > 100) {
                System.out.println("Lütfen 0-100 arasinda bir deger giriniz.");

                if (isWrong) {
                    right++;
                    System.out.println("Yanlis giriş yaptınız : " + (5 - right));
                } else {
                    isWrong = true;
                    System.out.println("Hakkiniz bir azalmıştır.");
                }
                continue;
            }

            if (selected == number) {
                System.out.println("\nTebrik ederiz. Yapmis oldugunuz tahmin dogrudur! Sayi: " + number);
                isWin = true;
                break;
            } else {
                System.out.println("Yapmis oldugunuz tahmin yanlis.");

                if (selected > number) {
                    System.out.println(selected + " doğru sayidan buyuktur.");
                } else {
                    System.out.println(selected + " doğru sayidan kucuktur.");
                }

                wrongSelected[right] = selected;
                right++;
                System.out.println("Remaining Right: " + (5 - right));
            }
        }

        if (!isWin) {
            System.out.println("Kaybettiniz");
            System.out.println("Tahmin Giriniz: " + number);
            if (!isWrong) {
                System.out.println("Mevcut tahminleriniz : " + Arrays.toString(wrongSelected));
            }
        }
    }
}
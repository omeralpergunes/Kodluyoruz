package deneme1;

import java.util.Scanner;

public class gelismisHesapMakinesi {
	
	public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int select;
        String menu = "1-Toplama Islemi\n" +
                "2-Cikarma islemi\n" +
                "3=Carpma Islemi\n" +
                "4=Bolme Islemi\n" +
                "5-Uslu sayi hesaplama\n" +
                "6-Faktoriyel Hesaplama\n" +
                "7-Diktortgen Alan ve Cevre Hesaplama\n" +
                "8-Mod alma\n" +
                "0-Cikis yap";
        System.out.println(menu);

        do {

            System.out.print("Lutfen Bir Islem Seciniz :");
            select = input.nextInt();
            switch (select) {
                case 1:
                    plus();
                    break;
                case 2:
                    minus();
                    break;
                case 3:
                    times();
                    break;
                case 4:
                    divided();
                    break;
                case 5:
                    power();
                    break;
                case 6:
                    factorial();
                    break;
                case 7:
                    rectangle();
                    break;
                case 8:
                    mod();
                    break;

                case 0:
                    break;
                default:
                    System.out.println("Yanlış bir değer girdiniz, tekrar deneyiniz.");

            }
        } while (select != 0);
    }

    static void plus() {
        Scanner input = new Scanner(System.in);
        int sayi1, sayi2;
        System.out.println("1. Sayiyi Giriniz :  ");
        sayi1 = input.nextInt();
        System.out.println("2. Sayiyi Giriniz :  ");
        sayi2 = input.nextInt();

        int result = (sayi1 + sayi2);
        System.out.println("Toplama isleminin sonucu : " + result);


    }

    static void minus() {
        Scanner input = new Scanner(System.in);
        int sayi1, sayi2;
        System.out.println(" 1. Sayiyi Giriniz :");
        sayi1 = input.nextInt();
        System.out.println(" 2. Sayiyi Giriniz : ");
        sayi2 = input.nextInt();

        int result = (sayi1 - sayi2);
        System.out.println("Cikarma isleminin sonucu : " + result);
    }

    static void times() {
        Scanner input = new Scanner(System.in);
        int sayi1, sayi2;
        System.out.println(" 1. Sayiyi Giriniz : ");
        sayi1 = input.nextInt();
        System.out.println(" 2. Sayiyi Giriniz : ");
        sayi2 = input.nextInt();

        int result = (sayi1 * sayi2);
        System.out.println("Carpma isleminin sonucu : " + result);
    }

    static void divided() {
        Scanner input = new Scanner(System.in);
        double number, number2;
        System.out.println("Payi yazin : ");
        number = input.nextDouble();
        System.out.println("Paydayi degeri yazin : ");
        number2 = input.nextDouble();

        double result = (number / number2);
        if (number2 == 0) {
            System.out.println("Hatali sayi yazdiniz payda 0 olamaz tekrar deneyiniz !");
        } else {
            System.out.println("Bolme isleminin snucu : " + result);
        }


    }
    static void power(){
        Scanner input = new Scanner(System.in);
        int taban, us,result=1;
        System.out.println("Tabani  yazin : ");
        taban = input.nextInt();
        System.out.println("Ussu yazin : ");
        us = input.nextInt();
        for (int i=1;i<=us;i++){
            result*=taban;

        }
        System.out.println(taban+" Ussu " + us + " İsleminin Sonucu : "+result);


    }
    static void factorial(){
        int result=1,num;
        Scanner input=new Scanner(System.in);
        System.out.println("Kac faktoriyel istediginizi girin : ");
        num= input.nextInt();

        for (int i=1;i<=num;i++){
            result*=i;

        }
        System.out.println(num+" Faktoriyel = "+result);

    }
    static void rectangle(){
        double k1,k2;
        Scanner input=new Scanner(System.in);
        System.out.println("Kisa kenari giriniz : ");
        k1= input.nextDouble();
        System.out.println("Uzun kenari giriniz : ");
        k2= input.nextDouble();

        double alan =k1*k2;
        double cevre=(k1+k2)*2;

        System.out.println("Diktortgenin alani : " + alan + " Diktortgenin cevresi : "+cevre );




    }
    static void mod(){
        double n1,n2;
        Scanner input=new Scanner(System.in);
        System.out.println("Modu alinacak sayiyi giriniz : ");
        n1= input.nextDouble();
        System.out.println("Modu  giriniz : ");
        n2= input.nextDouble();

        double result=n1%n2;
        System.out.println(result);


    }


}
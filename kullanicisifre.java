package deneme1;

import java.util.Scanner;

public class kullanicisifre {

	public static void main(String[] args) {
		 String username, password;
	        int newPassword, select;

	        Scanner input = new Scanner(System.in);
	        System.out.print("Kullanıcı Adınızı Girin: ");
	        username = input.nextLine();
	        System.out.print("Şifrenizi Girin: ");
	        password = input.nextLine();

	        boolean kullanici = username.equals("omerg");
	        boolean ksifre = password.equals("1234");

	        if (kullanici && ksifre)
	            System.out.println("Giriş yapıldı.");

	        else if (!kullanici) {
	            System.out.println("Kullanıcı bulunamadı.");
	        }

	        else {
	            System.out.print("Şifreniz yanlış. Yeni şifre almak için 1'e basın.\nSistemden ayrılmak için 0'a basın.\nSeçiminiz: ");
	            select = input.nextInt();

	            switch (select) {
	                case 0 -> {
	                    System.out.println("Sistemden çıkıldı.");
	                    System.exit(0);
	                }
	                case 1 -> {
	                    Scanner inp = new Scanner(System.in);
	                    System.out.print("Yeni şifrenizi girin: ");
	                    newPassword = inp.nextInt();

	                    if (newPassword == 1234) {
	                        System.out.print("Yeni şifreniz eski şifrenizden aynı olmamalıdır. \nTekrardan giriniz");
	                        newPassword = inp.nextInt();
	                        System.out.println("Şifreniz değiştirildi. Yeni şifreniz: " + newPassword);
	                    } else {
	                        System.out.println("Şifreniz değiştirildi. Yeni şifreniz: " + newPassword);
	                    }
	                }
	            }
	        }
	    }
	}

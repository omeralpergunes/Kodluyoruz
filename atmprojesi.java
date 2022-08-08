package deneme1;

import java.util.Scanner;

public class atmprojesi {

	public static void main(String[] args) {

		String userName, password;
		Scanner inp=new Scanner(System.in);
		
		
		int right = 3;
		int balance= 1500;
		int select;
		
		 for(int i=right;i>=0;i--)
	        {
		System.out.print("Kullanici Adiniz: ");
		userName = inp.nextLine();
		
		System.out.print("Sifreniz: ");
		password = inp.nextLine();
	
		
		if(userName.equals("omerg") && password.equals("oag123")) {
			System.out.println("Gunes Bank'a hosgeldiniz.");
			
			do {
				 System.out.println("1-Para Yatirma\n" +
                         "2-Para Cekme\n" +
                         "3-Bakiye Sorgulama\n" +
                         "4-Cikis Yap ");
                 System.out.print("Lutfen yapmak istediginiz islemi seciniz : ");
                 select=inp.nextInt();
                 int price;
			
			switch(select) {
			case 1: 
				System.out.println("Para miktarini giriniz");
				price = inp.nextInt();
				balance+=price; 
				System.out.print("İstediginiz miktar bakiyenize eklenmiştir");
				break;
				
			case 2: 
				System.out.print("Para Cekme");
				price = inp.nextInt();
				if(price>balance) {
					System.out.println("Bakiye yetersiz. Tekrar deneyiniz");
				}else {
					balance-=price;
				}
				break;
				
			case 3:
				System.out.println("Hesabinizdaki Bakiye: " + balance);
				break;
				
			  }
            }while (select!=4);
        System.out.println("Tekrar gorusmek uzere. İyi gunler dileriz.");
        break;
    }
    else
    {
        right--;
        System.out.println("Hatali kullanici adi veya sifre girdiniz. Tekrar deneyiniz.");
        if (right == 0) {
            System.out.println("Hesabiniz bloke olmustur lutfen banka ile iletisime geciniz.");
            break;
        } else {
            System.out.println("Kalan Hakkınız : " + right);
        }
    }}}}

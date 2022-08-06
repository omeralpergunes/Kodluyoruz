package deneme1;

import java.util.Scanner;

public class burclar {

	public static void main(String[] args) {

		String month;
		int day;
		String burc="";
		boolean isError =false;
		
		Scanner inp = new Scanner(System.in);
		System.out.print("Dogdugunuz Ay: ");
		month = inp.nextLine();
		System.out.print("Dogdugunuz Gün: ");
		day = inp.nextInt();
		

        if (month.equals("Ocak")){
            if (day>=1 && day<=31){
                if (day<22){
                    burc = "Oglak";
                }
                else {
                    burc="Kova";

                }
            }else {
                isError=true;
            }
		
		}else if(month.equals("Subat")) {
			if(day>=1 && day <=31) {
				if(day <=19) {
					burc ="Kova";
				}else {
					burc = "Balık";
				}
			}else {
					isError=true;
				}
			}else if(month.equals("Mart")){
				if(day>=1 && day<=31) {
					if(day<=21) {
						burc="Balık";
					}
					else {
						burc="Koc";
					 }

	            }else {
	                isError=true;
	            }
	        } else if (month.equals("Nisan")) {
	            if (day>=1 && day<=30){
	                if (day<=20) {
	                    burc = "Koc";
	                }else {
	                    burc="Boga";
	                }
	            }else {
	                isError=true;
	            }

	        } else if (month.equals("Mayıs")) {
	            if (day>=1 && day<=31){
	                if (day<=21){
	                    burc="Boga";
	                }else {
	                    burc="İkizler";
	                }
	            }else {
	                isError=true;
	            }
	        } else if (month.equals("Haziran")) {
	            if (day>=1 && day<=30){
	                if (day<=22){
	                    burc="İkizler";
	                }else {
	                    burc="Yengec";
	                }
	            }else {
	                isError=true;
	            }
	        } else if (month.equals("Temmuz")) {
	            if (day>=1 && day<=31){
	                if (day<=22){
	                    burc="Yengec";
	                }else
	                    burc="Aslan";
	            }else {
	                isError=true;
	            }
	        } else if (month.equals("Agustos")) {
	            if (day>=1 && day<=31){
	                if (day<=22){
	                    burc="Aslan";

	                }else {
	                    burc="Basak";
	                }
	            }else {
	                isError=true;
	            }
	        } else if (month.equals("Eylül")) {
	            if (day>=1 && day<=30){
	                if (day<=22){
	                    burc="Basak";
	                }else {
	                    burc="Terazi";
	                }
	            }else {
	                isError=true;
	            }
	        } else if (month.equals("Ekim")) {
	            if (day>=1 && day<=31){
	                if (day<=22){
	                    burc="Terazi";
	                }else {
	                    burc="Akrep";
	                }
	            }else {
	                isError=true;
	            }
	        } else if (month.equals("Kasım")) {
	            if (day>=1 && day<=30){
	                if (day<=21){
	                    burc="Akrep";
	                }else {
	                    burc="Yay";
	                }
	            }else {
	                isError=true;
	            }
	        } else if (month.equals("Aralık")) {
	            if (day>=1 && day<=31){
	                if (day<=21){
	                    burc="Yay";

	                }else {
	                    burc= "Oglak";
	                }
	            }else {
	                isError=true;
	            }
	        }

	        if (isError==true){
	        System.out.println("Giriş hatalı");

	        }else {
	            System.out.println("Burcunuz : " + burc);


	        }
	    }

	}

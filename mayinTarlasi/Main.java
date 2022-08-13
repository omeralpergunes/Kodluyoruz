package mayinTarlasi;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		int x,y;
		
		Scanner inp = new Scanner(System.in);
		System.out.print("Satir sayisini giriniz => ");
		x=inp.nextInt();
		System.out.print("Sutun sayisini giriniz => ");
		y=inp.nextInt();
		
        String[][] area = MineSweeper.mineSweeperA(x, y);
        String[][] area1 = MineSweeper.area1(x, y);
        
        MineSweeper.print(area1);
		
		MineSweeper.check(area,area1,x,y);
	}
	}
	
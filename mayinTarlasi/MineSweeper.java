package mayinTarlasi;

import java.util.Random;
import java.util.Scanner;

public class MineSweeper {
    static String[][] mineSweeperA(int m, int n) {
        Random ranNumber = new Random();
        String[][] area = new String[m][n];

        int low = 0;
        int s1 = m;
        int s2 = n;
        int mine = m * n / 4;
        int i = 0;

        while (i < mine) {
            int row = ranNumber.nextInt(m - low) + low;
            int col = ranNumber.nextInt(n - low) + low;
            if (area[row][col] != " * ") {
            	area[row][col] = " * ";
                i++;
            }

        }
        for (i = 0; i < m; i++) {
            for (int k = 0; k < n; k++) {
                if (area[i][k] != " * ") {
                	area[i][k] = " - ";
                }
            }
        }
        return area;
    }

    static void print(String[][] area) {
        for (int i = 0; i < area.length; i++) {
            for (int j = 0; j < area[i].length; j++) {
                System.out.print(area[i][j]);
            }
            System.out.println();
        }
    }

    static String[][] area1(int m, int n) {
        String[][] area1 = new String[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
            	area1[i][j] = " - ";
            }
        }
        return area1;
    }

    static String[][] check(String[][] area, String[][] area1, int x, int y) {
        int mn = x * y / 4;
        int remainder = (x * y) - mn;

        boolean ct = true;

        while (ct) {
            Scanner input = new Scanner(System.in);
            System.out.print("Satir seciniz : ");
            int m = input.nextInt();
            System.out.print("Sutun seciniz : ");
            int n = input.nextInt();

            if (m < 0 ||  m>= x || n< 0 || n >= y){
                System.out.println("Hatali deger girdiniz");
                continue;
            }

                if (area[m][n].equals(" * ")) {
                    System.out.println("<--Kaybettiniz-->");
                    System.out.println("<--Mayin Tarlasi-->");
                    MineSweeper.print(area);
                    ct = false;
                    break;

                } else if (area[m][n].equals(area1[m][n])) {
                    int count = 0;
                    for (int i = -1; i <= 1; i++) {
                        if (((m + i) < 0) || (m + i >= area.length)) {
                            continue;
                        }
                        for (int j = -1; j <= 1; j++) {
                            if (((n + j) < 0) || (n + j >= area.length)) {
                                continue;
                            }
                            if (area[m + i][n + j].equals(" * ")) {
                                count++;
                            }
                        }
                    }
                    area1[m][n] = " " + count + " ";
                    MineSweeper.print(area1);
                    remainder--;
                }
            System.out.println("Mevcut kalan bosluklar : " + remainder);
            if (remainder == 0) {
                System.out.println("Kazandınız");
                break;
            }
        }
        return area;
    }
}
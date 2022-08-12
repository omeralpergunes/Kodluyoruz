public class diziElemanFrekansi {

public static void main(String[] args) {
        int[] arr = {10, 20, 20, 10, 10, 20, 5, 20};
        int[] fre = new int[array.length];

        for (int i = 0; i < array.length; i++)
            fre [i] = 1;

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if ((i != j) && (array[i] == array[j])) {
                    fre[i]++;
                }
            }
        }
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if ((i != j) && (array[i] == array[j])) {
                    arr[j] = 0;
                }
            }
        }

        for (int i = 0; i < array.length; i++) {
            if (fre[i] >= 1) {
                if (array[i] != 0)
                    System.out.println("Sayi=> " + array  [i] + " Tekrar " + fre[i] + " zaman");
            }
        }
    }
}

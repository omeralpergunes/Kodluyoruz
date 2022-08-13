import java.io.*;
import java.util.*;


public class Solution {

    public static void main(String[] args) {
        
        Scanner inp = new Scanner(System.in);
        int n = inp.nextInt();
        int arr [] = new int [n];
        
        for(int i=0;i<n;i++){
            arr[i] = inp.nextInt();
            
        }
        int count=0;
        for(int i=0; i<n;i++){
            int sum=0;
            for(int j=i; j<n;j++){
                sum = sum+arr[j];
                if(sum<0){
                    count++;
                }
            }
    }
    System.out.println(count);
}
}

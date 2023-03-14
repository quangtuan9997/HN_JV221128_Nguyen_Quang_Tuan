package bai3;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[50];
        for (int i = 0; i < 50; i++) {
            arr[i] = (int) Math.round(99 * Math.random()) + 1;
        }
        System.out.println(Arrays.toString(arr));
        int min = arr[0];
        int max = arr[0];
        for (int i = 1; i < 50; i++) {
            if (arr[i] >= max) {
                max = arr[i];
            }
            if (arr[i] <= min) {
                min = arr[i];
            }
        }
        System.out.println("max=" + max);
        System.out.println("min=" + min);
        for (int i = 0; i < 50; i++) {
            for (int j = 0; j < 50; j++) {
                int tem;
                if (arr[i] <= arr[j]) {
                    tem = arr[i];
                    arr[i] = arr[j];
                    arr[j] = tem;
                }
            }
        }
        System.out.println("mảng sau khi được sắp xì:");
        System.out.println(Arrays.toString(arr));
        int cont = 0;
        for (int i = 0; i < 50; i++) {
            int snt = (int) Math.sqrt(arr[i]);
            boolean check=true;
            if (arr[i]==2){
                check= true;
            }
           if(arr[i]==1){
               check= false;
           }
            for (int j=2;j<=snt;j++){
                if(arr[i]%j==0){
                    check= false;
                    break;
                }
            }
            if (check){
                cont++;
            }

        }
        System.out.print("số lần xuất hiện SNT la:"+cont);
    }

}

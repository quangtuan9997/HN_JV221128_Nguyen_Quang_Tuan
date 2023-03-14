package bai2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("nhập vào số cần tính tổng từ 0 đến số đó:");
        int n=scanner.nextInt();
        while (true){
            if (n>=0){
                break;
            }
            System.out.println("vui long nhap lai:");
            n=scanner.nextInt();
        }
        int sum=0;
        for (int i=1;i<=n;i++){
            sum+=i;
        }
        System.out.println("Tong="+sum);
    }
}

package bai1;

import java.time.ZonedDateTime;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        ZonedDateTime zonedDateTime = ZonedDateTime.now();
        int year = zonedDateTime.getYear();
        System.out.print("nhập tuổi của bạn:");
        int n=scanner.nextInt();
        int yearBirth=year-n;
        int can=yearBirth %10;
        int chi=yearBirth %12;
        String canChi="";
        switch (can){
            case 0:
                canChi="Canh";
                break;
            case 1:
                canChi="Tân";
                break;
                case 2:
                    canChi="Nhâm";
                    break;
            case 3:
                canChi="Quý";
                break;
            case 4:
                canChi="Giáp";
                break;
            case 5:
                canChi="Ất";
                break;
            case 6:
                canChi="Bính";
                break;
            case 7:
                canChi="Đinh";
                break;
            case 8:
                canChi="Mậu";
                break;
            case 9:
                canChi="kỷ";
                break;
        }
        switch (chi){
            case 0:
                canChi +=" thân";
                break;
            case 1:
                canChi +=" dậu";
                break;
            case 2:
                canChi +=" tuất";
                break;
            case 3:
                canChi +=" hợi";
                break;
            case 4:
                canChi +=" tý";
                break;
            case 5:
                canChi +=" sửu";
                break;
            case 6:
                canChi +=" dần";
                break;
            case 7:
                canChi +=" mão";
                break;
            case 8:
                canChi +=" thìn";
                break;
            case 9:
                canChi +=" tị";
                break;
            case 10:
                canChi +=" ngọ";
                break;
            case 11:
                canChi +=" mùi";
                break;
        }
        System.out.println(canChi);
    }
}

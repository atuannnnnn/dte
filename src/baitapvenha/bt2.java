package baitapvenha;

import java.util.Scanner;

public class bt2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ho va ten:");
        String name = sc.nextLine();
        System.out.println("Nam sinh:");
        int namSinh = sc.nextInt();
        System.out.println("tuoi:");
        int tuoi = sc.nextInt();
        System.out.println("gioi tinh:");
        String gioitinh = sc.nextLine();
        System.out.println("GPA:");
        double GPA = sc.nextDouble();
        sc.nextLine();
        System.out.println("que quan:");
        String quequan = sc.nextLine();

        System.out.println("name:" + name);
        System.out.println("nam sinh:" + namSinh);
        System.out.println("tuoi:" + tuoi);
        System.out.println("gioi tinh:" + gioitinh);
        System.out.println("GPA:" + GPA);
        System.out.println("que quan:" + quequan);
    }
}

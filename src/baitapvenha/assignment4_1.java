package baitapvenha;

import java.util.Scanner;

public class assignment4_1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so luong phan tu cua mang");
        int n = sc.nextInt();

        float[] arrays = new float[n];
        //Nhap du lieu vao mang
        arrays = importData(arrays);
        // in ra mang sau khi nhap
        System.out.println("Mang sau khi nhap");
        for (float num : arrays) {
            System.out.println(num + "");
        }

    }

    private static float[] importData(float[] arrays) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}

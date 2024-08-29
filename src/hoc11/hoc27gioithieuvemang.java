/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hoc11;

import java.util.Scanner;

/**
 *
 * @author SAO VIET HUE
 */
public class hoc27gioithieuvemang {
    public static void main(String[] args) {
        double mang1[];
        double mang2[];
        
        mang1 = new double[10];
        Scanner sc=new Scanner(System.in);
        for (int i = 0; i < mang1.length; i++) {
            System.out.println("Nhap phan tu thu"+1+":");
            mang1[i]= sc.nextDouble();
        }
        double tong=0;
        for (int i = 0; i < mang1.length; i++) {
            tong+=mang1[i];
            
        }
        System.out.println("Tong :"+tong);
    }
}

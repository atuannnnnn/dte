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
public class hoc11 {
    public static void main(String[] args) {
        System.out.println("Nhap a, b");
        Scanner sc=new Scanner(System.in);
        System.out.println("Nhap vao a:");
        int a=sc.nextInt();
        System.out.println("Nhap vao b:");
        int b=sc.nextInt();
        int tong = a+b;
        System.out.println( a+"+ "+b+"="+tong);
        
        int hieu= a-b;
        System.out.println(a+"-"+b+"="+hieu);
        
        int nhan=a*b;
        System.out.println(a+"*"+b+"="+nhan);
        
        float thuong=(float)a/b;
        System.out.println(a+"/"+b+"="+thuong);
        
        int sodu=a%b;
        System.out.println(a+"%"+b+"="+sodu);
    }
    
}

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
public class hoc14 {
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       int a,b;
        System.out.println("Nhap a=");
        a=sc.nextInt();
        System.out.println("Nhap b=");
        b=sc.nextInt();
        //xuat ket qua so sanh
        System.out.println(a+"="+b+":"+(a==b));
        System.out.println(a+"!="+b+":"+(a!=b));
        System.out.println(a+"<"+b+":"+(a<b));
        System.out.println(a+">"+b+":"+(a>b));
        System.out.println(a+">="+b+":"+(a>=b));
        System.out.println(a+"<="+b+":"+(a<=b));
        
        System.out.println("ca hai so la so chan:"+ (a%2==0 && b%2==0));
        System.out.println("co it nhat 1 so chan:"+ (a%2==0 || b%2==0));
        
        
        
    }
    
}

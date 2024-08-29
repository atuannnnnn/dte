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
public class hoc15 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Nhap a=");
        int a=sc.nextInt();
        
        String ketqua = (a%2==0)?"so chan":"so le";
        System.out.println(a+"la"+ketqua);
        
    }
    
}

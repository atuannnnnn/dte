/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication7;

import static java.time.Clock.system;
import static java.time.InstantSource.system;
import java.util.Scanner;

/**
 *
 * @author SAO VIET HUE
 */
public class nhapdulieutubanphimScanner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ho va ten=");
        String hoVaTen = sc.nextLine();
        System.out.println("Nhap ma so sinh vien=");
        long maSinhVien = sc.nextLong();
        System.out.println("Nhap diem thi=");
        float diemThi = sc.nextFloat();
        System.out.println("Ho va ten=" + hoVaTen);
        System.out.println("Ma sinh vien=" + maSinhVien);
        System.out.println("Diem thi=" + diemThi);
        
        
    }
    
}

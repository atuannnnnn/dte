/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hoc11;

import java.util.Scanner;

public class baitaplop2 {
    public static void main(String[] args) {
        Scanner console =new Scanner(System.in);
        String phrase;
        do {            
            System.out.println("Type your password:");
            phrase=console.next();
        } while (!phrase.equals("AnhTuan"));
    }
    
}

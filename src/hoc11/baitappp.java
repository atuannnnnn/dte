
package hoc11;

import java.util.Scanner;

public class baitappp {
    public static void main(String[] args) {
        int a,b,c;
        Scanner sc=new Scanner(System.in);
        System.out.println("Nhap so a");
        a=sc.nextInt();
        System.out.println("Nhap b");
        b=sc.nextInt();
        System.out.println("Nhap c");
        c=sc.nextInt();
        
        //S = a*(b+c)+b*(a+c);
        int S=a*(b+c)+b*(a+c);
        System.out.println("S=" +S);
    }
    
}

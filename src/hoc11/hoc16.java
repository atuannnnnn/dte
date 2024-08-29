
package hoc11;

import java.util.Scanner;

public class hoc16 {
    public static void main(String[] args) {
        double a,b;
        Scanner sc=new Scanner(System.in);
        System.out.println("Nhap vao so a:");
        a=sc.nextDouble();
        System.out.println("Nhap vao so b:");
        b=sc.nextDouble();
        
        //Ham tri tuyet doi
        System.out.println("|a|="+ Math.abs(a));
        
        //Ham tim min
        System.out.println("min(a,b=" + Math.min(a, b));
        
        //ham tim max
        System.out.println("max(a,b)=0" + Math.max(a, b));
        
        //Ham ceil
        System.out.println("ceil(a)=" + Math.ceil(a));
        
        //Ham floor
        System.out.println("floor(a)="+ Math.floor(a));
        
        //Ham tinh a^b
        System.out.println("a^b=" +Math.pow(0, b));
        
        
    }  
}

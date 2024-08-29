
package hoc11;

import java.util.Scanner;

public class giaiptrinhbacnhatifelse {
    public static void main(String[] args) {
        //PTBN: ax+b=0
        /*
        *Neu a = 0 
        *     Neu b=0  =>PT vo so nghiem
        *     Neu b!=0  =>PT Vo nghiemj
        *Neu a!=0
        *     co nghiem x=-b/a
        */
    double a, b ,x;
    Scanner sc=new Scanner(System.in);
        System.out.println("Nhap a");
        a=sc.nextDouble();
        System.out.println("Nhap b");
        b=sc.nextDouble();
        
        if(a==0){
            //tinh huong a=0
            if(b==0){
                //Tinh huong a=0 va b=0
                System.out.println("Phuong trinh vo so nghiem");
                
        }   if(b!=0){
            //Tinh huong a=0 va b!=0
            System.out.println("Phuong trinh vo nghiem");
            
        }
    }else if(a!=0){
        //tinh huong a !=0
                x=-b/a;
                System.out.println("co nghiem x=" +x);
    }
        
}
}
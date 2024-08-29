
package hoc11;

import java.util.Scanner;

public class hoc18ptrinhbachai {
    public static void main(String[] args) {
        //phuong trinh bac2: ax^2+bx+c=0
        //Cac bien can so:a,b,c,x1,x1,delta
        /* neu a==0 thi bao loi
        *b1:delta =b^2 -4ac
        *b2: kiemtra delta
        *2.1: delta<0 =>phuong trinh vo nghiem
        *2.2: delta == 0 => phuongtrinh co nghiem kep x1=x2=-b/2a
        *2.3: delta>0 =>phuongtrinh co 2 nghiem
        *x1=(-b-sqrt(delta))/(2*a)
        *x2=(-b+sqrt(delta))/(2*a)
        */
    double a,b,c,x1,x2 = 0,delta;
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Nhap a=");
        a=sc.nextDouble();
        System.out.println("Nhap b");
        b=sc.nextDouble();
        System.out.println("Nhap c");
        c=sc.nextDouble();
        
        delta=Math.pow(b, 2) -(4*a*c);
        if(a==0){
            System.out.println("Nhap du lieu sai!");
        } else{
        if(delta<0){
            //tinh huong delta<0
            System.out.println("phuong trinh vo nghiem");
        }else if(delta ==0){
            //tinh huong delta ==0
            x1=x2=-b/(2*a);
            System.out.println("phuong trinh co nghiem kep x1=x2=" +x1);
           
        }else {
            //tinh huong delta>0
            x1= (-b+Math.sqrt(delta))/(2*a);
            x1= (-b-Math.sqrt(delta))/(2*a);
            System.out.println("phuong trinh co nghiem");
            System.out.println("x1=" +x1);
            System.out.println("x2=" +x2);
}
}
}
}
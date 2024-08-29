
package hoc11;

import static java.time.Clock.system;
import java.util.Scanner;

public class baitaplop1 {
    public static void main(String[] args) {
         Scanner console=new Scanner(System.in);
    int sum=0;
    // pull one prompt/read ("post") out of the loop
        System.out.print("Enter a number (-1 to quit):");
        int number=console.nextInt();
        
        while (number !=-1){
            sum=sum+number; //moved to top of loop
            System.out.print("(Enter a number (-1 to quit);");
            number= console.nextInt();
        }
        System.out.println("The total is"+ sum);
    }
   
            
}

package baitapvenha;

import java.util.Random;
import java.util.Scanner;

public class baitapvenha1 {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        Random random=new Random();
        int n=random.nextInt(100)+1;
        System.out.println("Nhap check");
        String check=scanner.nextLine();
        if(check.equalsIgnoreCase("ÿes")){
            if(n%2==0){
                System.out.println(n+"la so chan");
            }
            else{
                System.out.println(n+"la so le");
            }
        }
        else{
            if(n%2==0){
                System.out.println(n+"la so chan");
            }
            else{
                System.out.println(n+"la so le");
            }
        }
    }
}


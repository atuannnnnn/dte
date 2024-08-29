package hoc11;
import java.util.Random;
public class baitaplop3 {
    public static void main(String[] args) {
        Random rand=new Random();
        int r=rand.nextInt();
        if (r==0){
            System.out.println("Rock");
        }else if(r==1){
            System.out.println("Raper");
        }else {//r=2
            System.out.println("Scissors");
        }
    }
    
}

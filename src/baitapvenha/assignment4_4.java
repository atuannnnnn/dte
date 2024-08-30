package baitapvenha;

import static baitapvenha.assingment4_3.findMax2;
import java.util.Arrays;

public class assignment4_4 {
    public static void main(String[] args) {
        float[] arrays={3.5f, 1.2f, 4.7f, 2.8f, 4.0f, 5.0f};//vidu mang
        System.out.println("Mang goc:"+Arrays.toString(arrays));
        float secondMax= findMax2(arrays);
        System.out.println("Gia tri phan tu lon thu hai la: "+(secondMax !=Float.MIN_VALUE? secondMax:"Khong co gia tri lon thu hai"));
        
        System.out.println("Mang sau khi xoa cac phan tu le:"+Arrays.toString(arrays));
    }
    //Phuong thuc tim gia tri lon thu hai
    public static float findMax2(float[] arrays){
        if (arrays== null||arrays.length<2){
            
                IllegalAccessException("Mang phai chua it nhat hai phan tu.");
        }
        float max1 = Float.NEGATIVE_INFINITY;
        float max2 = Float.NEGATIVE_INFINITY;
        
        for (float num: arrays){
            if (num>max1){
                max2=max1;
                max1=max2;
            }else if (num>max2 &&num<max1){
                max2=num;
        }
        }
        if(max2 == Float.NEGATIVE_INFINITY){
            return Float.MIN_VALUE;
        }
        return max2;
    }
    //phuong thuc xoa cac phan tu le
    public static void deleteOddNumber(float[] arrays) throws java.lang.IllegalAccessException{
        if(arrays == null){
            throw new
                IllegalAccessException("Mang khong duoc null.");
        }
        int count = 0;
        for (float num: arrays){
            if (Math.floor(num)%2==0){
                arrays[count++]=num;
            }
        }
        //cat mang ve kich thuoc moi
        arrays =Arrays.copyOf(arrays, count);
        
        //In mang sau khi xoa de kiem tra
        System.out.println("Mang sau khi xoa cac ohan tu le:"+ Arrays.toString(arrays));
    }

    private static void IllegalAccessException(String mang_phai_chua_it_nhat_hai_phan_tu) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
    

    



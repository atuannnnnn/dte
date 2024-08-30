package baitapvenha;

public class assingment4_3 {

    public static void main(String[] args) {
        float[] arrays = {3.5f, 1.2f, 4.7f, 2.8f, 4.7f};
        float secondMax = findMax2(arrays);
        if (secondMax != Float.MIN_VALUE) {
            System.out.println("Gia tri phan tu lon thu hai la:" + secondMax);
        } else {
            System.out.println("Mang khong co du phan tu de xac dinh giatri lon thu hai.");
        }
    }

    public static float findMax2(float[] arrays) {
        if (arrays == null || arrays.length < 2) {
            throw new IllegalArgumentException("Mang phai chua it nhat hai phantu.");
        }
        float max1 = Float.NEGATIVE_INFINITY;
        float max2 = Float.NEGATIVE_INFINITY;

        for (float num : arrays) {
            if (num > max1) {
                max2 = max1;
                max1 = max2;
            } else if (num > max2 && num < max1) {
                max2 = num;
            }
        }
        //neu max2 van la gia tri ban dau thi mang khong co gia tri lon thu hai
        if (max2 == Float.NEGATIVE_INFINITY) {
            return Float.MIN_VALUE;
        }
        return max2;
    }
}

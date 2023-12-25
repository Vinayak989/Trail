package arraypractice;

import java.util.Arrays;

public class LargestNumber {
    public static void main(String[] args) {
        int a[] = {67, 92, 42, 99};
        int temp;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                if (a[i] > a[j]) {
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(a));
        System.out.println("3rd largest: "+a[2]);
    }
}


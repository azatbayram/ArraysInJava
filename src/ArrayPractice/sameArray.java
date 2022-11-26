package ArrayPractice;

import java.util.Arrays;

public class sameArray {

    public static void main(String[] args) {

        int[] array1={2,4,6,8,10};
        int[] array2=array1;

        array1[0]=200;
        array2[4]=500;

        System.out.println(Arrays.toString(array1));
        System.out.println("**********************");
        System.out.println(Arrays.toString(array2));
    }
}

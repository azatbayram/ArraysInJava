package ArrayPractice;

import java.util.Arrays;
import java.util.Scanner;

public class passArray {

    public static void main(String[] args) {

        int[] numbers=new int[4];

        getValues(numbers);

        System.out.println("Here are the numbers that you entered");

        showArray(numbers);

        System.out.println(Arrays.toString(numbers));
    }

    public static void showArray(int[] array) {
        for (int value:array){
            System.out.println(value);
        }
    }

    public static void getValues(int[] array) {

        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter a series of " + array.length + " numbers");

        for (int i=0; i<array.length; i++) {
            System.out.println("Enter number " + (i+1) + ":");
            array[i]=scanner.nextInt();
        }

    }
}

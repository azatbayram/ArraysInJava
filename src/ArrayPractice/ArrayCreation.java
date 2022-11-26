package ArrayPractice;

import java.util.Arrays;

public class ArrayCreation {

    public static void main(String[] args) {

        //1. way
        int[] numbers=new int[5];

        numbers[0]=23;
        numbers[1]=34;
        numbers[2]=76;
        numbers[3]=12;
        numbers[4]=2;

        System.out.println(numbers.length); //shows size of array
        System.out.println(Arrays.toString(numbers)); //we use Arrays.toString() for printing

        //2. way
        String[] days={"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};

        System.out.println(days.length);
        System.out.println(Arrays.toString(days));

    }
}

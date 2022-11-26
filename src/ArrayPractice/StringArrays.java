package ArrayPractice;

import java.util.Arrays;

public class StringArrays {

    public static void main(String[] args) {

        String[] myCars={"Honda", "Mercedes", "BMW", "Toyota", " Ford "};

        System.out.println(myCars[0].length());
        System.out.println(myCars[1].charAt(2));
        System.out.println(myCars[4].trim());
        System.out.println(myCars[2].substring(2, 3));
        System.out.println(myCars[1].equals(myCars[1]));
        System.out.println(myCars[1] == "Mercedes");

        System.out.println("*************************");

        for (int i=0; i<myCars.length; i++) {
            System.out.println(myCars[i].length());
        }

        System.out.println("*************************");

        String str="It will display the array of the size";
        String[] myArray=str.split(" ");

        System.out.println(myArray.length);
        System.out.println(Arrays.toString(myArray));

        for (String word:myArray) {
            System.out.println(word);
        }
    }
}

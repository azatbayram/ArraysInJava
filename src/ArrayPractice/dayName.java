package ArrayPractice;

import java.util.Scanner;

public class dayName {

    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);

        String[] dayName=new String[7];

        dayName[0]="Monday";
        dayName[1]="Tuesday";
        dayName[2]="Wednesday";
        dayName[3]="Thursday";
        dayName[4]="Friday";
        dayName[5]="Saturday";
        dayName[6]="Sunday";

        System.out.println("Enter number of week days:");
        int num=scan.nextInt();
        System.out.println("Today is " + dayName[num-1]);
    }
}

package ArrayPractice;

import java.util.Scanner;

public class monthName {

    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        String[] monthName=new String[12];
        monthName[0]="January";
        monthName[1]="February";
        monthName[2]="March";
        monthName[3]="April";
        monthName[4]="May";
        monthName[5]="June";
        monthName[6]="July";
        monthName[7]="August";
        monthName[8]="September";
        monthName[9]="October";
        monthName[10]="November";
        monthName[11]="December";

        System.out.println("Enter any month number:");
        int num=scan.nextInt();
        System.out.println("The month name is " + monthName[num-1]);
    }
}

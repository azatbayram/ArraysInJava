package ArrayPractice;

import java.util.Scanner;

public class payArray {

    public static void main(String[] args) {

        final int employees=5;
        double payRate;
        double grossPay;

        Scanner sc=new Scanner(System.in);

        int[] hours=new int[employees];

        System.out.println("Enter the hours worked by " + employees + " employees who all earn same horly wage.");

        for(int i=0; i<employees; i++) {

            hours[i]=sc.nextInt();
        }

        System.out.println("Enter the hourly rate for each employee:");
        payRate=sc.nextDouble();

        for(int i=0; i<employees; i++) {

            grossPay=hours[i]*payRate;
            System.out.println("Employee #" + (i+1) + ": $" + grossPay);
        }
    }
}

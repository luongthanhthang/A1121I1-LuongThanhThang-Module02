package b1_Introduction_to_Java.Thuc_hanh;

import java.util.Scanner;

public class LeapYearCalulator {
    public static void main(String[] args) {
        System.out.println("Check Leap Year");
        System.out.print("enter the year: ");
        Scanner scanner=new Scanner(System.in);
        int year=scanner.nextInt();
        if(year%100==0) {
            if(year%400==0) {
                System.out.printf("%d is a leap year",year);
            } else {
                System.out.printf("%d is NOT a leap year",year);
            }
        } else if(year%4==0) {
            System.out.printf("%d is a leap year",year);
        } else {
            System.out.printf("%d is NOT a leap year",year);
        }
    }
}

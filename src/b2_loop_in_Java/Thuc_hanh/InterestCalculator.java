//Ứng dụng tính tiền lãi cho vay
package b2_loop_in_Java.Thuc_hanh;

import java.util.Scanner;

public class InterestCalculator {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter investment amount: ");
        double money=scanner.nextDouble();
        System.out.print("Enter number of months: ");
        int month=scanner.nextInt();
        System.out.println("Enter annual interest rate in percentage: ");
        double interestRate=scanner.nextDouble();
        double totalInterest = 0;
        totalInterest += money * (interestRate/100)/12 * month;
        System.out.println("Total of interest: " + totalInterest);
    }
}

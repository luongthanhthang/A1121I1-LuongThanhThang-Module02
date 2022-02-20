package b1_Introduction_to_Java.Thuc_hanh;

import java.util.Scanner;

public class CalculateTheNumberOfDayInTheMonth {
    public static void main(String[] args) {
        System.out.println("Calculate the number of day in the month");
        System.out.println("Which month that you want to count day?");
        Scanner scanner = new Scanner(System.in);
        int month = scanner.nextInt();
        String dayInMonth;
        switch (month) {
            case 2:
                dayInMonth="28 or 29";
                break;
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                dayInMonth="31";
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                dayInMonth="30";
                break;
            default:
                dayInMonth="";
                break;
        }
        if(!dayInMonth.equals("")) {
            System.out.printf("The month '%d' has %s days!",month,dayInMonth);
        } else {
            System.out.print("Invalid input!");
        }
    }
}

//Ứng dụng đọc số thành chữ
package b1_Introduction_to_Java.Bai_tap;

import java.util.Scanner;

public class NumberIntoLetters {
    public static void main(String[] args) {
        System.out.println("Application to read numbers into letters");
        System.out.println("Enter the number");
        Scanner scanner = new Scanner(System.in);
        String result = "", ones = "", tens = "", hundreds = "";
        int number = scanner.nextInt();
        if (number >= 0 && number < 10) {
            switch (number) {
                case 0:
                    result = "zero";
                    break;
                case 1:
                    result = "one";
                    break;
                case 2:
                    result = "two";
                    break;
                case 3:
                    result = "three";
                    break;
                case 4:
                    result = "four";
                    break;
                case 5:
                    result = "five";
                    break;
                case 6:
                    result = "six";
                    break;
                case 7:
                    result = "seven";
                    break;
                case 8:
                    result = "eight";
                    break;
                case 9:
                    result = "nine";
                    break;
            }
        } else if (number < 20) {
            switch (number % 10) {
                case 4:
                    ones = "four";
                    break;
                case 6:
                    ones = "six";
                    break;
                case 7:
                    ones = "seven";
                    break;
                case 8:
                    ones = "eigh";
                    break;
                case 9:
                    ones = "nine";
                    break;
            }

            switch (number) {
                case 11:
                    result = "elevent";
                    break;
                case 12:
                    result = "twelve";
                    break;
                case 13:
                    result = "thirteen";
                    break;
                case 15:
                    result = "fifteen";
                    break;
                default:
                    result = ones + "teen";
                    break;
            }
        } else if (number < 100) {
            switch (number % 10) {
                case 0:
                    ones = "";
                    break;
                case 1:
                    ones = "one";
                    break;
                case 2:
                    ones = "two";
                    break;
                case 3:
                    ones = "three";
                    break;
                case 4:
                    ones = "four";
                    break;
                case 5:
                    ones = "five";
                    break;
                case 6:
                    ones = "six";
                    break;
                case 7:
                    ones = "seven";
                    break;
                case 8:
                    ones = "eight";
                    break;
                case 9:
                    ones = "nine";
                    break;
            }
            switch (number / 10) {
                case 2:
                    tens = "twenty";
                    break;
                case 3:
                    tens = "thirty";
                    break;
                case 4:
                    tens = "fourty";
                    break;
                case 5:
                    tens = "fifty";
                    break;
                case 6:
                    tens = "sixty";
                    break;
                case 7:
                    tens = "seventy";
                    break;
                case 8:
                    tens = "eightty";
                    break;
                case 9:
                    tens = "ninety";
                    break;
            }
            result = tens + "-" + ones;
        } else if (number < 1000) {
            switch (number / 100) {
                case 1:
                    hundreds = "one";
                    break;
                case 2:
                    hundreds = "two";
                    break;
                case 3:
                    hundreds = "three";
                    break;
                case 4:
                    hundreds = "four";
                    break;
                case 5:
                    hundreds = "five";
                    break;
                case 6:
                    hundreds = "six";
                    break;
                case 7:
                    hundreds = "seven";
                    break;
                case 8:
                    hundreds = "eight";
                    break;
                case 9:
                    hundreds = "nine";
                    break;
            }
            switch ((number % 100) / 10) {
                case 0:
                    tens = "";
                case 1:
                    switch (number % 100) {
                        case 11:
                            tens = "elevent";
                            break;
                        case 12:
                            tens = "twelve";
                            break;
                        case 13:
                            tens = "thirteen";
                            break;
                        case 14:
                            tens = "fourteen";
                            break;
                        case 15:
                            tens = "fifteen";
                            break;
                        case 16:
                            tens = "sixteen";
                            break;
                        case 17:
                            tens = "seventeen";
                            break;
                        case 18:
                            tens = "eighteen";
                            break;
                        case 19:
                            tens = "nineteen";
                            break;
                    }
                    break;
                case 2:
                    tens = "twenty";
                    break;
                case 3:
                    tens = "thirty";
                    break;
                case 4:
                    tens = "fourty";
                    break;
                case 5:
                    tens = "fifty";
                    break;
                case 6:
                    tens = "sixty";
                    break;
                case 7:
                    tens = "seventy";
                    break;
                case 8:
                    tens = "eightty";
                    break;
                case 9:
                    tens = "ninety";
                    break;
            }
            if ((number % 100) / 10 == 1) {
                ones = "";
            } else {
                switch ((number % 100) % 10) {
                    case 0:
                        ones = "";
                        break;
                    case 1:
                        ones = "one";
                        break;
                    case 2:
                        ones = "two";
                        break;
                    case 3:
                        ones = "three";
                        break;
                    case 4:
                        ones = "four";
                        break;
                    case 5:
                        ones = "five";
                        break;
                    case 6:
                        ones = "six";
                        break;
                    case 7:
                        ones = "seven";
                        break;
                    case 8:
                        ones = "eight";
                        break;
                    case 9:
                        ones = "nine";
                        break;
                }
            }
            if(tens==""&&ones=="") {
                result=hundreds+" hundreds";
            } else {
                result=hundreds+" hundreds and "+tens+" "+ones;
            }
        } else {
            result+="out of ability";
        }
        System.out.println("read number: " + number + " is " + result);
    }
}

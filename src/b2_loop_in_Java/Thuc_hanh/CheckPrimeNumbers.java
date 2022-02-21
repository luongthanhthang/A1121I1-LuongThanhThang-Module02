//Kiểm tra số nguyên tố
package b2_loop_in_Java.Thuc_hanh;

import java.util.Scanner;

public class CheckPrimeNumbers {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter a number");
        int number=scanner.nextInt();
        boolean checkPrime=true;
        if(number<2) {
            System.out.println(number+" is NOT prime");
        } else {
            for(int i=2; i<number;i++) {
                if(number%i==0) {
                    checkPrime=false;
                    break;
                }
            }

            if(checkPrime) {
                System.out.println(number+" is prime");
            } else {
                System.out.println(number+" is NOT prime");
            }
        }
    }
}

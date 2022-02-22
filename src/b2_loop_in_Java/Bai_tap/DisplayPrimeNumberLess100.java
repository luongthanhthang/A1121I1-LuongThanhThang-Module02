//Hiển thị các số nguyên tố nhỏ hơn 100
package b2_loop_in_Java.Bai_tap;

public class DisplayPrimeNumberLess100 {
    public static void main(String[] args) {
        int number = 3;
        System.out.print("Prime number less 100: 2  3");
        while (number < 100) {
            number++;
            boolean checkPrime = true;
            for (int i = 2; i < number; i++) {
                if (number % i == 0) {
                    checkPrime = false;
                }
            }
            if (checkPrime) {
                System.out.print("  " + number);
            }
        }
    }
}

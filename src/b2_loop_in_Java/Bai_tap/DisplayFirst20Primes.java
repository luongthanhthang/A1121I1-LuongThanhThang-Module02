//Hiển thị 20 số nguyên tố đầu tiên
package b2_loop_in_Java.Bai_tap;

public class DisplayFirst20Primes {
    public static void main(String[] args) {
        int count = 2, number = 3;
        System.out.print("First 20 Primes: 2  3");
        while (count < 20) {
            number++;
            boolean checkPrime = true;
            for (int i = 2; i < number; i++) {
                if (number % i == 0) {
                    checkPrime = false;
                }
            }
            if (checkPrime) {
                System.out.print("  " + number);
                count++;
            }
        }
    }
}

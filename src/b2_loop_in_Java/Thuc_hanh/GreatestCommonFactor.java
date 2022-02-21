//Tìm ước số chung lớn nhất
//Trong toán học,nếu số nguyên a chia hết cho số nguyên b thì số b được gọi là ước của số nguyên a,
//a được gọi là bội của b.Số nguyên dương b lớn nhất là ước của cả hai số nguyên a,
//b được gọi là ước số chung lớn nhất(ƯCLN)của a và b.Trong trường hợp cả hai số nguyên
//a và b đều bằng 0thì chúng không có ƯCLN vì khi đó mọi số tự nhiên khác không đều là ước
//chung của a và b.Nếu chỉ một trong hai số a hoặc b bằng 0,số kia khác 0thì ƯCLN của
//chúng bằng giá trị tuyệt đối của số khác 0.

package b2_loop_in_Java.Thuc_hanh;

import java.util.Scanner;

public class GreatestCommonFactor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the a: ");
        int a = input.nextInt();
        System.out.print("Enter the b: ");
        int b = input.nextInt();
        a = Math.abs(a);
        b = Math.abs(b);
//        a=0, b=0
        if (a == 0 && b == 0) {
            System.out.println("No greatest common factor");
        }

//        a=0|b=0
        if ((a == 0 && b != 0) || (a != 0 && b == 0)) {
            if (a > b) {
                System.out.println("Greatest common factor is " + a);
            } else {
                System.out.println("Greatest common factor is " + b);
            }
        } else {
//        a!=0, b!=0
            while (a != b) {
                if (a > b) {
                    a = a - b;
                } else {
                    b = b - a;
                }
            }
            System.out.println("Greatest common factor is " + a);
        }
    }
}

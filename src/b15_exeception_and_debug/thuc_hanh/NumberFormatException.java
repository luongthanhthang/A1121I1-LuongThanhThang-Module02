package b15_exeception_and_debug.thuc_hanh;

import java.util.Scanner;

//Tạo phương thức calc với đầu vào là 2 số nguyên x và y. In ra kết quả Cộng, Trừ, Nhân, Chia.
public class NumberFormatException {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter x: ");
        int x = scanner.nextInt();
        System.out.print("Enter y: ");
        int y = scanner.nextInt();
        NumberFormatException numberFormatException = new NumberFormatException();
        numberFormatException.calculate(x, y);
    }


    //hàm tính toán x,y
    private void calculate(int x, int y) {
        try {
            int a = x + y;
            int b = x - y;
            int c = x * y;
            int d = x / y;
            System.out.println("addition x + y: " + a);
            System.out.println("subtraction x - y: " + b);
            System.out.println("multiplication x * y: " + c);
            System.out.println("division x / y: " + d);
        } catch (Exception e) {
            System.err.println("Exception: " + e.getMessage());
        }
    }
}

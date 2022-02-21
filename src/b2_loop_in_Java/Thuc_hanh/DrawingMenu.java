//Thiết kế menu cho ứng dụng
//Trong phần này, chúng ta sẽ phát triển một ứng dụng cho phép người dùng hiển thị một menu
//các hình mà ứng dụng có thể vẽ, kèm theo số thứ tự, người dùng chọn một lựa chọn bằng
//cách nhập và số thứ tự trên menu và ứng dụng sẽ vẽ hình tương ứng.
package b2_loop_in_Java.Thuc_hanh;

import java.util.Scanner;

public class DrawingMenu {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Menu");
        System.out.println("1. Draw the triangle");
        System.out.println("2. Draw the square");
        System.out.println("3. Draw the rectangle");
        System.out.println("0. Exit");
        System.out.println("Enter you choice: ");
        int choice=input.nextInt();
        switch (choice) {
            case 1:
                System.out.println("Draw the triangle");
                System.out.println("******");
                System.out.println("*****");
                System.out.println("****");
                System.out.println("***");
                System.out.println("**");
                System.out.println("*");
                break;
            case 2:
                System.out.println("Draw the square");
                System.out.println("* * * * * *");
                System.out.println("* * * * * *");
                System.out.println("* * * * * *");
                System.out.println("* * * * * *");
                System.out.println("* * * * * *");
                System.out.println("* * * * * *");
                break;
            case 3:
                System.out.println("Draw the rectangle");
                System.out.println("* * * * * *");
                System.out.println("* * * * * *");
                System.out.println("* * * * * *");
                break;
            case 0:
                System.exit(0);
            default:
                System.out.println("No choice!");
        }
    }
}

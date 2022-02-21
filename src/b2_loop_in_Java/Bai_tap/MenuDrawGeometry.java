//Hiển thị các loại hình
package b2_loop_in_Java.Bai_tap;

import java.util.Scanner;

public class MenuDrawGeometry {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Menu: ");
        System.out.println("1. Print the rectangle: ");//hình chữ nhật
        System.out.println("2. Print the square triangle: ");// hình tam giác vuông(4 góc)
        System.out.println("3. Print isosceles: "); //tam giác cân
        System.out.println("4. Exit");
        System.out.println("Enter your choice: ");
        int choice = input.nextInt();
        switch (choice) {
            case 1:
                System.out.println("Draw the rectangle");
                System.out.print("enter the length: ");
                int length = input.nextInt();
                System.out.print("enter the width: ");
                int width = input.nextInt();
                for (int i = 0; i < width; i++) {
                    for (int j = 0; j < length; j++) {
                        System.out.print("*");
                    }
                    System.out.print("\n");
                }
                break;
            case 2:
                
        }
    }
}

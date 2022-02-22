//Hiển thị các loại hình
package b2_loop_in_Java.Bai_tap;

import java.util.Scanner;

public class MenuDrawGeometry {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Menu: ");
        System.out.println("1. Print the rectangle: ");//hình chữ nhật
        System.out.println("2. Print the square triangle: ");// hình tam giác vuông(4 góc)
        System.out.println("3. Print isosceles triangle: "); //tam giác cân
        System.out.println("4. Exit");
        System.out.print("Enter your choice: ");
        int choice = input.nextInt();
        switch (choice) {
            case 1:
                System.out.print("enter the length: ");
                int length = input.nextInt();
                System.out.print("enter the width: ");
                int width = input.nextInt();
                System.out.println("Draw the rectangle");
                for (int i = 0; i < width; i++) {
                    for (int j = 0; j < length; j++) {
                        System.out.print("*");
                    }
                    System.out.print("\n");
                }
                break;

            case 2:
                System.out.println("1. top-left");
                System.out.println("2. top-right");
                System.out.println("3. bottom-left");
                System.out.println("4. bottom-right");
                System.out.print("Enter angle position: ");
                int position = input.nextInt();
                switch (position) {
                    case 1:
                        System.out.print("Enter the length of square triangle: ");
                        int sideTopLeft = input.nextInt();
                        System.out.println("Draw the square triangle top-left!");
                        for (int i = 0; i < sideTopLeft; i++) {
                            for (int j = sideTopLeft; j > i; j--) {
                                System.out.print("*");
                            }
                            System.out.print("\n");
                        }
                        break;

                    case 2:
                        System.out.print("Enter the length of square triangle: ");
                        int sideTopRight = input.nextInt();
                        System.out.println("Draw the square triangle top-right!");
                        for (int row = 0; row < sideTopRight; row++) {
                            for (int i = 0; i < row; i++) {
                                System.out.print(" ");
                            }
                            for (int j = sideTopRight; j > row; j--) {
                                System.out.print("*");
                            }
                            System.out.print("\n");
                        }
                        break;

                    case 3:
                        System.out.print("Enter the length of square triangle: ");
                        int sideBottomLeft = input.nextInt();
                        System.out.println("Draw the square triangle bottom-left!");
                        for (int i = 0; i < sideBottomLeft; i++) {
                            for (int j = 0; j <= i; j++) {
                                System.out.print("*");
                            }
                            System.out.print("\n");
                        }
                        break;
                    case 4:
                        System.out.print("Enter the length of square triangle: ");
                        int sideBottomRight = input.nextInt();
                        System.out.println("Draw the square triangle bottom-right!");
                        for (int row = 1; row <= sideBottomRight; row++) {
                            for (int i = sideBottomRight; i > row; i--) {
                                System.out.print(" ");
                            }
                            for (int j = 1; j <= row; j++) {
                                System.out.print("*");
                            }
                            System.out.print("\n");
                        }
                        break;
                    default:
                        System.out.print("No choice!");
                        break;
                }
            case 3:
                System.out.print("Enter the height of isosceles triangle: ");
                int height = input.nextInt();
                int widthTriangle = height * 2 - 1;
                System.out.println("Draw the isosceles triangle!");
                for (int row = 1; row <= widthTriangle; row += 2) {
                    for (int i = widthTriangle; i > row; i -= 2) {
                        System.out.print(" ");
                    }
                    for (int j = 1; j <= row; j++) {
                        System.out.print("*");
                    }
                    System.out.print("\n");
                }
                break;
            case 4:
                System.exit(0);
                break;
            default:
                System.out.print("No choice!");
                break;
        }
    }
}

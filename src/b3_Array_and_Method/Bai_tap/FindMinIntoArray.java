//Tìm giá trị nhỏ nhất trong mảng
package b3_Array_and_Method.Bai_tap;

import java.util.Scanner;

public class FindMinIntoArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Nhập số phần tử mảng và khai báo mảng
        System.out.print("Enter the size: ");
        int size = scanner.nextInt();
        int[] arr = new int[size];

        //Nhập mảng
        System.out.println("Enter the element in Array:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print("enter element [" + i + "]: ");
            arr[i] = scanner.nextInt();
        }

        //xuất mảng
        System.out.print("element in array:");
        for (int n : arr
        ) {
            System.out.print("  " + n);
        }

        //tìm số nhỏ nhất của mảng
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }

        //xuất số nhỏ nhất
        System.out.print("\nMin in array: " + min);
    }
}

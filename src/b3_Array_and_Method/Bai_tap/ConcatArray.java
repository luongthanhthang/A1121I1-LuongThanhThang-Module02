//gộp mảng
package b3_Array_and_Method.Bai_tap;

import java.util.Scanner;

public class ConcatArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Mảng 1
        int[] arr1 = new int[4];
        //nhập mảng 1
        System.out.println("\nArray1:");
        for(int i=0; i<arr1.length; i++) {
            System.out.print("enter element ["+i+"]: ");
            arr1[i]=scanner.nextInt();
        }
        //mảng 2
        int[] arr2 = new int[5];
        //nhập mảng 2
        System.out.println("\nArray2:");
        for(int i=0; i<arr2.length; i++) {
            System.out.print("enter element ["+i+"]: ");
            arr2[i]=scanner.nextInt();
        }

        //xuất mảng 1
        System.out.print("element in array1:");
        for (int n : arr1
        ) {
            System.out.print("  " + n);
        }

        //xuất mảng 2
        System.out.print("\nelement in array2:");
        for (int n : arr2
        ) {
            System.out.print("  " + n);
        }
        //mảng 3 là gộp của mảng 1 và 2
        int[] arr3 = new int[arr1.length + arr2.length];
        //Nhập mảng 1 vào mảng 3
        for (int i = 0; i < arr1.length; i++) {
            arr3[i] = arr1[i];
        }

        //Nhập mảng 2 vào mảng 3
        for (int i = arr1.length, j = 0; i < arr3.length; i++, j++) {
            arr3[i] = arr2[j];
        }

        //xuất mảng 3
        System.out.print("\nelement in array3, concat array1 and array2:");
        for (int n : arr3
        ) {
            System.out.print("  " + n);
        }
    }
}

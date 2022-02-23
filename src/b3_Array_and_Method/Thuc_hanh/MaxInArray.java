//Tìm giá trị lớn nhất trong mảng
package b3_Array_and_Method.Thuc_hanh;

import java.util.Scanner;

public class MaxInArray {
    public static void main(String[] args) {
        int[] arr;
        int size;
        Scanner scanner=new Scanner(System.in);
        do {
            System.out.print("Enter a size: ");
            size=scanner.nextInt();
            if(size>20) {
                System.out.println("Size should not exceed 20");
            }
        } while(size>20);

        // nhập các phần từ trong mảng

        arr=new int[size];
        for(int i=0; i<arr.length; i++) {
            System.out.print("Enter the element "+i+": ");
            arr[i]=scanner.nextInt();
        }

        // xuất mảng
        System.out.print("element in array: ");
        for (int n: arr
             ) {
            System.out.print(n + "  ");
        }

        // tìm max của mảng
        int max=arr[0];
        int index=0;
        for(int i=0; i<arr.length; i++) {
            if(arr[i]>max) {
                max=arr[i];
                index=i;
            }
        }
        System.out.print("\nThe largest property value in the list is "+max+", at position: "+index);
    }
}

//Đảo ngược các phần tử của mảng
package b3_Array_and_Method.Thuc_hanh;

import java.util.Scanner;

public class ReverseTheElementOfArray {
    public static void main(String[] args) {
        int size;
        int[] array;
        Scanner input=new Scanner(System.in);
        do {
            System.out.print("Enter the size: ");
            size=input.nextInt();
            if(size>20) {
                System.out.println("Size does not exceed 20");
            }
        } while (size>20);

        //Nhập mảng
        array=new int[size];
        for(int i=0; i<array.length; i++) {
            System.out.print("Enter element "+i+":");
            array[i]=input.nextInt();
        }

        //In ra mảng
        System.out.printf("%-40s","Elements in array: ");
        for(int i=0; i<array.length; i++) {
            System.out.print(array[i]+"\t");
        }

        //Đảo ngược thứ tự mảng
        for(int j=0; j<array.length/2; j++) {
            int temp=array[j];
            array[j]=array[array.length-1-j];
            array[array.length-1-j]=temp;
        }

        // xuất mảng khi đảo ngược
        System.out.printf("\n%-40s","Element Array after Reverse: ");
        for (int n: array) {
            System.out.print(n+"\t");
        }
    }
}

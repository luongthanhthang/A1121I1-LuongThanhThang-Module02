//Mảng hai chiều - tính tổng các số ở đường chéo chính của ma trận vuông
package b3_Array_and_Method.Bai_tap;

import java.util.Scanner;

public class TwoDimensionalArrayTotalMainDiagonal {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        //Nhập chiều dài của ma trận
        int row,col;
        do{
            System.out.print("Input row: ");
            row = scanner.nextInt();
            System.out.print("Input column: ");
            col = scanner.nextInt();
        } while (row!=col);

        //Khai báo mảng 2 chiều
        int[][] arr = new int[row][col];
        //Nhập các phần tử mảng 2 chiều
        System.out.println("Enter the element into two dimensional array: ");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print("Enter the element [" + i + "][" + j + "]: ");
                arr[i][j] = scanner.nextInt();
            }
        }

        //Xuất mảng 2 chiều
        System.out.println("Two dimensional array: ");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.printf("%5d",arr[i][j]);
            }
            System.out.println("");
        }

        //Tính tổng đường chéo
        int total=0;
        for(int i=0; i<arr.length; i++) {
            total+=arr[i][i];
        }

        System.out.print("\nTotal main diagonal in array: "+total);
    }

}

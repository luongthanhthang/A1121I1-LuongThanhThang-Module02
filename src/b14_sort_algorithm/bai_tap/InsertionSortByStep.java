package b14_sort_algorithm.bai_tap;

import java.util.Arrays;
import java.util.Scanner;

public class InsertionSortByStep {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter list size: ");
        int size = scanner.nextInt();
        int[] list = new int[size];
        System.out.println("Enter " + list.length + " values:");
        //nhập các phần tử vào mảng
        for (int i = 0; i < size; i++) {
            list[i] = scanner.nextInt();
        }

        //xuất mảng
        System.out.print("Your input list: ");
        for (int i = 0; i < list.length; i++) {
            System.out.print(list[i] + "\t");
        }

        System.out.println("\nBegin sort processing...");
        insertionSort(list);
    }

    public static void insertionSort(int[] array) {
        int temp, indexTemp;
        for (int i = 1; i < array.length; i++) {
            //lấy ra giá trị xét vị trí để chèn vào
            temp = array[i];
            indexTemp = i;
            //dời vị trí để tìm kiếm nơi cần chèn vào
            while (indexTemp > 0 && temp < array[indexTemp-1]) {
                array[indexTemp] = array[indexTemp - 1];
                indexTemp-- ;
            }
            //gắn phần tử vào nơi thích hợp
            array[indexTemp] = temp;
        }

        //xuất mảng sau khi sort
        System.out.print("Array after insertion sort: ");
        Arrays.stream(array).forEach(element-> System.out.printf("%-4d", element));
    }
}

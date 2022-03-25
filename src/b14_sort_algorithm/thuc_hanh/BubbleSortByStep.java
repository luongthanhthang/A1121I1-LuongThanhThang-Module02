package b14_sort_algorithm.thuc_hanh;

import java.util.Arrays;
import java.util.Scanner;

public class BubbleSortByStep {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter list size: ");
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
        bubbleSortByStep(list);
    }

    public static void bubbleSortByStep(int[] list) {
        boolean check = true;
        for (int i = 1; i < list.length && check; i++) {
            check = false;
            for (int j = 0; j < list.length - i; j++) {
                if (list[j] > list[j + 1]) {
                    //đổi vị trí
                    int temp = list[j];
                    list[j] = list[j + 1];
                    list[j + 1] = temp;
                    check = true;
                }
            }
            if (check == false) {
                System.out.println("\nArray may be sorted and next pass not needed");
                break;
            }
        }
        //xuất mảng sau khi sort
        Arrays.stream(list).forEach(element -> System.out.printf("%-4d", element));
    }
}

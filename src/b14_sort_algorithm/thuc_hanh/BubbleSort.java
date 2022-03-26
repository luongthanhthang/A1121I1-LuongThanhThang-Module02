package b14_sort_algorithm.thuc_hanh;

import java.util.Arrays;

//Cài đặt thuật toán sắp xếp nổi bọt
public class BubbleSort {
    public static void bubbleSort(int[] list) {
        boolean check = true;
        for (int i = 0; i < list.length && check; i++) {
            check = false;
            for (int j = 0; j < list.length - 1 - i; j++) {
                if (list[j] > list[j + 1]) {
                    //đổi vị trí
                    int temp = list[j];
                    list[j] = list[j + 1];
                    list[j + 1] = temp;
                    check = true;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] list = {2, 3, 2, 5, 6, 1, -2, 3, 14, 12};
        bubbleSort(list);
        Arrays.stream(list).forEach(element -> System.out.printf("%-4d", element));
    }
}

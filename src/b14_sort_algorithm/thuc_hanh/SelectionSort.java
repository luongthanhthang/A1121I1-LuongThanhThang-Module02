package b14_sort_algorithm.thuc_hanh;

import java.util.Arrays;

//thiết lặp xếp chọn
public class SelectionSort {
    public static void selectionSort(double[] list) {
        for (int i = 0; i < list.length; i++) {
            //tìm số nhỏ nhất hiện tại
            int indexMin = i;
            for (int j = i + 1; j < list.length; j++) {
                if (list[j] < list[indexMin]) {
                    indexMin = j;
                }

                //đưa vị trí nhỏ nhất vào vị trí đúng
                if (indexMin != i) {
                    double temp = list[i];
                    list[i] = list[indexMin];
                    list[indexMin] = temp;
                }
            }
        }

        //xuất mảng sau khi sắp xếp
        System.out.print("array after sort: ");
        Arrays.stream(list).forEach(element -> System.out.printf("%-6.1f", element));
    }

    public static void main(String[] args) {
        double[] list = {1, 9, 4.5, 6.6, 5.7, -4.5};
        selectionSort(list);
    }
}

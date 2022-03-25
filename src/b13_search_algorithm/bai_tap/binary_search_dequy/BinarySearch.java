package b13_search_algorithm.bai_tap.binary_search_dequy;

import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

//Cài đặt thuật toán tìm kiếm nhị phân sử dụng đệ quy
public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = new int[20];
        Random random = new Random();
        //tạo mảng random
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(50);
        }

        //sắp xếp lại các phần từ trong mảng mới tìm kiếm nhị phân được
        Arrays.sort(arr);

        //xuất mảng
        Arrays.stream(arr).forEach(arrList -> System.out.printf("%-4d", arrList));

        //tìm kiếm phần tử
        int value = random.nextInt(50);
        System.out.println("\nelement search: "+value);
        System.out.println("\nindex element: "+binarySearch(arr, 0, arr.length - 1, value));

    }


    //phương thức tìm kiếm binary sử dụng đệ quy
    public static int binarySearch(int[] arr, int low, int high, int value) {
        int mid = (high + low) / 2;
        if (low > high) {
            return -1;
        }

        if (arr[mid] == value) {
            return mid;
        } else if (value > arr[mid]) {
            return binarySearch(arr, mid + 1, high, value);
        } else {
            return binarySearch(arr, low, mid - 1, value);
        }
    }
}

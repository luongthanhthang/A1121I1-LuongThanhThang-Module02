//Xoá phần tử khỏi mảng
//Việc xoá một phần tử trong mảng chính là thực hiện ghi đè phần tử đằng sau nó lên chính phần tử cần xoá.
package b3_Array_and_Method.Bai_tap;

import java.util.Scanner;

public class DeleteElementInArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = {5, 7, 8, 4, 9, 1, 3, 2};
        // xuất mảng
        System.out.print("element in array:");
        for (int n : arr
        ) {
            System.out.print("  " + n);
        }
        // nhập phần tử muốn xoá
        int index_del = -1;
        System.out.println("\nEnter the element you want to delete: ");
        int deleteNumber = scanner.nextInt();
        //tìm ra vị trí cần xoá
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == deleteNumber) {
                index_del = i;
                break;
            }
        }

        //làm lại mảng mới
        if (index_del != -1) {
            for (int i = index_del; i < arr.length; i++) {
                if (i + 1 == arr.length) {
                    break;
                } else {
                    arr[i] = arr[i + 1];
                }
            }
            arr[arr.length-1]=0;
        }

        //Xuất mảng mới
        System.out.print("element in array after delete element:");
        for (int n : arr
        ) {
            System.out.print("  " + n);
        }
    }
}

//Xoá phần tử khỏi mảng
//Việc xoá một phần tử trong mảng chính là thực hiện ghi đè phần tử đằng sau nó lên chính phần tử cần xoá.
package b3_Array_and_Method.Bai_tap;

import java.util.Scanner;

public class DeleteElementInArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = {5, 7, 1, 1, 9, 1, 3, 2};
        // xuất mảng
        System.out.print("element in array:");
        for (int n : arr
        ) {
            System.out.print("  " + n);
        }
        // nhập phần tử muốn xoá
        int index_del = -1;
        System.out.print("\nEnter the element you want to delete: ");
        int deleteNumber = scanner.nextInt();

        //đếm trong mảng có bao nhiêu phần từ cần xoá
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == deleteNumber) {
                count++;
            }
        }

        //khai báo mảng mới có độ dài giảm đi
        int[] newArray = new int[arr.length - count];

        //làm lại mảng mới, không chứa phần tử cần xoá
        for (int i = 0, j = 0; i < arr.length; i++, j++) {
            if (arr[i] != deleteNumber) {
                newArray[j] = arr[i];
            } else {
                j--;
                continue;
            }
        }

        //Xuất mảng mới
        System.out.print("element in array after delete element:");
        for (int n : newArray
        ) {
            System.out.print("  " + n);
        }
    }
}

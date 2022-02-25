//Thêm phần tử vào mảng
//Nhập một giá trị bất kỳ từ bàn phím và vị trí cần chèn, giá trị này được chèn vào vị trí đó trong mảng.
package b3_Array_and_Method.Bai_tap;

import java.util.Scanner;

public class AddElementIntoArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //mảng cho trước
        int[] arr = new int[10];

        //nhập số phần từ muốn nhập
        int size=-1;
        do {
            System.out.print("enter the number (<10) of element into the array: ");
            size=scanner.nextInt();
        }while (size>10);

        // nhập phần từ vào mảng
        for (int i = 0; i < size; i++) {
            System.out.print("Enter element [" + i + "]: ");
            arr[i] = scanner.nextInt();
        }
        //xuất mảng cho trước
        System.out.print("Element in array");
        for (int n : arr
        ) {
            System.out.print("  " + n);
        }

        //Nhập số X muốn chèn vào
        System.out.print("\nEnter the element you want insert: ");
        int element = scanner.nextInt();

        //Nhập vị trí muốn chèn
        System.out.print("Enter location you want insert: ");
        int index = scanner.nextInt();

        //Điều kiện chèn và tiến hành chèn phần từ vào mảng
        if (index < 0 || index > arr.length - 1) {
            System.out.print("\n Not insert element into array");
        } else {
            //dời vị trí các biến sau biến cần chèn
            for (int i = size-1; i >=index; i--) {
                arr[i+1]=arr[i];
            }
            //gán giá trị cần chèn vào mảng
            arr[index]=element;
        }

        // xuất mảng mới
        System.out.print("Element in array after insert element: ");
        for (int n: arr
             ) {
            System.out.print("  "+n);
        }
    }
}

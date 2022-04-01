package b15_exeception_and_debug.bai_tap.bai_tap_ngoai.CheckValue100Array;
/*Khai báo 1 mảng có n phần tử các số nguyên, viết hàm nhập các phần tử cho mảng.
Bắt ngoại lệ nếu nhập phần từ có giá trị là 100 thì in ra các phần tử đã nhập và kết thúc chương trình*/

import java.util.Arrays;
import java.util.Scanner;

public class ExceptionValueBigger100 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number array length: ");
        int number = scanner.nextInt();
        int[] arr = new int[number];

        //nhập phần tử vào mảng
//        for (int i = 0; i < arr.length; i++) {
        try {
            for (int i = 0; i < arr.length; i++) {
                System.out.print("Enter element index [" + i + "]: ");
                arr[i] = scanner.nextInt();
                arrCheck(arr);
            }
        } catch (ValueEqual100Exception e) {
            System.out.println("\n" + e.getMessage());
            e.printStackTrace();   //hiện lỗi tại line nào
            //break;
        }
    }

    //dòng lệnh ở đây vẫn chạy bình thường

    //hàm bắt lỗi
    public static void arrCheck(int[] arr) throws ValueEqual100Exception {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 100) {
                int[] arrResult = new int[i];
                //chuyển phần tử từ arr -> arrResult
                for (int j = 0; j < arrResult.length; j++) {
                    arrResult[j] = arr[j];
                }
//                Arrays.stream(arrResult).forEach(element -> System.out.printf("%-4d", element));
                System.out.print(Arrays.toString(arrResult));
                throw new ValueEqual100Exception("ERROR value equal 100!");
            }
        }
    }
}

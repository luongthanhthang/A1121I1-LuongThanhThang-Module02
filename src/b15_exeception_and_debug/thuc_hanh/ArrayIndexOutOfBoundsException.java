package b15_exeception_and_debug.thuc_hanh;

import java.util.Random;
import java.util.Scanner;

//Viết một chương trình cho phép tạo ra một mảng 100 số nguyên ngẫu nhiên.
// Cho phép người dùng nhập vào chỉ số của một phần tử và hiển thị giá trị của phần tử đó.
//Sử dụng try-catch để hiển thị thông báo nếu người dùng nhập vào chỉ số không hợp lệ (index < 0 hoặc index >= 100)
public class ArrayIndexOutOfBoundsException {
    public static Integer[] createRandomArray() {
        Random random = new Random();
        //khởi tạo mảng
        Integer[] arr = new Integer[100];
        System.out.println("Danh sách phần tử mảng: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(50);
            System.out.print(arr[i] + " ");
        }
        return arr;
    }

    public static void main(String[] args) {
        Integer[] arr = createRandomArray();

        Scanner scanner = new Scanner(System.in);
        System.out.print("\nNhập chỉ số phần tử bất kì muốn lấy ra: ");
        int index = scanner.nextInt();
        try {
            System.out.println("Phần tử ở chỉ số " + index + " là: " + arr[index]);
        } catch (IndexOutOfBoundsException e) {
            System.err.println("Chỉ số vượt quá giới hạn của mảng");
        }
    }
}

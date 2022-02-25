//Ứng dụng đếm số lượng sinh viên thi đỗ
package b3_Array_and_Method.Thuc_hanh;

import java.util.Scanner;

public class ApplicationCountNumberStudentPassTheExam {
    public static void main(String[] args) {
        //khai báo số lượng phần tử trong mảng
        int size;
        int[] arr;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.print("Enter number student: ");
            size = scanner.nextInt();
            if (size > 30)
                System.out.println("Size should not exceed 30");
        } while (size > 30);

        arr = new int[size];
        //nhập mảng
        System.out.println("Enter a mark for student:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print("enter mark student [" + (i + 1) + "]: ");
            arr[i] = scanner.nextInt();
        }

        //Xuất mảng
        System.out.print("list of mark:");
        for (int n : arr
        ) {
            System.out.print("  " + n);
        }

        // đếm số học sinh pass môn học
        int count = 0;
        for (int mark : arr
        ) {
            if (mark >= 5 && mark <= 10) {
                count++;
            }
        }
        System.out.print("\nThe number of students passing the exam is " + count);
    }
}

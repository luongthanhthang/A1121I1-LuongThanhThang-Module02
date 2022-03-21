package b11_DSA_Stack_Queue.bai_tap.check_palindrome_queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

//Khái niệm: Một chuỗi được gọi là Palindrome nếu như đọc xuôi giống đọc ngược.
//Bài toán: Cho trước một chuỗi, kiểm tra xem chuỗi đó có phải là chuỗi palindrome hay không?
//Ví dụ về chuỗi palindrome: Able was I ere I saw Elba
public class Palindrome {
    public static void main(String[] args) {
        Queue<Character> leftString = new LinkedList<>();
        Stack<Character> rightString = new Stack<>();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input String: ");
        String inputString = scanner.nextLine();
        int length = inputString.length();

        //xét phần bên trái
        for (int i = 0; i < length / 2; i++) {
            leftString.add(inputString.charAt(i));
        }

        //xét bên phải, các phần tử sẽ bị đảo lại ở đây
        if (length % 2 == 0) {
            for (int i = length / 2; i < length; i++) {
                rightString.push(inputString.charAt(i));
            }
        } else {
            for (int i = length / 2 + 1; i < length; i++) {
                rightString.push(inputString.charAt(i));
            }
        }


        //kiểm tra
        System.out.println();
        boolean check = true;
        while (!leftString.isEmpty()) {
            if (!(leftString.remove() == rightString.pop())) {
                check = false;
            }
        }

        //xuất kết quả
        if (check) {
            System.out.print("this is palindrome string!");
        } else {
            System.out.print("this is NOT palindrome string");
        }
    }
}

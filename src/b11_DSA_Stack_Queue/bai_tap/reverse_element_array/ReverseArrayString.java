package b11_DSA_Stack_Queue.bai_tap.reverse_element_array;

import java.util.Scanner;
import java.util.Stack;

public class ReverseArrayString {
    public static void main(String[] args) {
        Stack<String> stringArray = new Stack<>();
        Scanner scanner = new Scanner(System.in);
        System.out.print("input element: ");
        String string = scanner.nextLine();

        System.out.println("mảng chuỗi sau khi đảo: ");
        String[] split = string.split("");
        //bỏ phần tử vào mảng
        for (int i = 0; i < split.length; i++) {
            stringArray.push(split[i]);
        }
        //xuất mảng đảo ngược
        while (!stringArray.empty()) {
            System.out.print(stringArray.pop() + " ");
        }
    }
}

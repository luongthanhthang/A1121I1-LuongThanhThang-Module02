package b11_DSA_Stack_Queue.bai_tap.check_parentheses;

import java.util.Scanner;
import java.util.Stack;

// kiểm tra dấu ngoặc sử dụng stack
public class CheckParentheses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("input expression: ");
        String input = scanner.nextLine();
        String[] strings = input.split("");

        // khai báo stack
        Stack<String> stringStack = new Stack<>();
        for (String string : strings) {
            // thêm ngoặc "("
            if ("(".equals(string)) {
                stringStack.push(string);
            }

            //kiểm ta ngoặc ")"
            if (!stringStack.empty()) {
                if (")".equals(string)) {
                    stringStack.pop();
                }
            }
        }

        if (stringStack.empty()) {
            System.out.println("TRUE!");
        } else {
            System.out.println("FALSE!");
        }
    }
}

package b11_DSA_Stack_Queue.bai_tap.reverse_element_array;

import java.util.Scanner;
import java.util.Stack;

public class ReserveArrayNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Stack<Integer> integers = new Stack<>();
        //nhập phần tử
        System.out.print("input number element: ");
        int number = scanner.nextInt();
        for (int i = 0; i < number; i++) {
            System.out.print("input element [" + i + "]: ");
            int element = scanner.nextInt();
            integers.push(element);
        }
        System.out.print("Mảng ban đầu: ");
        for (int n : integers
        ) {
            System.out.print(n + " ");
        }

        System.out.print("\nMảng lúc sau: ");
        while (!integers.empty()) {
            System.out.print(integers.pop()+" ");
        }
    }
}

package b11_DSA_Stack_Queue.thuc_hanh.deloy_stack_using_linkedlist;

public class GenericStackClient {
    //Cài đặt lớp GenericStackClient chứa hai phương thức stackOfStrings() và stackOfIntegers()
    static void stackOfStrings() {
        // phương thức xuất ra màn hình chữ và sau đó xoá hết phần tử trong mảng
        MyGenericStack<String> stack=new MyGenericStack<>();
        stack.push("Five");
        stack.push("Four");
        stack.push("Three");
        stack.push("Two");
        stack.push("One");
        //kích thước của ngăn xếp sau khi push
        System.out.println("1.1 Size of stack after push operations: "+stack.size());
        //xoá phần tử từ stack
        System.out.println("1.2 Pop elements from stack: ");
        //xoá hết phần tử trong mảng
        while (!stack.isEmpty()) {
            System.out.printf(" %s", stack.pop());
        }
        //số phần từ sau khi xoá hết
        System.out.println("\n1.3 Size of stack after pop operations: "+stack.size());
    }

    static void stackOfIntegers() {
        MyGenericStack<Integer> stack=new MyGenericStack<>();
        stack.push(5);
        stack.push(4);
        stack.push(3);
        stack.push(2);
        stack.push(1);
        System.out.println("2.1 Size of stack after push operation: "+stack.size());
        System.out.println("2.2 Pop elements from stack: ");
        while (!stack.isEmpty()) {
            System.out.printf(" %d",stack.pop());
        }
        System.out.println("\n3.3 Size of stack after pop operations: "+stack.size());
    }
}

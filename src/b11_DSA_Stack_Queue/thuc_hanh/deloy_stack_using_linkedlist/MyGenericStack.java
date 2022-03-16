package b11_DSA_Stack_Queue.thuc_hanh.deloy_stack_using_linkedlist;

import java.util.EmptyStackException;
import java.util.LinkedList;

public class MyGenericStack<T> {
    //Tạo lớp MyGenericStack với các thuộc tính
    private LinkedList<T> stack;

    public MyGenericStack() {
        this.stack=new LinkedList<>();
    }

    //Phương thức
    //cài đặt phương thức push()
    public void push(T element) {
        stack.addFirst(element);
    }

    //Cài đặt phương thức isEmpty()
    public boolean isEmpty() {
        if(stack.size()==0) {
            return true;
        } else {
            return false;
        }
    }

    //cài đặt phương thức pop
    public T pop (){
        if(isEmpty()) {
            throw new EmptyStackException();
        }
        return stack.removeFirst();
    }

    //Cài đặt phương thức size()
    public int size() {
        return stack.size();
    }
}

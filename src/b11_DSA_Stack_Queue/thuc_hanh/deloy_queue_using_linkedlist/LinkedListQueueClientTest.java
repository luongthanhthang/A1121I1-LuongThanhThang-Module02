package b11_DSA_Stack_Queue.thuc_hanh.deloy_queue_using_linkedlist;

public class LinkedListQueueClientTest {
    public static void main(String[] args) {
        MyLinkedListQueue myLinkedListQueue=new MyLinkedListQueue();
        myLinkedListQueue.enqueue(10);
        myLinkedListQueue.enqueue(20);
        myLinkedListQueue.dequeue();
        myLinkedListQueue.dequeue();
        myLinkedListQueue.enqueue(30);
        myLinkedListQueue.enqueue(40);
        myLinkedListQueue.enqueue(50);
        //trả về phần tử đã xoá
        System.out.println("Dequeued item is " + myLinkedListQueue.dequeue().key);
    }
}

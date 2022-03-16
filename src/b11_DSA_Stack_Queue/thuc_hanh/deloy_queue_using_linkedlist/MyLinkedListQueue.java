package b11_DSA_Stack_Queue.thuc_hanh.deloy_queue_using_linkedlist;

public class MyLinkedListQueue {
    private Node head;
    private Node tail;

    //constructor
    public MyLinkedListQueue() {
        this.head = null;
        this.tail = null;
    }

    //Cài đặt phương thức trong lớp MyLinkedListQueue
    //Phương thức enqueue(): thêm (hay lưu trữ) một phần tử vào trong hàng đợi.
    public void enqueue(int key) {
        Node temp = new Node(key);
        //kiểm tra xem hàng đợi có đầy không, nếu hết thì hoát
        if (this.tail == null) {
            this.head = this.tail = temp;
            return;
        }
        this.tail = temp;
        this.tail.next = temp;
    }

    //Phương thức dequeue(): xóa một phần tử từ hàng đợi.
    // trả về phần tử đã xoá
    public Node dequeue() {
        //kiểm tra xem hàng đợi có đầy không, nếu hết thì hoát
        if (this.head == null) {
            return null;
        }
        //xuất phần tử đã xoá
        Node temp = this.head;
        //tiến hành xoá phần tử hàng chờ
        this.head = this.head.next;
        //kiểm tra mạng bay giờ có còn phần tử hay không
        if (this.head == null) {
            this.tail=null;
        }
        return temp;
    }
}

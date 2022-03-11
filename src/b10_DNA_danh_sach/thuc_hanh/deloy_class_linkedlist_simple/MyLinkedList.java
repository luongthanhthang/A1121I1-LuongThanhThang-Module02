package b10_DNA_danh_sach.thuc_hanh.deloy_class_linkedlist_simple;

//Lớp MyLinkedList gồm
//Các thuộc tính
//numNodes size xác định số phần tử trong danh sách, mặc định gán là 0.
//head đối tượng lớp Node
//Các phương thức:
//Phương thức khởi tạo một tham số khởi tạo node đầu tiên trong danh sách
//Phương thức thêm một phần tử mới vào danh sách: add()
//Phương thức thêm một phần tử mới vào đầu danh sách: addFirst()
//Phương thức truy cập một phần tử trong danh sách: get()
//Phương thức printList() in các phần tử trong danh sách
//Lớp MyLinkedListTest chứa phương thức main() để thực thi ứng dụng
public class MyLinkedList {
    private Node head;
    private int numNodes;

    public MyLinkedList(Object data) {
        head = new Node(data);
    }

    private class Node {
        private Node next;
        private Object data;

        //constructor
        public Node(Object data) {
            this.data = data;
        }
    }

    //Cài đặt phương thức add
    //Mục đích: Thêm đối tượng vào vị trí thứ index trong danh sách
    //Tham số đầu vào: vị trí thêm (index), đối tượng thêm (data)

    public void add(int index, Object data) {
        Node temp = head;
        Node holder;

        for (int i = 0; i < index - 1 && temp.next != null; i++) {
            temp = temp.next;
        }
        holder = temp.next;
        temp.next = new Node(data);
        temp.next.next = holder;
        numNodes++;
    }

    //Cài đặt phương thức addFirst()
    //Mục đích: Thêm đối tượng vào vị trí đầu tiên trong danh sách
    //Tham số đầu vào: đối tượng thêm (data)

    public void addFirst(Object data) {
        Node temp = head;
        head = new Node(data);
        head.next = temp;
        numNodes++;
    }

    //Cài đặt phương thức get()
    //Mục đích: Lấy phần tử ở vị trí index từ danh sách
    //Tham số đầu vào: vị trí cần lấy (index)
    public Node get(int index){
        Node temp=head;
        for(int i=0; i<index; i++) {
            temp = temp.next;
        }
        return temp;
    }

    //Cài đặt phương thức printList
    //Mục đích: Hiển thị danh sách các phần tử trong danh sách

    public void printList() {
        Node temp = head;
        while(temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }
}

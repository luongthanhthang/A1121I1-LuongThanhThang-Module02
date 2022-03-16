package b10_DSA_danh_sach.bai_tap.trien_khai_linkedlist;

public class MyLinkedList<E> {
    //Phần từ đầu tiên của liên kết
    private Node head;
    //số lượng phần tử của danh sách
    private int numNodes = 0;

    private class Node {
        private Node next;
        Object data;

        //constructor
        public Node(Object data) {
            this.data = data;
        }

        public Object getData() {
            return this.data;
        }
    }

    //constructor
    public MyLinkedList() {
    }

    //add phần tủ vào đầu liên kết
    public void addFirst(E element) {
        //khai báo biến tạm trỏ đến giá trị của head
        Node temp = this.head;
        // biến head lúc này sẽ gán bằng biến mình nhập vào
        this.head = new Node(element);
        //trỏ head hiện tại với head ban đầu là temp
        this.head.next = temp;
        numNodes++;
    }

    //Thêm phần tủ vào cuối danh sách
    public void addLast(E element) {
        //khai báo biến temp trỏ đến head
        Node temp = head;
        //Sẽ cho con trỏ chạy đến phần từ cuối cùng của liên kết(có .next=null)
        while (temp.next != null) {
            temp = temp.next;
        }
        //hiện tại temp đang ở vị trí cuối của liên kết
        temp.next = new Node(element);
        numNodes++;
    }

    //thêm phần tử vào vị trí bất kì
    public void add(int index, E element) {
        // khai báo temp trỏ đến head
        Node temp = this.head;

        //Khai báo 1 Node Holder:    temp->element->holder
        Node holder;

        //Cho con trỏ chạy đến index-1, vì mình gán nó là temp=temp.next nên <index-1
        //temp.next khác null để trường hợp Node gắn vào cuối liên kết thì xẩy ra lỗi temp=temp.next;
        for (int i = 0; i < index - 1 && temp.next != null; i++) {
            temp = temp.next;
        }

        //cho holder trỏ vào biến tiếp theo của index
        holder = temp.next;
        temp.next = new Node(element);
        temp.next.next = holder;

        numNodes++;
    }

    //lấy phần tử tại vị trí bắt kì
    public E get(int index) {
        // khai báo temp trỏ đến head
        Node temp = this.head;
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }
        return (E) temp.getData();
    }

    //hiện số phần tử trong danh sách
    public int size() {
        return this.numNodes;
    }

    //Xoá phần tử ở vị trí bất kì
    public E remove(int index) {
        //kiểm tra index có nằm nhỏ <0 hay nằm ngoài giới hạn của liên kết không
        //đối tượng đã bị xoá
        Object dataRemove;
        if (index < 0 || index > numNodes) {
            throw new IllegalArgumentException("ERROR index: " + index);
        } else {
            // khai báo temp trỏ đến head
            Node temp = this.head;

            // nếu index = 0 thì trả về data hiện tại
            if (index == 0) {
                dataRemove = temp.data;
                //head hiện tại sẽ bằng phần tử tiếp theo
                this.head = head.next;
            } else {
                //trỏ đến vị trí trước index
                for (int i = 0; i < index - 1 && temp.next != null; i++) {
                    temp = temp.next;
                }
                dataRemove = temp.next;
                temp.next = temp.next.next;
            }
            numNodes--;
        }
        return (E) dataRemove;
    }

    //Xoá phần tử muốn xoá trong liên kết
    public boolean remove(E element) {
        //xoá nếu phần tử muốn xoá ở vị trí đầu
        if (this.head.data.equals(element)) {
            remove(0); //khi chạy hàm này thì sẽ bị trừ phần tử, nên không phải trừ tiếp
            return true;
        } else {
            // khai báo temp trỏ đến head
            Node temp = this.head;

            //xét hết liên kết
            while (temp.next != null) {
                //Nếu như tồn tại 1 phần tử giống với phần tử data truyền vào thì nó sẽ bị remove
                if (temp.next.data.equals(element)) {
                    // bỏ qua thành phần có phần từ =element
                    temp.next = temp.next.next;
                    numNodes--;
                    return true;
                }
            }
        }
        return false;
    }

    //phương thức clone để sao chép LinkedList
    public MyLinkedList<E> clone() {
        //kiểm tra linkedList có phần tử hay không
        if (numNodes == 0) {
            throw new NullPointerException("LinkedList không có phần tử");
        }

        //khai báo liên kết mới
        MyLinkedList<E> myLinkedListCopy = new MyLinkedList<>();
        // khai báo temp trỏ đến head
        //CHÚ Ý: chỉ đưa dữ liệu data vào, không phải đưa nguyên Node vào
        Node temp = this.head;
        myLinkedListCopy.addFirst((E) temp.data);

        temp = temp.next;
        while (temp != null) {
            myLinkedListCopy.addLast((E) temp.data);
            temp = temp.next;
        }
        return myLinkedListCopy;
    }

    //Phương thức kiểm tra phần tử có trong danh sách hay không
    public boolean contains(E element) {
        Node temp = this.head;
        while (temp.next != null) {
            if (temp.data.equals(element)) {
                return true;
            }
            temp = temp.next;
        }
        return false;
    }

    //Phương thức trả về index của phần tử
    public int indexOf(E element) {
        Node temp = this.head;
        int i = 0;
        while (temp.next != null) {
            if (temp.getData().equals(element)) {
                return i;
            }
            temp = temp.next;
            i++;
        }
        return -1;
    }

    // phương thức add thêm phần tử, nếu được trả về true
    // , không thì trả về false và đây là add vào vị trí cuối
    public boolean add(E element) {
        //chạy lại liên kết xem có phần tử đó ở cuối không
        if (element == null) {

            return false;
        } else {
            this.addLast(element);
            return true;
        }
    }

    // Phương thức tăng kích thước phần tử trong liên kết
    public void ensureCapacity(int minCapacity) {
    }

    // Phương thức lấy data đầu liên kết
    public E getFirst() {
        return (E) this.head.data;
    }

    // Phương thức lấy data cuối liên kết
    public E getLast() {
        Node temp = this.head;
        while (temp.next != null) {
            temp = temp.next;
        }
        return (E) temp.data;
    }

    //Phương thức xoá hết liên kết
    public void clear() {
        this.numNodes=0;
        this.head = null;
    }
}

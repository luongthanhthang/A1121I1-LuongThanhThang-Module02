package b10_DNA_danh_sach.thuc_hanh.deloy_class_linkedlist_simple;

public class MyLinkedListTest {
    public static void main(String[] args) {
        System.out.println("/=/=/=/= TESTING /=/=/=/=");
        MyLinkedList<Integer> myLinkedList = new MyLinkedList(10);
        myLinkedList.addFirst(11);
        myLinkedList.addFirst(12);
        myLinkedList.addFirst(13);

        myLinkedList.add(2,9);
        myLinkedList.add(4,9);
        myLinkedList.printList(); //xuất bảng
        System.out.println("");
        System.out.println("Element array index 3: "+myLinkedList.get(3));
    }
}

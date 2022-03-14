package b10_DNA_danh_sach.bai_tap.trien_khai_linkedlist;

import b10_DNA_danh_sach.bai_tap.trien_khai_arraylist.MyListTest;

public class MyLinkedListTest {
    //tạo class student
    static class Student {
        private int id;
        private String name;

        //contructor
        public Student() {
        }

        public Student(int id, String name) {
            this.id = id;
            this.name = name;
        }

        //getter setter

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }
    public static void main(String[] args) {
        MyLinkedList<Student> studentMyLinkedList = new MyLinkedList<>();
        Student student1 = new Student(1, "Thang");
        Student student2 = new Student(2, "Duy");
        Student student3 = new Student(3, "Son");
        Student student4 = new Student(4, "Quang");
        Student student5 = new Student(5, "Thong");
        Student student6 = new Student(6, "Tri");

        //thêm 1 phần tử vào ĐẦU liên kết
        studentMyLinkedList.addFirst(student1);
        studentMyLinkedList.addFirst(student2);
        studentMyLinkedList.addFirst(student3);

        //thêm 1 phần từ vào vị trí BẤT KÌ
        studentMyLinkedList.add(1, student4);

        //thêm phần tử ở CUỐI liên kết
        studentMyLinkedList.addLast(student5);

        // xuất phần tử trong liên kết lúc đầu
        System.out.println("Linked List ban đầu");
        for (int i = 0; i < studentMyLinkedList.size(); i++) {
            // khai báo phần tử trong liên kết là kiểu Student
            Student studentElement=studentMyLinkedList.get(i);
            System.out.print("name: "+studentElement.getName());
            System.out.println(", id: "+studentElement.getId());
        }

        //xoá phần tử vị trí BẤT KÌ
//        studentMyLinkedList.remove(2);

        //xoá phần tử nhập vào
//        studentMyLinkedList.remove(student4);


        // xuất phần tử trong liên kết cuối
        System.out.println();
        System.out.println("Linked List lúc sau");
        for (int i = 0; i < studentMyLinkedList.size(); i++) {
            // khai báo phần tử trong liên kết là kiểu Student
            Student studentElement=studentMyLinkedList.get(i);
            System.out.print("name: "+studentElement.getName());
            System.out.println(", id: "+studentElement.getId());
        }


        //kiểm tra copy phần tử trong liên kết
        MyLinkedList<Student> myLinkedListCopy=studentMyLinkedList.clone();
        //xuất mảng copy
        System.out.println();
        System.out.println("Linked List lúc sau khi copy");
        for (int i = 0; i < myLinkedListCopy.size(); i++) {
            // khai báo phần tử trong liên kết là kiểu Student
            Student studentElement=myLinkedListCopy.get(i);
            System.out.print("name: "+studentElement.getName());
            System.out.println(", id: "+studentElement.getId());
        }

        //kiểm tra phần tử có trong danh sách hay không
        System.out.println("student2 có trong liên kết hay không: "+studentMyLinkedList.contains(student2));

        //kiểm tra vị trí của phần tử
        System.out.println("student 2 ở vị trí thứ : "+studentMyLinkedList.indexOf(student2));
    }
}

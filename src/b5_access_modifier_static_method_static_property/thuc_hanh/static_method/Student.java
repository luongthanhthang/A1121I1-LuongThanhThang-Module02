//Trong Java, một phương thức tĩnh là một phương thức thuộc về một lớp chứ không phải là một thể hiện của một lớp.
// Chương trình sau đây sẽ sử dụng phương thức tĩnh để thay đổi giá trị thuộc tính của lớp.
package b5_access_modifier_static_method_static_property.thuc_hanh.static_method;

public class Student {
    private int rollno;
    private String name;
    private static String collage="BBDIT";

    //constructor to initialize the variable
    Student(int r, String n) {
        this.rollno=r;
        this.name=n;
    }

    //static method to change the value of static variable
    static void change() {
        collage="CODEGYM";
    }

    //method to display values
    void display() {
        System.out.println(this.rollno+" "+this.name+" "+collage);
    }
}

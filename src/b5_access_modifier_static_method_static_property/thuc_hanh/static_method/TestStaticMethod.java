package b5_access_modifier_static_method_static_property.thuc_hanh.static_method;

public class TestStaticMethod {
    public static void main(String[] args) {
        //gọi method của class Student
        Student.change();

        //tạo object
        Student s1=new Student(111,"Hoang");
        Student s2=new Student(222,"Khanh");
        Student s3=new Student(333,"Nam");

        //gọi method của đối tượng
        s1.display();
        s2.display();
        s3.display();
    }
}

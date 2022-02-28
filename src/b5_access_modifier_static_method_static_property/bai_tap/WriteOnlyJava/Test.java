package b5_access_modifier_static_method_static_property.bai_tap.WriteOnlyJava;

public class Test {
    public static void main(String[] args) {
        //private nên nó không chạy
        Student test=new Student();
        test.setClasses("I1121");
        test.setName("Thang");
    }
}

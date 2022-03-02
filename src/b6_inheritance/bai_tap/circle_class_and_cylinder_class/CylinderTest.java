package b6_inheritance.bai_tap.circle_class_and_cylinder_class;

public class CylinderTest {
    public static void main(String[] args) {
        Cylinder cylinder=new Cylinder();
        System.out.println(cylinder);

        cylinder=new Cylinder(3.0,2.0,"Red");
        System.out.println(cylinder);
    }
}

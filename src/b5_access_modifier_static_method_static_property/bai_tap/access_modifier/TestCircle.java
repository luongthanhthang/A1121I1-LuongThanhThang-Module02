package b5_access_modifier_static_method_static_property.bai_tap.access_modifier;

public class TestCircle {
    public static void main(String[] args) {
        //access modifier la public
//        Circle circle1=new Circle(5);
//        System.out.println("Area circle is: "+circle1.getArea());
//        System.out.println("radius circle is: "+circle1.getRadius());

        //thay đổi modifier la default
        Circle circle2=new Circle(6);
        System.out.println("Area circle is: "+circle2.getArea());
        System.out.println("radius circle is: "+circle2.getRadius());
    }
}

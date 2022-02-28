package b5_access_modifier_static_method_static_property.bai_tap.access_modifier;

public class Circle {
    private double radius=1.0;
    private String color="red";

    //constructor
    public Circle() {}

    public Circle(double radius){
        this.radius=radius;
    }

//    public double getRadius() {
//        return this.radius;
//    }
//
//    public double getArea() {
//        return this.radius*this.radius*Math.PI;
//    }

    double getRadius() {
        return this.radius;
    }

    double getArea() {
        return this.radius*this.radius*Math.PI;
    }
}

package b6_inheritance.thuc_hanh.system_of_geometric_objects;

public class Circle extends Shape {
    private double radius=1.0;

    //constructor
    public Circle(){}
    public Circle(double radius) {
        this.radius=radius;
    }

    public Circle(double radius, String color, boolean filled) {
        super(color, filled);
        this.radius=radius;
    }

    //getter setter

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    //tính diện tích
    public double getArea() {
        return this.radius*this.radius*Math.PI;
    }

    //tính chu vi
    public double getPerimeter() {
        return 2*radius*Math.PI;
    }

    @Override
    public String toString() {
        return "A Circle with radius= "
                +getRadius()
                +", which is a subclass of "
                +super.toString();
    }
}

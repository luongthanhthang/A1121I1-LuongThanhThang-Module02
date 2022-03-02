package b6_inheritance.bai_tap.circle_class_and_cylinder_class;

public class Cylinder extends Circle{
    private double height=1.0;

    //constructor
    Cylinder(){}

    Cylinder(double height, double radius, String color) {
        super(radius, color);
        this.height=height;
    }

    //setter getter
    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    //tính diện tích hình trụ
    public double getAreaCylinder() {
        return 2*Math.PI*this.getRadius()*this.getHeight()+(2*super.getArea());
    }

    @Override
    public String toString() {
        return "A Cylinder with radius: "
                +this.getRadius()
                +" and height: "
                +this.getHeight()
                +" and color: "
                +this.getColor()
                +" and Area "
                +this.getAreaCylinder()
                +", which is a sub class of "
                +super.toString();
    }
}

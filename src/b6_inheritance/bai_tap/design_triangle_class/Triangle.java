package b6_inheritance.bai_tap.design_triangle_class;

import b6_inheritance.thuc_hanh.system_of_geometric_objects.Shape;

public class Triangle extends Shape {
    private double side1=1.0;
    private double side2=1.0;
    private double side3=1.0;
    private boolean check=false;


    //constructor
    public Triangle() {}
    public Triangle(double side1, double side2, double side3) {
        this.side1=side1;
        this.side2=side2;
        this.side3=side3;
    }

    public Triangle(double side1, double side2, double side3, String color) {
        this.side1=side1;
        this.side2=side2;
        this.side3=side3;
        super.setColor(color);
    }

    //getter setter
    public double getSide1() {
        return side1;
    }

    public void setSide1(double side1) {
        this.side1 = side1;
    }

    public double getSide2() {
        return side2;
    }

    public void setSide2(double side2) {
        this.side2 = side2;
    }

    public double getSide3() {
        return side3;
    }

    public void setSide3(double side3) {
        this.side3 = side3;
    }

    public boolean isCheck() {
        return check;
    }

    public void setCheck(boolean check) {
        this.check = check;
    }

    //check phải tam giác hay không
    public boolean checkTriangle() {
        if((this.side1+this.side2)>this.side3&&(this.side1+this.side3)>this.side2&&(this.side2+this.side3)>this.side1) {
            return this.check=true;
        } else {
            return this.check=false;
        }
    }

    //Một phương thức getPerimeter() trả về chu vi của tam giác.
    public String getPerimeter() {
        if(this.checkTriangle()) {
            return "Perimeter of triangle is: "+(this.side1+this.side2+this.side3);
        } else {
            return "DOES NOT EXIST TRIANGLE";
        }
    }

    //Một phương thức getArea() trả về diện tích của tam giác.
    // gọi p là nửa chu vi tam giác
    // Diện tích tam giác bất kì = (p*(p-side1)*(p-side2)*(p-side3))^1/2
    public String getArea() {
        if(this.checkTriangle()) {
            double p=(this.side1+this.side2+this.side3)/2; //nửa chu vi
            return "Area of triangle is: "+ Math.sqrt(p*(p-this.side1)*(p-this.side2)*(p-this.side3));
        } else {
            return "DOES NOT EXIST TRIANGLE";
        }
    }

    //Một phương thức toString() trả về thông tin của tam giác dưới dạng chuỗi ký tự.
    @Override
    public String toString() {
        return "Triangle has side1= "+this.side1
                +"\nside2= "+this.side2
                +"\nside3= "+this.side3
                +"\ncolor: "+this.getColor()
                +"\n"+this.getPerimeter()
                +"\n"+this.getArea()
                +"\nwhich is a subclass of "+super.toString();
    }
}

//Class hình chữ nhật
/*Lớp Hình chữ nhật có các thuộc tính: width (chiều rộng), height (chiều cao),
phương thức khởi tạo không tham số và có 2 tham số,
các phương thức: getArea() (tính diện tích), getPerimeter() (tính chu vi) và display() (hiển thị).*/
package b4_OPP.Thuc_hanh.Rectangle;

public class Rectangle {
 //    Bước 1: Tạo lớp Rectangle, khai báo các thuộc tính (properties),
//    định nghĩa các phương thức khởi tạo (contructors).
    double width, height;

    public Rectangle() {
    }
    //thuộc tính
    public Rectangle(double width, double height) {
        this.width=width;
        this.height=height;
    }

    //hành vi
    //tính diện tích hình chữ nhật
    public double getArea() {
        return this.width*this.height;
    }

    //tính chu vi hình chữ nhật
    public double getParimeter() {
        return (this.width+this.height)*2;
    }

    //hiển thị
    public String display() {
        return "Rectangle{"+"width="+this.width+", height="+this.height+"}";
    }
}

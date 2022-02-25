package b4_OPP.Thuc_hanh.Rectangle;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter the Width: ");
        double width=scanner.nextDouble();
        System.out.print("Enter the Height: ");
        double height=scanner.nextDouble();
        Rectangle rectangle=new Rectangle(width,height);
        //hiển thị
        System.out.println("Your Rectangle: "+rectangle.display());
        //tính chu vi hình chữ nhật
        System.out.println("Perimeter of the rectangle: "+rectangle.getParimeter());
        //tính diện tích hình chữ nhật
        System.out.println("Area of the Rectangle: "+rectangle.getArea());
    }
}

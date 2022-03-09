package b7_abtract_class_and_interface.bai_tap.interface_colorable_for_geometry_class;

import b6_inheritance.thuc_hanh.system_of_geometric_objects.Square;

public class SquareColorableTest {
    public static void main(String[] args) {
        Square[] square = new Square[3];
        square[0] = new Square();
        square[1] = new Square(3.0);
        square[2] = new SquareColorable(5.0);
        for (int i = 0; i < square.length; i++) {
            System.out.println("Area square " + i + " is: " + square[i].getArea());
            if (square[i] instanceof SquareColorable) {
                System.out.print("Square has Colorable is Square "+i+": ");
                ((SquareColorable) square[i]).howToColor();
            }
        }
    }
}

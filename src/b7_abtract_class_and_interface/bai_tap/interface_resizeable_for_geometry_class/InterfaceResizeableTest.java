package b7_abtract_class_and_interface.bai_tap.interface_resizeable_for_geometry_class;

import b6_inheritance.thuc_hanh.system_of_geometric_objects.Shape;

public class InterfaceResizeableTest {
    public static void main(String[] args) {
        Shape[] shape=new Shape[3];
        shape[0]=new CircleResizeable(3.0);
        shape[1]=new RectangleResizeable(4,5);
        shape[2]=new SquareResizeable(6);
        for (Shape geometry: shape
             ) {
            if(geometry instanceof CircleResizeable) {
                ((CircleResizeable) geometry).resize(50.0);
            } else if(geometry instanceof RectangleResizeable) {
                ((RectangleResizeable) geometry).resize(75.0);
            } else {
                ((SquareResizeable) geometry).resize(100.0);
            }
        }
    }
}

package b7_abtract_class_and_interface.bai_tap.interface_resizeable_for_geometry_class;

import b6_inheritance.thuc_hanh.system_of_geometric_objects.Rectangle;

public class RectangleResizeable extends Rectangle implements Resizeable {
    //constructor
    public RectangleResizeable(double width, double length) {
        super(width,length);
    }


    @Override
    public void resize(double percent) {
        System.out.println("Area BEFORE increase size of Rectangle: "+this.getArea());
        System.out.println("Area AFTER increase size of Rectangle: "+percent+"% is: "+(this.getArea()+(this.getArea()*percent/100)));
    }
}

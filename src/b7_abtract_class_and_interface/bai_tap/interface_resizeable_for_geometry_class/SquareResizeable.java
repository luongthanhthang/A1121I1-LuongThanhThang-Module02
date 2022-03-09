package b7_abtract_class_and_interface.bai_tap.interface_resizeable_for_geometry_class;

import b6_inheritance.thuc_hanh.system_of_geometric_objects.Square;

public class SquareResizeable extends Square implements Resizeable {

    //constructor
    public SquareResizeable(double side) {
        super(side);
    }

    @Override
    public void resize(double percent) {
        System.out.println("Area BEFORE increase size of Square: "+this.getArea());
        System.out.println("Area AFTER increase size of Square: "+percent+"% is: "+(this.getArea()+(this.getArea()*percent/100)));
    }
}

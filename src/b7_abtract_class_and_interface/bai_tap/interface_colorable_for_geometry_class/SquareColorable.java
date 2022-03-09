package b7_abtract_class_and_interface.bai_tap.interface_colorable_for_geometry_class;

import b6_inheritance.thuc_hanh.system_of_geometric_objects.Square;

public class SquareColorable extends Square implements Colorable {
    //constructor
    public SquareColorable(){}
    public SquareColorable(double side){
        super(side);
    }

    @Override
    public void howToColor() {
        System.out.println("Color all four sides");
    }
}

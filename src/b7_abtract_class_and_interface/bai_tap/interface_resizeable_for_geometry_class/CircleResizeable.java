package b7_abtract_class_and_interface.bai_tap.interface_resizeable_for_geometry_class;

import b6_inheritance.thuc_hanh.system_of_geometric_objects.Circle;

public class CircleResizeable extends Circle implements Resizeable {

    //constructor
    public CircleResizeable(){}
    public CircleResizeable(double radius){
        super(radius);
    }

    @Override
    public void resize(double percent) {
        System.out.println("Area BEFORE increase size of Circle: "+this.getArea());
        System.out.println("Area AFTER increase size of Circle: "+percent+"% is: "+(this.getArea()+(this.getArea()*percent/100)));
    }
}

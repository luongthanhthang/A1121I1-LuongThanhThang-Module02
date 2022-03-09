package b7_abtract_class_and_interface.thuc_hanh.implement_comparable_for_geometry_class;

import b6_inheritance.thuc_hanh.system_of_geometric_objects.Circle;

public class ComparableCircle extends Circle implements Comparable<ComparableCircle>{

    public ComparableCircle() {
    }

    public ComparableCircle(double radius) {
        super(radius);
    }

    public ComparableCircle(double radius, String color, boolean filled) {
        super(radius, color, filled);
    }

    // ghi đè lại phương thức compareTo để sử dụng lại sort(), lớp trước và sau khi so sánh bị thay đổi
    @Override
    public int compareTo(ComparableCircle circle) {
        if(this.getRadius()>circle.getRadius()) {
            return 1;
        } else if(this.getRadius()<circle.getRadius()) {
            return -1;
        } else {
            return 1;
        }
    }
}

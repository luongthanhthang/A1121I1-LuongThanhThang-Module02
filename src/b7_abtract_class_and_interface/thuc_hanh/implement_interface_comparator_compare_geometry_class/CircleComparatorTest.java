package b7_abtract_class_and_interface.thuc_hanh.implement_interface_comparator_compare_geometry_class;

import b6_inheritance.thuc_hanh.system_of_geometric_objects.Circle;
import b7_abtract_class_and_interface.thuc_hanh.implement_comparable_for_geometry_class.ComparableCircle;

import java.util.Arrays;
import java.util.Comparator;

public class CircleComparatorTest {
    public static void main(String[] args) {
        Circle[] circles=new Circle[3];
        circles[0]=new Circle(3.6);
        circles[1]=new Circle(); // giá trị mặc dịnh là 1.0
        circles[2]=new Circle(3.5, "indigo", false);

        // suất mảng trước khi sắp xếp
        System.out.println("Pre-sorted: ");
        for (Circle circle: circles
        ) {
            System.out.println(circle);
        }

        // sắp xếp lại mảng
        Comparator circleComparator =new CircleComparator();
        Arrays.sort(circles, circleComparator);

        //Xuất lại mảng sau khi sắp xếp
        System.out.println("\nAfter-sorted: ");
        for (Circle circle: circles
        ) {
            System.out.println(circle);
        }
    }
}

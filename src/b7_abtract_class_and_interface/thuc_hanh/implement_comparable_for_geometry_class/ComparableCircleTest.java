package b7_abtract_class_and_interface.thuc_hanh.implement_comparable_for_geometry_class;

import java.util.Arrays;

public class ComparableCircleTest {
    public static void main(String[] args) {
        ComparableCircle[] circles=new ComparableCircle[3];
        circles[0]=new ComparableCircle(3.6);
        circles[1]=new ComparableCircle();  // mặc định là 1.0
        circles[2]=new ComparableCircle(3.5, "indigo", false);

        // suất mảng trước khi sắp xếp
        System.out.println("Pre-sorted: ");
        for (ComparableCircle circle: circles
             ) {
            System.out.println(circle);
        }

        // sắp xếp lại các phần tử trong mảng
        Arrays.sort(circles);

        //Xuất lại mảng sau khi sắp xếp
        System.out.println("\nAfter-sorted: ");
        for (ComparableCircle circle: circles
        ) {
            System.out.println(circle);
        }
    }
}

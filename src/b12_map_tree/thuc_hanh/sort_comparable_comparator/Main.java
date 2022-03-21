package b12_map_tree.thuc_hanh.sort_comparable_comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Student student = new Student("Kien", 30, "HT");
        Student student1 = new Student("Nam", 26, "HN");
        Student student2 = new Student("Anh", 38, "HT" );
        Student student3 = new Student("Tung", 38, "HT" );

        List<Student> lists = new ArrayList<Student>();
        lists.add(student);
        lists.add(student1);
        lists.add(student2);
        lists.add(student3);

        // đang sắp xếp theo tên
        Collections.sort(lists);
        for (Student students: lists
             ) {
            System.out.println(students.toString());
        }

        //sắp xếp theo tuổi
        AgeComparator ageComparator = new AgeComparator();
        Collections.sort(lists, ageComparator);
        System.out.println("so sánh theo tuổi: ");
        for (Student students: lists
             ) {
            System.out.println(students.toString());
        }
    }
}

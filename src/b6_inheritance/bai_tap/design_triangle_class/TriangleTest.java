package b6_inheritance.bai_tap.design_triangle_class;

public class TriangleTest {
    public static void main(String[] args) {
        Triangle triangle=new Triangle();
        System.out.println(triangle);

        triangle=new Triangle(3,4,5);
        System.out.println("\n"+triangle);

        triangle=new Triangle(3,4,5,"red");
        System.out.println("\n"+triangle);

        triangle=new Triangle(1,1,5);
        System.out.println("\n"+triangle);
    }
}

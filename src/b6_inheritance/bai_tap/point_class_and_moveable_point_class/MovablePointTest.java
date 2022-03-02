package b6_inheritance.bai_tap.point_class_and_moveable_point_class;

public class MovablePointTest {
    public static void main(String[] args) {
        MovablePoint movablePoint=new MovablePoint();
        System.out.println(movablePoint);
        System.out.println("Move: "+movablePoint.move());

        movablePoint=new MovablePoint(2,3,4,5);
        System.out.println("\n"+movablePoint);
        System.out.println("Move: "+movablePoint.move());

        movablePoint=new MovablePoint(6,7);
        System.out.println("\n"+movablePoint);
        System.out.println("Move: "+movablePoint.move());

    }
}

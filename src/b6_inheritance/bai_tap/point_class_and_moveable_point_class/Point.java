package b6_inheritance.bai_tap.point_class_and_moveable_point_class;

import java.util.Arrays;

public class Point {
    private float x=0.0f;
    private float y=0.0f;

    //constructor
    public Point() {}
    public Point(float x, float y) {
        this.x=x;
        this.y=y;
    }

    //setter getter
    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    public void setXY(float x, float y) {
        this.x=x;
        this.y=y;
    }

    public float[] getXY() {
        float[] arr={this.x, this.y};
        return arr;
    }

    @Override
    public String toString() {
        return "x: " +
                getX()
                +" y: "
                +getY()
                +" Array xy"
                + Arrays.toString(getXY());
    }
}

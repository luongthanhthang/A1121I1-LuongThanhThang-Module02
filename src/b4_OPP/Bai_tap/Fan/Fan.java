package b4_OPP.Bai_tap.Fan;

public class Fan {
    //2 hằng được đặt tên là SLOW, MEDIUM,
    // và FAST với giá trị 1, 2, và 3 để biểu thị tốc độ quạt.
    final int SLOW = 1;
    final int MEDIUM = 2;
    final int FAST = 3;

    public int getSLOW() {
        return SLOW;
    }

    public int getMEDIUM() {
        return MEDIUM;
    }

    public int getFAST() {
        return FAST;
    }

    //Trường speed có kiểu số nguyên
    // (private int) để xác định tốc độ quạt, mặc định là SLOW
    private int speed = SLOW;

    //Trường on có kiểu private boolean
    // để xác định quạt đang bật hay tắt, mặc định là false (tắt).
    private boolean on = false;

    //Trường radius có kiểu private
    // double để xác định bán kính quạt, giá trị mặc định là 5
    private double radius = 5;

    //Trường color có kiểu
    // dữ liệu private String để xác định màu quạt, mặc định là blue
    private String color = "blue";

    //getter setter
    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    //Phương thức (khởi tạo) không tham số tạo đối tượng fan mặc định
    public Fan() {

    }

    //Phương thức toString() trả về chuỗi chứa thông tin của quạt.
    // Nếu quạt đang ở trạng thái on,
    // phương thức trả về speed, color, và radius với chuỗi “fan is on”.
    // Nếu quạt không ở trạng thái on,
    // phương thức trả về color, radius với chuỗi “fan is off”.
    public String toString() {
        if (this.on) {
            return "Fan is on: \n- speed: " + this.speed
                    + "\n- color: " + this.color
                    + "\n- radius: " + this.radius;
        } else {
            return "Fan is off: \n- color: " + this.color
                    + "\n- radius: " + this.radius;
        }
    }
}

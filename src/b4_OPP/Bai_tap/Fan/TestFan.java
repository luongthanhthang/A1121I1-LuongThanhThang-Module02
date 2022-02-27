//Tạo 2 đối tượng Fan
//Đối tượng Fan 1: Gán giá trị lớn nhất cho speed, radius là 10, color là yellow và quạt ở trạng thái bật.
//Đối tượng Fan 2: Gán giá trị trung bình cho speed, radius là 5, color là blue và quạt ở trạng thái tắt
package b4_OPP.Bai_tap.Fan;

public class TestFan {
    public static void main(String[] args) {
        //Đối tượng Fan 1: Gán giá trị lớn nhất cho speed,
        // radius là 10, color là yellow và quạt ở trạng thái bật.
        Fan fan1=new Fan();
        fan1.setSpeed(fan1.getFAST());
        fan1.setRadius(10);
        fan1.setColor("Yellow");
        fan1.setOn(true);
        System.out.println("Fan1: "+fan1.toString());

        //Đối tượng Fan 2: Gán giá trị trung bình cho speed,
        // radius là 5, color là blue và quạt ở trạng thái tắt
        Fan fan2=new Fan();
        fan2.setSpeed(fan2.getMEDIUM());
        fan2.setRadius(5);
        fan2.setColor("blue");
        fan2.setOn(false);
        System.out.println("Fan2: "+fan2.toString());
    }

}

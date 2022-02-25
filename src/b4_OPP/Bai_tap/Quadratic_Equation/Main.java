//Nhập vào 3 giá trị cho a, b, c và hiển thị kết quả dựa trên việc tính delta.
//Nếu delta >= 0, hiển thị 2 nghiệm. Nếu delta bằng 0, hiển thị một nghiệm (do 2 nghiệm bằng nhau).
//Còn lại hiển thị chuỗi “The equation has no roots”
package b4_OPP.Bai_tap.Quadratic_Equation;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("enter a: ");
        double a=scanner.nextDouble();
        System.out.print("enter b: ");
        double b=scanner.nextDouble();
        System.out.print("enter c: ");
        double c=scanner.nextDouble();
        QuadraticEquation quadraticEquation = new QuadraticEquation();
        quadraticEquation.setA(a);
        quadraticEquation.setB(b);
        quadraticEquation.setC(c);
        if(quadraticEquation.getDiscriminant()>=0) {
            System.out.println("the equation has 2 root: ");
            System.out.println("Root 1: "+quadraticEquation.getRoot1());
            System.out.println("Root 2: "+quadraticEquation.getRoot2());
        } else {
            System.out.println("The equation has no roots");
        }
    }
}

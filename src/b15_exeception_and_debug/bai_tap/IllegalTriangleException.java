package b15_exeception_and_debug.bai_tap;

import java.util.Scanner;

//Viết một ứng dụng nhập vào 3 cạnh của hình tam giác.
// Kiểm tra nếu giá trị nhập vào là số âm hoặc tổng 2 cạnh không lớn hơn cạnh còn lại thì sinh ngoại lệ.
public class IllegalTriangleException {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Check the 3 sides of the triangle");
        System.out.print("Input side 1: ");
        int sideOne = scanner.nextInt();
        System.out.print("Input side 2: ");
        int sideTwo = scanner.nextInt();
        System.out.print("Input side 3: ");
        int sideThree = scanner.nextInt();
        try {
            checkTriangle(sideOne, sideTwo, sideThree);
            System.out.print("3 cạnh của tam giác là " + sideOne + ", " + sideTwo + ", " + sideThree);
        } catch (ExceptionTriangle e) {
            e.printStackTrace();
        }

        System.out.print("3 cạnh của tam giác là " + sideOne + ", " + sideTwo + ", " + sideThree);

        //cách không sử dụng try catch
//        IllegalTriangleException illegalTriangleException = new IllegalTriangleException();
//        illegalTriangleException.checkTriangle(sideOne, sideTwo, sideThree);
//        System.out.print("3 cạnh của tam giác là " + sideOne + ", " + sideTwo + ", " + sideThree);

    }

//    //cách không dùng class exception riêng
//    private void checkTriangle(int side1, int side2, int side3) {
//        if (!(side1 + side2 > side3 && side1 + side3 > side2 && side2 + side3 > side1)) {
//            throw new RuntimeException("Không tồn tại tam giác");
//        }
//    }

    //cách sử dụng class riêng try catch
    public static void checkTriangle(int side1, int side2, int side3) throws ExceptionTriangle {
        if ((side1 + side2 > side3 && side1 + side3 > side2 && side2 + side3 > side1)) {
            return;
        }
        throw new ExceptionTriangle("Không tồn tại tam giác");
    }
}

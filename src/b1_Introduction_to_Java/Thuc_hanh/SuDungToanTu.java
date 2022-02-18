package b1_Introduction_to_Java.Thuc_hanh;

import java.util.Scanner;

//Viết một ứng dụng để tính diện tích của hình chữ nhật dựa vào chiều rộng và chiều cao được nhập vào.
public class SuDungToanTu {
    public static void main(String[] args) {
        float width;
        float height;
        Scanner scanner=new Scanner(System.in); //khai báo đối tượng scanner
        System.out.println("Enter width: ");
        width=scanner.nextFloat(); //Nhập chiều rộng

        System.out.println("Enter height: ");
        height=scanner.nextFloat(); //Nhập chiều dài
        float area=width*height;
        System.out.println("Area is "+area);

    }
}

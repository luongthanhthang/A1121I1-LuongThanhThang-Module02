package b17_binaryfile_serialization.bai_tap.product_management_binary_file;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TestProductFile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("ENTER PATH: ");
        //D:\CodeGym\Module 2\src\file_txt\tên file.dat
        String path = scanner.nextLine();

        ProductManagement productManagement = new ProductManagement();
        System.out.println("-----------Menu Product---------");
        while (true) {
            System.out.println("1. add product: ");
            System.out.println("2. display product: ");
            System.out.println("3. search product: ");
            System.out.println("4. EXIT ");
            System.out.print("Enter input: ");
            switch (Integer.parseInt(scanner.nextLine())) {
                case 1:
                    //thêm sản phẩm vào file
                    productManagement.addProduct(path);
                    break;
                case 2:
                    //hiển thị sản phẩm
                    try {
                        productManagement.displayProduct(path);
                    } catch (Exception e) {
                        e.getStackTrace();
                    }
                    break;
                case 3:
                    try {
                        //tìm kiếm sản phẩm
                        productManagement.searchProduct(path);
                    } catch (Exception e) {
                        e.getStackTrace();
                    }
                    break;
                case 4:
                    System.exit(0);
            }
        }
    }
}

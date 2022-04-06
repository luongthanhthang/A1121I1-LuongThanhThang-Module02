package b17_binaryfile_serialization.thuc_hanh.write_read_binary_file;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class WriteReadObjectTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("ENTER PATH: ");
        //D:\CodeGym\Module 2\src\file_txt\tên file.dat
        String path = scanner.nextLine();

        List<Product> productList = new ArrayList<>();
        productList.add(new Product(1, "Vũ Kiều Anh", "Hà Nội"));
        productList.add(new Product(2, "Nguyễn Minh Quân", "Hà Nội"));
        productList.add(new Product(3, "Đặng Huy Hoà", "Đà Nẵng"));
        productList.add(new Product(4, "Nguyễn Khánh Tùng", "Hà Nội"));
        productList.add(new Product(5, "Nguyễn Khắc Nhật", "Hà Nội"));
        //ghi file
        ReadWriteObject writeReadFileObject = new ReadWriteObject();
//        writeReadFileObject.writeToFileObject(path, studentList);
        //đọc file
        List<Product> studentsRead = new ArrayList<>();
        studentsRead = writeReadFileObject.readFromFileObject(path);
        studentsRead.forEach(System.out::println);

    }
}

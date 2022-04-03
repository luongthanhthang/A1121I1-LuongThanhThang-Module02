package b16_IO_text_file.bai_tap.copy_file;

import java.util.Scanner;

public class TestCopyFile {
    public static void main(String[] args) {
        //Nhập nơi file cần copy
        System.out.print("Enter the path source: ");
        // đường dẫn: D:\CodeGym\Module 2\src\file_txt\number.txt
        Scanner scanner = new Scanner(System.in);
        String pathSource = scanner.nextLine();
        //Nhập nơi file cần copy đến
        System.out.print("Enter the path target: ");
        String pathTarget = scanner.nextLine();
        //khởi tạo copy file
        FileCopy fileCopy = new FileCopy();
        fileCopy.copyFile(pathSource, pathTarget);
        System.out.println("Copy file thành công!");
        //đọc file nguồn
        System.out.println("data file source");
        fileCopy.readFromFile(pathSource);
        //đọc file sau khi copy
        System.out.println("data file target");
        fileCopy.readFromFile(pathTarget);
    }
}

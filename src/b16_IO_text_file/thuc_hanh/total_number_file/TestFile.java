package b16_IO_text_file.thuc_hanh.total_number_file;

import java.util.Scanner;

public class TestFile {
    public static void main(String[] args) {
        System.out.print("Enter the path: ");
        // đường dẫn: D:\CodeGym\Module 2\src\file_txt\number.txt
        Scanner scanner = new Scanner(System.in);
        String path = scanner.nextLine();
        ReadFileExample fileExample = new ReadFileExample();
        fileExample.writeToFile(path);
        System.out.println("List number write success");
        System.out.println("Sum number in file: ");
        fileExample.readFromFile(path);
    }
}

package b16_IO_text_file.thuc_hanh.number_max;

import java.util.List;
import java.util.Scanner;

public class TestFileFindMax {
    public static void main(String[] args) {
        System.out.print("Enter the path: ");
        Scanner scanner = new Scanner(System.in);
        // đường dẫn D:\CodeGym\Module 2\src\file_txt\ tên file.txt
        String path = scanner.nextLine();
        ReadAndWriteFile writeFile = new ReadAndWriteFile();
        //nhập data và list và vào file
        List<Integer> listFindMax = writeFile.writeToFile(path);
        //tìm số lớn nhất trong list
        int max = FindMaxValue.findMax(listFindMax);
        // ghi thêm dòng max của file
        writeFile.writeMaxToFile(path, max);
        System.out.println("List number write success");
        System.out.println("Result in file: ");
        // đọc file
        writeFile.readFromFile(path);
    }
}

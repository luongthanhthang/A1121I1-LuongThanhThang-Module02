package b16_IO_text_file.thuc_hanh.number_max;

import b16_IO_text_file.thuc_hanh.total_number_file.ReadFileExample;

import java.util.Scanner;

public class TestFileFindMax {
    public static void main(String[] args) {
        System.out.print("Enter the path: ");
        Scanner scanner = new Scanner(System.in);
        String path = scanner.nextLine();
        ReadFileExample fileExample = new ReadFileExample();
        fileExample.writeToFile(path);
        System.out.println("List number write success");
        System.out.println("Result in file: ");
        fileExample.readFromFile(path);
    }
}

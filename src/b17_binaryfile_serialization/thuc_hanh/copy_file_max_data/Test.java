package b17_binaryfile_serialization.thuc_hanh.copy_file_max_data;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter source file:");
        String sourcePath = scanner.nextLine();
        System.out.print("Enter destination file:");
        String destPath = scanner.nextLine();

        File sourceFile = new File(sourcePath);
        File destFile = new File(destPath);

        CopyFileMax fileMax = new CopyFileMax();

        //test file sử dụng copyFileUsingJava7Files
//        fileMax.copyFileUsingJava7Files(sourceFile, destFile);

        //test file sử dụng copyFileUsingStream
        fileMax.copyFileUsingStream(sourceFile, destFile);

        System.out.print("Copy completed");
    }
}

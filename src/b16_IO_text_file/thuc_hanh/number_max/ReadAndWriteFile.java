package b16_IO_text_file.thuc_hanh.number_max;

//Viết một ứng dụng cho phép đọc một file text chứa các số nguyên và tìm giá trị lớn nhất trong các số đó và ghi ra file.
//Ứng dụng cho phép nhập vào đường dẫn của file và tìm giá trị lớn nhất của
// các số hiện có trong file và sau đó ghi ra tệp tin có tên là result.txt.
//Trong file text, mỗi số nguyên được ngăn cách với nhau bởi dấu cách.

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ReadAndWriteFile {
    //ghi vào file
    Scanner scanner = new Scanner(System.in);

    public List<Integer> writeToFile(String path) {
        System.out.print("Input number element: ");
        int size = Integer.parseInt(scanner.nextLine());
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            System.out.print("Enter element: [" + i + "]: ");
            list.add(scanner.nextInt());
        }
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(path))) {
            for (Integer element : list
            ) {
                writer.write(element);
                writer.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return list;
    }

    //đọc file
    public void readFromFile(String path) {
        // Đọc file theo đường dẫn
        //kiểm tra file có tồn tại không, nếu không thì ném ngoại lệ
        try {
            File file = new File(path);
            if (!file.exists()) {
                throw new FileNotFoundException();
            }

            // Đọc từng dòng của file và tiến hành cộng tổng lại
            BufferedReader reader = new BufferedReader(new FileReader(path));
            String line = null;
            while ((line = reader.readLine()) != null) {
                //chuyển thành số vì trong file chỉ có kiểu String
//                try {
                System.out.println(line);
//                } catch (Exception e) {
//                    System.out.println("dòng này bị lỗi");
//                }
            }
            //đóng file
            reader.close();

            // Hiển thị ra tổng các số trong file
        } catch (Exception e) {
            System.err.println("File không tồn tại or nội dung có lỗi");
        }
    }


}

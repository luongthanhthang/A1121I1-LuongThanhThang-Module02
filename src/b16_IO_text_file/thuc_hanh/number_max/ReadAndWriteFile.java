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
            list.add(Integer.parseInt(scanner.nextLine()));
        }
        //true là cho ghi tiếp vào file, false là không cho (nghĩa là sẽ ghi đè nội dung cũ)
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(path))) {
            for (Integer element : list) {
                //phải chuyển về lại String vì ghi đọc chỉ đọc được kiểu String
                writer.write(Integer.toString(element));
                //trỏ con trỏ xuống dòng
                writer.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return list;
    }

    //ghi thêm dòng tìm ra max vào file
    public void writeMaxToFile(String path, int max) {
        // true là được ghi tiếp vào file, false thì ghi đè vào file
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(path, true));) {
            writer.write("Max into list :" + max);
        } catch (IOException e) {
            e.printStackTrace();
        }
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

            // Đọc từng dòng của file
            BufferedReader reader = new BufferedReader(new FileReader(path));
            String line = null;
            while ((line = reader.readLine()) != null) {
                //chuyển thành số vì trong file chỉ có kiểu String
                System.out.println(line);
            }
            //đóng file
            reader.close();

            // Hiển thị ra tổng các số trong file
        } catch (Exception e) {
            System.err.println("File không tồn tại or nội dung có lỗi");
        }
    }


}

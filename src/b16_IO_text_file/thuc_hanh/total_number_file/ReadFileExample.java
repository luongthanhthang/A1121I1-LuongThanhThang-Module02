package b16_IO_text_file.thuc_hanh.total_number_file;


import java.io.*;
import java.util.Scanner;

public class ReadFileExample {
    //ghi vào file
    Scanner scanner = new Scanner(System.in);

    public void writeToFile(String path) {
        System.out.print("Input number element: ");
        int size = Integer.parseInt(scanner.nextLine());
        String[] list = new String[size];
        for (int i = 0; i < list.length; i++) {
            System.out.print("Enter element: [" + i + "]: ");
            list[i] = scanner.nextLine();
        }
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(path))) {
            for (String element : list
            ) {
                writer.write(element);
                writer.newLine();
            }
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

            // Đọc từng dòng của file và tiến hành cộng tổng lại
            BufferedReader reader = new BufferedReader(new FileReader(path));
            String line = null;
            int sum = 0;
            while ((line = reader.readLine()) != null) {
                //chuyển thành số vì trong file chỉ có kiểu String
//                try {
                sum += Integer.parseInt(line);
                System.out.println(line);
//                } catch (Exception e) {
//                    System.out.println("dòng này bị lỗi");
//                }
            }
            System.out.println("SUM in file " + sum);

            //đóng file
            reader.close();

            // Hiển thị ra tổng các số trong file
        } catch (Exception e) {
            System.err.println("File không tồn tại or nội dung có lỗi");
        }
    }
}

package b16_IO_text_file.bai_tap.copy_file;

import java.io.*;

//Viết một chương trình cho phép người dùng sao chép các tập tin.
// Người sử dụng cần phải cung cấp một tập tin nguồn (source file) và một tập tin đích (target file).
//Chương trình sao chép tệp nguồn vào tệp tin đích và hiển thị số ký tự trong tệp.
// Chương trình nên cảnh báo người dùng nếu tệp nguồn không tồn tại hoặc nếu tập tin đích đã tồn tại.
//Để sao chép nội dung từ tệp tin nguồn đến tệp tin đích,
// bạn nên sử dụng luồng đầu vào để đọc ký tự từ tệp nguồn và luồng đầu ra để gửi byte đến tệp tin đích, bất kể nội dung của tệp.
public class FileCopy {
    // cho vào nơi file nguồn, và nơi file đã được copy đưa đến
    public void copyFile(String sourcePath, String targetPath) {
        try {
            //Đọc file theo đường dẫn, để kiểm tra file có tồn tại không
            File file = new File(sourcePath);
            if (!file.exists()) {
                throw new FileNotFoundException();
            }

            //đọc từng dòng trong file sau đó sao chép lại
            BufferedReader reader = new BufferedReader(new FileReader(sourcePath));
            String line = null;
            BufferedWriter writerFile = new BufferedWriter(new FileWriter(targetPath));
            //đọc file và copy vào file mình tạo
            while ((line = reader.readLine()) != null) {
                // copy vào file (ghi vào file mới)
                writerFile.write(line);
                writerFile.newLine();
            }
            //đóng file
            reader.close();
            writerFile.close();
        } catch (Exception e) {
            System.err.println("Fie không tồn tại or nội dung có lỗi!");
            e.getStackTrace();
        }
    }

    //đọc file đã copy
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

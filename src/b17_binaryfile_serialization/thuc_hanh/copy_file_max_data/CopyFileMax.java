package b17_binaryfile_serialization.thuc_hanh.copy_file_max_data;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;

public class CopyFileMax {
    void copyFileUsingJava7Files(File source, File dest) {
        //File có sẵn phương thức copy(đường link nguồn, link đích)
        // toPath : xuất địa chỉ của file
        //StandardCopyOption giống với valueOf(): trả về hằng số với tên chỉ định
        //StandardCopyOption.REPLACE_EXISTING thay thế file đã tồn tại
        //StandardCopyOption.COPY_ATTRIBUTES sao chếp các thuộc tính vào tệp mới
        //StandardCopyOption.ATOMIC_MOVE di chuyển tệp dưới dạng hoạt động của hệ thống tệp nguyên tử

        try {
            Files.copy(source.toPath(), dest.toPath(), StandardCopyOption.REPLACE_EXISTING);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

     void copyFileUsingStream(File source, File dest) {

        try (InputStream is = new FileInputStream(source);
             OutputStream os = new FileOutputStream(dest)) {
            byte[] buffer = new byte[1024];
            int length;
            while ((length = is.read(buffer)) > 0) {
                os.write(buffer, 0, length);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

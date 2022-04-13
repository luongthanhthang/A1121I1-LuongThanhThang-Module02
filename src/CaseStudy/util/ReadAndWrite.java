package CaseStudy.util;

import java.io.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

//đọc ghi file chuẩn
public class ReadAndWrite<T> {

    //ngăn cách các thuộc tính, ngăn cách các ô trong table csv

    //collection lưu trữ các đối tượng như employee, hay customer
    //path là địa chỉ
    //nhập HEADER cho mỗi bảng, vd: "thuộc tính 1, thuộc tính 2"
    public void writeToFile(Collection<T> collection, String path, String inputHeader) {
        File file = new File(path);

        //ghi file
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(file))) {
            //đầu tiên là ghi header
            writer.write(inputHeader);

            //duyệt các phần tử trong mảng và ghi file
            for (T element : collection) {
                //xuống dòng, vì đã có dòng header phía trên
                writer.newLine();

                //ghi các phần tử trong list, ngăn cách bởi dấu ","
                writer.write(element.toString());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    //đọc file
    public List<String> readFromFile(String path) {
        File file = new File(path);
        List<String> list = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String line = null;

            //bỏ qua HEADER
            line = reader.readLine();
            while ((line = reader.readLine())!=null) {
                //tạo mảng chứa các phần tử của list ngăn cách bởi dấu ","
                //phần này ai gọi hàm này thì xử lí
                list.add(line);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
        //return về list String, ai gọi hàm sẽ xử lí phần xuất đối tượng
        return list;
    }
}

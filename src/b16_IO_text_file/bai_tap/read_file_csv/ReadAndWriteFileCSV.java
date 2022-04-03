package b16_IO_text_file.bai_tap.read_file_csv;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadAndWriteFileCSV {
    //vì file csv ngăn cách bằng dấu "," nên tạo một CONST là dấu "," cho dễ sử dụng
    final String SPACE = ",";

    //ghi file CSV
    public void writeListNation(String path, List<Nation> list) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(path));) {
            //header
            writer.write("ID" + SPACE + "CODE" + SPACE + "NAME");
            for (Nation nation : list) {
                //xuống dòng
                writer.newLine();
                writer.write(nation.getId() + SPACE + nation.getCode() + SPACE + nation.getName());
//                writer.flush(); //đẩy từng dòng vào file(dùng khi dự án lớn)
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    //đọc file CSV
    public void readListNation(String path) {
        //tạo 1 list nation để bỏ các phần tử vào
        List<Nation> listNation = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(path))) {
            File file = new File(path);
            if (!file.exists()) {
                throw new FileNotFoundException();
            }
            String line = null;
            //bỏ qua header
            line = reader.readLine();

            //đọc các phần tử còn lại trong file và gán lại vào List
            while ((line = reader.readLine()) != null) {
                //tạo chuỗi String chứa các thuộc tính của đối tượng ngăn cách bởi dấu ","
                String[] propertyNation = line.split(",");
                int id = Integer.parseInt(propertyNation[0]);
                String code = propertyNation[1];
                String name = propertyNation[2];

                //bỏ các đối tượng vào list
                listNation.add(new Nation(id, code, name));
            }

            //đọc ra list nation
            listNation.forEach(System.out::println);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

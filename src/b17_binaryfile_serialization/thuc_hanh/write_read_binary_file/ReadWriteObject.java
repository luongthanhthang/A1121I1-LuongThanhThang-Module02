package b17_binaryfile_serialization.thuc_hanh.write_read_binary_file;


import java.io.*;
import java.util.List;

public class ReadWriteObject {
    //ghi file(output)
    public void writeToFileObject(String path, List<Product> products) {
        try (ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(path))) {
            objectOutputStream.writeObject(products);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    //đọc file
    public List<Product> readFromFileObject(String path) {
        try (ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(path))) {
            return (List<Product>) objectInputStream.readObject();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return null;
    }
}

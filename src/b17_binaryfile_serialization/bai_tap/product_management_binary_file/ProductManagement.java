package b17_binaryfile_serialization.bai_tap.product_management_binary_file;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProductManagement {
    static Scanner scanner = new Scanner(System.in);
    static List<Product> productList = new ArrayList<>();

    //Viết một chương trình cho phép người dùng thêm, hiển thị, tìm kiếm thông tin sản phẩm vào file.
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

    //tạo product mới
    public Product newProduct() {
        System.out.println("-----Enter New Product-----");
        System.out.print("Enter id: ");
        String id = scanner.nextLine();

        System.out.print("Enter name Product: ");
        String nameProduct = scanner.nextLine();

        System.out.print("Enter name Company: ");
        String nameCompany = scanner.nextLine();

        System.out.print("Enter cost: ");
        double cost = Double.parseDouble(scanner.nextLine());

        return new Product(id, nameProduct, nameCompany, cost);
    }

    //thêm product
    public void addProduct(String path) {
        // tiến hành đọc lại file và ghi lại chèn file cũ
        //đọc file để lấy lại list cũ
//        List<Product> productList = readFromFileObject(path);

        // nhập product mới và thêm vào list
        productList.add(newProduct());

        //ghi đè lại file cũ
        writeToFileObject(path, productList);
    }

    //hiển thị file product
    public void displayProduct(String path) {
        //đọc file và hiện thị ra nội dung file
        List<Product> productsRead = readFromFileObject(path);
        productsRead.forEach(System.out::println);
    }

    //tìm kiểm thông tin sản phẩm
    public void searchProduct(String path) {
        //nhập id product để tìm kiếm
        System.out.print("Enter id search of product: ");
        String inInput = scanner.nextLine();

        //đọc lại file để lấy lại list product
        List<Product> productsList = readFromFileObject(path);
        for (Product product: productsList) {
            //nếu tìm được sản phẩm thì hiển thị thông tin sản phẩm đó
            if(inInput.equals(product.getId())) {
                System.out.println("Product tìm được là: "+product);
            }
        }
    }

}

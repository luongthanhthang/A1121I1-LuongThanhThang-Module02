package b12_java_collection_framework.bai_tap.arrayList_linkedlist;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class ProductManagerLinkedList {
    Scanner scanner = new Scanner(System.in);
    List<Product> productList = new LinkedList<>();

    //constructor
    public ProductManagerLinkedList() {}

    //tạo sản phầm mới
    public Product createProduct() {
        System.out.print("Enter the name Product: ");
        String name = scanner.nextLine();
        System.out.print("Enter the id product: ");
        String id = scanner.nextLine();
        System.out.print("Enter the cost product: ");
        double cost = Double.parseDouble(scanner.nextLine());
        return new Product(name, id, cost);
    }

    //phương thức thêm sản phẩm
    public void addProduct() {
        productList.add(createProduct());
    }

    //sửa sản phẩm
    public void editProduct() {
        //hiển thị lại sản phẩm
        displayProduct();
        boolean check = true;
        System.out.print("input id product edit: ");
        String id = scanner.nextLine();

        //tìm sản phẩm theo id và sửa sản phẩm
        for (int i = 0; i < productList.size(); i++) {
            if (id.equals(productList.get(i).getIdProduct())) {
                productList.set(i, createProduct());
            }
        }
    }

    //phương thức xoá sản phẩm theo id
    public void removeProduct() {
        boolean check =true;
        //hiển thị lại phần tử trước khi muốn xoá
        displayProduct();
        System.out.print("enter id product remove: ");
        String idRemove = scanner.nextLine();
        for (Product product : productList) {
            if (idRemove.equals(product.getIdProduct())) {
                productList.remove(product);
                check = false;
            }
        }
        if(check) {
            System.out.println("NOT FOUND ID!");
        }
    }

    // hiển thị sản phẩm
    public void displayProduct() {
        System.out.println("List Product: ");
        for (Product product : productList
        ) {
            System.out.println(product.toString());
        }
    }

    //tìm kiểm sản phẩm theo tên
    public void searchProduct() {
        boolean check = true;
        System.out.print("enter NAME you want to search: ");
        String nameProduct = scanner.nextLine();
        for (Product product : productList) {
            if (nameProduct.equals(product.getNameProduct())) {
                System.out.println(product.toString());
                check = false;
            }
        }
        if(check) {
            System.out.println("NOT FOUND PRODUCT!");
        }
    }

    // sắp xếp sản phầm theo giá tăng dần
    public void sortProductLowToHigh() {
        CostComparator costComparator = new CostComparator();
        Collections.sort(productList, costComparator);
    }

    //sắp xếp sản phầm theo giá giảm dần
    public void sortProductHighToLow() {
        CostComparator costComparator = new CostComparator();
        Collections.sort(productList, costComparator);
        Collections.reverse(productList);
    }
}

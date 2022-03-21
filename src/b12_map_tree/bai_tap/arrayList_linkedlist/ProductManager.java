package b12_map_tree.bai_tap.arrayList_linkedlist;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProductManager {
    Scanner scanner = new Scanner(System.in);
    List<Product> products = new ArrayList<>();

    //constructor

    public ProductManager() {
    }

    //phương thức thêm sản phẩm
    public void addProduct(Product product) {
        products.add(product);
    }

    //sửa sản phẩm
    public void edit(Product product) {
        boolean check = true;
        System.out.print("input id product edit: ");
        String id = scanner.nextLine();

        //tìm sản phẩm theo id
        for(int i=0; i<products.size(); i++) {
            if(id.equals(products.get(i).getIdProduct())) {
                
            }
        }
    }

    //phương thức xoá sản phẩm
    public void removeProduct(Product product) {
        products.remove(product);
    }


}

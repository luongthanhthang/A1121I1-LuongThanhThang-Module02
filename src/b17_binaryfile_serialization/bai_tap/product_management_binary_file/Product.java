package b17_binaryfile_serialization.bai_tap.product_management_binary_file;

import java.io.Serializable;

/*
 Thông tin sản phẩm gồm:
- Mã sản phẩm
- Tên sản phẩm
- Hãn sản xuất
- Giá
- Các mô tả khác*/
public class Product implements Serializable {
    private static final long serialVersionUID = 2L;
    private String id;
    private String nameProduct;
    private String nameCompany;
    private double cost;

    //constructor

    public Product() {
    }

    public Product(String id, String nameProduct, String nameCompany, double cost) {
        this.id = id;
        this.nameProduct = nameProduct;
        this.nameCompany = nameCompany;
        this.cost = cost;
    }

    // setter getter

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNameProduct() {
        return nameProduct;
    }

    public void setNameProduct(String nameProduct) {
        this.nameProduct = nameProduct;
    }

    public String getNameCompany() {
        return nameCompany;
    }

    public void setNameCompany(String nameCompany) {
        this.nameCompany = nameCompany;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id='" + id + '\'' +
                ", nameProduct='" + nameProduct + '\'' +
                ", nameCompany='" + nameCompany + '\'' +
                ", cost=" + cost +
                '}';
    }
}

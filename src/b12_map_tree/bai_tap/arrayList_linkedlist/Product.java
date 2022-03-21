package b12_map_tree.bai_tap.arrayList_linkedlist;

public class Product {
    private String nameProduct;
    private String idProduct;
    private double costProduct;

    //constructor

    public Product() {
    }

    public Product(String nameProduct, String idProduct, double costProduct) {
        this.nameProduct = nameProduct;
        this.idProduct = idProduct;
        this.costProduct = costProduct;
    }

    //getter setter

    public String getNameProduct() {
        return nameProduct;
    }

    public void setNameProduct(String nameProduct) {
        this.nameProduct = nameProduct;
    }

    public String getIdProduct() {
        return idProduct;
    }

    public void setIdProduct(String idProduct) {
        this.idProduct = idProduct;
    }

    public double getCostProduct() {
        return costProduct;
    }

    public void setCostProduct(double costProduct) {
        this.costProduct = costProduct;
    }

    @Override
    public String toString() {
        return "Product{" +
                "nameProduct='" + nameProduct + '\'' +
                ", idProduct='" + idProduct + '\'' +
                ", costProduct=" + costProduct +
                '}';
    }
}

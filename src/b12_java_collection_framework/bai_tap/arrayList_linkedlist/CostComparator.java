package b12_java_collection_framework.bai_tap.arrayList_linkedlist;

import java.util.Comparator;

public class CostComparator implements Comparator<Product> {
    @Override
    public int compare(Product product1, Product product2) {
        if (product1.getCostProduct()>product2.getCostProduct()) {
            return 1;
        } else if (product1.getCostProduct()==product2.getCostProduct()) {
            return 0;
        } else {
            return -1;
        }
    }
}

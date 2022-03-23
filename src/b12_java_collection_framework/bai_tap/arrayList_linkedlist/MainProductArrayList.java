package b12_java_collection_framework.bai_tap.arrayList_linkedlist;

import java.util.Scanner;

public class MainProductArrayList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ProductManagerArrayList productManager = new ProductManagerArrayList();
        boolean check = true;
        while (check) {
            //hiển thị menu
            System.out.println("1. add product");
            System.out.println("2. edit product");
            System.out.println("3. remove product");
            System.out.println("4. display product");
            System.out.println("5. search product");
            System.out.println("6. sort product");
            System.out.println("7. out menu");
            System.out.print("input: ");
            switch (Integer.parseInt(scanner.nextLine())) {
                case 1:
                    System.out.println("----------add product----------");
                    productManager.addProduct();
                    break;
                case 2:
                    System.out.println("----------edit product----------");
                    productManager.editProduct();
                    break;
                case 3:
                    System.out.println("----------remove product----------");
                    productManager.removeProduct();
                    break;
                case 4:
                    System.out.println("----------display product----------");
                    productManager.displayProduct();
                    break;
                case 5:
                    System.out.println("----------search product----------");
                    productManager.searchProduct();
                    break;
                case 6:
                    System.out.println("----------sort product----------");
                    System.out.println("1. sort lowest price -> highest price");
                    System.out.println("2. sort highest price -> lowest price");
                    System.out.print("input sort: ");
                    switch (Integer.parseInt(scanner.nextLine())) {
                        case 1:
                            productManager.sortProductLowToHigh();
                            break;
                        case 2:
                            productManager.sortProductHighToLow();
                            break;
                        default:
                            System.out.println("NOT SORT!");
                    }
                    break;
                case 7:
                    System.exit(0);
                    break;
                default:
                    check = false;
            }
        }
    }
}

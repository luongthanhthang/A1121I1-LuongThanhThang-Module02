package b12_java_collection_framework.bai_tap.arrayList_linkedlist;

import java.util.Scanner;

public class MainProductLinkedList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ProductManagerLinkedList productManagerLinkedList = new ProductManagerLinkedList();
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
                    productManagerLinkedList.addProduct();
                    break;
                case 2:
                    System.out.println("----------edit product----------");
                    productManagerLinkedList.editProduct();
                    break;
                case 3:
                    System.out.println("----------remove product----------");
                    productManagerLinkedList.removeProduct();
                    break;
                case 4:
                    System.out.println("----------display product----------");
                    productManagerLinkedList.displayProduct();
                    break;
                case 5:
                    System.out.println("----------search product----------");
                    productManagerLinkedList.searchProduct();
                    break;
                case 6:
                    System.out.println("----------sort product----------");
                    System.out.println("1. sort lowest price -> highest price");
                    System.out.println("2. sort highest price -> lowest price");
                    System.out.print("input sort: ");
                    switch (Integer.parseInt(scanner.nextLine())) {
                        case 1:
                            productManagerLinkedList.sortProductLowToHigh();
                            break;
                        case 2:
                            productManagerLinkedList.sortProductHighToLow();
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

package CaseStudy.controllers;

import CaseStudy.services.EmployeeService;
import CaseStudy.services.implement.EmployeeServiceImpl;

import java.util.Scanner;

public class FuramaController {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        mainMenu();
    }

    //menu chính
    public static void mainMenu() {
        boolean check = true;
        //check để xem người nhập có nhập những số trong menu hay không
        while (check) {
            System.out.println();
            System.out.println("1\tEmployee Management");
            System.out.println("2\tCustomer Management");
            System.out.println("3\tFacility Management ");
            System.out.println("4\tBooking Management");
            System.out.println("5\tPromotion Management");
            System.out.println("6\tExit");
            System.out.print("input Menu: ");
            //xem chọn vào menu nào
            switch (Integer.parseInt(scanner.nextLine())) {
                case 1:
                    displayEmployeeMenu();
                    break;
                case 2:
                    displayCustomerMenu();
                    break;
                case 3:
                    displayFacilityMenu();
                    break;
                case 4:
                    displayBookingMenu();
                    break;
                case 5:
                    displayPromotionMenu();
                    break;
                case 6:
                    System.exit(0);
                    break;
            }
        }
    }

    public static void displayEmployeeMenu() {
        EmployeeService employeeService = new EmployeeServiceImpl();
        boolean check = true;
        while (check) {
            System.out.println();
            System.out.println("1.\tDisplay list employees");
            System.out.println("2.\tAdd new employee");
            System.out.println("3.\tEdit employee");
            System.out.println("4.\tReturn main menu");
            System.out.print("input Employee Menu: ");
            switch (Integer.parseInt(scanner.nextLine())) {
                case 1:
                    employeeService.display();
                    break;
                case 2:
                    employeeService.addNew();
                    break;
                case 3:
                    employeeService.update();
                    break;
                case 4:
                    mainMenu();
                    break;
            }
        }
    }

    public static void displayCustomerMenu() {
        System.out.println();
        System.out.println("1.\tDisplay list customers");
        System.out.println("2.\tAdd new customer");
        System.out.println("3.\tEdit customer");
        System.out.println("4.\tReturn main menu");
        System.out.print("input Customer Menu: ");
    }

    public static void displayFacilityMenu() {
        System.out.println();
        System.out.println("1.\tDisplay list facility");
        System.out.println("2.\tAdd new facility");
        System.out.println("3.\tDisplay list facility maintenance");
        System.out.println("4.\tReturn main menu");
        System.out.print("input Facility Menu: ");
        scanner.nextInt();
    }

    public static void displayBookingMenu() {
        System.out.println();
        System.out.println("1.\tAdd new booking");
        System.out.println("2.\tDisplay list booking");
        System.out.println("3.\tCreate new contracts");
        System.out.println("4.\tDisplay list contracts");
        System.out.println("5.\tEdit contracts");
        System.out.println("6.\tReturn main menu");
        System.out.print("input Booking Menu: ");
        scanner.nextInt();
    }

    public static void displayPromotionMenu() {
        System.out.println();
        System.out.println("1.\tDisplay list customers use service");
        System.out.println("2.\tDisplay list customers get voucher");
        System.out.println("3.\tReturn main menu");
        System.out.print("input Promotion Menu: ");
        scanner.nextInt();
    }
}

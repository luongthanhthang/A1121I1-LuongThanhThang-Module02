package CaseStudy.controllers;

import CaseStudy.services.CustomerService;
import CaseStudy.services.EmployeeService;
import CaseStudy.services.FacilityService;
import CaseStudy.services.Service;
import CaseStudy.services.implement.BookingServiceImpl;
import CaseStudy.services.implement.CustomerServiceImpl;
import CaseStudy.services.implement.EmployeeServiceImpl;
import CaseStudy.services.implement.FacilityServiceImpl;

import java.util.Scanner;

public class FuramaController {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        mainMenu();
    }

    //menu chính
    public static void mainMenu() {
        boolean check = true;
        //check để xem người nhập có nhập những số trong menu hay không
        while (check) {
            System.out.println("----------Main Menu----------");
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
        //khởi tạo list employee
        EmployeeService employeeList = new EmployeeServiceImpl();
        boolean check = true;
        while (check) {
            System.out.println("\n----------Employee Menu----------");
            System.out.println("1.\tDisplay list employees");
            System.out.println("2.\tAdd new employee");
            System.out.println("3.\tEdit employee");
            System.out.println("4.\tReturn main menu");
            System.out.print("input Employee Menu: ");
            switch (Integer.parseInt(scanner.nextLine())) {
                case 1:
                    employeeList.display();
                    break;
                case 2:
                    employeeList.addNew();
                    break;
                case 3:
                    employeeList.edit();
                    break;
                case 4:
                    mainMenu();
                    break;
            }
        }
    }

    public static void displayCustomerMenu() {
        boolean check = true;
        //khởi tạo list customer
        CustomerService customerList = new CustomerServiceImpl();
        while (check) {
            System.out.println("\n----------Customer Menu----------");
            System.out.println("1.\tDisplay list customers");
            System.out.println("2.\tAdd new customer");
            System.out.println("3.\tEdit customer");
            System.out.println("4.\tReturn main menu");
            System.out.print("input Customer Menu: ");
            switch (Integer.parseInt(scanner.nextLine())) {
                case 1:
                    customerList.display();
                    break;
                case 2:
                    customerList.addNew();
                    break;
                case 3:
                    customerList.edit();
                    break;
                case 4:
                    mainMenu();
                    break;
            }
        }
    }

    public static void displayFacilityMenu() {
        boolean check = true;
        // khởi tạo map list facility
        FacilityService facilityList = new FacilityServiceImpl();
        while (check) {
            System.out.println("\n----------Facility Menu----------");  //Quản lý cơ sở
            System.out.println("1.\tDisplay list facility");
            System.out.println("2.\tAdd new facility");
            System.out.println("3.\tDisplay list facility maintenance");  //bảo trì
            System.out.println("4.\tReturn main menu");
            System.out.print("input Facility Menu: ");
            switch (Integer.parseInt(scanner.nextLine())) {
                case 1:
                    facilityList.display();
                    break;
                case 2:
                    while (true) {
                        System.out.println("1.\tAdd New Villa");
                        System.out.println("2.\tAdd New House");
                        System.out.println("3.\tAdd New Room");
                        System.out.println("4.\tBack to menu");
                        switch (Integer.parseInt(scanner.nextLine())) {
                            case 1:
                                facilityList.addNewVilla();
                                break;
                            case 2:
                                facilityList.addNewHouse();
                                break;
                            case 3:
                                facilityList.addNewRoom();
                                break;
                            case 4:
                                displayFacilityMenu();
                                break;
                        }
                    }
                case 3:
                    facilityList.displayMaintenance();
                    break;
                case 4:
                    mainMenu();
                    break;
            }
        }
    }

    public static void displayBookingMenu() {
        Service bookingList = new BookingServiceImpl();
        boolean check = true;
        while (check) {
            System.out.println("\n----------Booking Menu----------");
            System.out.println("1.\tAdd new booking");
            System.out.println("2.\tDisplay list booking");
            System.out.println("3.\tCreate new contracts");
            System.out.println("4.\tDisplay list contracts");
            System.out.println("5.\tEdit contracts");
            System.out.println("6.\tReturn main menu");
            System.out.print("input Booking Menu: ");
            switch (Integer.parseInt(scanner.nextLine())) {
                case 1:
                    bookingList.addNew();
                    break;
                case 2:
                    bookingList.display();
                    break;
            }
        }
    }

    public static void displayPromotionMenu() {
        boolean check = true;
        while (check) {
            System.out.println("\n----------Promotion Menu----------");
            System.out.println("1.\tDisplay list customers use service");
            System.out.println("2.\tDisplay list customers get voucher");
            System.out.println("3.\tReturn main menu");
            System.out.print("input Promotion Menu: ");
        }
    }
}

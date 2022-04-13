package CaseStudy.controllers;

import CaseStudy.services.*;
import CaseStudy.services.implement.*;

import java.util.Scanner;

public class FuramaController {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        mainMenu();
    }

    //xử lý lỗi đưa ra exception khi nhập chữ

    //menu chính
    public static void mainMenu() {
        boolean check = true;
        //check để xem người nhập có nhập những số trong menu hay không
        while (check) {
            System.out.println("\n----------Main Menu----------");
            System.out.println("1\tEmployee Management");
            System.out.println("2\tCustomer Management");
            System.out.println("3\tFacility Management ");
            System.out.println("4\tBooking Management");
            System.out.println("5\tPromotion Management");
            System.out.println("6\tExit");
            System.out.print("input Menu: ");

            //cho choice bằng 0 vì nó không nằm từ 1->6 và chương trình chạy bình thường
            int choice = 0;
            try {
                choice = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.err.println("Input not Number, Please re-input!");
                e.printStackTrace();
            }

            //xem chọn vào menu nào
            switch (choice) {
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
            //cho choice bằng 0 vì nó không nằm từ 1->6 và chương trình chạy bình thường
            int choice = 0;
            try {
                choice = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.err.println("Input not Number, Please re-input!");
                e.printStackTrace();
            }

            switch (choice) {
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

            //cho choice bằng 0 vì nó không nằm từ 1->6 và chương trình chạy bình thường
            int choice = 0;
            try {
                choice = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.err.println("Input not Number, Please re-input!");
                e.printStackTrace();
            }

            switch (choice) {
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

            //cho choice bằng 0 vì nó không nằm từ 1->6 và chương trình chạy bình thường
            int choice = 0;
            try {
                choice = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.err.println("Input not Number, Please re-input!");
                e.printStackTrace();
            }

            switch (choice) {
                case 1:
                    facilityList.display();
                    break;
                case 2:
                    while (true) {
                        System.out.println("1.\tAdd New Villa");
                        System.out.println("2.\tAdd New House");
                        System.out.println("3.\tAdd New Room");
                        System.out.println("4.\tBack to menu");
                        System.out.print("Input facility: ");
                        //cho choice bằng 0 vì nó không nằm từ 1->6 và chương trình chạy bình thường
                        int inputFacility = 0;
                        try {
                            inputFacility = Integer.parseInt(scanner.nextLine());
                        } catch (NumberFormatException e) {
                            System.err.println("Input not Number, Please re-input!");
                            e.printStackTrace();
                        }
                        switch (inputFacility) {
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
        Service contractList = new ContractServiceImpl();
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

            //cho choice bằng 0 vì nó không nằm từ 1->6 và chương trình chạy bình thường
            int choice = 0;
            try {
                choice = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.err.println("Input not Number, Please re-input!");
                e.printStackTrace();
            }

            switch (choice) {
                case 1:
                    bookingList.addNew();
                    break;
                case 2:
                    bookingList.display();
                    break;
                case 3:
                    contractList.addNew();
                    break;
                case 4:
                    contractList.display();
                    break;
                case 5:
                    contractList.edit();
                    break;
                case 6:
                    mainMenu();
                    break;
            }
        }
    }

    public static void displayPromotionMenu() {
        PromotionService promotionService = new PromotionServiceImpl();
        boolean check = true;
        while (check) {
            System.out.println("\n----------Promotion Menu----------");
            System.out.println("1.\tDisplay list customers use service");
            System.out.println("2.\tDisplay list customers get voucher");
            System.out.println("3.\tReturn main menu");
            System.out.print("input Promotion Menu: ");

            //cho choice bằng 0 vì nó không nằm từ 1->6 và chương trình chạy bình thường
            int choice = 0;
            try {
                choice = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.err.println("Input not Number, Please re-input!");
                e.printStackTrace();
            }

            switch (choice) {
                case 1:
                    promotionService.displayCustomerListUseServiceInYear();
                    break;
                case 2:
                    promotionService.displayCustomerListGetVoucher();
                    break;
                case 3:
                    mainMenu();
                    break;
            }
        }
    }
}

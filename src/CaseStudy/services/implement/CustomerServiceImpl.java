package CaseStudy.services.implement;

import CaseStudy.models.Customer;
import CaseStudy.services.CustomerService;

import java.util.LinkedList;
import java.util.Scanner;

//1. Trong class CustomerServiceImpl sử dụng LinkedList, static property, static block
// để lưu trữ và khởi tạo dữ liệu. Viết các chức năng xử lý business cho phần hiển thị danh sách khách hàng,
// thêm mới khách hàng, chỉnh sửa thông tin cho khách hàng.
//2. Tạo đối tượng CustomerServiceImpl trong FuramaController
//3.  Sử dụng các method business đã viết trong CustomerServiceImpl để hoàn thành chức năng Customer Management
public class CustomerServiceImpl implements CustomerService {
    //khởi tạo list customer
    private static LinkedList<Customer> customerLinkedList = new LinkedList<>();

    //khai báo scanner để người dùng nhập vào thông tin
    Scanner scanner = new Scanner(System.in);

    //tạo đối tượng customer
    public Customer inputCustomer() {
        System.out.print("input name Customer: ");
        String name = scanner.nextLine();

        System.out.print("input dateOfBirth Customer: ");
        String dateOfBirth = scanner.nextLine();

        System.out.print("input sex Customer: ");
        String sex = scanner.nextLine();

        System.out.print("input id(cmnd) Customer: ");
        String id = scanner.nextLine();

        //chống lỗi việc nhập số -> chuỗi
        System.out.print("input phoneNumber Customer: ");
        int phoneNumber = Integer.parseInt(scanner.nextLine());

        System.out.print("input email Customer: ");
        String email = scanner.nextLine();

        System.out.print("input address Customer: ");
        String address = scanner.nextLine();

        System.out.print("input id customer: ");
        String idCustomer = scanner.nextLine();

        // rankCustomer: Loại Customer bao gồm: (Diamond, Platinum, Gold, Silver, Member).
        System.out.print("input rank customer: ");
        String rankCustomer = scanner.nextLine();

        return new Customer( name,  dateOfBirth,  sex,  id,  phoneNumber,  email,  address,  idCustomer,  rankCustomer);
        }


    @Override
    public void addNew() {
        customerLinkedList.add(inputCustomer());
    }

    @Override
    public void display() {
        customerLinkedList.forEach(System.out::println);
    }

    @Override
    public void update() {
        boolean check = true;
        System.out.print("input id element update: ");
        String idCustomer = scanner.nextLine();
        for (int i = 0; i < customerLinkedList.size(); i++) {
            if (idCustomer.equals(customerLinkedList.get(i).getId())) {
                //xuất lại thông tin cũ
                System.out.println(customerLinkedList.get(i).toString());
                //edit lại thông tin
                customerLinkedList.set(i, inputCustomer());
                check = false;
            }
        }
        if (check) {
            System.out.println("NOT FIND ID!");
        }
    }

//    @Override
//    public void delete() {
//
//    }
}

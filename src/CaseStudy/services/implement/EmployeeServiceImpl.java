package CaseStudy.services.implement;

import CaseStudy.models.Employee;
import CaseStudy.services.EmployeeService;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//. Trong class EmployeeServiceImpl sử dụng ArrayList, static property,
// static block để lưu trữ và khởi tạo dữ liệu. Viết các chức năng xử lý business
// cho phần hiển thị danh sách nhân viên, thêm mới nhân viên, chỉnh sửa thông tin cho nhân viên.
//2. Tạo đối tượng EmployeeServiceImpl trong FuramaController
//3.  Sử dụng các method business đã viết trong EmployeeServiceImpl để
// hoàn thành chức năng Employee Management
public class EmployeeServiceImpl implements EmployeeService {
    //khai báo chuỗi lưu thông tin nhân viên
    private static List<Employee> employeeList = new ArrayList<>();

    //khai báo scanner để người dùng nhập vào thông tin
    Scanner scanner = new Scanner(System.in);

    //tạo đối tượng employee
    public Employee inputEmployee() {
        System.out.print("input name Employee: ");
        String name = scanner.nextLine();

        System.out.print("input dateOfBirth Employee: ");
        String dateOfBirth = scanner.nextLine();

        System.out.print("input sex Employee: ");
        String sex = scanner.nextLine();

        System.out.print("input id(cmnd) Employee: ");
        String id = scanner.nextLine();

        //chống lỗi việc nhập số -> chuỗi
        System.out.print("input phoneNumber Employee: ");
        int phoneNumber = Integer.parseInt(scanner.nextLine());

        System.out.print("input email Employee: ");
        String email = scanner.nextLine();

        System.out.print("input address Employee: ");
        String address = scanner.nextLine();

        System.out.print("input id Employee: ");
        String idEmployee = scanner.nextLine();

        //level:         Trình độ sẽ lưu trữ các thông tin: Trung cấp, Cao đẳng, Đại học và sau đại học
        //rankEmployee:   Vị trí sẽ lưu trữ các thông tin: Lễ tân, phục vụ, chuyên viên, giám sát,
        // quản lý, giám đốc.
        System.out.print("input level Employee: ");
        String level = scanner.nextLine();

        System.out.print("input rank employee: ");
        String rank = scanner.nextLine();

        //chống lỗi việc nhập số -> chuỗi
        System.out.print("input salary Employee: ");
        double salary = Double.parseDouble(scanner.nextLine());

        return new Employee(name, dateOfBirth, sex, id, phoneNumber, email, address, idEmployee, level, rank, salary);

    }

    @Override
    public void addNew() {
        employeeList.add(inputEmployee());
    }

    @Override
    public void display() {
        for (Employee employee : employeeList
        ) {
            System.out.println(employee.toString());
        }
    }

    @Override
    public void edit() {
        boolean check = true;
        System.out.print("input id element update: ");
        String idEmployee = scanner.nextLine();
        for (int i = 0; i < employeeList.size(); i++) {
            if (idEmployee.equals(employeeList.get(i).getId())) {
                //xuất lại thông tin cũ
                System.out.println(employeeList.get(i).toString());

//                //nhập lại phần tử bạn muốn update
//                employeeList.add(i, inputEmployee());
//                //xoá phần tử tại vị trí index, vì sau khi thêm phần tử vào, thì phần tử cũ sẽ được đẩy lên index+1
//                employeeList.remove(i+1);

                //edit lại thông tin
                employeeList.set(i, inputEmployee());
                check = false;
            }
        }
        if (check) {
            System.out.println("NOT FIND ID!");
        }
    }

//    @Override
//    public void delete() {
//        boolean check = true;
//        //xuất lại dữ liệu employee
//        display();
//        //nhập id của dữ liệu muốn xoá
//        System.out.print("input id element update: ");
//        String id = scanner.nextLine();
//        for (int i = 0; i <employeeList.size() ; i++) {
//            if(id.equals(employeeList.get(i).getId())) {
//                employeeList.remove(employeeList.get(i));
//                check =false;
//            }
//        }
//        if (check) {
//            System.out.println("NOT FIND ID!");
//        }
//    }
}

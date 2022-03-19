package CaseStudy.services.implement;

import CaseStudy.models.Employee;
import CaseStudy.services.EmployeeService;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeeServiceImpl implements EmployeeService {
    //khai báo chuỗi lưu thông tin nhân viên
    static List<Employee> employeeList = new ArrayList<>();

    //khai báo scanner để người dùng nhập vào thông tin
    Scanner scanner = new Scanner(System.in);

    //tạo đối tượng employee
    public Employee inputEmployee() {
        System.out.print("input name: ");
        String name = scanner.nextLine();

        System.out.print("input dateOfBirth: ");
        String dateOfBirth = scanner.nextLine();

        System.out.print("input sex: ");
        String sex = scanner.nextLine();

        System.out.print("input id(cmnd): ");
        String id = scanner.nextLine();

        //chống lỗi việc nhập số -> chuỗi
        System.out.print("input phoneNumber: ");
        int phoneNumber = Integer.parseInt(scanner.nextLine());

        System.out.print("input email: ");
        String email = scanner.nextLine();

        System.out.print("input address: ");
        String address = scanner.nextLine();

        System.out.print("input idEmployee: ");
        String idEmployee = scanner.nextLine();

        System.out.print("input level: ");
        String level = scanner.nextLine();

        System.out.print("input rank: ");
        String rank = scanner.nextLine();

        //chống lỗi việc nhập số -> chuỗi
        System.out.print("input salary: ");
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
    public void update() {
        boolean check = true;
        System.out.print("input id element update: ");
        String id = scanner.nextLine();
        for (int i = 0; i < employeeList.size(); i++) {
            if (id.equals(employeeList.get(i).getId())) {
                //xuất lại thông tin cũ
                System.out.println(employeeList.get(i).toString());

                //nhập lại phần tử bạn muốn update
                employeeList.add(i, inputEmployee());
                //xoá phần tử tại vị trí index, vì sau khi thêm phần tử vào, thì phần tử cũ sẽ được đẩy lên index+1
                employeeList.remove(i+1);
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

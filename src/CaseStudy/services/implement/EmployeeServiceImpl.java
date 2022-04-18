package CaseStudy.services.implement;

import CaseStudy.models.Employee;
import CaseStudy.services.EmployeeService;
import CaseStudy.util.ReadAndWrite;
import CaseStudy.util.RegexData;

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

    //REGEX ngày sinh dd-MM-yyyy
    private static final String REGEX_BIRTHDAY = "^(?:(?:31(/)(?:0?[13578]|1[02]))\\1|(?:(?:29|30)(/)(?:0?[13-9]|1[0-2])\\2))(?:(?:1[6-9]|[2-9]\\d)?\\d{2})$|^(?:29(/)0?2\\3(?:(?:(?:1[6-9]|[2-9]\\d)?(?:0[48]|[2468][048]|[13579][26])|(?:(?:16|[2468][048]|[3579][26])00))))$|^(?:0?[1-9]|1\\d|2[0-8])(/)(?:(?:0?[1-9])|(?:1[0-2]))\\4(?:(?:1[6-9]|[2-9]\\d)?\\d{2})$";

    //khai báo scanner để người dùng nhập vào thông tin
    Scanner scanner = new Scanner(System.in);

    //đường link CSV
    private static final String PATH = "D:\\CodeGym\\Module 2\\src\\CaseStudy\\data\\employee.csv";

    //khai báo đọc ghi file CSV
    ReadAndWrite<Employee> employeeReadAndWrite = new ReadAndWrite<>();

    //tạo đối tượng employee
    public Employee inputEmployee() {
        try {
            System.out.print("input name Employee: ");
            String name = scanner.nextLine();

            System.out.print("input dateOfBirth Employee: ");
            String dateOfBirth = RegexData.regexAge(scanner.nextLine(), REGEX_BIRTHDAY);

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
        } catch (NumberFormatException e) {
            System.err.println("Input not Number, Please re-input!");
            e.printStackTrace();
        }
        return null;
    }

    //đọc file CSV để lấy dữ liệu list nhận được
    public List<Employee> getEmployeeList() {
        //đọc file để lấy dữ liệu employee trong file
        List<String> stringList = employeeReadAndWrite.readFromFile(PATH);
        //khai báo chuỗi lưu thông tin nhân viên
        List<Employee> employeeList = new ArrayList<>();
        for (String employeeString : stringList) {
            //vì các thuộc tính trong file CSV được ngăn cách bởi dấu ","
            String[] stringProperty = employeeString.split(",");
            employeeList.add(new Employee(stringProperty[0], stringProperty[1], stringProperty[2], stringProperty[3], Integer.parseInt(stringProperty[4]), stringProperty[5], stringProperty[6], stringProperty[7], stringProperty[8], stringProperty[9], Double.parseDouble(stringProperty[10])));
        }
        return employeeList;
    }

    @Override
    public void addNew() {
        List<Employee> employeeList = getEmployeeList();
        employeeList.add(inputEmployee());
        employeeReadAndWrite.writeToFile(employeeList, PATH, "name, dateOfBirth, sex, id, phoneNumber, email, address, idEmployee, level, rank, salary");
    }


    @Override
    public void display() {
        List<Employee> employeeList = getEmployeeList();
        //xoá những đối tượng bị null
        while (employeeList.contains(null)) {
            employeeList.remove(null);
        }

        System.out.println("\n----------List Employee----------");
        for (Employee employee : employeeList) {
            System.out.println(employee.toStringDisplay());
        }
    }

    @Override
    public void edit() {
        List<Employee> employeeList = getEmployeeList();
        boolean check = true;
        //hiển thị lại danh sách employee
        display();

        System.out.print("input id element update: ");
        String idEmployee = scanner.nextLine();
        for (int i = 0; i < employeeList.size(); i++) {
            if (idEmployee.equals(employeeList.get(i).getId())) {
                //xuất lại thông tin cũ
                System.out.println(employeeList.get(i).toStringDisplay());

//                //nhập lại phần tử bạn muốn update
//                employeeList.add(i, inputEmployee());
//                //xoá phần tử tại vị trí index, vì sau khi thêm phần tử vào, thì phần tử cũ sẽ được đẩy lên index+1
//                employeeList.remove(i+1);

                //edit lại thông tin
                employeeList.set(i, inputEmployee());
                check = false;
            }
        }

        //update file CSV
        employeeReadAndWrite.writeToFile(employeeList, PATH, "name, dateOfBirth, sex, id, phoneNumber, email, address, idEmployee, level, rank, salary");
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

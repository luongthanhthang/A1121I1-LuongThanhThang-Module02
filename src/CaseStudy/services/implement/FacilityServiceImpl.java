package CaseStudy.services.implement;

import CaseStudy.models.Facility;
import CaseStudy.models.House;
import CaseStudy.models.Room;
import CaseStudy.models.Villa;
import CaseStudy.services.FacilityService;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

//Yêu cầu: sử dụng LinkedHashMap, static property, static block, override equals(), hashCode()
//1. Trong class FacilityServiceImpl sử dụng LinkedHashMap (sử dụng key là service,
// value là số lần đã sử dụng), static property, static block để lưu trữ và khởi tạo dữ liệu.
// Viết các chức năng xử lý business cho phần hiển thị danh sách facility, thêm mới facility, hiển thị danh sách facility cần bảo trì.
//(mỗi khi khách hàng booking từ chức năng Booking thành công thì số lần sử dụng sẽ tăng 1,
// hiện tại có thể sử dụng dữ liệu cứng để test chức năng)
//2. Lưu ý khi người dùng chọn thêm mới dịch vụ sẽ hiển thị menu
// con cho phép người dùng chọn loại dịch vụ muốn thêm:
//1.	Add New Villa
//2.	Add New House
//3.	Add New Room
//4.	Back to menu
//3. Tạo đối tượng FacilityServiceImpl trong FuramaController
//4.  Sử dụng các method business đã viết FacilityServiceImpl
// trong để hoàn thành chức năng Facility Management
public class FacilityServiceImpl implements FacilityService {

    //Khởi tạo list Hasp Map lưu trữ cơ sở
    // Key: cơ sở nào
    // value: số lần sử dụng
    private static Map<Facility, Integer> facilityList = new LinkedHashMap<>();
    private Scanner scanner = new Scanner(System.in);

    @Override
    public void display() {
        //sử dụng entrySet để duyệt các phần tử trong list Map
        for (Map.Entry<Facility, Integer> element : facilityList.entrySet()) {
            System.out.println("Facility: " + element.getKey() + " USED " + element.getValue() + " times");
        }
    }

    @Override
    public void displayMaintenance() {
        //hiển thị danh sách cần bảo trì
        System.out.println("-----LIST Facility need maintenance-----");
        for (Map.Entry<Facility, Integer> element: facilityList.entrySet()) {
            if(element.getValue()>=5) {
                System.out.println("Facility: " + element.getKey() + " USED " + element.getValue() + " times");
            }
        }
    }

    @Override
    public void addNewVilla() {
        //nhập thông tin Villa
        System.out.print("Input name Villa: ");
        String name = scanner.nextLine();

        System.out.print("Input area Villa: ");
        double area = Double.parseDouble(scanner.nextLine());

        System.out.print("Input cost Villa: ");
        double cost = Double.parseDouble(scanner.nextLine());

        System.out.print("Input max People Villa: ");
        int maxPeople = Integer.parseInt(scanner.nextLine());

        System.out.print("Input rent Type Villa: ");
        String rentType = scanner.nextLine();

        System.out.print("Input standard Room Villa: ");
        String standardRoom = scanner.nextLine();

        System.out.print("Input area Pool Villa: ");
        double areaPool = Double.parseDouble(scanner.nextLine());

        System.out.print("Input number Floor Villa: ");
        int numberFloor = Integer.parseInt(scanner.nextLine());

        //tạo đối tượng Villa
        Facility villa = new Villa(name, area, cost, maxPeople, rentType, standardRoom, areaPool, numberFloor);

        //bỏ đối tượng vào Map List:
        // Key: cơ sở nào
        //value: số lần sử dụng
        facilityList.put(villa, 0);
    }

    @Override
    public void addNewHouse() {
        //nhập thông tin House
        System.out.print("Input name House: ");
        String name = scanner.nextLine();

        System.out.print("Input area House: ");
        double area = Double.parseDouble(scanner.nextLine());

        System.out.print("Input cost House: ");
        double cost = Double.parseDouble(scanner.nextLine());

        System.out.print("Input max People House: ");
        int maxPeople = Integer.parseInt(scanner.nextLine());

        System.out.print("Input rent Type House: ");
        String rentType = scanner.nextLine();

        System.out.print("Input standard Room House: ");
        String standardRoom = scanner.nextLine();

        System.out.print("Input number Floor House: ");
        int numberFloor = Integer.parseInt(scanner.nextLine());

        //tạo đối tượng House
        Facility house = new House(name, area, cost, maxPeople, rentType, standardRoom, numberFloor);

        //bỏ đối tượng vào Map List:
        // Key: cơ sở nào
        //value: số lần sử dụng
        facilityList.put(house, 0);
    }

    @Override
    public void addNewRoom() {
        //nhập thông tin Room
        System.out.print("Input name Room: ");
        String name = scanner.nextLine();

        System.out.print("Input area Room: ");
        double area = Double.parseDouble(scanner.nextLine());

        System.out.print("Input cost Room: ");
        double cost = Double.parseDouble(scanner.nextLine());

        System.out.print("Input max People Room: ");
        int maxPeople = Integer.parseInt(scanner.nextLine());

        System.out.print("Input rent Type Room: ");
        String rentType = scanner.nextLine();

        System.out.print("Input service Free Room: ");
        String serviceFreeRoom = scanner.nextLine();

        //tạo đối tượng Room
        Facility room = new Room(name, area, cost, maxPeople, rentType, serviceFreeRoom);

        //bỏ đối tượng vào Map List:
        // Key: cơ sở nào
        //value: số lần sử dụng
        facilityList.put(room, 0);
    }

    @Override
    public void addNew() {
    }

    @Override
    public void edit() {
    }
}

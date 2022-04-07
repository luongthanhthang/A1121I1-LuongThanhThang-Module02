package CaseStudy.services.implement;

import CaseStudy.models.Booking;
import CaseStudy.models.Customer;
import CaseStudy.models.Facility;
import CaseStudy.models.Villa;
import CaseStudy.services.BookingService;
import CaseStudy.util.BookingComparator;

import java.util.*;

public class BookingServiceImpl implements BookingService {
    /*1. Khi thực hiện booking phải hiển thị danh sách khách hàng cho nhân viên chọn mã khách hàng,
    hiển thị danh sách dịch vụ cho nhân viên chọn mã dịch vụ.*/

    //Set vì danh sách booking luôn khác nhau
    static Set<Booking> bookingListSet = new TreeSet<>(new BookingComparator());

    //danh sách khách hàng
    static List<Customer> customerList = new ArrayList<>();

    //danh sách dịch vụ
    static Map<Facility, Integer> serviceList = new LinkedHashMap<>();

    //hiện tại chưa có đọc ghi file nên sẽ tạo dữ liệu cứng
    //dùng static để tạo sẵn dữ liệu
    static {
        //dữ liệu khách hàng
        customerList.add(new Customer("Thang4", "4/4/2000", "female", "ID444444444", 84444444, "thang444gmail.com", "DaNang4", "CUS444", "Silver"));
        customerList.add(new Customer("Thang1", "1/1/2000", "male", "ID1111111111", 84111111, "thang111@gmail.com", "DaNang1", "CUS111", "Diamond"));
        customerList.add(new Customer("Thang2", "2/2/2000", "female", "ID222222222", 84222222, "thang222@gmail.com", "DaNang2", "CUS222", "Platinum"));
        customerList.add(new Customer("Thang5", "5/5/2000", "male", "ID555555555", 84555555, "thang555@gmail.com", "DaNang5", "CUS555", "Member"));
        customerList.add(new Customer("Thang3", "3/3/2000", "male", "ID333333333", 84333333, "thang333@gmail.com", "DaNang3", "CUS333", "Gold"));

        //dữ liệu dịch vụ
        serviceList.put(new Villa("001", "Villa 1", 10.5, 111111, 500, "FullDay", "5 sao", 5, 50), 0);
        serviceList.put(new Villa("002", "Villa 2", 20.5, 222222, 600, "PartDay", "4 sao", 6, 100), 0);
        serviceList.put(new Villa("003", "Villa 3", 30.5, 333333, 700, "FullDay", "3 sao", 7, 150), 0);
    }

    static Scanner scanner = new Scanner(System.in);

    //hiển thị danh sách Customer để nhân viên chọn
    public Customer chooseCustomer() {
        //hiển thị danh sách khách hàng
        System.out.println("\n----------Customer List----------");
        customerList.forEach(System.out::println);

        //cho nhân viên chọn ID khách hàng
        //nếu nhân viên nhập sai ID khách hàng thì nhập lại
        System.out.print("Input ID Customer Booking: ");
        String id = scanner.nextLine();

        while (true) {
            //nếu họ nhập STOP thì dừng tìm kiếm và trả lại null
            if (id.equals("STOP")) {
                return null;
            }

            //kiểm tra xem có id trong list không
            for (Customer customer : customerList) {
                if (id.equals(customer.getIdCustomer())) {
                    return customer;
                }
            }
            //nếu nhập sai thì bắt người dùng nhập lại
            System.out.print("Not Found ID Customer, Please re-input ID customer: ");
            id = scanner.nextLine();
        }
    }

    //hiển thị cơ sở facility để nhân viên chọn
    public Facility chooseFacility() {
        //hiển thị danh sách khách hàng
        System.out.println("\n----------Facility List----------");
        for (Map.Entry<Facility, Integer> element : serviceList.entrySet()) {
            System.out.println("Service: " + element.getKey() + " USED: " + element.getValue() + ", ");
        }

        //cho nhân viên chọn ID khách hàng
        //nếu nhân viên nhập sai ID khách hàng thì nhập lại
        System.out.print("Input ID Facility Booking: ");
        String idFacility = scanner.nextLine();

        while (true) {
            //nếu họ nhập STOP thì dừng tìm kiếm và trả lại null
            if (idFacility.equals("STOP")) {
                return null;
            }

            //kiểm tra xem có id trong list không
            for (Map.Entry<Facility, Integer> facility : serviceList.entrySet()) {
                if (idFacility.equals(facility.getKey().getIdFacility())) {
                    return facility.getKey();
                }
            }
            //nếu nhập sai thì bắt người dùng nhập lại
            System.out.print("Not Found ID Facility, Please re-input ID Facility: ");
            idFacility = scanner.nextLine();
        }
    }

    //thêm mới booking
    @Override
    public void addNew() {
        //xét id booking, bắt đầu từ 1
        int idBooking = 1;
        //kiểm tra list booing có trống hay không
        if (!bookingListSet.isEmpty()) {
            idBooking = bookingListSet.size()+1;
        }
        //chọn customer
        Customer customer = chooseCustomer();

        //chọn facility
        Facility facility = chooseFacility();

        //nhập ngày bắt đầu thuê
        System.out.print("Enter start time rent: ");
        String startTimeRent = scanner.nextLine();

        //nhập ngày kết thúc thuê
        System.out.print("Enter end time rent: ");
        String endTimeRent = scanner.nextLine();

        //tạo đối tượng booking
        Booking booking = new Booking(idBooking, startTimeRent, endTimeRent, customer, facility);

        //thêm booking vào list
        bookingListSet.add(booking);
        System.out.println("-----ADD BOOKING SUCCESS!-----");
    }

    //hiện danh sách booking
    @Override
    public void display() {
        bookingListSet.forEach(System.out::println);
    }

    @Override
    public void edit() {

    }
}

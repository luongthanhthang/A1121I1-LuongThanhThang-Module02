package CaseStudy.services.implement;

import CaseStudy.models.*;
import CaseStudy.services.BookingService;
import CaseStudy.util.BookingComparator;
import CaseStudy.util.ReadAndWrite;

import java.util.*;

public class BookingServiceImpl implements BookingService {
    /*1. Khi thực hiện booking phải hiển thị danh sách khách hàng cho nhân viên chọn mã khách hàng,
    hiển thị danh sách dịch vụ cho nhân viên chọn mã dịch vụ.*/

    //Set vì danh sách booking luôn khác nhau
    //dùng TreeSet vì list phải sắp xếp theo trật tụ là ngày
    static Set<Booking> bookingListSet = new TreeSet<>(new BookingComparator());

    //danh sách khách hàng
    static List<Customer> customerList = CustomerServiceImpl.getListCustomer();

    //danh sách dịch vụ
    static Map<Facility, Integer> serviceList = FacilityServiceImpl.getListFacility();

    //list booking đệm, khi hoàn thành hợp đồng thì list booking này sẽ bị xoá hết dữ liệu
    static Set<Booking> bookingListSetBuffer = new TreeSet<>(new BookingComparator());

    //đường link CSV
    private static final String PATH = "D:\\CodeGym\\Module 2\\src\\CaseStudy\\data\\booking.csv";

    //khai báo đọc ghi file CSV
    ReadAndWrite<Booking> bookingReadAndWrite = new ReadAndWrite<>();

    //tạo dữ liệu cho list booking để test chức năng promotionService
    static {
        bookingListSet.add(new Booking(4, "02/02/2000", "05/05/2000", new Customer("Thang4", "4/4/2000", "female", "ID444444444", 84444444, "thang444gmail.com", "DaNang4", "CUS444", "Silver"), new Villa("002", "Villa 2", 20.5, 222222, 600, "PartDay", "4 sao", 6, 100)));
        bookingListSet.add(new Booking(3, "02/02/2001", "04/04/2001", new Customer("Thang4", "4/4/2000", "female", "ID444444444", 84444444, "thang444gmail.com", "DaNang4", "CUS444", "Silver"), new Villa("002", "Villa 2", 20.5, 222222, 600, "PartDay", "4 sao", 6, 100)));
        bookingListSet.add(new Booking(2, "05/05/2000", "06/06/2000", new Customer("Thang4", "4/4/2000", "female", "ID444444444", 84444444, "thang444gmail.com", "DaNang4", "CUS444", "Silver"), new Villa("002", "Villa 2", 20.5, 222222, 600, "PartDay", "4 sao", 6, 100)));
        bookingListSet.add(new Booking(1, "12/12/2000", "05/05/2001", new Customer("Thang4", "4/4/2000", "female", "ID444444444", 84444444, "thang444gmail.com", "DaNang4", "CUS444", "Silver"), new Villa("002", "Villa 2", 20.5, 222222, 600, "PartDay", "4 sao", 6, 100)));
        bookingListSet.add(new Booking(5, "10/10/2001", "15/11/2001", new Customer("Thang4", "4/4/2000", "female", "ID444444444", 84444444, "thang444gmail.com", "DaNang4", "CUS444", "Silver"), new Villa("002", "Villa 2", 20.5, 222222, 600, "PartDay", "4 sao", 6, 100)));
        bookingListSet.add(new Booking(7, "06/06/2000", "07/07/2000", new Customer("Thang4", "4/4/2000", "female", "ID444444444", 84444444, "thang444gmail.com", "DaNang4", "CUS444", "Silver"), new Villa("002", "Villa 2", 20.5, 222222, 600, "PartDay", "4 sao", 6, 100)));
        bookingListSet.add(new Booking(6, "09/09/2000", "09/09/2000", new Customer("Thang4", "4/4/2000", "female", "ID444444444", 84444444, "thang444gmail.com", "DaNang4", "CUS444", "Silver"), new Villa("002", "Villa 2", 20.5, 222222, 600, "PartDay", "4 sao", 6, 100)));
        bookingListSet.add(new Booking(8, "08/08/2000", "10/10/2000", new Customer("Thang4", "4/4/2000", "female", "ID444444444", 84444444, "thang444gmail.com", "DaNang4", "CUS444", "Silver"), new Villa("002", "Villa 2", 20.5, 222222, 600, "PartDay", "4 sao", 6, 100)));

        bookingListSetBuffer.add(new Booking(4, "02/02/2000", "05/05/2000", new Customer("Thang4", "4/4/2000", "female", "ID444444444", 84444444, "thang444gmail.com", "DaNang4", "CUS444", "Silver"), new Villa("002", "Villa 2", 20.5, 222222, 600, "PartDay", "4 sao", 6, 100)));
        bookingListSetBuffer.add(new Booking(3, "02/02/2001", "04/04/2001", new Customer("Thang4", "4/4/2000", "female", "ID444444444", 84444444, "thang444gmail.com", "DaNang4", "CUS444", "Silver"), new Villa("002", "Villa 2", 20.5, 222222, 600, "PartDay", "4 sao", 6, 100)));
        bookingListSetBuffer.add(new Booking(2, "05/05/2000", "06/06/2000", new Customer("Thang4", "4/4/2000", "female", "ID444444444", 84444444, "thang444gmail.com", "DaNang4", "CUS444", "Silver"), new Villa("002", "Villa 2", 20.5, 222222, 600, "PartDay", "4 sao", 6, 100)));
        bookingListSetBuffer.add(new Booking(1, "12/12/2000", "05/05/2001", new Customer("Thang4", "4/4/2000", "female", "ID444444444", 84444444, "thang444gmail.com", "DaNang4", "CUS444", "Silver"), new Villa("002", "Villa 2", 20.5, 222222, 600, "PartDay", "4 sao", 6, 100)));
        bookingListSetBuffer.add(new Booking(5, "10/10/2001", "15/11/2001", new Customer("Thang4", "4/4/2000", "female", "ID444444444", 84444444, "thang444gmail.com", "DaNang4", "CUS444", "Silver"), new Villa("002", "Villa 2", 20.5, 222222, 600, "PartDay", "4 sao", 6, 100)));
        bookingListSetBuffer.add(new Booking(7, "06/06/2000", "07/07/2000", new Customer("Thang4", "4/4/2000", "female", "ID444444444", 84444444, "thang444gmail.com", "DaNang4", "CUS444", "Silver"), new Villa("002", "Villa 2", 20.5, 222222, 600, "PartDay", "4 sao", 6, 100)));
        bookingListSetBuffer.add(new Booking(6, "09/09/2000", "09/09/2000", new Customer("Thang4", "4/4/2000", "female", "ID444444444", 84444444, "thang444gmail.com", "DaNang4", "CUS444", "Silver"), new Villa("002", "Villa 2", 20.5, 222222, 600, "PartDay", "4 sao", 6, 100)));
        bookingListSetBuffer.add(new Booking(8, "08/08/2000", "10/10/2000", new Customer("Thang4", "4/4/2000", "female", "ID444444444", 84444444, "thang444gmail.com", "DaNang4", "CUS444", "Silver"), new Villa("002", "Villa 2", 20.5, 222222, 600, "PartDay", "4 sao", 6, 100)));
    }

    //hiện tại chưa có đọc ghi file nên sẽ tạo dữ liệu cứng
    //dùng static để tạo sẵn dữ liệu
//    static {
//        //dữ liệu khách hàng
//        customerList.add(new Customer("Thang4", "4/4/2000", "female", "ID444444444", 84444444, "thang444gmail.com", "DaNang4", "CUS444", "Silver"));
//        customerList.add(new Customer("Thang1", "1/1/2000", "male", "ID1111111111", 84111111, "thang111@gmail.com", "DaNang1", "CUS111", "Diamond"));
//        customerList.add(new Customer("Thang2", "2/2/2000", "female", "ID222222222", 84222222, "thang222@gmail.com", "DaNang2", "CUS222", "Platinum"));
//        customerList.add(new Customer("Thang5", "5/5/2000", "male", "ID555555555", 84555555, "thang555@gmail.com", "DaNang5", "CUS555", "Member"));
//        customerList.add(new Customer("Thang3", "3/3/2000", "male", "ID333333333", 84333333, "thang333@gmail.com", "DaNang3", "CUS333", "Gold"));
//
//        //dữ liệu dịch vụ
//        serviceList.put(new Villa("001", "Villa 1", 10.5, 111111, 500, "FullDay", "5 sao", 5, 50), 0);
//        serviceList.put(new Villa("002", "Villa 2", 20.5, 222222, 600, "PartDay", "4 sao", 6, 100), 0);
//        serviceList.put(new Villa("003", "Villa 3", 30.5, 333333, 700, "FullDay", "3 sao", 7, 150), 0);
//    }

    static Scanner scanner = new Scanner(System.in);

    //xuất list booking set để chuyển thành Queue bên hợp đồng
    public Set<Booking> bookingListSetToQueue() {
        return bookingListSetBuffer;
    }

    //xuất danh sách booking(lịch sử booking)
    public Set<Booking> getBookingList() {
        return bookingListSet;
    }

    //hiển thị danh sách Customer để nhân viên chọn
    public Customer chooseCustomer() {
        //hiển thị danh sách khách hàng
        System.out.println("\n----------Customer List----------");
        for (Customer customer : customerList) {
            System.out.println(customer.toStringDisplay());
        }

        //cho nhân viên chọn ID khách hàng
        //nếu nhân viên nhập sai ID khách hàng thì nhập lại
        System.out.print("Input ID Customer Booking: ");
        String id = scanner.nextLine();

        while (true) {
            //nếu họ nhập STOP thì dừng tìm kiếm và trả lại null
//            if (id.equals("STOP")) {
//                return null;
//            }

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
            System.out.println("Service: " + element.getKey().toStringDisplay() + " USED: " + element.getValue());
        }

        //cho nhân viên chọn ID khách hàng
        //nếu nhân viên nhập sai ID khách hàng thì nhập lại
        System.out.print("Input ID Facility Booking: ");
        String idFacility = scanner.nextLine();

        while (true) {
            //nếu họ nhập STOP thì dừng tìm kiếm và trả lại null
//            if (idFacility.equals("STOP")) {
//                return null;
//            }

            //kiểm tra xem có id trong list không
            for (Map.Entry<Facility, Integer> facility : serviceList.entrySet()) {
                if (idFacility.equals(facility.getKey().getIdFacility())) {
                    //mỗi lần sử dụng dịch vụ thì số lần sử dụng tăng lên 1
                    serviceList.put(facility.getKey(), facility.getValue() + 1);
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
            idBooking = bookingListSet.size() + 1;
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
        bookingListSetBuffer.add(booking);

        //ghi file booking csv
        System.out.println("-----ADD BOOKING SUCCESS!-----");
    }

    //hiện danh sách booking
    @Override
    public void display() {
        for (Booking booking: bookingListSet) {
            System.out.println(booking.toStringDisplay());
        }
    }

    @Override
    public void edit() {

    }
}

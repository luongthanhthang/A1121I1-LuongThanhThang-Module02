package CaseStudy.services.implement;

import CaseStudy.models.Booking;
import CaseStudy.services.PromotionService;
import CaseStudy.util.BookingComparator;

import java.util.Scanner;
import java.util.Set;
import java.util.Stack;
import java.util.TreeSet;

// Với chức năng hiển thị danh sách khách hàng đã sử dụng dịch vụ theo năm:
// dữ liệu được lấy từ danh sách booking, năm sử dụng dịch vụ cho phép người dùng nhập vào.
public class PromotionServiceImpl implements PromotionService {

    static Scanner scanner = new Scanner(System.in);

    //tạo list danh sách chứa các booking có cùng năm(năm là người dùng nhập vào)
    static Set<Booking> bookingListYear = new TreeSet<>(new BookingComparator());

    @Override
    public void displayCustomerListUseServiceInYear() {
        //lây dữ liệu từ danh sách booking
        Set<Booking> bookings = new BookingServiceImpl().getBookingList();

        System.out.print("Enter display list YEAR: ");
        String year = scanner.nextLine();

        //tiến hành kiểm tra và hiển thị list có cùng năm
        for (Booking booking : bookings) {
            // dd/MM/yyyy
            String[] yearStart = booking.getStartDate().split("/");
            String[] yearEnd = booking.getEndDate().split("/");
            if (yearStart[2].equals(year) && yearEnd[2].equals(year)) {
                bookingListYear.add(booking);
            }
        }

        //hiển thị danh sách Booking sử dụng cùng năm
        System.out.println("----------List Booking in " + year + "YEAR----------");
        for (Booking bookingYear : bookingListYear) {
            System.out.println(bookingYear.toStringDisplay());
        }
    }


    /*Với chức năng tặng voucher khuyến mãi. Cho phép người dùng nhập vào số lượng voucher khuyến mãi 10%,
    số lượng voucher khuyến mãi 20%, số lượng voucher khuyến mãi 50%,
     hệ thống sẽ lấy danh sách các khách hàng đã booking trong tháng hiện tại sắp xếp theo thứ tự booking và đẩy vào Stack
      (số lượng khách hàng = tổng số lượng voucher) sau đó tiến hành hiển thị danh sách khách hàng sẽ tặng voucher
      (các khách hàng đặt theo thứ tự muộn nhất sẽ nhận 10%, hết 10% mới sử dụng 20%, hết 20% mới được sử dụng 50%)
     */
    @Override
    public void displayCustomerListGetVoucher() {
        //chuyển dữ liệu từ list booking theo năm từ TreeSet --> Stack để phát voucher, vì người MUỘN nhất nhận voucher trước
        //mà danh sách TreeSet xếp từ sớm đến muộn nên dùng Stack (FILO)
        Stack<Booking> bookingVoucherStackList = new Stack<>();

        //đầu tiên kiểm tra danh sách theo năm có trống hay không
        if (bookingListYear.isEmpty()) {
            return;
        }

        //chuyển TreeSet qua Stack
        for (Booking booking : bookingListYear) {
            bookingVoucherStackList.push(booking);
        }

        System.out.println("----------VOUCHER----------");
        //hiện số lượng người cần phát voucher
        System.out.println("total booking voucher: " + bookingVoucherStackList.size());
        System.out.println();

        //nhập tổng số voucher 10%, 20%, 50% sao cho tổng voucher = tổng danh sách trong list
        int voucher10;
        int voucher20;
        int voucher50;
        try {
            do {
                System.out.print("Enter number voucher 10%: ");
                voucher10 = Integer.parseInt(scanner.nextLine());
                System.out.print("Enter number voucher 20%: ");
                voucher20 = Integer.parseInt(scanner.nextLine());
                System.out.print("Enter number voucher 50%: ");
                voucher50 = Integer.parseInt(scanner.nextLine());
            } while ((voucher10 + voucher20 + voucher50) != bookingVoucherStackList.size());

            //tiến hành phát voucher và hiện danh sách được phát voucher
            while (!(bookingVoucherStackList.isEmpty())) {
                //phát voucher 10% trước sau đó 20, 50
                if (voucher10 != 0) {
                    System.out.println("- VOUCHER 10% to " + bookingVoucherStackList.pop().toStringDisplay());
                    voucher10--;
                } else if (voucher20 != 0) {
                    System.out.println("- VOUCHER 20% to " + bookingVoucherStackList.pop().toStringDisplay());
                    voucher20--;
                } else {
                    System.out.println("- VOUCHER 50% to " + bookingVoucherStackList.pop().toStringDisplay());
                    voucher50--;
                }
            }
            return;
        } catch (NumberFormatException e) {
            System.err.println("Input not Number, Please re-input!");
            e.printStackTrace();
        }
        return;
    }
}

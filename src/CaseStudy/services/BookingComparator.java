package CaseStudy.services;

import CaseStudy.models.Booking;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Comparator;

//Danh sách booking hiển thị phải được sắp xếp theo thứ tự ngày tháng đặt phòng gần nhất,
// nếu trùng nhau thì sắp xếp theo ngày trả phòng
public class BookingComparator implements Comparator<Booking> {

    @Override
    public int compare(Booking booking1, Booking booking2) {
        //format lại ngày tháng năm
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        //LocalDate hiển thị ngày hiện tại
        LocalDate startDate1 = LocalDate.parse(booking1.getStartDate());
        return 0;
    }
}

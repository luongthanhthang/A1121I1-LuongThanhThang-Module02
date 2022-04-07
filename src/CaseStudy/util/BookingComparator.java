package CaseStudy.util;

import CaseStudy.models.Booking;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Comparator;
/*2. Danh sách booking hiển thị phải được sắp xếp theo thứ tự ngày tháng đặt phòng gần nhất,
 nếu trùng nhau thì sắp xếp theo ngày trả phòng*/

public class BookingComparator implements Comparator<Booking> {

    @Override
    public int compare(Booking booking1, Booking booking2) {
        //format lại (ngày tháng năm) vì mặc đinh là ( tháng ngày năm)
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        //ép kiểu từ String qua Date
        LocalDate startDate1 = LocalDate.parse(booking1.getStartDate(), formatter);
        LocalDate startDate2 = LocalDate.parse(booking2.getStartDate(), formatter);
        LocalDate endDate1 = LocalDate.parse(booking1.getEndDate(), formatter);
        LocalDate endDate2 = LocalDate.parse(booking1.getEndDate(), formatter);

        //đầu tiên so sánh thời gian ban đầu
        //nếu thời gian ban đầu mà bằng nhau tiếp tục so sánh ngày kết thúc
        if (startDate1.compareTo(startDate2) > 0) {
            return 1;
        } else if (startDate1.compareTo(startDate2) < 0) {
            return -1;
        } else { //trường hợp bằng thời gian ban đầu
            if (endDate1.compareTo(endDate2) > 0) {
                return 1;
            } else if (endDate1.compareTo(endDate2) < 0) {
                return -1;
            } else {
                return 0;
            }
        }
    }
}

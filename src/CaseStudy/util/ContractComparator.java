package CaseStudy.util;

import CaseStudy.models.Contract;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Comparator;

public class ContractComparator implements Comparator<Contract> {
    @Override
    public int compare(Contract contract1, Contract contract2) {
        //xếp theo ngày tháng năm của Facility
        //format lại (ngày tháng năm) vì mặc đinh là ( tháng ngày năm)
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        //ép kiểu từ String qua Date
        LocalDate startDate1 = LocalDate.parse(contract1.getStartDateFacility(), formatter);
        LocalDate startDate2 = LocalDate.parse(contract2.getStartDateFacility(), formatter);
        LocalDate endDate1 = LocalDate.parse(contract1.getEndDateFacility(), formatter);
        LocalDate endDate2 = LocalDate.parse(contract2.getEndDateFacility(), formatter);

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

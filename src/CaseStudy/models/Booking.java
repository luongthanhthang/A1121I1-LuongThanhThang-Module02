package CaseStudy.models;

public class Booking {
    private int idBooking;
    private String startDate;
    private String endDate;
    private Customer customer;
    private Facility facility;

    //constructor

    public Booking() {
    }

    public Booking(int idBooking, String startDate, String endDate, Customer customer, Facility facility) {
        this.idBooking = idBooking;
        this.startDate = startDate;
        this.endDate = endDate;
        this.customer = customer;
        this.facility = facility;
    }

    //getter setter

    public int getIdBooking() {
        return idBooking;
    }

    public void setIdBooking(int idBooking) {
        this.idBooking = idBooking;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Facility getFacility() {
        return facility;
    }

    public void setFacility(Facility facility) {
        this.facility = facility;
    }

    public String toStringDisplay() {
        return "Booking{" +
                "idBooking=" + idBooking +
                ", startDate='" + startDate + '\'' +
                ", endDate='" + endDate + '\'' +
                ", customer=" + customer +
                ", facility=" + facility +
                '}';
    }

    //dùng cho file CSV

    @Override
    public String toString() {
        return idBooking +
                "," + startDate +
                "," + endDate +
                "," + customer +
                "," + facility;
    }


    //mỗi đối tượng sẽ có mỗi hashCode khác nhau
    //Phương thức này định nghĩa khi nào thì 2 đối tượng có cùng 1 hashCode, Thường dùng trong Set vì Set cần các thành phần khác nhau
    //vd:
//    @Override
//    public int hashCode() {
//        return idBooking;
//    }

//    //ví dụ so sánh 2 đối tượng booking
//    @Override
//    public boolean equals(Object obj) {
//        //kiểm tra đối tượng có null hay có thể ép kiểu về booking không
//        if (obj == null || !(obj instanceof Booking)) {
//            return false;
//        }
//
//        //ép kiểu obj về Booking
//        Booking otherBooking = (Booking) obj;
//        if (otherBooking.idBooking == this.idBooking) {
//            return true;
//        }
//        return false;
//    }
}

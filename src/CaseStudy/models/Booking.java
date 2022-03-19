package CaseStudy.models;

public class Booking {
    private String idBooking;
    private String startDate;
    private String endDate;
    private String idCustomer;
    private String nameService;
    private String optionService;

    //constructor

    public Booking() {
    }

    public Booking(String idBooking, String startDate, String endDate, String idCustomer, String nameService, String optionService) {
        this.idBooking = idBooking;
        this.startDate = startDate;
        this.endDate = endDate;
        this.idCustomer = idCustomer;
        this.nameService = nameService;
        this.optionService = optionService;
    }

    //getter setter

    public String getIdBooking() {
        return idBooking;
    }

    public void setIdBooking(String idBooking) {
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

    public String getIdCustomer() {
        return idCustomer;
    }

    public void setIdCustomer(String idCustomer) {
        this.idCustomer = idCustomer;
    }

    public String getNameService() {
        return nameService;
    }

    public void setNameService(String nameService) {
        this.nameService = nameService;
    }

    public String getOptionService() {
        return optionService;
    }

    public void setOptionService(String optionService) {
        this.optionService = optionService;
    }

    //xuất thông tin

    @Override
    public String toString() {
        return "Booking{" +
                "idBooking='" + idBooking + '\'' +
                ", startDate='" + startDate + '\'' +
                ", endDate='" + endDate + '\'' +
                ", idCustomer='" + idCustomer + '\'' +
                ", nameService='" + nameService + '\'' +
                ", optionService='" + optionService + '\'' +
                '}';
    }
}

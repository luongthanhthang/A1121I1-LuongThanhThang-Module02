package CaseStudy.models;

//hợp đồng
public class Contract {
    private int idContract;
    private int idBooking;
    private double deposit;  //số tiền đặt cọc
    private double totalMoney;
    private String idCustomer;
    private String startDateFacility;
    private String endDateFacility;

    //constructor

    public Contract() {
    }

    public Contract(int idContract, int idBooking, double deposit, double totalMoney, String idCustomer, String startDateFacility, String endDateFacility) {
        this.idContract = idContract;
        this.idBooking = idBooking;
        this.deposit = deposit;
        this.totalMoney = totalMoney;
        this.idCustomer = idCustomer;
        this.startDateFacility = startDateFacility;
        this.endDateFacility = endDateFacility;
    }

    //getter setter

    public int getIdContract() {
        return idContract;
    }

    public void setIdContract(int idContract) {
        this.idContract = idContract;
    }

    public int getIdBooking() {
        return idBooking;
    }

    public void setIdBooking(int idBooking) {
        this.idBooking = idBooking;
    }

    public double getDeposit() {
        return deposit;
    }

    public void setDeposit(double deposit) {
        this.deposit = deposit;
    }

    public double getTotalMoney() {
        return totalMoney;
    }

    public void setTotalMoney(double totalMoney) {
        this.totalMoney = totalMoney;
    }

    public String getIdCustomer() {
        return idCustomer;
    }

    public void setIdCustomer(String idCustomer) {
        this.idCustomer = idCustomer;
    }

    public String getStartDateFacility() {
        return startDateFacility;
    }

    public void setStartDateFacility(String startDateFacility) {
        this.startDateFacility = startDateFacility;
    }

    public String getEndDateFacility() {
        return endDateFacility;
    }

    public void setEndDateFacility(String endDateFacility) {
        this.endDateFacility = endDateFacility;
    }

    //xuất thông tin


    public String toStringDisplay() {
        return "idContract=" + idContract +
                ", idBooking=" + idBooking +
                ", deposit=" + deposit +
                ", totalMoney=" + totalMoney +
                ", idCustomer='" + idCustomer + '\'' +
                ", startDateFacility='" + startDateFacility + '\'' +
                ", endDateFacility='" + endDateFacility + '\'';
    }

    //dùng cho file CSV

    @Override
    public String toString() {
        return idContract +
                "," + idBooking +
                "," + deposit +
                "," + totalMoney +
                "," + idCustomer +
                "," + startDateFacility +
                "," + endDateFacility;
    }
}

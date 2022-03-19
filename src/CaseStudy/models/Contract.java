package CaseStudy.models;
//hợp đồng
public class Contract {
    private String idContract;
    private String idBooking;
    private double deposit;  //số tiền đặt cọc
    private double totalMoney;
    private String idCustomer;

    //constructor

    public Contract() {
    }

    public Contract(String idContract, String idBooking, double deposit, double totalMoney, String idCustomer) {
        this.idContract = idContract;
        this.idBooking = idBooking;
        this.deposit = deposit;
        this.totalMoney = totalMoney;
        this.idCustomer = idCustomer;
    }

    //getter setter

    public String getIdContract() {
        return idContract;
    }

    public void setIdContract(String idContract) {
        this.idContract = idContract;
    }

    public String getIdBooking() {
        return idBooking;
    }

    public void setIdBooking(String idBooking) {
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

    //xuất thông tin

    @Override
    public String toString() {
        return "Contract{" +
                "idContract='" + idContract + '\'' +
                ", idBooking='" + idBooking + '\'' +
                ", deposit=" + deposit +
                ", totalMoney=" + totalMoney +
                ", idCustomer='" + idCustomer + '\'' +
                '}';
    }
}

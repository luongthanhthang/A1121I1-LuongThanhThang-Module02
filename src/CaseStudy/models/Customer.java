package CaseStudy.models;

public class Customer extends Person {
    private String idCustomer;
    private String rankCustomer;

    //constructor

    public Customer() {
    }

    public Customer(String name, String dateOfBirth, String sex, String id, int phoneNumber, String email, String address, String idCustomer, String rankCustomer) {
        super(name, dateOfBirth, sex, id, phoneNumber, email, address);
        this.idCustomer = idCustomer;
        this.rankCustomer = rankCustomer;
    }

    //getter setter

    public String getIdCustomer() {
        return idCustomer;
    }

    public void setIdCustomer(String idCustomer) {
        this.idCustomer = idCustomer;
    }

    public String getRankCustomer() {
        return rankCustomer;
    }

    public void setRankCustomer(String rankCustomer) {
        this.rankCustomer = rankCustomer;
    }

    //xuất thông tin

    @Override
    public String toString() {
        return "Customer{" + super.toString() +
                "idCustomer='" + idCustomer + '\'' +
                ", rankCustomer='" + rankCustomer + '\'' +
                '}';
    }
}
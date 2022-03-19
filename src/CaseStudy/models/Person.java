package CaseStudy.models;

public abstract class Person {
    private String name;
    private String dateOfBirth;   //ngày sinh
    private String sex;
    private String id; //CMND
    private int phoneNumber;
    private String email;
    private String address;


    //constructor

    public Person() {
    }

    public Person(String name, String dateOfBirth, String sex, String id, int phoneNumber, String email, String address) {
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.sex = sex;
        this.id = id;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.address = address;
    }

    //getter setter

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }


    //đưa thông tin

    @Override
    public String toString() {
        return "name='" + name + '\'' +
                ", dateOfBirth='" + dateOfBirth + '\'' +
                ", sex='" + sex + '\'' +
                ", id='" + id + '\'' +
                ", phoneNumber=" + phoneNumber +
                ", email='" + email + '\'' +
                ", address='" + address + '\''+", ";
    }
}

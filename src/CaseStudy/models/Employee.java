package CaseStudy.models;

public class Employee extends Person {
    private String idEmployee;
    private String level;
    private String rankEmployee;     //vị trí
    private double salary;  //lương

    //level:         Trình độ sẽ lưu trữ các thông tin: Trung cấp, Cao đẳng, Đại học và sau đại học
    //rankEmployee:   Vị trí sẽ lưu trữ các thông tin: Lễ tân, phục vụ, chuyên viên, giám sát, quản lý, giám đốc.

    //constructor

    public Employee() {
    }

    public Employee(String name, String dateOfBirth, String sex, String id, int phoneNumber, String email, String address, String idEmployee, String level, String rank, double salary) {
        super(name, dateOfBirth, sex, id, phoneNumber, email, address);
        this.idEmployee = idEmployee;
        this.level = level;
        this.rankEmployee = rank;
        this.salary = salary;
    }

    //getter setter

    public String getIdEmployee() {
        return idEmployee;
    }

    public void setIdEmployee(String idEmployee) {
        this.idEmployee = idEmployee;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public String getRankEmployee() {
        return rankEmployee;
    }

    public void setRankEmployee(String rankEmployee) {
        this.rankEmployee = rankEmployee;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    //xuất thông tin

    public String toStringDisplay() {
        return "Employee{" + super.toStringDisplay() + "," +
                "idEmployee='" + idEmployee + '\'' +
                ", level='" + level + '\'' +
                ", rankEmployee='" + rankEmployee + '\'' +
                ", salary=" + salary +
                '}';
    }

    //dùng cho file CSV
    @Override
    public String toString() {
        return super.toString() + "," + idEmployee +
                "," + level +
                "," + rankEmployee +
                "," + salary;
    }
}

package CaseStudy.models;

public abstract class Facility {
    //Các loại dịch vụ này sẽ bao có các thông tin:
    // Tên dịch vụ, Diện tích sử dụng, Chi phí thuê, Số lượng người tối đa,
    // Kiểu thuê (bao gồm thuê theo năm, tháng, ngày, giờ.
    private String name;
    private double area;
    private double cost;
    private int maxPeople;
    private String rentType;

    //constructor

    public Facility() {
    }

    public Facility(String name, double area, double cost, int maxPeople, String rentType) {
        this.name = name;
        this.area = area;
        this.cost = cost;
        this.maxPeople = maxPeople;
        this.rentType = rentType;
    }

    //getter setter

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public int getMaxPeople() {
        return maxPeople;
    }

    public void setMaxPeople(int maxPeople) {
        this.maxPeople = maxPeople;
    }

    public String getRentType() {
        return rentType;
    }

    public void setRentType(String rentType) {
        this.rentType = rentType;
    }

    //đưa ra thông tin
    @Override
    public String toString() {
        return "name='" + name + '\'' +
                ", area=" + area +
                ", cost=" + cost +
                ", maxPeople=" + maxPeople +
                ", rentType='" + rentType + '\'' + " ,";
    }
}

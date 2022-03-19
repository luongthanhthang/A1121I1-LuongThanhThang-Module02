package CaseStudy.models;

public class House extends Facility {
    private String standardRoomHouse;
    private double numberFloorHouse;

    //constructor

    public House() {
    }

    public House(String name, double area, double cost, int maxPeople, String rentType, String standardRoomHouse, double numberFloorHouse) {
        super(name, area, cost, maxPeople, rentType);
        this.standardRoomHouse = standardRoomHouse;
        this.numberFloorHouse = numberFloorHouse;
    }

    //getter setter

    public String getStandardRoomHouse() {
        return standardRoomHouse;
    }

    public void setStandardRoomHouse(String standardRoomHouse) {
        this.standardRoomHouse = standardRoomHouse;
    }

    public double getNumberFloorHouse() {
        return numberFloorHouse;
    }

    public void setNumberFloorHouse(double numberFloorHouse) {
        this.numberFloorHouse = numberFloorHouse;
    }

    //xuất thông tin

    @Override
    public String toString() {
        return "House{" + super.toString() +
                "standardRoomHouse='" + standardRoomHouse + '\'' +
                ", numberFloorHouse=" + numberFloorHouse +
                '}';
    }
}

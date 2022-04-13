package CaseStudy.models;

public class House extends Facility {
    private String standardRoomHouse;
    private int numberFloorHouse;

    //constructor

    public House() {
    }

    public House(String idFacility, String name, double area, double cost, int maxPeople, String rentType, String standardRoomHouse, int numberFloorHouse) {
        super(idFacility, name, area, cost, maxPeople, rentType);
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

    public int getNumberFloorHouse() {
        return numberFloorHouse;
    }

    public void setNumberFloorHouse(int numberFloorHouse) {
        this.numberFloorHouse = numberFloorHouse;
    }

    //xuất thông tin

    @Override
    public String toStringDisplay() {
        return "House{" + super.toStringDisplay() + "," +
                "standardRoomHouse='" + standardRoomHouse + '\'' +
                ", numberFloorHouse=" + numberFloorHouse +
                '}';
    }

    //dùng cho file CSV
    @Override
    public String toString() {
        return super.toString() + "," + standardRoomHouse +
                "," + numberFloorHouse;
    }
}

package CaseStudy.models;

public class Room extends Facility {
    private String serviceFreeRoom;

    //constructor

    public Room() {
    }

    public Room(String name, double area, double cost, int maxPeople, String rentType, String serviceFreeRoom) {
        super(name, area, cost, maxPeople, rentType);
        this.serviceFreeRoom = serviceFreeRoom;
    }

    //getter setter

    public String getServiceFreeRoom() {
        return serviceFreeRoom;
    }

    public void setServiceFreeRoom(String serviceFreeRoom) {
        this.serviceFreeRoom = serviceFreeRoom;
    }

    //xuất thông tin

    @Override
    public String toString() {
        return "Room{" + super.toString() +
                "serviceFreeRoom='" + serviceFreeRoom + '\'' +
                '}';
    }
}

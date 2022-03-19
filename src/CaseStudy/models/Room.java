package CaseStudy.models;

public class Room extends Facility {
    private String serviceFree;

    //constructor

    public Room() {
    }

    public Room(String name, double area, double cost, int maxPeople, String rentType, String serviceFree) {
        super(name, area, cost, maxPeople, rentType);
        this.serviceFree = serviceFree;
    }

    //getter setter

    public String getServiceFree() {
        return serviceFree;
    }

    public void setServiceFree(String serviceFree) {
        this.serviceFree = serviceFree;
    }

    //xuất thông tin

    @Override
    public String toString() {
        return "Room{" + super.toString() +
                "serviceFree='" + serviceFree + '\'' +
                '}';
    }
}

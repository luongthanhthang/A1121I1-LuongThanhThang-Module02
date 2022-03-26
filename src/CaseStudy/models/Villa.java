package CaseStudy.models;

public class Villa extends Facility {
    private String standardRoomVilla;
    private double areaPool;
    private int numberFloorVilla;

    //constructor

    public Villa() {
    }

    public Villa(String name, double area, double cost, int maxPeople, String rentType, String standardRoomVilla, double areaPool, int numberFloorVilla) {
        super(name, area, cost, maxPeople, rentType);
        this.standardRoomVilla = standardRoomVilla;
        this.areaPool = areaPool;
        this.numberFloorVilla = numberFloorVilla;
    }

    //getter setter

    public String getStandardRoomVilla() {
        return standardRoomVilla;
    }

    public void setStandardRoomVilla(String standardRoomVilla) {
        this.standardRoomVilla = standardRoomVilla;
    }

    public double getAreaPool() {
        return areaPool;
    }

    public void setAreaPool(double areaPool) {
        this.areaPool = areaPool;
    }

    public int getNumberFloorVilla() {
        return numberFloorVilla;
    }

    public void setNumberFloorVilla(int numberFloorVilla) {
        this.numberFloorVilla = numberFloorVilla;
    }

    //xuất thông tin

    @Override
    public String toString() {
        return "Villa{" + super.toString() +
                "standardRoomVilla='" + standardRoomVilla + '\'' +
                ", areaPool=" + areaPool +
                ", numberFloorVilla=" + numberFloorVilla +
                '}';
    }
}

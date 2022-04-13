package CaseStudy.models;

public class Villa extends Facility {
    private String standardRoomVilla;
    private double areaPool;
    private int numberFloorVilla;

    //constructor

    public Villa() {
    }

    public Villa(String idFacility, String name, double area, double cost, int maxPeople, String rentType, String standardRoomVilla, double areaPool, int numberFloorVilla) {
        super(idFacility, name, area, cost, maxPeople, rentType);
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
    public String toStringDisplay() {
        return "Villa{" + super.toStringDisplay() + "," +
                "standardRoomVilla='" + standardRoomVilla + '\'' +
                ", areaPool=" + areaPool +
                ", numberFloorVilla=" + numberFloorVilla +
                '}';
    }

    //dùng cho file CSV

    @Override
    public String toString() {
        return super.toString() + "," +
                standardRoomVilla +
                "," + areaPool +
                "," + numberFloorVilla;
    }

}

package qa.udst.car_rental.model;

public class Truck extends Vehicle {

    private int capacity;

    public Truck(int id, String manufacturer, String model, int year, int capacity) {
        super(id, manufacturer, model, year);
        this.capacity = capacity;
    }

    public Truck() {
        super();
    }
    
    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

}

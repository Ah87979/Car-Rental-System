package qa.udst.car_rental.model;

import jakarta.persistence.Entity;

@Entity
public class Truck extends Vehicle {

    private double capacity;

    public Truck(int id, String manufacturer, String model, int year, double capacity) {
        super(id, manufacturer, model, year);
        this.capacity = capacity;
    }

    public Truck() {
        super();
    }
    
    public double getCapacity() {
        return capacity;
    }

    public void setCapacity(double capacity) {
        this.capacity = capacity;
    }

}

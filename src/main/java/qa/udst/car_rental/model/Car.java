package qa.udst.car_rental.model;

import jakarta.persistence.Entity;

@Entity
public class Car extends Vehicle {

    private int seats;

    public Car(String manufacturer, String model, int year, int seats) {
        super(manufacturer, model, year);
        this.seats = seats;
    }

    public Car() {
        super();
    }

    public int getSeats() {
        return seats;
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }

}

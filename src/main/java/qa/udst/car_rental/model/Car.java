package qa.udst.car_rental.model;

public class Car extends Vehicle {

    private int seats;

    public Car(int id, String manufacturer, String model, int year, int seats) {
        super(id, manufacturer, model, year);
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

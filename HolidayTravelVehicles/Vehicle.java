package W6;

public class Vehicle {
    private String make;
    private String model;
    private int year;
    private boolean available;

    public Vehicle(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.available = true; // 默认可用
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    public void displayInfo() {
        System.out.println("Vehicle Info: " + year + " " + make + " " + model);
    }
}


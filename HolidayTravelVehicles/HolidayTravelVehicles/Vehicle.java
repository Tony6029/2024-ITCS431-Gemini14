package HolidayTravelVehicles;
public class Vehicle {
    private String licensePlate;
    private String brand;
    private int year;

    public Vehicle(String licensePlate, String brand, int year) {
        this.licensePlate = licensePlate;
        this.brand = brand;
        this.year = year;
    }

    public void displayInfo() {
        System.out.println("Vehicle Info:");
        System.out.println("License Plate: " + licensePlate);
        System.out.println("Brand: " + brand);
        System.out.println("Year: " + year);
    }
}
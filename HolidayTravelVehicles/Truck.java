import HolidayTravelVehicles.Vehicle;

class Truck extends Vehicle {
    private double loadCapacity;

    public Truck(String licensePlate, String brand, int year, double loadCapacity) {
        super(licensePlate, brand, year);
        this.loadCapacity = loadCapacity;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Load Capacity: " + loadCapacity + " tons");
    }
}
import HolidayTravelVehicles.Vehicle;

class Car extends Vehicle{
    private int numberOfDoors;

    public Car(String licensePlate, String brand, int year, int numberOfDoors) {
        super(licensePlate, brand, year);
        this.numberOfDoors = numberOfDoors;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Number of Doors: " + numberOfDoors);
    }
}
import HolidayTravelVehicles.Vehicle;

class Bike extends Vehicle {
    private boolean hasCarrier;

    public Bike(String licensePlate, String brand, int year, boolean hasCarrier) {
        super(licensePlate, brand, year);
        this.hasCarrier = hasCarrier;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Has Carrier: " + (hasCarrier ? "Yes" : "No"));
    }
}
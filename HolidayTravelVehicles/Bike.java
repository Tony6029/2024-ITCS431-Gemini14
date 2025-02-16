package W6;

public class Bike extends Vehicle {
    private boolean hasCarrier;

    public Bike(String make, String model, int year, boolean hasCarrier) {
        super(make, model, year);
        this.hasCarrier = hasCarrier;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Has carrier: " + (hasCarrier ? "Yes" : "No"));
    }
}

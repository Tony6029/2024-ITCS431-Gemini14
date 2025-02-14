public class Main {
    public static void main(String[] args) {
        Car car = new Car("ABC123", "Toyota", 2022, 4);
        Bike bike = new Bike("XYZ789", "Honda", 2021, true);
        Truck truck = new Truck("LMN456", "Volvo", 2020, 10.5);

        System.out.println("\n--- Vehicle Information ---");
        car.displayInfo();
        System.out.println();
        bike.displayInfo();
        System.out.println();
        truck.displayInfo();
    }
}
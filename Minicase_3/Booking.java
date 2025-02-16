package W6;

public class Booking {
    private User user;
    private Vehicle vehicle;
    private boolean confirmed;

    public Booking(User user, Vehicle vehicle) {
        this.user = user;
        this.vehicle = vehicle;
        this.confirmed = false;
    }

    public boolean confirmBooking(PaymentGateway paymentGateway) {
        if (vehicle.isAvailable()) {
            if (paymentGateway.processPayment()) {
                vehicle.setAvailable(false);
                confirmed = true;
                System.out.println("Booking confirmed for " + user + ".");
                return true;
            } else {
                System.out.println("Payment failed.");
            }
        } else {
            System.out.println("Vehicle not available.");
        }
        return false;
    }

    public void cancelBooking() {
        if (confirmed) {
            vehicle.setAvailable(true);
            confirmed = false;
            System.out.println("Booking canceled.");
        } else {
            System.out.println("No confirmed booking to cancel.");
        }
    }
}


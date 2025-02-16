package W6;

public class Main {
    public static void main(String[] args) {
        // 创建用户
        User user = new User("JohnDoe");
        user.login("password123");

        // 创建车辆
        Vehicle car = new Vehicle("Toyota", "Camry", 2022);
        car.displayInfo();

        // 创建支付网关
        PaymentGateway paymentGateway = new PaymentGateway();

        // 进行预订
        Booking booking = new Booking(user, car);
        if (booking.confirmBooking(paymentGateway)) {
            System.out.println("Booking successful!");
        } else {
            System.out.println("Booking failed.");
        }

        // 取消预订
        booking.cancelBooking();
    }
}

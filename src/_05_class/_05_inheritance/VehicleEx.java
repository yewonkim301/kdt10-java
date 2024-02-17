package _05_class._05_inheritance;

public class VehicleEx {
    static Bus bus = new Bus("Hyundai", "City Bus", 2022);
    static Car car = new Car("Toyota", "Camry",2023);
    static Motorcycle motorcycle = new Motorcycle("Harley-Davidson", "Sportster",2021);

    public static void main(String[] args) {
        System.out.println("==== Bus 정보 ====");
        bus.setPassengerCapacity(30);
        System.out.printf("Bus {brand='%s', model='%s', year='%d', passengerCapacity='%d'}\n", bus.getBrand(), bus.getModel(), bus.getYear(), bus.getPassengerCapacity());
        bus.start();
        bus.role();
        bus.end();
        System.out.println();
        System.out.println("==== Car 정보 ====");
        car.setConvertible(true);
        System.out.printf("Car {brand='%s', model='%s', year='%d', convertible='%b'}\n", car.getBrand(), car.getModel(), car.getYear(), car.getConvertible());
        car.start();
        car.parking();
        car.end();
        System.out.println();
        System.out.println("==== Motorcycle 정보 ====");
        motorcycle.setLicenseType("A");
        System.out.printf("Motorcycle {brand='%s', model='%s', year='%d', licenseType='%s'}\n", motorcycle.getBrand(), motorcycle.getModel(), motorcycle.getYear(), motorcycle.getLicenseType());
        motorcycle.start();
        motorcycle.characteristic();
        motorcycle.end();
        System.out.println();
    }
}

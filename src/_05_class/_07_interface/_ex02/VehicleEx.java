package _05_class._07_interface._ex02;

import java.util.ArrayList;

public class VehicleEx {
    public static void main(String[] args) {
        ArrayList<Vehicle> vehicles = new ArrayList<>();

        Car car = new Car("기아", 130);
        Airplane airplane = new Airplane("대한항공", 300);

        vehicles.add(car);
        vehicles.add(airplane);

        for (Vehicle vehicle: vehicles) {
            System.out.printf("%s의 최고 속력은 %d\n", vehicle.getName(), vehicle.getMaxSpeed());
            vehicle.move();

            // flyable 인터페이스를 구현한 경우에만 fly 메소드 호출
            if (vehicle instanceof Flyable) {
                ((Flyable) vehicle).fly();
            }

            System.out.println();
        }
    }
}

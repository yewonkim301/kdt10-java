package _05_class._07_interface._ex02;

import java.util.ArrayList;

public class VehicleEx {
    public static void main(String[] args) {
        ArrayList<Vehicle> vehicles = new ArrayList<>();

        Car car = new Car("붕붕이", 130);
        Airplane airplane = new Airplane("비행기", 300);

        vehicles.add(car);
        vehicles.add(airplane);

        for (Vehicle vehicle: vehicles) {
            vehicle.move();
            if (vehicle)
        }
    }
}

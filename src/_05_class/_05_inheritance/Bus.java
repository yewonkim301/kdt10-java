package _05_class._05_inheritance;

public class Bus extends Vehicle{
    public Bus (String brand, String model, int year) {
        setBrand(brand);
        setModel(model);
        setYear(year);
    }

    public int getPassengerCapacity() {
        return passengerCapacity;
    }

    public void setPassengerCapacity(int passengerCapacity) {
        this.passengerCapacity = passengerCapacity;
    }

    private int passengerCapacity;

    public void role() {
        System.out.println("승객을 운송합니다.");
    }
}

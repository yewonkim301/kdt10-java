package _05_class._05_inheritance;

public class Car extends Vehicle{
    public Car (String brand, String model, int year) {
        setBrand(brand);
        setModel(model);
        setYear(year);
    }

    private boolean convertible;

    public boolean getConvertible() {
        return convertible;
    }

    public void setConvertible(boolean convertible) {
        this.convertible = convertible;
    }

    public void parking() {
        System.out.println("주차했습니다.");
    }
}

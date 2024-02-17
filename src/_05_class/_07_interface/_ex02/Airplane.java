package _05_class._07_interface._ex02;

public class Airplane extends Vehicle implements Flyable{
    public Airplane(String name, int maxSpeed) {
        super(name, maxSpeed);
    }

    @Override
    void move() {
        System.out.println("하늘을 날아가는 중");
    }

    @Override
    public void fly() {
        System.out.println("고도 10,000피트에서 비행 중");
    }


}

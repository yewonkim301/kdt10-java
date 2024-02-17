package _05_class._06_abstract;

public class Baek extends Student{
    public Baek(String name, String school, int age, int stdNum) {
        super(name, school, age, stdNum);
    }

    @Override
    void todo() {
        System.out.println("점심은 백종원 피자");
    }
}

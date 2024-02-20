package _07_generic;

class Calculator<T extends Number> {
    private T num1;
    private T num2;

    public Calculator(T num1, T num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public double add() {
        return num1.doubleValue() + num2.doubleValue();
    }
}
public class Prac2 {
    public static void main(String[] args) {
        Calculator<Integer> integer = new Calculator<>(6,9);
        System.out.printf("Integer Sum: %f\n", integer.add());
        Calculator<Double> doubleNum = new Calculator<>(2.3,5.68);
        System.out.printf("Double Sum: %f\n", doubleNum.add());

    }
}

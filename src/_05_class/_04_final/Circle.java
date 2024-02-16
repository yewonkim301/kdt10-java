package _05_class._04_final;

import java.util.Scanner;

public class Circle {
    // 반지름 final 필드
    private final double radius;
    // PI 상수
    private static final double PI = 3.141592;

    public Circle (int radius) {
        this.radius = radius;
    }

    public double calculateArea () {
        return radius * radius * PI;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("원의 반지름을 입력하세요: ");
        Circle circle = new Circle(scanner.nextInt());
        System.out.println("원의 반지름 : " + circle.radius);
        System.out.println("원의 넓이 : " + circle.calculateArea());
    }
}

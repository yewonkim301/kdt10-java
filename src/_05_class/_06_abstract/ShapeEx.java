package _05_class._06_abstract;

import java.util.ArrayList;

public class ShapeEx {
    public static void main(String[] args) {
        // ArrayList 생성
        // Shape -> Circle, Rectangle 의 부모이기 때문에
        // 자바의 다형성 - 하나의 변수가 여러 종류의 객체를 참조할 수 있는 능력
        ArrayList<Shape> shape = new ArrayList<>();

        // Shape 객체는 new 연산자로 직접 생성할 수  없지만,
        // 자식 클래스인 Circle, Square 에서 new 연산자로 객체 생성 가능
        // Shape shape = new Shape(); // X
        Circle circle = new Circle("Red", 5);
        Square square = new Square("Blue", 4,6);

        /*
        circle.start();
        circle.draw();
        System.out.println("원 색상은 : " + circle.getColor());

        square.start();
        square.draw();
        System.out.println("사각형 색상은 : " + square.getColor());
        */

        shape.add(circle);
        shape.add(square);

        for (Shape s : shape) {
            System.out.printf("==== %s 도형의 정보 ====\n", s.getType());
            System.out.printf("도형의 색상: %s\n", s.getColor());
            System.out.printf("도형의 넓이: %f\n", s.calculateArea());
            System.out.println();
        }
    }
}

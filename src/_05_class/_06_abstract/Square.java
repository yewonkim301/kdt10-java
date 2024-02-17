package _05_class._06_abstract;

// 구체적인 클래스
public class Square extends Shape {
    private int width;
    private int height;
    public Square(String color, int width, int height) {
        super(color, "Rectangle");
        this.width = width;
        this.height = height;
    }

    // 추상 메소드 구현
    void draw() {
        System.out.println("사각형 그리기!");
    }

    double calculateArea() {
        return width * height;
    }
}

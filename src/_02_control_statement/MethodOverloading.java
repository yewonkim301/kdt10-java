package _02_control_statement;

// 오버로딩
// - 하나의 클래스에서 동일한 이름의 메서드 여러 개 정의
// 즉, 이름이 같고 매개변수가 타입, 개수, 순서가 다름
// - 동작이 유사할 때 사용하면 편리
public class MethodOverloading {
    public static void main(String[] args) {
        // 1. 객체 생성
        MethodOverloading ol = new MethodOverloading();

        // 2. 객체의 메서드 사용
        System.out.println(ol.add(1, 2));
        System.out.println(ol.add(1.1, 2.1));
        System.out.println(ol.add(1, 2, 3));
        System.out.println(ol.add(1.1, 2.1, 3.1));

        // 실습
        System.out.println("반지름이 5인 원의 넓이 : " + ol.cal(5.0));
        System.out.println("가로4, 세로 7인 직사격형의 넓이 : " + ol.cal(4, 7));
        System.out.println("밑변6, 높이 3인 삼각형의 넓이 : "+ ol.cal(6.0, 3.0));
    }
    public int add(int a, int b) { return a + b; }
    public double add(double a, double b) { return a + b; }
    public int add(int a, int b, int c) { return a + b + c; }
    public double add(double a, double b, double c) { return a + b + c; }

    // 실습
    public double cal(double x) { return x * x * 3.141592; }
    public double cal(int x, int y) { return (x * y); }
    public double cal(double x, double y) { return x * y * 0.5; }
}

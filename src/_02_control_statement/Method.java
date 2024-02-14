package _02_control_statement;

// 메서드
// - 객체가 갖는 기능 (동작)

// 메서드 정의

/*
* 접근제한자 티런타입 메서드_이름(인자1, 인자2, ,,,) {
*   메서드 행위
*   return 반환값;
* }
*/

import java.util.Scanner;

public class Method {
    public static void main(String[] args) {
        hello();

        System.out.println(sum1(10, 20));
        System.out.println(sum2(10, 20));

        // 값 전달
        System.out.println(mul1(10, 20));

        // 참조 전달
        int[] numbers = {10, 20};
        int[] numbers2 = {10, 20, 30, 40};
        System.out.println(mul2(numbers));
        System.out.println(mul2(new int[] {10, 30})); // 배열 생성하고 바로 값 넣기
        System.out.println(mul2(numbers2));

        ////////////////////////////////////////////
        // 실습
        Scanner scanner = new Scanner(System.in);
        System.out.println("숫자 두 개를 입력하세요");
        double x = scanner.nextDouble();
        double y = scanner.nextDouble();
        System.out.println("덧셈 결과 : " + prac1(x, y));
        System.out.println("뺄셈 결과 : " + prac2(x, y));
        System.out.println("나눗셈 결과 : " + prac3(x, y));
        System.out.println("곱셈 결과 : " + prac4(x, y));
    }
    // 반환값이 없는 메서드
    public static void hello() {
        System.out.println("hello java!");
    }
    // static 이 붙어 있으면 별도의 객체 생성 없이도 사용 가능
    // -> static 을 붙이면 따로 객체를 생성하지 않아도 별도의 저장 공간(쿨래스 내에)을 알아서 미리 생성해 놓기 때문
    // -> 따라서 하나의 클래스 내에서만 사용할 때 주로 static 사용

    // 반환값이 있는 메서드
    // - "리턴 타입"과 return 에서 실제 반화하는 데이터 형식 일치해야 함
    public static int sum1 (int x, int y) {
        return x + y;
    }

    public static String sum2 (int x, int y) {
        return "x + y = " + (x + y);
    }

    // call by value (값 전달)
    public static int mul1(int x, int y) {
        return x * y;
    }

    // call by reference (참조 전달)
    public static int mul2 (int[] nums) {
        // return nums[0] * nums[1];
        // 배열 길이가 2보다 클 때
        int result = 1;
        for (int n : nums) {
            result *= n;
        }
        return result;
    }
    ////////////////////////////////////////////
    // 실습
    public static double prac1(double x, double y) {
        return x + y;
    }
    public static double prac2(double x, double y) {
        return x - y;
    }
    public static double prac3(double x, double y) {
        return x * y;
    }
    public static double prac4(double x, double y) {
        return x / y;
    }
}

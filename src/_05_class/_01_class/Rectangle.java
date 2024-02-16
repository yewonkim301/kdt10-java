package _05_class._01_class;

import java.util.Scanner;

public class Rectangle {
    /*
    public int width;
    public int height;

    public Rectangle () {

    }
    public int getArea(int width, int height) {
        return width * height;
    }

    public static void main(String[] args) {
        System.out.println("사각형의 가로와 세로 길이를 띄어쓰기를 기준으로 입력하세요.");
        Scanner scanner = new Scanner(System.in);

        int width = scanner.nextInt();
        int height = scanner.nextInt();
        Rectangle area = new Rectangle();

        System.out.println(area.getArea(width, height));
    }
    */

    // 클래스 실습
    // 필드 (변수)
    private int width;
    private int height;
    public static int cnt = 0;

    public Rectangle (int width) {
        // 지역 변수와 필드 변수명이 동일하기 떄문에 this 를 사용해서 필드 값에 접근
        this.width = width;
        // cnt++; // 새로운 Rectangle 인스터스 호출될 때마다 증가
    }

    public int getWidth() {
        return width;
    }
    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }
    public void setHeight(int height) {
        this.height = height;
    }
}

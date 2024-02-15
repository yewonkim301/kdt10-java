package _05_class._01_class;

import java.util.Scanner;

public class Rectangle {
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
}

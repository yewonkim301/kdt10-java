package _05_class._01_class;

import java.util.ArrayList;
import java.util.Scanner;

public class RectangleEx {
    public static void main(String[] args) {
        // Rectangle 객체를 담는 ArrayList 생성
        ArrayList<Rectangle> arr =  new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while(true) {
            // 사용자에게 안내 메시지 출력
            System.out.println("사각형의 가로와 세로 길이를 띄어쓰기를 기준으로 입력해주세요.");
            int width = scanner.nextInt();
            int height = scanner.nextInt();
            // 0이 입력되면 종료
            if (width == 0 && height == 0) break;
            Rectangle rectangle = new Rectangle(width);
            // 세로 길이 설정
            rectangle.setHeight(height);
            // ArrayList 에 Rectangle 객체 추가
            arr.add(rectangle);
            Rectangle.cnt++;
        }
        // 입력된 Rectangle 객체들의 정보 출력
        for (int i = 0; i < arr.toArray().length; i++) {
            System.out.println("가로 길이는 : " + arr.get(i).getWidth());
            System.out.println("세로 길이는 : " + arr.get(i).getHeight());
            System.out.println("넓이는 : " + arr.get(i).getWidth() * arr.get(i).getHeight());
            System.out.println("-----------------------");
        }
        System.out.println("Rectangle 인스턴스의 개수는 : " + Rectangle.cnt);
        scanner.close();
    }
}

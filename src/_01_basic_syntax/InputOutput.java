package _01_basic_syntax;

import java.util.Scanner;

// 입출력
public class InputOutput {
    public static void main(String[] args) {
        // 출력
        System.out.println("안녕하세요"); // 줄바꿈
        System.out.print("잘부탁드립니다. \n"); // 줄바꿈 X

        // 입력
        // - Scanner 클래스 이용
        System.out.println("공백으로 구분하여 이름/나이/키/결혼여부를 입력해주세요. >>>");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.next(); // 공백 이전까지 문자열 읽음
        int age = scanner.nextInt(); // 공백 이전까지 정수 읽음
        double height = scanner.nextDouble(); // 공백 이전까지 실수 읽음
        boolean single = scanner.nextBoolean(); // 공백 이전까지 불리언 읽음

        System.out.println("===입력 결과 출력===");
        System.out.println("이름 : " + name);
        System.out.println("나이 : " + age);
        System.out.println("키 : " + height);
        System.out.println("결혼 여부 : " + single);

        scanner.close();

        // 실습
        System.out.println("===== 실습 =====");
        System.out.println("이름을 입력하세요");
        Scanner scanner2 = new Scanner(System.in);
        String name2 = scanner2.next();
        System.out.println("나이를 입력하세요");
        int age2 = scanner2.nextInt();
        System.out.printf("안녕하세요! %s님(%d)세", name2, age2);
        scanner2.close();
    }
}

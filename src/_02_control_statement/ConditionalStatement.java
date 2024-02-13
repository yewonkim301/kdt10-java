package _02_control_statement;

import java.util.Scanner;

public class ConditionalStatement {
    public static void main(String[] args) {
        int number = 10;
        if (number % 2 == 0) {
            System.out.println("짝수");
        } else {
            System.out.println("홀수");
        }

        ////////////////////////////////
        // 문자열 (String) 객체 비교
        System.out.println("이름을 입력하세요");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();
        System.out.println("name 값 확인 : " + name);

        // Bad ('==' 연산자 사용)
//        if (name == "김코딩") {
//            System.out.println("환영합니다!");
//        } else {
//            System.out.println("이름을 다시 입력해주세요.");
//        }

        // Good ('.equals' 메서드 사용)
        if (name.equals("김코딩")) {
            System.out.println("환영합니다!");
        } else {
            System.out.println("이름을 다시 입력해주세요.");
        }

        // Why?
        // - '==' 연산자 : 두 객체의 참조 비교 (동일한 메모리 위치 가리키는지 확인)
        // - '.equals()' 메서드 : 두 객체의 내용이 동일한지 비교

        // "문자열 리터럴"의 경우, Java 에서 특별 취급
        // 동일한 문자열 리터럴이 사용되는 경우, Java 컴파일러는 문자열 풀 (string pool)이라는 공유된 메모리 영역에 해당 문자열을 저장
        // str1, str2 같은 경우에 같은 무자열을 가리키고 있으므로 같은 참조값을 가짐
        String str1 = "hello";
        String str2 = "hello";

        if (str1 == str2) {
            System.out.println("같은 참조를 가리킴");
        } else {
            System.out.println("서로 다른 참조를 가리킴");
        }

        if (str1.equals(str2)) {
            System.out.println("내용이 같다");
        } else {
            System.out.println("내용이 다르다");
        }

        // 문자열 "동적 할당"의 경우, new String(...) 을 이용해서 새로운 문자열 객체를 생성 -> 서로 다른 객체를 가리킴
        // str3, str4 서로 다른 객체 -> '==' 연산자로 비교시 false
        // 따라서 문자열 비교시 (내용) '.equals()' 메서드로 비교하는 것이 좋다.
        String str3 = new String("hi");
        String str4 = new String("hi");

        if (str3 == str4) {
            System.out.println("같은 참조를 가리킴");
        } else {
            System.out.println("서로 다른 참조를 가리킴");
        }

        if (str3.equals(str4)) {
            System.out.println("내용이 같다");
        } else {
            System.out.println("내용이 다르다");
        }

        ///////////////////////////////////////////
        // switch - case 문
        // - 각 case 문의 break 문으로 선택 사항, break 문 생략시 바로 밑의 case문으로 넘어감
        String dayOfWeek;
        int day = 4;

//        switch (day) {
//            case 1:
//                dayOfWeek = "일요일";
//                break;
//            case 2:
//                dayOfWeek = "월요일";
//                break;
//            case 3:
//                dayOfWeek = "화요일";
//                break;
//            case 4:
//            case 5:
//            case 6:
//            case 7:
//                dayOfWeek = "수 ~ 토요일";
//                break;
//            default:
//                dayOfWeek = "잘못된 입력입니다.";
//                break;
//        }

        dayOfWeek = switch (day) {
            case 1 -> "일요일";
            case 2 -> "월요일";
            case 3 -> "화요일";
            case 4, 5, 6, 7 -> "수 ~ 토요일";
            default -> "잘못된 입력입니다.";
        };
        System.out.println(dayOfWeek);

        // 실습 1
        System.out.println("나이를 입력하세요");
        int age2 = scanner.nextInt();

        if (age2 >=1 && age2 <= 7) {
            System.out.println("유아");
        } else if (age2 >= 8 && age2 <= 13) {
            System.out.println("초등학생");
        } else if (age2 >= 14 && age2 <= 16) {
            System.out.println("중학생");
        } else if (age2 >= 17 && age2 <= 19) {
            System.out.println("고등학생");
        } else if (age2 >= 20) {
            System.out.println("성인");
        }

        // 실습 2
        System.out.println("이름를 입력하세요");
        String name2 = scanner.next();

        if (name2.equals("홍길동")) {
            System.out.println("남자");
        } else if (name2.equals("성춘향")) {
            System.out.println("여자");
        } else {
            System.out.println("모르겠어요.");
        }
//        scanner.close();


    }
}

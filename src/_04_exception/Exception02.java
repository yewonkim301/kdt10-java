package _04_exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exception02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            // 배열 크기 입력
            System.out.print("배열 크기 입력하세요 : ");
            int size = scanner.nextInt();
            if (size <= 0) {
                // 에러 객체 집적 생성
                throw new IllegalArgumentException("배열 크기는 1 이상이어야 합니다.");
            }

            // 배열 생성
            int[] arr = new int[size];

            // 배열 요소 입력
            System.out.println(size +"개의 정수를 입력하세요 :");
            int sum = 0;
            for (int i = 0; i < size; i++) {
                System.out.print("정수 " + (i + 1) + ": ");
                arr[i] = scanner.nextInt();
                sum += arr[i];
            }

            // 퍙균 계산
            double average = (double)sum/size;
            System.out.println("평균은 " + average + "입니다.");
        } catch (InputMismatchException e) {
            System.out.println("잘못된 입력 형식입니다. 정수를 입력하세요.");
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        } finally {
            scanner.close();
        }
    }
}

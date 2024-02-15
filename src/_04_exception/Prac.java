package _04_exception;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Prac {
    // 실습 1
    public static int getIdx(int[] arr, int idx) { return arr[idx]; }

    // 실습 3
    public static void main(String[] args) {
        // 실습 1
        int[] arr = {1, 2, 3, 4};
        try {
            for (int i = 0; i < arr.length + 1; i++) {
                System.out.println(getIdx(arr, i));
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("인덱스가 범위를 벗어났습니다.");
        }

        // 실습 2
        Scanner scanner = new Scanner(System.in);

        /*
        try {
            System.out.println("배열의 크기를 입력해주세요 : ");
            int len = scanner.nextInt();
            int[] numArr = new int[len];
            System.out.println("배열을 입력해주세요 : ");
            double result = 0;
            for (int i = 0; i < len; i++) {
                int num = scanner.nextInt();
                result += num;
            }
            result /= len;
            System.out.println(result);
        } catch (InputMismatchException e) {
            // 사용자가 정수가 아닌 값을 인력한 경우
            System.out.println("에러 발생 : " + e.toString());
        } catch (ArithmeticException e) {
            // 사용자가 0을 입력한 경우
            System.out.println("에러 발생 : " + e.toString());
        }
        */

        // 실습 3
        ArrayList<Integer> numbers = new ArrayList<>();
        ArrayList<Integer> duplNum  = new ArrayList<>();

        try {
            System.out.println("배열의 크기를 입력해주세요 : ");
            int len2 = scanner.nextInt();
            System.out.println("배열 요소를 입력하십시오 : ");
            for (int i = 0; i < len2; i++) {
                int num2 = scanner.nextInt();
                System.out.println("정수 " + (i + 1) + ": " + num2);
                numbers.add(num2);
            }
            for (int i = 0; i < len2 - 1; i++) {
                for (int j = i + 1; j < len2; j++) {
                    if (numbers.get(i).equals(numbers.get(j))) {
                        if (!duplNum.contains(numbers.get(i))) {
                            duplNum.add(numbers.get(i));
                        }
                    }
                }
            }
            System.out.println("중복된 요소 : " + duplNum);
        } catch (ArithmeticException e) {
            // 사용자가 배열의 길이를 0으로 입력한 경우
            System.out.println("에러 발생 : " + e.toString());
        } catch (InputMismatchException e) {
            // 사용자가 정수가 아닌 값을 인력한 경우
            System.out.println("에러 발생 : " + e.toString());
        } finally {
            scanner.close();
        }
    }
}

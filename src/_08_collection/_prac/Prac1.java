package _08_collection._prac;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Prac1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Set<Integer> arr = new HashSet<>();

        System.out.println("정수를 입력하세요. -1을 입력하면 종료됩니다.");
        while (true) {
            System.out.print("정수 입력: ");
            int n = scanner.nextInt();
            if (n == -1) break;
            arr.add(n);
        }
        System.out.println("중복 제거된 정수 목록: " + arr);
        scanner.close();
    }
}

package _08_collection._prac;

import java.util.*;

public class Prac2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, Integer> map = new HashMap<>();

        System.out.println("이름과 나이를 입력하세요. '종료'를 입력하면 종료됩니다.");
        while (true) {
            System.out.print("이름 입력: ");
            String name = scanner.next();
            if (name.equals("종료")) break;
            System.out.print("나이 입력: ");
            int age = scanner.nextInt();
            map.put(name, age);
        }
        System.out.println();
        System.out.println("=== 입력 받은 이름과 나이 목록 ===");
        Set<Map.Entry<String, Integer>> entrySet = map.entrySet();
        // System.out.println(entrySet); // [홍길동=21, 김새싹=20]
        for (Map.Entry<String, Integer> entry : entrySet) {
            System.out.printf("이름: %s, 나이: %d\n", entry.getKey(), entry.getValue());
        }
        scanner.close();
    }
}

package _03_array;

// Collection Type
// : 객체를 효율적으로 추가, 삭제, 검색할 수 있도록 관련 인터페이스 & 클래스를 java.util 에 포함시켜 놓음

// List
// L ArrayList

// Set
// L HashSet
// L TreeSet

// Map
// L HashMap
// L Hashtable
// L TreeMap

// ArrayList 클래스
// - List 컬렉션에서 가장 많이 사용하는 컬렉션
// - 표준 배열보다 조금 느릴 수 있으나, 배열에서 많은 조작이 필요한 경우 유용
// - 크기를 미리 지정하지 않아도 됨 (동적할당, 일반 배열과 차이점)
// - List 컬렉션은 객체 자체를 저장하는게 아니라, 객체 번지를 저장 -> 동일한 객체 중복 저장 = 동일한 번지수 저장, null도 가능

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ArrayListEx {
    public static void main(String[] args) {
        // 1. ArrayList 생성 (정수형)
        ArrayList<Integer> numbers = new ArrayList<>();

        // 2. 요소 추가
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);

        // 3. 요소 접근
        System.out.println("첫 번째 요소 : " + numbers.get(0));

        // 4. 요소 수정
        numbers.set(1, 77);
        System.out.println("numbers : " + numbers);

        // 5. 요소 삽입 (지정된 위치)
        numbers.add(1, 7);
        System.out.println("numbers : " + numbers);

        // 6. ArrayList 끼리 연결
        System.out.println(Arrays.asList(99, 33, 44));
        numbers.addAll(Arrays.asList(99,33,44));
        System.out.println("numbers : " + numbers);

        // 7. 요소 위치 찾기
        numbers.indexOf(10);
        numbers.indexOf(30);
        numbers.indexOf(99);

        // 8. 요소 삭제
        numbers.remove(2);
        System.out.println("numbers : " + numbers);

        // 9. 리스트 크기 확인
        System.out.println("리스트 크기 확인 : " + numbers.size());

        // 10. 모든 요소 순회
        for (Integer n: numbers) {
            System.out.println(n + " ");
        }

        // 11. 모든 요소 삭제
        numbers.clear();
        System.out.println("numbers :  " + numbers);

        //////////////////////////////////////
        // Student 타입의 ArrayList 생성
        ArrayList<Student> students = new ArrayList<>();

        students.add(new Student("John", 10));
        Student student = new Student("Jennie", 19);
        students.add(student);
        students.add(new Student("Lily", 40));
        students.add(new Student( "Lisa", 30));

        System.out.println("학생 수 : " + students.size());
        Student std  = students.get(0);
        System.out.println(std.getName() + "학생의 나이는 " + std.getAge());

        for (Student std1 : students) {
            System.out.println(std1.getName() + "(" + std1.getAge() + ")");
        }

        //////////////////////////////////////
        // 실습
        ArrayList<String> str = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while(true) {
            System.out.println("문자를 입력해주세요. : ");
            String newStr = scanner.nextLine();
            if (newStr.equals("exit")) break;
            str.add(newStr);
        }
        for (String s: str) {
            System.out.println(s);
        }
    }
}

class Student {
    private String name;
    private int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public String getName () { return name; }

    public int getAge() { return age; }
}

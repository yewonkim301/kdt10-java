package _05_class._04_final;

public class Student {
    // final 필드
    final String name  = "코딩온"; // 1. 필드 선언시 초기화

    final String sid; // 2. 생성자에서 초기화

    public Student(String sid) {
        this.sid = sid;
    }

    public static void main(String[] args) {
        Student std1 = new Student("s001");
        System.out.println(std1.name);
        System.out.println(std1.sid);

        // final 필드 값 변경 불가능
        // std1.name = "홍길동";
    }
}

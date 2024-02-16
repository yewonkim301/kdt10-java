package _05_class._02_access_modifier._pack5;

public class PersonEx {
    public static void main(String[] args) {
        // 객체 생성
        Person p1 = new Person("minion");
        Person p2 = new Person("pooh");

        // p1.age = 4; // x: 필드 직접 변경 불가능
        p1.setAge(4); // o: 메소드를 이용한 간접적 변경
        System.out.println(p1.getName() + "의 나이 : "+ p1.getAge());

        p2.setAge(-6); // 나이 값이 음수인 경우, se


        // tAge 내부 로직에 의해 0으로 변경
        System.out.println(p2.getName() + "의 나이 : "+ p2.getAge());
    }
}

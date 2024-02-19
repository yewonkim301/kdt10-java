package _06_wrapper;

// 포장 클래스는 문자열을 기본 타입 값으로 변환할 때도 사용함
// 대부분의 포장 클래스에는 "parse+기본타입" 명으로 된 static 메소드 존재
// : 해당 메소드는 해당 기본타입 값으로 변환함

// 포장 값 비교
// - 포장 객체는 내부 값을 비교하기 위해 ==, != 연산자 사용 불가능
// - 내부 값을 비교하는 것이 아니라 포장 객체의 주소값을 비교하기 때문
// - 따라서, equals() 메소드로 내부 값을 비교해야 함

// - byte, short, int: -128 ~ 127
// - boolean: true, false
// - char: \u0000 ~ \u007f
// 위 범위에 포함되는 값은 포장 객체 공유 (같은 참조). 이 외의 값을 갖는다면 다른 참조

public class ValueCompare {
    public static void main(String[] args) {
        // -128 ~ 127 이내
        Integer obj1 = 10;
        Integer obj2 = 10;
        System.out.printf("%d == %d : %b\n", obj1, obj2, obj1 == obj2); // true
        System.out.printf("%d equals %d : %b\n\n", obj1, obj2, obj1.equals(obj2)); // true

        // -128 ~ 127 초과 값을 갖는 경우
        Integer obj3 = 1000;
        Integer obj4 = 1000;
        System.out.printf("%d == %d : %b\n", obj3, obj4, obj3 == obj4); // false -> 번지 비교
        System.out.printf("%d equals %d : %b\n\n", obj3, obj4, obj3.equals(obj4)); // true
    }
}

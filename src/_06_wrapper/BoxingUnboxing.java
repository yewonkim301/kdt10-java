package _06_wrapper;

// Wrapper 객체 : 기본 타입 값을 갖는 객체 생성 가능
// - 포장 객체를 생성하기 위한 클래스는 'java.lang' 패키지에 포함되어 있음
// - 포장 객체는 포장하고 있는 기본 타입의 값을 변경할 수 있고, 단지 객체로 생성하는데 목적이 있음
// - 컬렉션 객체 때문, 기본 타입의 값은 저장할 수 없고, 객체만 저장 가능하기 때문

public class BoxingUnboxing {
    public static void main(String[] args) {
        // Boxing
        // - 기본 타입의 값을 포장 객체로 만드는 과정
        // - 포장 클래스 변수에 값이 대입될 때 발생
        Integer obj1 = 100;
        Double obj2 = 3.14;
        Character obj3 = 'A';
        System.out.println(obj1.intValue()); // intValue() : Integer 객체 내부의 int 값 리턴
        System.out.println(obj2.doubleValue());
        System.out.println(obj3.charValue());
        System.out.println("---------------------");

        // Unboxing
        // - 포장 객체에서 기본 타입 값을 얻는 과정
        // - 기본 타입 변수에 포장 객체가 대입될 때 발생
        int value1 = obj1;
        double value2 = obj2;
        char value3 = obj3;
        System.out.println(value1);
        System.out.println(value2);
        System.out.println(value3);
        System.out.println("---------------------");

        // 연산 시 boxing
        // - obj1은 100과 연산되기 전에 언박싱 됨
        int result1 = obj1 + 100;
        double result2 = obj2 + 1.5;
        char result3 = (char)(obj3 + 1); // char 은 숫자로 연산되므로 형변환 필요
        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
    }
}

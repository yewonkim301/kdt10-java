package _05_class._01_class;

public class ClassName {
    // 필드 (변수)
    public int number;
    public String name;

    // 메서드 (함수)

    // 생성자 -> 클래스명과 동일한 이름
    // 기본 생성자 (default) 생력 가능
    /*
    public ClassName() {

    }
    */
    public ClassName (int number, String name) {
        this.number = number;
        this.name = name;
    }

    public void testMethod() {
        System.out.println("test method!");
    }

    public static void main(String[] args) {
        // 객체 생성 (인스턴스화)
        ClassName test = new ClassName(1, "test");

        // 필드, 메드 사용
        test.testMethod();
        System.out.println(test.name); // null -> 초기값
        System.out.println(test.number); // 0 -> 초기값
    }
}

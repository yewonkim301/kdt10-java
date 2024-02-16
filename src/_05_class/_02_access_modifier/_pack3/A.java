package _05_class._02_access_modifier._pack3;

// 필드와 메소드의 접근 제한자
public class A {
    public int field1; // public field
    int filed2; // default
    private int field3; // private

    // constructor (생성자)
    public A() {
        // 클래스 내부이므로 접근 제한자의 영향 받지 않음
        field1 = 1;
        filed2 = 2;
        field3 = 3;

        method1();
        method2();
        method3();
    }

    // public method
    public void method1() {}

    // default
    void method2() {}

    // private
    private void method3() {}
}

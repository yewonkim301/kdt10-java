package _05_class._02_access_modifier._pack3;

public class B {
    public void method() {
        A a = new A(); // _pack3.A 와 _pack3.B는 서로 같은 패키지이기 떄문에 별도의 import 없이 접근 가능

        // 필드 변경
        a.field1 = 11; // o
        a.filed2 = 22; // o
        // a.field3 = 33; // x : private field 이기 떄문에 컴파일 에러

        // 메소드 호출
        a.method1(); // o
        a.method2(); // o
        // a.method3(); // x : private method 이기 때문에 컴파일 에러
    }
}

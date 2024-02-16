package _05_class._02_access_modifier._pack4;

import _05_class._02_access_modifier._pack3.A;

public class C {
    public void method() {
        A a = new A(); // _pack3.A 와 _pack4.C는 서로 다른 패키지이기 떄문에 import

        // 필드 변경
        a.field1 = 11; // o
        // a.filed2 = 22; // x : default field 이기 때문에 컴파일 에러
        // a.field3 = 33; // x : private field 이기 떄문에 컴파일 에러

        // 메소드 호출
        a.method1(); // o
        // a.method2(); // x : default field 이기 때문에 컴파일 에러
        // a.method3(); // x : private method 이기 때문에 컴파일 에러
    }
}

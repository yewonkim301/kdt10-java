package _05_class._07_interface;

import _05_class._02_access_modifier._pack3.A;

public class RemoteControlEx {
    public static void main(String[] args) {
        // interface 도 하나의 타입이므로 변수의 타입으로 사용 가능
        // - interface 는 참조 타입 -> null 대입 가능
        RemoteControl rc;

        // rc 변수에 Television 객체를 대입
        rc = new Television();
        rc.turnOn();
        rc.setVolume(5);
        rc.turnOff();

        // rc 변수에 Audio 객체를 대입 (교체)
        rc = new Audio();
        rc.turnOn();
        rc.setVolume(15);
        rc.turnOff();
    }
}

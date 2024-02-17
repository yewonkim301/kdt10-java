package _05_class._07_interface;

// implements -> 상속을 받는 것이 아니라 구현한다는 의미
public class Audio implements RemoteControl{
    // 필드
    private int volume;

    @Override
    public void turnOn() {
        System.out.println("Audio turn on");
    }

    @Override
    public void turnOff() {
        System.out.println("Audio turn off");
    }

    @Override
    public void setVolume(int volume) {
        // 인터페이스의 상수 필드를 이용해서 volume 필드의 값 제한
        if (volume > RemoteControl.MAX_VOLUME) {
            this.volume = RemoteControl.MAX_VOLUME;
        } else if (volume < RemoteControl.MIN_VOLUME) {
            this.volume = RemoteControl.MIN_VOLUME;
        } else {
            this.volume = volume;
        }
        System.out.println("현재 Audio 볼륨 : " + this.volume);
    }
}

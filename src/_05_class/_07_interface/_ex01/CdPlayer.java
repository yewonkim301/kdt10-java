package _05_class._07_interface._ex01;

public class CdPlayer implements Music{
    @Override
    public void play() {
        System.out.println("CD 플레이어에서 '아이유 꽃갈피' 앨범을 재생합니다.");
    }

    @Override
    public void stop() {
        System.out.println("CD 플레이어에서 '아이유 꽃갈피' 앨범을 정지합니다.");
    }
}

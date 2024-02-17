package _05_class._07_interface._ex01;

public class MusicEx {
    public static void main(String[] args) {
        Music music;

        music = new Mp3Player();
        System.out.println("==== MP3 Player ====");
        music.play();
        music.stop();
        System.out.println();

        music = new CdPlayer();
        System.out.println("==== CD Player ====");
        music.play();
        music.stop();
    }
}

package _05_class._04_final;

// 상수
// - 변하지 않는 값
// - 객체마다 저장할 필요가 없고, 단 한 번만 값이 선언되면 되기 때문에
// - static 이면서 final 인 특성을 갖는다.
// - 대문자로 작성하는 것이 관례
public class ConstEx {
    public static void main(String[] args) {
        // 상수 읽기
        System.out.println(Const.GREETING);
        System.out.println(Const.MAX_VALUE);

        // 값 변경 X
        // Const.GREETING = "Hi"; // 에러
    }
}

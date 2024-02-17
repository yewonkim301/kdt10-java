package _05_class._06_abstract;

public class StudentEx {
    public static void main(String[] args) {
        Kim kim = new Kim("김철수", "ABC 고등학교", 17, 20220001);
        Baek baek = new Baek("백영희", "XYZ 고등학교", 18, 20220002);

        kim.info();
        System.out.println("학교 : " + kim.getSchool());
        System.out.println("나이 : " + kim.getAge());
        System.out.println("학번 : " + kim.getStdNum());
        kim.todo();
        System.out.println();

        baek.info();
        System.out.println("학교 : " + baek.getSchool());
        System.out.println("나이 : " + baek.getAge());
        System.out.println("학번 : " + baek.getStdNum());
        baek.todo();
    }
}

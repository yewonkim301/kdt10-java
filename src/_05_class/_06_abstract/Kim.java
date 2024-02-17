package _05_class._06_abstract;

public class Kim extends Student{
    public Kim(String name, String school, int age, int stdNum) {
        super(name, school, age, stdNum);
    }

    @Override
    void todo() {
        System.out.println("점심은 김가네 김밥");
    }
}

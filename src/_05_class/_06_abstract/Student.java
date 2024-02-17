package _05_class._06_abstract;

public abstract class Student {
    private String name;
    private String school;
    private int age;
    private int stdNum;

    // 생성자 선언
    public Student(String name, String school, int age, int stdNum) {
        this.name = name;
        this.school = school;
        this.age = age;
        this.stdNum = stdNum;
    }

    abstract void todo ();

    void info() {
        System.out.printf("==== %s 학생의 정보 ====\n", name);
    }

    public String getName() {
        return name;
    }

    public String getSchool() {
        return school;
    }

    public int getAge() {
        return age;
    }

    public int getStdNum() {
        return stdNum;
    }
}

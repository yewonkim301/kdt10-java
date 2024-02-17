package _05_class._05_inheritance;

public class AnimalEx {
    static Dog dog = new Dog("초코", 2);

    static Cat cat = new Cat("나비", 3);

    public static void main(String[] args) {
        System.out.println("종 : " + dog.getSpecies());
        System.out.println("이름 : " + dog.getName());
        System.out.println("나이 : " + dog.getAge());
        dog.makeSound();
        dog.setFood("뼈다귀");
        System.out.println("======================");
        System.out.println("종 : " + cat.getSpecies());
        System.out.println("이름 : " + cat.getName());
        System.out.println("나이 : " + cat.getAge());
        cat.makeSound();
        cat.setToy("낚시대");
    }
}

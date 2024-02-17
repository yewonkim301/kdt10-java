package _05_class._05_inheritance;

public class Cat extends Animal {
    public Cat (String name, int age) {
        setSpecies("고양이");
        setName(name);
        setAge(age);
    }

    private String toy;
    public String getToy() {
        return toy;
    }

    public void setToy(String toy) {
        this.toy = toy;
        System.out.println("좋아하는 장난감은 : " + toy);
    }

    @Override
    public void makeSound() {
        System.out.println("야옹");
    }
}

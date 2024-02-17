package _05_class._05_inheritance;

public class Dog extends Animal{
    public Dog (String name, int age) {
        setSpecies("강아지");
        setName(name);
        setAge(age);
    }

    private String food;
    public String getFood() {
        return food;
    }

    public void setFood(String food) {
        this.food = food;
        System.out.println("좋아하는 간식은 : " + food);
    }

    @Override
    public void makeSound() {
        System.out.println("멍멍");
    }
}

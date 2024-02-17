package _05_class._05_inheritance;

public class Animal {
    private String species;
    private String name;
    private Integer age;

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public void makeSound() {
        System.out.println("동물은 소리를 낸다.");
    }
}

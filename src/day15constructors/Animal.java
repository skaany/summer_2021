package day15constructors;

public class Animal {

    String name;
    int age;
    boolean isCarnivorous;
    String specy;
    char gender;

    static int counter;

    public Animal() {
        counter++;
    }

    public Animal(String name, int age, boolean isCarnivorous, String specy, char gender) {
        this.name = name;
        this.age = age;
        this.isCarnivorous = isCarnivorous;
        this.specy = specy;
        this.gender = gender;
        counter++;
    }

    public Animal(String name, int age, char gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        counter++;
    }

    public Animal(String specy) {
        this.specy = specy;
        counter++;
    }
}

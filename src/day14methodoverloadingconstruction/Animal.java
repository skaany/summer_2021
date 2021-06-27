package day14methodoverloadingconstruction;

public class Animal {

    String name;
    int age;
    String species;


    static int counter = 0;

    public Animal() {
        counter++;
    }

    public Animal(String name, int age, String species) {
        this.name = name;
        this.age = age;
        this.species = species;
        counter++;
    }
    public Animal(int age, String species) {
        this.age = age;
        this.species = species;
        counter++;
    }
}

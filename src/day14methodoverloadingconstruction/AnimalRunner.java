package day14methodoverloadingconstruction;

public class AnimalRunner {

    public static void main(String[] args) {
        Animal a01 = new Animal();
        Animal a02 = new Animal("Bobby", 7, "Bulldog");
        Animal a03 = new Animal(7, "Puppy");


        System.out.println(Animal.counter);
    }
}

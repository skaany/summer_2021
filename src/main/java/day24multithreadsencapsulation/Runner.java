package day24multithreadsencapsulation;

public class Runner {

    public static void main(String[] args) {

        System.out.println("==========CATS============");
        Cat cat1 = new Cat();
        cat1.move();
        cat1.eat();
        cat1.meow();

        System.out.println("===========DOGS===========");
        Dog dog = new Dog();
        dog.move();
        dog.eat();
        dog.bark();

        System.out.println("===========BIRDS===========");

        Bird bird = new Bird();
        bird.move();
        bird.eat();
        bird.fly();

    }
}

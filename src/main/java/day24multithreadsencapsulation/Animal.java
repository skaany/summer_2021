package day24multithreadsencapsulation;

/*
    1) In Jave, there's parent-child relationghsip
    2) A parent can have infinitely many child classes
       A child can have just a single parent in Java
       It means Java doesn't support multiple inheritances.
    3) Inheritance means child classes can use class members from parent class
    4) Inheritance is so beneficial in:
        a) Ending repetition
        b) Maintenance
        c) Reusability
     5) A child class may have grandparents as well
*/

/*
    1) Single Inheritance : Child can have just a single parent
    2) Hierarchical Inheritance: A parent can have multiple child classes.
    3) Multi-Level Inheritance:

*/

public class Animal {


    public void move() {
        System.out.println("Animals move...");
    }

    public void eat() {
        System.out.println("Animals eat...");
    }


}





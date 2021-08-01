package day26inheritanceoverriding;

public class Animal {

    String name = "Animal";
    int height =33;
    byte ageOfAnimal=3;


    public Animal(){
        System.out.println("Parent Constructor ran....");
    }

    public Animal(String name){
        this();
        System.out.println("Parent Constructor with parameters ran....");
    }

    public void move(){
        System.out.println("Animals move...");
    }
     public void eat(){
        System.out.println("Animals eat...");
    }


}

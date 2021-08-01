package day26inheritanceoverriding;

public class Mammal extends Animal{

    String name = "Mammal";
    int height = 22;
    byte ageOfMammal = 2;


    public Mammal(int height) {
        this("Owl");
        System.out.println(height + " cm.");
    }

    public Mammal(String name) {
        super(name);
    }


    public void move(){
        System.out.println("Mammals move...");
    }
    public void feed(){
        System.out.println("Mammals feed their babies with milk...");
    }
}

package day24multithreadsencapsulation;

public class School {

    public static void main(String[] args) {

        //1. Way: To create an object with the Default constructor
        Student student1 = new Student();
        System.out.println(student1.getName());

        student1.setName("Ali Can");
        System.out.println(student1.getName());

        //2. Way: To create an object with constructor parameter
        Student student2 = new Student("Ali Can", 15, false);

        //3. Way: To create an object with the Default constructor, then update the values by using setters
        Student student3 = new Student();
        student3.setName("Mary Star");
        student3.setSuccessful(false);



    }
}

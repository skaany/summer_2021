package day24multithreadsencapsulation;

public class Student {
    /*
    Data Hiding Process is called 'Encapsulation'
    1) To hide class members, use "private" access modifier for them.
       If you do not want anybody to see the object detatils, do not create "toString()"
    2) To read the value of hidden variables, we create "getters", and by using "getters" we
       can read the values.
    3) To update value of a variable for a specific student, user "Setters"

    Note: To create an "immutable class"
        a) Make the variables private
        b) Do not create any setters

    Note: getter() and setter() methods are called "Java Beans" in Java

    Note: a) Getter method names start with "get" followed by "variable" name
          b) However, if the variable is "boolean", getter method names start with "is" followed by "variable name"

    Note: a) The return type of getters is same with the type of the declared variable.
          b) The return type of setter is "void" everytime.
          c) Getters do not use any  "parameter", on the other hand -> Setters require parameter.


    */

    private String name = "Mark Stone";
    private int age;
    private boolean isSuccessful;



    public Student() {
    }

    public Student(String name, int age, boolean isSuccessful) {
        this.name = name;
        this.age = age;
        this.isSuccessful = isSuccessful;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSuccessful(boolean successful) {
        isSuccessful = successful;
    }

    public int getAge() {
        return age;
    }
}

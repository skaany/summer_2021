package day14methodoverloadingconstruction;

public class Constructors01 {
    /*
    Java knows, classes are for Object Creation, to create objects we need "constructors"
    because of that when you create a class Java creates a constructor automatically.

    Java gives you a default constructor, which is invisible inside the class.

    If you want you can create your own constructor as well.

    Note: Constructors are not methods because they do not have return types.
            In the interview, do not use "constructor method"

    Note: Constructor names must be same with the class name.

    Interview Question:

    What is the difference between "constructor" and "method"?
    1) Constructors do not have return type but methods have
    2) Methods may have any name as method but constructors must have class name as constructor name

    Note: When you create a class, Java gives you default constructor but if you create any constructor Java deletes default one.

    Note: Default constructor is constructor without parameters like public constructors01(){}
     */

    public static void main(String[] args) {

    }


    //How can we create a constructor
    //Access Modifier + Class Name() + {}
    public Constructors01(){}
    public Constructors01(int a){}
    public Constructors01(int a, String s){}
    public Constructors01(char a, double d, String s){}
}

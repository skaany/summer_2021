package day26inheritanceoverriding;

public class Runner {

/*

    If you use variables whose names are same in inheritance, to understand which variables will be able to
    see by using objects, remember the following rule;
        Look at the data type which you used in object creation, the variables will be displayed from the
        class which you used as data type.

        1) Look at the data type which you used in object creation, you will be able to see all the variables
            whose names are different in the class which you used as data type in all parents.
        2) It is not possible to see variables whose names are different from the child classes of the class
            which you used as data type.


*/
    public static void main(String[] args) {

        Mammal bird = new Bird();


    }
}

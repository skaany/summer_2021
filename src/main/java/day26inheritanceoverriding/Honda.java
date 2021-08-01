package day26inheritanceoverriding;

public class Honda extends Car{

    /*
    RULES OF OVERRIDING:
        1) When you override a method, you can use same access modifier.
        2) Access modifier in child class can not have narrower access modifier.
        3) Private methods can not be overridden because overriding means you want to use the method
            in another class. But private class members cannot be used in other classes.
            static methods can not be overridden, because static methods are common methods for all child classes.
            If any child updates it, the other classes will be affected and it can create problem because of that
            Java does not let overriding.
        4) @Override annotation checks the overriding rules, if there's any missed or used wrongly overriding
            rule, and it will give CTE.
        5) In overriding, return types of "overridden" and "overriding" methods can be same.
        6) In overriding, from "overriding" method return type to
           "overridden" method you must have  "IS-A" relationship.
           Note: If there is "IS-A" relationship between return types, return types are called
           "Covariant Return Types"
        7) In overriding, if the return type is "primitive", return types of "overridden" and "overriding"
           methods must be same.
        8) In overriding, if the return type is “void”
 	        return types of “overridden” and “overriding” methods must be “void”


     */
    @Override
    public Honda move() {
        System.out.println("Honda moves fast...");
        return null;
    }
}

package day24multithreadsencapsulation;

public class AccessModifier01 {

    /*

     */
    public String name = "Ali Can";


    /*
        You cannot access  address, since it has "protected" access modifier.
         "protected" fields can not be accessed from any other packages unless they're child class.
         To be able to access we need to create an instance of child class.

     */

    protected String address = "Miami, Fl";


    /*
        You can not access to "school" property from another package, since its access modifier is default.
        You can not access "default" class members from any other packages.
     */
    String school = "FIU";




    /*
    If you want a class member not to be visible from any other class, use "private"
    access modifier. This cannot be accessed from another class regardless of package.
     */
    private String profession = "Java Developer";


}

package day28exceptions;

public class E02 {


    /*

    1) If you use for example length() method for "null" String object, you will get
        "NullPointerException"
     2) "NullPointerException" is an "unchecked exception"
     3) If there's no parent-child relationship between Exception Classes,
        the order of catch-blocks doesn't matter
     4) try-block cannot be used alone, it can be used like the followings:
        a) try + catch
        b) try + multiple catch clauses
        c) try + catch or multiple catch + finally
        d) try + finally

     */

    public static void main(String[] args) {

        String s1 = "";
        System.out.println(s1.length());

        String s2 = null;



        try {
            System.out.println(12/0);
            System.out.println(s2.length());//NullPointerException

        }catch (NullPointerException e){

            System.out.println("Do not use length() for null. "+ e.getMessage());

        }catch (ArithmeticException e){

            System.out.println(e.getMessage());

        } finally {
            System.out.println("Finally part will be executed under every condition");
        }
        System.out.println("Will that code be executed?");
    }
}

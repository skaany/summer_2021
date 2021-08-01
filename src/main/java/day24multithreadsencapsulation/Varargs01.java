package day24multithreadsencapsulation;

import java.util.Arrays;

public class Varargs01 {

    /*
    1- Behind the "varargs", Java uses arrays. Because of that varargs behaves like arrays
    with some differences.
    2- You cannot use more than 1 varargs in a method paranthesi.
    3- Varargs must be the last parameter every time.
    4- "..." can be put just after data type or just before varargs sanme

    Note: If you need same method to use with different number of parameters,
    use "varargs"
     */

    /*


     */

    public static void main(String[] args) {


        System.out.println(add(5,6,5,8,9));

    }

    public static int add(int... args){

        return Arrays.stream(args).sum();
    }
}

package day28exceptions;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class E03 {

    /*
        1) ArrayIndexOutOfBoundsException is thrown if you use non-existing index in Arrays
        2) ArrayIndexOutOfBoundsException is un-checked exception

        3) ClassCastException is thrown if you try to cast a data type to another which is not supported by Java
        4) ClassCastException is un-checked exception

        5) NumberFormatException is thrown if you use non-digit characters in a String ans use parseInt()
        6) NumberFormatException is un-checked exception


     */

    public static void main(String[] args) {

        String s [] = {"A", "D", "B", "C"};

        System.out.println(Arrays.stream(s).sorted().collect(Collectors.toList()));

        Object obj = 70;
        String num = String.valueOf(obj);
        System.out.println(num);


        String snum= "123";
        int num1 = Integer.parseInt(snum);
        System.out.println(num1 + 5);

        String snum2= "1a23";
        int num2 = Integer.parseInt(snum2);
        System.out.println(num2 + 5);


    }
}

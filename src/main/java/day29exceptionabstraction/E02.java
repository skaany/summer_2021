package day29exceptionabstraction;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class E02 {

    public static void main(String[] args) {
        //StringIndexOutOfBoundsException
//        String s = "Java is easy";
//        System.out.println(s.charAt(2));
//        System.out.println(s.charAt(12));

        //IllegalStateException
        /*
        If you use a method at an inappropriate time, you will get IllegalStateException
         */

        List<Integer> list = new ArrayList<>();
        list.add(21);
        list.add(22);
        list.add(23);

        Iterator <Integer> it = list.iterator();
        it.next();
        while (it.hasNext()){

            it.remove();
            break;
        }
    }

}

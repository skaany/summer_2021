package day27Exceptions;

public class E03 {

    public static void main(String[] args) {

        int a = 12;
        int b = 0;

        try {
            System.out.println(a / b);
        }catch (ArithmeticException e){

            e.printStackTrace();
        }

    }
}

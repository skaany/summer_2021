package day29exceptionabstraction;

import java.util.Scanner;

public class E01 {

    //IllegalArgumentException
    //Sometimes we do not want to use some values for some parameters.

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your age... ");
        int age = scanner.nextInt();

        setAge(age);

    }


    static void setAge(int age) throws IllegalArgumentException{

        if(age < 0 ){
            throw new IllegalArgumentException();
        }
        System.out.println("Your age is : "+ age);

    }
}

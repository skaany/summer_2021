package day30exceptionsinterfacesiteratorscollections;

public class CustomExceptions01 {

    public static void main(String[] args) {

        //Handle checked custom exception
        try {
            checkTheGrade(80);
        } catch (IllegalGradeException e) {
            System.out.println(e.getMessage());
        }

        //Handle unchecked custom exception
        try {
            divide(12, 1);
        }catch(DivideByOneException e) {
            System.out.println(e.getMessage());
        }

    }

    //Use Checked Custom Exception in a method
    public static void checkTheGrade(int grade) throws IllegalGradeException {

        if(grade<0 || grade>100) {
            throw new IllegalGradeException("Grades must be between 0 and 100");
        }
        System.out.println("Your grade is " + grade);

    }

    //Use Unchecked Custom Exception in a method
    public static void divide(int x, int y) throws DivideByOneException{

        if(y==1) {
            throw new DivideByOneException("Dividing a number by 1 gives the number itself, no need to divide");
        }

        System.out.println("The result is " + x/y);


    }

}
/*
 	When you create a "Custom Exception";

 	A)For "Checked Custom Exception";
	 	1)Put "Exception" word at the end of the Custom Exception class name like IllegalGradeException
	 	2)Do not forget to extend "Exception" class
	 	3)Create constructor with a String parameter, and "super()" constructor call keyword

	B)For "Unchecked Custom Exception";
	 	1)Put "Exception" word at the end of the Custom Exception class name like IllegalGradeException
	 	2)Do not forget to extend "RuntimeException" class
	 	3)Create constructor with a String parameter, and "super()" constructor call keyword
 */

class IllegalGradeException extends Exception{

    public IllegalGradeException(String message) {
        super(message);
    }

}

class DivideByOneException extends RuntimeException{

    public DivideByOneException(String message) {
        super(message);
    }
}
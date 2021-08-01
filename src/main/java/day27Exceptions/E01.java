package day27Exceptions;

import java.io.*;
import java.util.logging.Logger;

/*
    1) FileNotFoundException:
            a) The file with the specified path does not exist.
            b) If the file is inaccessible
    2) IOException:
            a) It can handle all exceptions about Input and Output
       Note: IOException is the parent of FileNotFoundException
       Note: If you are using IOException Class, no need to use FileNotFoundException

       Note: When you see an Exception, you have 2 options
	  		a) Using “throws” declaration in the method name line
	  		b) Using try-catch block
    3) You can use multiple "catch blocks" for a single entry "try block"
    4) If you use multiple "catch blocks", order the Exception Classes from child to parent, otherwise
        you will get Compile Time Error.
    5) If you use multiple "catch blocks", you can get different messages for every Exception.
    6) try-block cannot be used alone
    7) When you type code if you get red underline for Exceptions, that kind of Exceptions are called
    "Checked Exception". If you do not get any red underline for some Exceptions, they are called "Unchecked Exception"

 */

public class E01 {


    public static void main(String[] args)  {


        try (FileInputStream fis = new FileInputStream("src/day27Exceptions/TextFile01.text")){
           //FileInputStream fis = new FileInputStream("src/day27Exceptions/TextFile01.text");
           int i = 0;
           while ((i= fis.read())!= -1) {
                System.out.print((char)i);
           }

        }
         catch (IOException e) {
            e.printStackTrace();
        }


    }

}



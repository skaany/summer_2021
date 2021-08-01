package day28exceptions;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class E01 {

    public static void main(String[] args) {

        try {

            BufferedReader br = new BufferedReader(new FileReader("src/day27Exceptions/TextFile01.text"));

            String line = br.readLine();

            while (line != null) {

                System.out.println(line);
                line = br.readLine();

            }

        } catch (FileNotFoundException e) {

            System.out.println("There is an issue about path or accessing file...");

        } catch (IOException e) {

            System.out.println("There's an issue in reading file");

        }

    }
}

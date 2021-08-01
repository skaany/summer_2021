package day27Exceptions;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamReadFile {


    public static void main(String[] args) {

        String fileName = "src/day27Exceptions/TextFile01.text";

        //read file into stream, try-with-resources
        try (Stream<String> stream = Files.lines(Paths.get(fileName))) {


            stream.filter(e -> !e.contains("unexpected")).forEach(System.out::println);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

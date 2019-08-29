package test;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Bata {
    public static void main(String[] args) {
        try (FileReader reader = new FileReader("/Users/skyblue/Documents/javatest/src/test/information.txt");
             BufferedReader br = new BufferedReader(reader)) {

            // read line by line
            String text;
            while ((text= br.readLine()) != null) {
                System.out.println(text);
            }

        } catch (IOException e) {
            System.err.format("IOException: %s%n", e);
        }
    }

}




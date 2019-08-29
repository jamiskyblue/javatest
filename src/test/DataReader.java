package test;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class DataReader {
    public static void main(String[] args) {
        String text;
        String a = null;

        try {
            FileReader fileReader = new FileReader("src/test/information.txt");
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            while ((text= bufferedReader.readLine())!= null){
                a=text;
               // a=append(text).append("\n");
            }
            fileReader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e){
            e.printStackTrace();
        }
        System.out.println(a);
    }
}

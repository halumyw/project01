package lxtfirststep;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class HelloWorld {

    public static void main(String[] args){
        System.out.println("HelloWorld!!");

        try {
            FileInputStream fis = new FileInputStream("hello.txt");//ctrl+alt+t
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }
}

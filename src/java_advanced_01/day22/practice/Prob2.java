package java_advanced_01.day22.practice;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Arrays;

public class Prob2 {
    public static void main(String[] args) throws Exception {
        String fileName ="C:/Temp/books.dat";

        ArrayList<Book> books = new ArrayList<>(Arrays.asList(
                new Book("반지의제왕", 10000),
                new Book("호빗", 15000),
                new Book("해리포터", 20000)));

        FileOutputStream fos = new FileOutputStream(fileName);
        ObjectOutputStream oos = new ObjectOutputStream(fos);

        oos.writeObject(books);

        oos.flush();
        oos.close();
        fos.flush();
        fos.close();

        FileInputStream fis = new FileInputStream(fileName);
        ObjectInputStream ois = new ObjectInputStream(fis);

        Object obj = ois.readObject();
        System.out.println(obj);

        ois.close();
        fis.close();

    }
}

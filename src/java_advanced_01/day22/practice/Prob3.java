package java_advanced_01.day22.practice;

import java.io.*;
import java.util.Arrays;

public class Prob3 {
    public static void main(String[] args) throws Exception {
        String fileName = "C:/Temp/students.dat";
        Student student1 = new Student("손흥민", 1);
        Student student2 = new Student("황희찬", 2);

        FileOutputStream fos = new FileOutputStream(fileName);
        ObjectOutputStream oos = new ObjectOutputStream(fos);

        oos.writeObject(student1);
        oos.writeObject(student2);

        oos.flush();
        oos.close();
        fos.flush();
        fos.close();

        FileInputStream fis = new FileInputStream(fileName);
        ObjectInputStream ois = new ObjectInputStream(fis);

        try {
            while (true) {
                Object obj = ois.readObject();
                System.out.println(obj);
            }
        } catch (EOFException e) {
            System.out.println("끝");
        } finally {
            ois.close();
            fis.close();
        }
    }


}


package java_advanced_01.day22.practice;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Prob4 {
    public static void main(String[] args) throws Exception {
        String fileName = "C:/Temp/account.dat";
        Account account = new Account("철수", 10000);

        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(fileName));

        oos.writeObject(account);

        oos.flush();
        oos.close();

        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(fileName));
        Object obj = ois.readObject();
        System.out.println(obj);

        ois.close();
    }
}

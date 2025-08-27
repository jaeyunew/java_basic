package java_advanced_01.day22.practice;

import java.io.*;

public class Prob1 {
    public static void main(String[] args) {
        String fileName = "C:/Temp/person.dat";

        Person person = new Person("홍길동", 30);
        //try with resources ==> autocloseable
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(fileName))) {
            oos.writeObject(person);

            oos.flush();

        } catch (IOException e) {
            System.out.println("입출력예외 처리완료");
        } catch (Exception e) {
            System.out.println("Exception 처리완료");
        }


        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(fileName))) {


            Person p = (Person) ois.readObject();
            System.out.println(p.toString());


        }catch (IOException e){
            System.out.println("입출력예외 처리완료");
        }catch (ClassNotFoundException e){
            System.out.println(e.getMessage());
        }
    }
}
package java_advanced_01.day17.comparableEx;

import java.util.TreeSet;

public class ComparableEx02 {
    public static void main(String[] args) {
        Fruit f1 = new Fruit("사과", 10000);
        Fruit f2 = new Fruit("귤", 12000);
        Fruit f3 = new Fruit("복숭아", 8000);
        Fruit f4 = new Fruit("포도", 18000);

        TreeSet<Fruit> treeSet = new TreeSet<Fruit>();
        treeSet.add(f1);
        treeSet.add(f2);
        treeSet.add(f3);
        treeSet.add(f4);

        for (Fruit f : treeSet) {
            System.out.println(f.fruitName);
        }
    }
}

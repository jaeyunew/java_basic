package java_advanced_01.day15.generic.ex02;

import java.util.ArrayList;
import java.util.List;

class Fruit {
}

class Apple extends Fruit {
}

class Pear extends Fruit {
}

class Banana extends Fruit {
}

class FruitBox<T, U> {
    List<T> apples = new ArrayList<>();
    List<U> bananas = new ArrayList<>();

    public void add(T apple, U banana) {
        apples.add(apple);
        bananas.add(banana);
    }
}

public class Main {
    //복수 제너릭 타입
    public static void main(String[] args) {
        FruitBox<Apple, Banana> box = new FruitBox<>();

        box.add(new Apple(), new Banana());
        box.add(new Apple(), new Banana());
    }
}

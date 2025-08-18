package java_advanced_01.day17.comparableEx;
//과일이 있다. 과일을 가격기준으로 내림차순 정렬할 수 있도록 비교기를 구현하세요.
public class Fruit implements Comparable<Fruit> {
    public String fruitName;
    public int price;

    public Fruit(String fruitName, int price) {
        this.fruitName = fruitName;
        this.price = price;
    }

    @Override
    public int compareTo(Fruit o) {
        if(this.price > o.price) return -1;
        else if(this.price < o.price) return 1;
        else return 0;
    }
}

// int compareTo(o1, o2 같다면 0를 리턴, 01, 02 앞에 오게 하려면 음수리턴 , 뒤에 오게 하려면 양수리턴)

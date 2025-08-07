package javabasic_02.day12.homework.P2;

public abstract class Beverage {
    private String name;
    public int price;

    public Beverage(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public abstract void calcPrice();

    public void print() {
        System.out.println(name + "이며, 가격은 " + price);
    }

    public static void getSalesInfo(Beverage[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println((i + 1) + "번째 판매 음료는 ");
            arr[i].print();
        }
    }

    public static int getTotalPrice(Beverage[] arr) {
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i].getPrice();
        }
        return sum;
    }
}

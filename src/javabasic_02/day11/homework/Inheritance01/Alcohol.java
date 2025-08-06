package javabasic_02.day11.homework.Inheritance01;

public class Alcohol extends Drink {
    private double alcper;

    public Alcohol(String name, int price, int count, double alcper) {
        super(name, price, count);
        this.alcper = alcper;
    }

    public static void printTitle() {
        System.out.println("상품명(도수[%])\t단가\t수량\t금액");
    }

    public void printData() {
        System.out.println(getName() + "(" + this.alcper + ")\t" + getPrice() + "\t" + getCount() + "\t" + getTotalPrice());
    }


}

package javabasic_02.day12.homework.P2;

public class Tea extends Beverage{
    public static int amount = 0;

    public Tea(String name) {
        super(name);
        calcPrice();
        amount++;
    }

    @Override
    public void calcPrice() {
        switch (getName()) {
            case "lemonTea":
                price = 1500;
                break;
            case "ginsengTea":
                price = 2000;
                break;
            case "redginsengTea":
                price = 2500;
                break;
        }
    }
}
